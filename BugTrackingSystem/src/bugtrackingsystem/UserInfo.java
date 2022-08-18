/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import static bugtrackingsystem.dataConnection.host;
import static bugtrackingsystem.dataConnection.pass;
import static bugtrackingsystem.dataConnection.uname;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author m639a
 */
public class UserInfo extends javax.swing.JFrame {

    /**
     * Creates new form UserInfo
     */
    public UserInfo() {
        initComponents();
        getConnected();
        this.setLocationRelativeTo(null);
    }
    
    //DB connection objects
    Connection conObj = null;
    Statement smtObj = null;
    ResultSet resObj = null;
    
    
    //Prepared Statement for DB queries
    PreparedStatement command;
    
    public void getConnected()
    {
        try
        {
            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj = conObj.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserInfo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
