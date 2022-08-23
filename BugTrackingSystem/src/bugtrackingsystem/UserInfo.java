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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author m639a
 */
public final class UserInfo extends javax.swing.JFrame{

    /**
     * Creates new form UserInfo
     * @param choice
     */
    
    int edit = 0;
    int reply = -1;
    
    public UserInfo(int choice) {
        initComponents();
        getConnected();
        this.setLocationRelativeTo(null);
        
        if (choice == 0)
        {
            editButton.setVisible(false);
            deleteButton.setVisible(false);
            edit = 0;
        }
        else
        {
            try 
            {
                command = conObj.prepareStatement("SELECT * FROM USERS WHERE USERID = ?");
                command.setInt(1, choice);
                resObj = command.executeQuery();
                resObj.next();
                
                idField.setText(Integer.toString(resObj.getInt("USERID")));
                usernameField.setText(resObj.getString("USERNAME"));
                passwordField.setText(resObj.getString("PASSWORD"));
                if (resObj.getString("ROLE").equals("A"))
                {
                    roleBox.setSelectedIndex(1);
                }
                else if (resObj.getString("ROLE").equals("D"))
                {
                    roleBox.setSelectedIndex(2);
                }
                else if (resObj.getString("ROLE").equals("T"))
                {
                    roleBox.setSelectedIndex(3);
                }
                
                idField.setEnabled(false);
                usernameField.setEnabled(false);
                passwordField.setEnabled(false);
                roleBox.setEnabled(false);
            } 
            catch (SQLException ex) 
            {
                System.out.println(ex.getMessage());
            }
            edit = 1;
        }
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
            resObj = smtObj.executeQuery("SELECT * FROM USERS");
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        userInfoLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        roleBox = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(217, 217, 217));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(109, 177, 147));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");
        passwordLabel.setToolTipText("");
        passwordLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        cancelButton.setBackground(new java.awt.Color(133, 89, 165));
        cancelButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(50, 50, 50));
        cancelButton.setText("Cancel");
        cancelButton.setPreferredSize(new java.awt.Dimension(150, 45));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(133, 89, 165));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(50, 50, 50));
        deleteButton.setText("Delete");
        deleteButton.setPreferredSize(new java.awt.Dimension(150, 45));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(133, 89, 165));
        confirmButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(50, 50, 50));
        confirmButton.setText("Confirm");
        confirmButton.setPreferredSize(new java.awt.Dimension(150, 45));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        userInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        userInfoLabel.setForeground(new java.awt.Color(133, 89, 165));
        userInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/UserInfo-Purple-Small.png"))); // NOI18N
        userInfoLabel.setText("  User Information");
        userInfoLabel.setPreferredSize(new java.awt.Dimension(800, 90));

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(109, 177, 147));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username");
        usernameLabel.setToolTipText("");
        usernameLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(109, 177, 147));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("ID");
        idLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        roleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(109, 177, 147));
        roleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleLabel.setText("Role");
        roleLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idField.setBackground(new java.awt.Color(50, 50, 50));
        idField.setForeground(new java.awt.Color(217, 217, 217));
        idField.setPreferredSize(new java.awt.Dimension(200, 45));

        usernameField.setBackground(new java.awt.Color(50, 50, 50));
        usernameField.setForeground(new java.awt.Color(217, 217, 217));
        usernameField.setPreferredSize(new java.awt.Dimension(200, 45));

        passwordField.setBackground(new java.awt.Color(50, 50, 50));
        passwordField.setForeground(new java.awt.Color(217, 217, 217));
        passwordField.setPreferredSize(new java.awt.Dimension(200, 45));

        roleBox.setBackground(new java.awt.Color(50, 50, 50));
        roleBox.setForeground(new java.awt.Color(217, 217, 217));
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Admin", "Developer", "Tester" }));

        editButton.setBackground(new java.awt.Color(109, 177, 147));
        editButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        editButton.setForeground(new java.awt.Color(50, 50, 50));
        editButton.setText("Edit");
        editButton.setPreferredSize(new java.awt.Dimension(80, 45));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(userInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roleBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(userInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String msg = "Delete "+usernameField.getText()+"?";
        reply = JOptionPane.showConfirmDialog(null, msg, "Delete", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {
            try
            {
                command = conObj.prepareStatement("DELETE FROM USERS WHERE USERID = ?");
                command.setInt(1, Integer.parseInt(idField.getText()));
                command.executeUpdate();
                this.dispose();
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        else if (reply == JOptionPane.NO_OPTION){}
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if (edit == 0)
        {
            try
            {
                command = conObj.prepareStatement("INSERT INTO USERS (USERID, USERNAME, PASSWORD, ROLE, CREATIONDATE, CREATIONTIME) VALUES (?,?,?,?,CURRENT_DATE,CURRENT_TIME)");
                command.setInt(1, Integer.parseInt(idField.getText()));
                command.setString(2, usernameField.getText());
                command.setString(3, passwordField.getText());
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        idField.setEnabled(true);
        usernameField.setEnabled(true);
        passwordField.setEnabled(true);
        roleBox.setEnabled(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

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
        catch (UnsupportedLookAndFeelException ex)
        {
            System.out.println(ex.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserInfo(0).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel userInfoLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
