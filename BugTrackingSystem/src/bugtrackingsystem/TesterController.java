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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mariam
 */
public class TesterController extends dataConnection {
    
    // counter to count number of bugs to be tested
    private int counter = 0;
    // counter to count number of assigned projects
    private int counter2 = 0;

    //View BugsTable in Dashboard
    public void ViewBugTable() {
        try {
            System.out.println(" connecting to database...");

            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj = conObj.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE TESTERID = ? ORDER BY BUGID ASC");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");

            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //view number of To be tested Bugs in the card
    public int ViewBugCard() {
        try {

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
