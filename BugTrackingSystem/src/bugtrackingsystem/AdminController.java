/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.sql.*;

/**
 *
 * @author m639a
 */
public class AdminController extends dataConnection
{

    public AdminController() {
    }
    
    public void viewUsers()
    {
        try 
        {
            command = conObj.prepareStatement("SELECT * FROM USERS ORDER BY USERID ASC");
            resObj = command.executeQuery();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void viewProjects()
    {
        try 
        {
            command = conObj.prepareStatement("SELECT * FROM PROJECTS ORDER BY PROJECTID ASC");
            resObj = command.executeQuery();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void viewBugs()
    {
        try 
        {
            command = conObj.prepareStatement("SELECT * FROM BUGS ORDER BY BUGID ASC");
            resObj = command.executeQuery();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void viewActivity()
    {
        try
        {
            command = conObj.prepareStatement("SELECT * FROM ACTIVITIES ORDER BY DATE DESC, TIME DESC");
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void viewAttempts()
    {
        try
        {
            command = conObj.prepareStatement("SELECT * FROM FAILEDLOGINS ORDER BY DATE DESC, TIME DESC");
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void searchOmni(int table, String search)
    {
        try
        {
            if (search.isEmpty())
            {
                if (table == 0)
                    command = conObj.prepareStatement("SELECT * FROM ACTIVITIES ORDER BY DATE DESC, TIME DESC");
                else if (table == 1)
                    command = conObj.prepareStatement("SELECT * FROM FAILEDLOGINS ORDER BY DATE DESC, TIME DESC");
            }
            else
            {
                if (table == 0)
                {
                    command = conObj.prepareStatement("SELECT * FROM ACTIVITIES WHERE USERNAME LIKE ? OR ROLE LIKE ? OR ACTION LIKE ?");
                    command.setString(1, "%"+search+"%");
                    command.setString(2, "%"+search+"%");
                    command.setString(3, "%"+search+"%");
                }
                else if (table == 1)
                {
                    command = conObj.prepareStatement("SELECT * FROM FAILEDLOGINS WHERE USERNAME LIKE ? OR PASSWORD LIKE ?");
                    command.setString(1, "%"+search+"%");
                    command.setString(2, "%"+search+"%");
                }
            }
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void searchUsers(String search)
    {
        try
        {
            if (search.isEmpty())
                command = conObj.prepareStatement("SELECT * FROM USERS ORDER BY USERID ASC");
            else
            {
                if (search.matches("[0-9]+"))
                {
                    command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERID = ?");
                    command.setInt(1, Integer.parseInt(search));
                }
                else
                {
                    command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERNAME LIKE ? OR PASSWORD LIKE ? OR ROLE LIKE ?");
                    command.setString(1, "%"+search+"%");
                    command.setString(2, "%"+search+"%");
                    command.setString(3, "%"+search+"%");
                }
            }
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void searchProjects(String search)
    {
        try
        {
            if (search.isEmpty())
                command = conObj.prepareStatement("SELECT * FROM PROJECTS ORDER BY PROJECTID ASC");
            else
            {
                if (search.matches("[0-9]+"))
                {
                    command = conObj.prepareStatement("SELECT * FROM PROJECTS WHERE PROJECTID = ?");
                    command.setInt(1, Integer.parseInt(search));
                }
                else
                {
                    command = conObj.prepareStatement("SELECT * FROM PROJECTS WHERE PROJECTNAME LIKE ?");
                    command.setString(1, "%"+search+"%");
                }
            }
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void searchBugs(String search)
    {
        try
        {
            if (search.isEmpty())
            {
                command = conObj.prepareStatement("SELECT * FROM BUGS ORDER BY BUGID ASC");
            }
            else
            {
                if (search.matches("[0-9]+"))
                {
                    command = conObj.prepareStatement("SELECT * FROM BUGS WHERE BUGID = ? OR PROJECTID = ? OR TESTERID = ? OR DEVELOPERID = ?");
                    command.setInt(1, Integer.parseInt(search));
                    command.setInt(2, Integer.parseInt(search));
                    command.setInt(3, Integer.parseInt(search));
                    command.setInt(4, Integer.parseInt(search));
                }
                else
                {
                    command = conObj.prepareStatement("SELECT * FROM BUGS WHERE BUGNAME LIKE ? OR DESCRIPTION LIKE ?");
                    command.setString(1, "%"+search+"%");
                    command.setString(2, "%"+search+"%");
                }
            }
            resObj = command.executeQuery();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void addUser(int edit, String id, String usr, String pwd, int role)
    {
        if (edit == 0)
        {
            try
            {
                String box = " ";
                conObj = DriverManager.getConnection(host, uname, pass);
                command = conObj.prepareStatement("INSERT INTO USERS VALUES (?, ?, ?, ?, CURRENT_DATE, CURRENT_TIME)");
                command.setInt(1, Integer.parseInt(id));
                command.setString(2, usr);
                command.setString(3, pwd);
                switch (role) 
                {
                    case 0:
                        box = "A";
                        break;
                    case 1:
                        box = "D";
                        break;
                    case 2:
                        box = "T";
                        break;
                    default:
                        break;
                }
                command.setString(4, box);
                command.executeUpdate();
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
