/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

/**
 *
 * @author Madan
 */
public class CurrentUser {

    public static String user;
    public static String role;
    public static int id;
    public CurrentUser(String uname, String role,int id) {
        CurrentUser.user = uname;
        CurrentUser.role = role;
        CurrentUser.id = id;
    }
}
