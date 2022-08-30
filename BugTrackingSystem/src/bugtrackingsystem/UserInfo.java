/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author m639a
 */
public final class UserInfo extends javax.swing.JFrame{

    /**
     * Creates new form UserInfo
     * @param choice
    */
    
    int edit = -1;
    
    public UserInfo(int choice) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        if (choice == 0)
        {
            deleteButton.setVisible(false);
            editButton.setVisible(false);
            edit = 0;
        }
        else
        {
            edit = 1;
            confirmButton.setEnabled(false);
            String[] arr = info.selectUser(choice);
            idField.setText(arr[0]);
            usernameField.setText(arr[1]);
            passwordField.setText(arr[2]);
            switch (arr[3])
            {
                case "A":
                    roleBox.setSelectedIndex(0);
                    break;
                case "D":
                    roleBox.setSelectedIndex(1);
                    break;
                case "T":
                    roleBox.setSelectedIndex(2);
                    break;
                default:
                    break;
            }
            idField.setEnabled(false);
            usernameField.setEnabled(false);
            passwordField.setEnabled(false);
            roleBox.setEnabled(false);
        }
    }
    
    AdminController info = new AdminController();
    
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
        idLabel.setText("User ID");
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
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Developer", "Tester" }));

        editButton.setBackground(new java.awt.Color(109, 177, 147));
        editButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        editButton.setForeground(new java.awt.Color(50, 50, 50));
        editButton.setText("Edit");
        editButton.setPreferredSize(new java.awt.Dimension(120, 45));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
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
        int result = info.deleteUser(idField.getText(), usernameField.getText());
        if (result == 1)
        {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please update the table!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        int result = -1;
        
        if (edit == 0)
        {
            if (idField.getText().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please fill all the required fields!");
            else
            {
                result = info.addUser(idField.getText(), usernameField.getText(), passwordField.getText(), roleBox.getSelectedIndex());
            }
        }
        else
        {
            if (idField.getText().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please fill all the required fields!");
            else
            {
                result = info.editUser(idField.getText(), usernameField.getText(), passwordField.getText(), roleBox.getSelectedIndex());
            }
        }
        if (result == 1)
        {    
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please update the table!");
        }        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        usernameField.setEnabled(true);
        passwordField.setEnabled(true);
        roleBox.setEnabled(true);
        confirmButton.setEnabled(true);
        editButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

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
