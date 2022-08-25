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
    
//View Bugstable in dashboard
    public void ViewBugTable() {
        try {

            System.out.println(" prepare the query...");
            
            command = conObj.prepareStatement("SELECT *FROM BUGS WHERE TESTERID = ?");
            command.setInt(1, CurrentUser.id);

            System.out.println(" excute the query...");
            
            resObj = command.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
