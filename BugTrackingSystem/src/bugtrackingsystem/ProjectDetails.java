/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mariam
 */
public class ProjectDetails extends javax.swing.JFrame implements Colors {

    /**
     * Creates new form ProjectDetails
     */
    
    //CONTROLLER
    TesterController ProjectInfo = new TesterController();
    
    public ProjectDetails() {
        initComponents();
        //GETCONNECTED
        ProjectInfo.ViewUsersTable();
         Users.setModel(DbUtils.resultSetToTableModel(ProjectInfo.getResObj()));
         // SET THE JFRAME TO BE IN THE CENTER 
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProjectsDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Users = new javax.swing.JTable();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 527));

        ProjectsDetails.setBackground(new java.awt.Color(50, 50, 50));
        ProjectsDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectsDetails.setForeground(new java.awt.Color(133, 89, 165));
        ProjectsDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectsDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/assigned peple - small.png"))); // NOI18N
        ProjectsDetails.setText("  Assigned people on the same project:");

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setForeground(new java.awt.Color(217, 217, 217));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(606, 318));

        Users.setBackground(new java.awt.Color(50, 50, 50));
        Users.setForeground(new java.awt.Color(217, 217, 217));
        Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Users.setToolTipText("");
        Users.setIntercellSpacing(new java.awt.Dimension(1, 6));
        Users.setPreferredSize(new java.awt.Dimension(606, 318));
        Users.setRowHeight(40);
        Users.setSelectionBackground(new java.awt.Color(109, 177, 147));
        Users.setSelectionForeground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setViewportView(Users);

        CancelButton.setBackground(new java.awt.Color(109, 177, 147));
        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(50, 50, 50));
        CancelButton.setText("Cancel");
        CancelButton.setPreferredSize(new java.awt.Dimension(99, 43));
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ProjectsDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseEntered
         CancelButton.setBackground(Purple);
    }//GEN-LAST:event_CancelButtonMouseEntered

    private void CancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseExited
         CancelButton.setBackground(Purple);
    }//GEN-LAST:event_CancelButtonMouseExited

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ProjectsDetails;
    private javax.swing.JTable Users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
