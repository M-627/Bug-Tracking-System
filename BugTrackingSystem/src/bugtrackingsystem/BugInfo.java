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
public final class BugInfo extends javax.swing.JFrame{

    /**
     * Creates new form UserInfo
     * @param choice
    */
    
    String[] bug = new String[5];
    String[] dev = new String[4];
    
    AdminController info = new AdminController();
    
    public BugInfo(int choice) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
        bug = info.selectBug(String.valueOf(choice));
        
        idField.setText(""+choice+"");
        bugField.setText(bug[0]);
        devIDField.setText(bug[1]);
        dev = info.selectUser(Integer.parseInt(bug[1]));
        devField.setText(dev[1]);
        typeBox.setSelectedItem(bug[2]);
        severityBox.setSelectedItem(bug[3]);
        descArea.setText(bug[4]);
        
        idField.setEnabled(false);
        bugField.setEnabled(false);
        devField.setEnabled(false);
        descArea.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userIDLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        projectInfoLabel = new javax.swing.JLabel();
        projectLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        bugField = new javax.swing.JTextField();
        devField = new javax.swing.JTextField();
        userIDLabel1 = new javax.swing.JLabel();
        userIDLabel2 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox<>();
        severityBox = new javax.swing.JComboBox<>();
        userIDLabel3 = new javax.swing.JLabel();
        devIDField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        userIDLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(217, 217, 217));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        userIDLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel.setText("Type");
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
        projectInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/Bug-Purple-Small.png"))); // NOI18N
        projectInfoLabel.setText("  Bug Information");
        projectInfoLabel.setPreferredSize(new java.awt.Dimension(800, 90));

        projectLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        projectLabel.setForeground(new java.awt.Color(109, 177, 147));
        projectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectLabel.setText("Bug Name");
        projectLabel.setToolTipText("");
        projectLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(109, 177, 147));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("Bug ID");
        idLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        idField.setBackground(new java.awt.Color(50, 50, 50));
        idField.setForeground(new java.awt.Color(217, 217, 217));
        idField.setPreferredSize(new java.awt.Dimension(200, 45));

        bugField.setBackground(new java.awt.Color(50, 50, 50));
        bugField.setForeground(new java.awt.Color(217, 217, 217));
        bugField.setPreferredSize(new java.awt.Dimension(200, 45));

        devField.setBackground(new java.awt.Color(50, 50, 50));
        devField.setForeground(new java.awt.Color(217, 217, 217));
        devField.setPreferredSize(new java.awt.Dimension(200, 45));

        userIDLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel1.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel1.setText("Developer");
        userIDLabel1.setToolTipText("");
        userIDLabel1.setPreferredSize(new java.awt.Dimension(150, 45));

        userIDLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel2.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel2.setText("Severity");
        userIDLabel2.setToolTipText("");
        userIDLabel2.setPreferredSize(new java.awt.Dimension(150, 45));

        typeBox.setBackground(new java.awt.Color(50, 50, 50));
        typeBox.setForeground(new java.awt.Color(217, 217, 217));
        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Content", "Functional", "Visual" }));
        typeBox.setPreferredSize(new java.awt.Dimension(200, 45));

        severityBox.setBackground(new java.awt.Color(50, 50, 50));
        severityBox.setForeground(new java.awt.Color(217, 217, 217));
        severityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "Major", "Moderate", "Minor", "Cosmetic" }));
        severityBox.setPreferredSize(new java.awt.Dimension(200, 45));

        userIDLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel3.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel3.setText("Developer ID");
        userIDLabel3.setToolTipText("");
        userIDLabel3.setPreferredSize(new java.awt.Dimension(150, 45));

        devIDField.setBackground(new java.awt.Color(50, 50, 50));
        devIDField.setForeground(new java.awt.Color(217, 217, 217));
        devIDField.setPreferredSize(new java.awt.Dimension(200, 45));

        descArea.setBackground(new java.awt.Color(50, 50, 50));
        descArea.setColumns(20);
        descArea.setForeground(new java.awt.Color(217, 217, 217));
        descArea.setRows(5);
        descArea.setPreferredSize(new java.awt.Dimension(320, 90));
        descArea.setSelectedTextColor(new java.awt.Color(99, 99, 99));
        descArea.setSelectionColor(new java.awt.Color(222, 222, 222));
        jScrollPane1.setViewportView(descArea);

        userIDLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userIDLabel4.setForeground(new java.awt.Color(109, 177, 147));
        userIDLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDLabel4.setText("Description");
        userIDLabel4.setToolTipText("");
        userIDLabel4.setPreferredSize(new java.awt.Dimension(150, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(projectInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(devIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(userIDLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(devField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(projectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bugField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(userIDLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(severityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(projectInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bugField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userIDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(severityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(userIDLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
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

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
     
        int reply;
        if (devIDField.getText().isEmpty())
        {
            reply = JOptionPane.showConfirmDialog(null, "Are you sure you don't want to assign a developer?", "Warning!", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                info.updateBug(new String[] {idField.getText(),typeBox.getItemAt(typeBox.getSelectedIndex()), severityBox.getItemAt(severityBox.getSelectedIndex())});
                this.dispose();
                JOptionPane.showMessageDialog(null, "Please update the table!");
            }
        }
        else
        {
            dev = info.selectUser(Integer.parseInt(devIDField.getText()));
            if (dev[3].equals("D"))
            {
                info.updateBug(new String[] {idField.getText(), typeBox.getItemAt(typeBox.getSelectedIndex()), severityBox.getItemAt(severityBox.getSelectedIndex()), devIDField.getText()});
                this.dispose();
                JOptionPane.showMessageDialog(null, "Please update the table!");
            }
            else if (dev[3].equals(" "))
            {
                JOptionPane.showMessageDialog(null, "This user doesn't exit.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This user cannot be assigned.");
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            new BugInfo(12).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bugField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextArea descArea;
    private javax.swing.JTextField devField;
    private javax.swing.JTextField devIDField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectInfoLabel;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JComboBox<String> severityBox;
    private javax.swing.JComboBox<String> typeBox;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel userIDLabel1;
    private javax.swing.JLabel userIDLabel2;
    private javax.swing.JLabel userIDLabel3;
    private javax.swing.JLabel userIDLabel4;
    // End of variables declaration//GEN-END:variables
}
