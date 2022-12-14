/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;


import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author mariam
 */
public class TesterController extends dataConnection {

    public TesterController() {
    }
    

    //VIEW ASSIGNED BUGTABLE IN DASHBOARD --------------------------------------------------------------------------------------
    public void ViewBugTable() {
        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT BUGID, BUGNAME, SEVERITY FROM BUGS WHERE TESTERID = ? AND STATUS = ? ORDER BY BUGID ASC");
            command.setInt(1, CurrentUser.id);
            command.setString(2, "T");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //VIEW NUMBER OF BUGS TO BE TESTED IN THE CARD --------------------------------------------------------------------------------
    public int ViewBugCard() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE TESTERID = ? AND STATUS = ?");
            command.setInt(1, CurrentUser.id);
            command.setString(2, "T");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }

    //SEARCH IN ASSIGNED BUGS IN DASHBOARD --------------------------------------------------------------------------------
    public void searchBugs(String search) {
        try {
            if (search.isEmpty()) {
                System.out.println(" prepare the query...");

                command = conObj.prepareStatement("SELECT BUGID, BUGNAME, SEVERITY FROM BUGS WHERE TESTERID = ? AND STATUS = ? ORDER BY BUGID ASC");
                command.setInt(1, CurrentUser.id);
                command.setString(2, "T");
            } else {
                if (search.matches("[0-9]+")) {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT BUGID, BUGNAME, SEVERITY FROM BUGS WHERE BUGID = ?");
                    command.setInt(1, Integer.parseInt(search));
                } else {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT BUGID, BUGNAME, SEVERITY FROM BUGS WHERE (TESTERID = ? AND STATUS = ?) AND (BUGNAME LIKE ? OR SEVERITY LIKE ?)");
                    command.setInt(1, CurrentUser.id);
                    command.setString(2, "T");
                    command.setString(3, "%" + search + "%");
                    command.setString(4, "%" + search + "%");
                }
            }
            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //SELECT BUG FROM DASHBOARD --------------------------------------------------------------------------------
    public String[] selectBug(int id) {
        String retID = " ";
        String retName = " ";
        String retSeverity = " ";
        String retType = " ";
        String retDescription = " ";

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM BUGS WHERE BUGID = ?");
            command.setInt(1, id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();

            retID = Integer.toString(resObj.getInt("BUGID"));
            retName = resObj.getString("BUGNAME");
            retSeverity = resObj.getString("SEVERITY");
            retType = resObj.getString("TYBE");
            retDescription = resObj.getString("DESCRIPTION");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return new String[]{retID, retName, retSeverity, retType, retDescription};
    }

    //EDIT BUG STATUS   --------------------------------------------------------------------------------
    public int editBug(int Status) {
        try {
            String status = " ";
            getConnected("SELECT * FROM BUGS");

            command = conObj.prepareStatement("UPDATE BUGS SET STATUS = ? WHERE BUGID = ?");
            command.setInt(2, CurrentBug.BugId);
            switch (Status) {
                case 0:
                    status = "T";
                    break;
                case 1:
                    status = "C";
                    break;
                default:
                    break;
            }
            command.setString(1, status);

            System.out.println(" excute the query...");

            command.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 1;
    }

    //VIEW PROJECTTABLE  ----------------------------------------------------------------------------------------------------------------------
    public void ViewProjectsTable() {
        try {
            getConnected("SELECT * FROM ASSIGNMENTS");
            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT PROJECTS.PROJECTID , PROJECTS.PROJECTNAME , PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON ASSIGNMENTS.PROJECTID = PROJECTS.PROJECTID WHERE ASSIGNMENTS.USERID = ? ORDER BY PROJECTID ASC");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //VIEW NUMBER OF ASSIGNED PROJECTS --------------------------------------------------------------------
    public int ViewProjectCard() {
        int counter2 = 0;
        try {
            getConnected("SELECT * FROM ASSIGNMENTS");
            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM ASSIGNMENTS WHERE USERID = ?");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter2++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter2;
    }

    //SEARCH IN ASSIGNED PROJECTS IN PRJECTS PANEL --------------------------------------------------------------------------------
    public void searchProjects(String search) {
        try {
            if (search.isEmpty()) {
                System.out.println(" prepare the query...");

                command = conObj.prepareStatement("SELECT PROJECTS.PROJECTID , PROJECTS.PROJECTNAME , PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON ASSIGNMENTS.PROJECTID = PROJECTS.PROJECTID WHERE ASSIGNMENTS.USERID = ? ORDER BY PROJECTID ASC");
                command.setInt(1, CurrentUser.id);
            } else {
                if (search.matches("[0-9]+")) {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT PROJECTS.PROJECTID , PROJECTS.PROJECTNAME , PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON ASSIGNMENTS.PROJECTID = PROJECTS.PROJECTID WHERE ASSIGNMENTS.USERID = ?  AND ASSIGNMENTS.PROJECTID = ? ORDER BY PROJECTID ASC");
                    command.setInt(1, CurrentUser.id);
                    command.setInt(2, Integer.parseInt(search));
                } else {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT PROJECTS.PROJECTID , PROJECTS.PROJECTNAME , PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON ASSIGNMENTS.PROJECTID = PROJECTS.PROJECTID WHERE ASSIGNMENTS.USERID = ?  AND PROJECTS.PROJECTNAME LIKE ? ORDER BY PROJECTID ASC");
                    command.setInt(1, CurrentUser.id);
                    command.setString(2, "%" + search + "%");
                }
            }
            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //VIEW USERSTABLE  ----------------------------------------------------------------------------------------------------------------------
    public void ViewUsersTable() {
        try {
            getConnected("SELECT * FROM ASSIGNMENTS");
            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT USERS.USERID, USERS.USERNAME, USERS.ROLE FROM ASSIGNMENTS INNER JOIN USERS ON ASSIGNMENTS.USERID = USERS.USERID WHERE ASSIGNMENTS.PROJECTID = ? ORDER BY USERID ASC");
            command.setInt(1, CurrentProject.projectId);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //VIEW BUGTABLE FOR SPECIFIC PROJECT -----------------------------------------------------------------------------------------------------
    public void ViewProjectBugsTable() {
        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM BUGS WHERE PROJECTID = ? ORDER BY BUGID ASC");
            command.setInt(1, CurrentProject.projectId);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //SEARCH IN BUGTABLE PANEL (BUGDETAILS) --------------------------------------------------------------------------------
    public void searchBugDetails(String search) {
        try {
            if (search.isEmpty()) {
                System.out.println(" prepare the query...");

                command = conObj.prepareStatement("SELECT * FROM BUGS WHERE PROJECTID = ?");
                command.setInt(1, CurrentProject.projectId);
            } else {
                if (search.matches("[0-9]+")) {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT * FROM BUGS WHERE PROJECTID = ? AND BUGID = ?");
                    command.setInt(1, CurrentProject.projectId);
                    command.setInt(2, Integer.parseInt(search));
                } else {
                    System.out.println(" prepare the query...");

                    command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECtID = ? AND (BUGNAME LIKE ? OR SEVERITY LIKE ? OR TYBE LIKE ? OR STATUS LIKE ?)");
                    command.setInt(1, CurrentProject.projectId);
                    command.setString(2, "%" + search + "%");
                    command.setString(3, "%" + search + "%");
                    command.setString(4, "%" + search + "%");
                    command.setString(5, "%" + search + "%");
                }
            }
            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//SELECT BUG FROM DASHBOARD --------------------------------------------------------------------------------
    public String[] selectedBug(int id) {
        String retName = " ";
        String retPID = " ";
        String retTID = " ";
        String retDID = " ";
        String retDescription = " ";
        String retStatus = " ";
        String retSeverity = " ";
        String retType = " ";
        String retTNAME = "";
        String retDNAME = "";

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM BUGS WHERE BUGID = ?");
            command.setInt(1, id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();

            retName = resObj.getString("BUGNAME");
            System.out.println(retName);

            retPID = Integer.toString(resObj.getInt("PROJECTID"));
            System.out.println(retPID);

            retTID = Integer.toString(resObj.getInt("TESTERID"));
            System.out.println(retTID);

            retDID = Integer.toString(resObj.getInt("DEVELOPERID"));
            System.out.println(retDID);

            retDescription = resObj.getString("DESCRIPTION");
            System.out.println(retDescription);

            retStatus = resObj.getString("STATUS");
            System.out.println(retStatus);

            retSeverity = resObj.getString("SEVERITY");
            System.out.println(retSeverity);

            retType = resObj.getString("TYBE");
            System.out.println(retType);

            //RETURN TESTERNAME
            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERID = ?");
            command.setInt(1, Integer.parseInt(retTID));

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();
            retTNAME = resObj.getString("USERNAME");

            //RETURN DEVELOPERNAME
            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERID = ?");
            command.setInt(1, Integer.parseInt(retDID));

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();
            retDNAME = resObj.getString("USERNAME");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return new String[]{retName, retPID, retTNAME, retTID, retDNAME, retDescription, retStatus, retSeverity, retType};
    }

    //GENERATE BUGID AUTOMATICALLY --------------------------------------------------------------------------------------------
    public int GenerateBugID() {
        int BugId = 0;
        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT Max(BUGID) FROM BUGS");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();

            BugId = resObj.getInt(1) + 1;
            System.out.println(" BugId = " + BugId);

            System.out.println(" BugId = " + BugId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BugId;
    }

    //GET THE ID OF A SPECIFIC TESTER--------------------------------------------------------------------
    public int getTesterId(String name) {
        int retID = 0;
        try {
            getConnected("SELECT * FROM USERS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERNAME = ?");
            command.setString(1, name);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            resObj.next();
            retID = resObj.getInt("USERID");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retID;
    }
    
    // CHECK DUPLICITY
     public boolean ChechDuplicity(String name) {
         boolean found = false;
         try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT * FROM BUGS WHERE BUGNAME = ?");
            command.setString(1, name);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            
            found = resObj.next();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return found;
     }

    // ADD BUGINFO
    public int addBug(int id, String Name, String projectID, int TesterId, String Description, String status, String Severity, String Type) {
        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" starting insertion .....");
            command = conObj.prepareStatement("INSERT INTO BUGS  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, CURRENT_DATE)");
            command.setInt(1, id);
            command.setString(2, Name);
            command.setInt(3, Integer.parseInt(projectID));
            command.setInt(4, TesterId);
            command.setInt(5, 0);
            command.setString(6, Description);
            command.setDate(7, null);
            command.setDate(8, null);
            command.setString(9, Severity);
            command.setString(10, Type);
            command.setString(11, status);

            command.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 1;
    }

    //UPDATE BUGINFO -----------------------------------------------------------------------------------------------
    public int UpdateBug(String Description, String Severity, String Type, int Id) {
        try {
            String status = " ";
            getConnected("SELECT * FROM BUGS");

            command = conObj.prepareStatement("UPDATE BUGS SET DESCRIPTION = ?, SEVERITY = ?, TYBE = ? WHERE BUGID = ?");
            command.setInt(4, Id);

            command.setString(1, Description);
            command.setString(2, Severity);
            command.setString(3, Type);

            System.out.println(" excute the query...");

            command.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 1;
    }

    //DELETE BUG -----------------------------------------------------------------------------------------
    public int deleteBug(int id, String name) {
        String msg = "Delete " + name + "?";
        int reply = JOptionPane.showConfirmDialog(null, msg, "Delete", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                getConnected("SELECT * FROM BUGS");
                command = conObj.prepareStatement("DELETE FROM BUGS WHERE BUGID = ?");
                command.setInt(1, id);

                command.executeUpdate();

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return 1;
    }

    //VIEW NUMBER OF OPENED BUGS IN THE CARD --------------------------------------------------------------------------------
    public int ViewOpenedCard() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECTID = ? AND STATUS = ?");
            command.setInt(1, CurrentProject.projectId);
            command.setString(2, "O");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }

    //VIEW NUMBER OF CLOSED BUGS IN THE CARD --------------------------------------------------------------------------------
    public int ViewClosedCard() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECTID = ? AND STATUS = ?");
            command.setInt(1, CurrentProject.projectId);
            command.setString(2, "C");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }

    //VIEW NUMBER OF IN PROGRESS BUGS IN THE CARD --------------------------------------------------------------------------------
    public int ViewInProgressCard() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECTID = ? AND STATUS = ?");
            command.setInt(1, CurrentProject.projectId);
            command.setString(2, "I");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }

    //VIEW NUMBER OF TO BE TESTED BUGS IN THE CARD --------------------------------------------------------------------------------
    public int ViewToBeTestedCard() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECTID = ? AND STATUS = ?");
            command.setInt(1, CurrentProject.projectId);
            command.setString(2, "T");

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }
    
    //COUNT BUGS --------------------------------------------------------------------------------
    public int CountBugs() {
        //COUNTER
        int counter = 0;

        try {
            getConnected("SELECT * FROM BUGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECTID = ? ");
            command.setInt(1, CurrentProject.projectId);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while (resObj.next()) {
                counter++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter;
    }
}
