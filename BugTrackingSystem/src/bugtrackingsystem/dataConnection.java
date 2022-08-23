/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.sql.*;

/**
 *
 * @author mariam
 */
public abstract class dataConnection {

    public dataConnection(){    
    }
    
    
    public static String host = "jdbc:derby://localhost:1527/Bug Tracker System";
    public static String uname = "Bug";
    public static String pass = "12345";
    
    Connection conObj = null;
    Statement smtObj = null;
    ResultSet resObj = null;
    PreparedStatement command = null;

    public Connection getConObj() {
        return conObj;
    }

    public Statement getSmtObj() {
        return smtObj;
    }

    public ResultSet getResObj() {
        return resObj;
    }

    public PreparedStatement getCommand() {
        return command;
    }
    
    
    
    public void getConnected(String query)
    {
        try
        {
            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj = conObj.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
            resObj = smtObj.executeQuery(query);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
