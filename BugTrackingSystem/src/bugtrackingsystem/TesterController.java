/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import static bugtrackingsystem.dataConnection.host;
import static bugtrackingsystem.dataConnection.pass;
import static bugtrackingsystem.dataConnection.uname;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mariam
 */
public class TesterController extends dataConnection {
    
   
   
    // counter to count number of assigned projects
    private int counter2 = 0;

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
    public String[] selectBug(int id)
    {
        String retID = " ";
        String retName = " ";
        String retSeverity = " ";
        String retType = " ";
        String retDescription = " ";
        
        try 
            {
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
                retType = resObj.getString("TYPE");
                retDescription = resObj.getString("DESCRIPTION");
            } 
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return new String[] {retID, retName, retSeverity, retType, retDescription};
    }
    
    //EDIT BUG STATUS   --------------------------------------------------------------------------------
    public int editBug(int Status)
    {
        try
        {
            String status = " ";
            getConnected("SELECT * FROM BUGS");
            
            command = conObj.prepareStatement("UPDATE BUGS SET STATUS = ? WHERE BUGID = ?");
            command.setInt(2, CurrentBug.BugId);
            switch (Status)
            {
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
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return 1;
    }
    
    
    
    
    
    
    
    //view projectsTable 
    public void ViewProjectsTable() {
        try {
            System.out.println(" prepare the query...");
            command = conObj.prepareStatement("SELECT PROJECTS.PROJECTID , PROJECTS.PROJECTNAME , PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON ASSIGNMENTS.PROJECTID = PROJECTS.PROJECTID WHERE ASSIGNMENTS.USERID = ? ORDER BY PROJECTID ASC");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");
            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //view number of Assigned projects in the card
    public int ViewProjectCard() {
        try {

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM ASSIGNMENTS WHERE USERID = ?");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
            while(resObj.next()) {
                counter2++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return counter2;
    }
    
    //------------------------------------------------------BUGTRIAL CODES-----------------------------------------------------------------------------------------
    //View BugTable for specific project
    public void ViewBugTable2() {
        try {
            System.out.println(" connecting to database...");
            
            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj = conObj.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println(" prepare the query...");
            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE PROJECtID = ?");
            command.setInt(1, CurrentProject.projectId);

            System.out.println(" excute the query...");
            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //generate BugId
    public int GenerateBugID() {
        int BugId = 0;
        try {
            System.out.println(" connecting to database...");
            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj= conObj.createStatement();

            System.out.println(" excute the query...");
            resObj = smtObj.executeQuery("SELECT Max(BUGID) FROM BUGS");
            resObj.next();
           BugId = resObj.getInt(1) + 1;
            System.out.println(" BugId = " + BugId);
            } catch (Exception e) {
            e.printStackTrace();
        }
        return BugId; 
    }
}
