/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author m639a
 */
public class AdminController extends dataConnection
{

    public AdminController() {
    }
    
    
    
//  Activity Screen Operations    
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
//  Activity Screen Operations End

    
    
//  Users Screen Operations   
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
    
    public int addUser(String id, String usr, String pwd, int role)
    {
        try
        {
            String box = " ";
            int found = 0;
            getConnected("SELECT * FROM USERS");
            
            while (resObj.next())
            {
                if (resObj.getInt("USERID") == Integer.parseInt(id))
                {
                    found = 1;
                    break;
                }
            }
            
            if (found == 1)
            {
                JOptionPane.showMessageDialog(null, "This ID is unavailable.");
                return 0;
            }
            else
            {
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
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return 1;
    }
    
    public int deleteUser(String id, String usr)
    {
        String msg = "Delete "+usr+"?";
        int reply = -1;
        reply = JOptionPane.showConfirmDialog(null, msg, "Delete", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {
            try
            {
                getConnected("SELECT * FROM USERS");
                command = conObj.prepareStatement("DELETE FROM USERS WHERE USERID = ?");
                command.setInt(1, Integer.parseInt(id));
                command.executeUpdate();
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
            return 1;
        }
        return 0;
    }
    
    public String[] selectUser(int id)
    {
        String retID = " ";
        String retUsr = " ";
        String retPwd = " ";
        String retRole = " ";
        
        try 
            {
                getConnected("SELECT * FROM USERS");
                command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERID = ?");
                command.setInt(1, id);
                resObj = command.executeQuery();
                resObj.next();
                
                retID = Integer.toString(resObj.getInt("USERID"));
                retUsr = resObj.getString("USERNAME");
                retPwd = resObj.getString("PASSWORD");
                switch (resObj.getString("ROLE"))
                {
                    case "A":
                        retRole = "A";
                        break;
                    case "D":
                        retRole = "D";
                        break;
                    case "T":
                        retRole = "T";
                        break;
                    default:
                        break;
                }
            } 
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return new String[] {retID, retUsr, retPwd, retRole};
    }
    
    public int editUser(String id, String usr, String pwd, int role)
    {
        try
        {
            String box = " ";
            getConnected("SELECT * FROM USERS");
            
            command = conObj.prepareStatement("UPDATE USERS SET USERNAME = ?, PASSWORD = ?, ROLE = ? WHERE USERID = ?");
            command.setString(1, usr);
            command.setString(2, pwd);
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
            command.setString(3, box);
            command.setInt(4, Integer.parseInt(id));
            command.executeUpdate();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return 1;
    }
//  Users Screen Operations End
    
    
    
// Projects Screen Operations
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
    
    public int addProject(String id, String usr)
    {
        try
        {
            String box = " ";
            int found = 0;
            getConnected("SELECT * FROM PROJECTS");
            
            while (resObj.next())
            {
                if (resObj.getInt("PROJECTID") == Integer.parseInt(id))
                {
                    found = 1;
                    break;
                }
            }
            
            if (found == 1)
            {
                JOptionPane.showMessageDialog(null, "This ID is unavailable.");
                return 0;
            }
            else
            {
                command = conObj.prepareStatement("INSERT INTO PROJECTS VALUES (?, ?, CURRENT_DATE, CURRENT_TIME)");
                command.setInt(1, Integer.parseInt(id));
                command.setString(2, usr);
                command.executeUpdate();
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return 1;
    }
    
    public void assignUsers(int id, ArrayList<String> users, int edit)
    {
        try 
        {
            getConnected("SELECT * FROM ASSIGNMENTS");
            if (edit == 0)
            {
                for (int i = 0; i < users.size(); i++)
                {
                    command = conObj.prepareStatement("INSERT INTO ASSIGNMENTS VALUES (USERID = ?, PROJECTID = ?)");
                    command.setInt(1, Integer.parseInt(users.get(i)));
                    command.setInt(2, id);
                    command.executeUpdate();
                }
            }
            else if (edit == 1)
            {
                for (int i = 0; i < users.size(); i++)
                {
                    command = conObj.prepareStatement("UPDATE ASSIGNMENTS SET USERID = ?, PROJECTID = ?");
                    command.setInt(1, Integer.parseInt(users.get(i)));
                    command.setInt(2, id);
                    command.executeUpdate();
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public String[] selectProject(int id)
    {
        String retID = " ";
        String retUsr = " ";
        
        try 
            {
                getConnected("SELECT * FROM PROJECTS");
                command = conObj.prepareStatement("SELECT * FROM PROJECTS WHERE PROJECTID = ?");
                command.setInt(1, id);
                resObj = command.executeQuery();
                resObj.next();
                
                retID = Integer.toString(resObj.getInt("PROJECTID"));
                retUsr = resObj.getString("PROJECTNAME");
            } 
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return new String[] {retID, retUsr};
    }
// Projects Screen Operations End

    
    
// Bugs Screen Operations
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
// Bugs Screen Operations    
}
