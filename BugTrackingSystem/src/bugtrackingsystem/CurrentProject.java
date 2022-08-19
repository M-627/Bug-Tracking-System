/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

/**
 *
 * @author mariam
 */
public class CurrentProject {
    public static String projectId;
    public static String projectIName;
    public static String projectDate;
    

    public CurrentProject(String id ,String name ,String date) {
        CurrentProject.projectId = id;
        CurrentProject.projectIName = name;
        CurrentProject.projectDate = date;
       }
    }
   
