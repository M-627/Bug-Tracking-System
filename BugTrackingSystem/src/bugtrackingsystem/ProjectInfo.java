/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author m639a
 */
public final class ProjectInfo extends javax.swing.JFrame{

    /**
     * Creates new form UserInfo
     * @param choice
    */
    
    int edit = -1;
    
    public ProjectInfo(int choice) {
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
            addButton.setEnabled(false);
            removeButton.setEnabled(false);
            String[] arr = info.selectProject(choice);
            idField.setText(arr[0]);
            projectField.setText(arr[1]);
            idField.setEnabled(false);
            projectField.setEnabled(false);
            userIDField.setEnabled(false);
        }
    }
    
    
    AdminController info = new AdminController();
    ArrayList<String> newUsers = new ArrayList<>();
    ArrayList<String> newIDs = new ArrayList<>();
    ArrayList<String> removedUsers = new ArrayList<>();
    String[] temp = new String[4];
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userIDLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        projectInfoLabel = new javax.swing.JLabel();
        projectLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        usersLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        projectField = new javax.swing.JTextField();
        userIDField = new javax.swing.JTextField();
        usersBox = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(217, 217, 217));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        userIDLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel.setText("Assign User");
        userIDLabel.setToolTipText("");
        userIDLabel.setPreferredSize(new java.awt.Dimension(150, 45));

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

        projectInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        projectInfoLabel.setForeground(new java.awt.Color(133, 89, 165));
        projectInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/Projects-Purple-Small.png"))); // NOI18N
        projectInfoLabel.setText("  Project Information");
        projectInfoLabel.setPreferredSize(new java.awt.Dimension(800, 90));

        projectLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        projectLabel.setForeground(new java.awt.Color(109, 177, 147));
        projectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectLabel.setText("Project Name");
        projectLabel.setToolTipText("");
        projectLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(109, 177, 147));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("ID");
        idLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        usersLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        usersLabel.setForeground(new java.awt.Color(109, 177, 147));
        usersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersLabel.setText("Assigned Users");
        usersLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idField.setBackground(new java.awt.Color(50, 50, 50));
        idField.setForeground(new java.awt.Color(217, 217, 217));
        idField.setPreferredSize(new java.awt.Dimension(200, 45));

        projectField.setBackground(new java.awt.Color(50, 50, 50));
        projectField.setForeground(new java.awt.Color(217, 217, 217));
        projectField.setPreferredSize(new java.awt.Dimension(200, 45));

        userIDField.setBackground(new java.awt.Color(50, 50, 50));
        userIDField.setForeground(new java.awt.Color(217, 217, 217));
        userIDField.setPreferredSize(new java.awt.Dimension(200, 45));

        usersBox.setBackground(new java.awt.Color(50, 50, 50));
        usersBox.setForeground(new java.awt.Color(217, 217, 217));
        usersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

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

        removeButton.setBackground(new java.awt.Color(109, 177, 147));
        removeButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        removeButton.setForeground(new java.awt.Color(50, 50, 50));
        removeButton.setText("Remove");
        removeButton.setPreferredSize(new java.awt.Dimension(120, 45));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(109, 177, 147));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        addButton.setForeground(new java.awt.Color(50, 50, 50));
        addButton.setText("Add");
        addButton.setPreferredSize(new java.awt.Dimension(120, 45));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projectField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userIDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(projectInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(projectInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usersBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
        int result = info.deleteUser(idField.getText(), projectField.getText());
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
            if (idField.getText().isEmpty() || projectField.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please make sure you have specified the ID and name of the project!");
            else
            {
                result = info.addProject(idField.getText(), projectField.getText());
            }
        }
        else
        {
            if (idField.getText().isEmpty() || projectField.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please make sure you have specified the ID and name of the project!");
            else
            {
                //result = info.editProject(idField.getText(), projectField.getText());
            }
        }
        if (!newUsers.isEmpty())
        {
            info.assignUsers(Integer.parseInt(projectField.getText()), newUsers, edit);
        }
        if (result == 1)
        {    
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please update the table!");
        }        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        addButton.setEnabled(true);
        confirmButton.setEnabled(true);
        projectField.setEnabled(true);
        removeButton.setEnabled(true);
        userIDField.setEnabled(true);
        editButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if (edit == 0)
        {
            int rem = usersBox.getSelectedIndex();
            newUsers.remove(rem - 1);
            usersBox.removeItemAt(rem);
        }
        else if (edit == 1)
        {
            
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int count = 0;
        if (newUsers.isEmpty())
        {
            newUsers.add(userIDField.getText());
            temp = info.selectUser(Integer.parseInt(newUsers.get(count)));
            count++;
        }
        else
        {
            for (int i = 0; i < newUsers.size(); i++)
            {
                if (!newUsers.get(i).equals( userIDField.getText()))
                    newUsers.add(userIDField.getText());
                else
                    JOptionPane.showMessageDialog(null, "A user can be only added");
            }
        }
        //temp = info.selectUser(Integer.parseInt(newUsers.get(i)));
        if (!temp[1].equals(" ") || !temp[3].equals("A"))
        {
            usersBox.addItem(temp[1]);
            //i++;
        }
        else if (temp[3].equals("A"))
            JOptionPane.showMessageDialog(null, "This user cannot be assigned a project.");
        else
            JOptionPane.showMessageDialog(null, "This user doesn't exist.");
    }//GEN-LAST:event_addButtonActionPerformed

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
            new ProjectInfo(0).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField projectField;
    private javax.swing.JLabel projectInfoLabel;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField userIDField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JComboBox<String> usersBox;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
}
