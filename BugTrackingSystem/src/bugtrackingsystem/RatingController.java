/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;


import java.sql.SQLException;


/**
 *
 * @author mariam
 */
public class RatingController extends dataConnection{

    public RatingController() {
    }

    //GENERATE ID AUTOMATICALLY 
    private int GenerateID() {
        int id = 0;
        try {
            getConnected("SELECT * FROM RATINGS");

            System.out.println(" prepare the query...");

            command = conObj.prepareStatement("SELECT MAX(ID) FROM BUG.RATINGS");

            System.out.println(" prepare the query...");
            resObj = command.executeQuery();

            resObj.next();

            id = resObj.getInt(1) + 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    // SAVE RATING
    public void insertRating(int rate, String usr, String role) {
        try {
            System.out.println("Generating id automatically...");
            int id = GenerateID();
            System.out.println("id= " + id);

            getConnected("SELECT * FROM RATINGS");

            System.out.println("inserting data...");
            command = conObj.prepareStatement("INSERT INTO RATINGS VALUES (?,?,?,?)");
            command.setInt(1, id);
            command.setString(2, usr);
            command.setString(3, role);
            command.setInt(4, rate);

            System.out.println("excution process...");
            command.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
