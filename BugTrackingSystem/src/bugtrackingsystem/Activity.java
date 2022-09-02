/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author m639a
 */
public class Activity extends dataConnection
{
    public void activity(String description)
    {
        try
        {
            getConnected("SELECT * FROM ACTIVITIES");
            
            command = conObj.prepareStatement("INSERT INTO ACTIVITIES VALUES (?, ?, ?, CURRENT_DATE, CURRENT_TIME)");      
            command.setString(1, CurrentUser.user);
            command.setString(2, CurrentUser.role);
            command.setString(3, description);
            command.executeUpdate();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
}
