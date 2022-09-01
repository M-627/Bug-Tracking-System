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
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mariam
 */
public class Rating extends javax.swing.JFrame implements Colors{

    
    // DB connection objects
    public Connection con = null;
    public Statement st = null;
    public ResultSet rs = null;
    // prepared statement for queries
    PreparedStatement command;
    
    // counter &ID
    int counter = 0;
    int id = 0 ;
    
    public Rating() {
        initComponents();
    }

    //generating BugID automatically
    private void GenerateID(){
        
        try{
            con = DriverManager.getConnection(host, uname, pass);
            command = con.prepareStatement("SELECT MAX(ID) FROM BUG.RATINGS");
            rs = command.executeQuery();
            rs.next();
           id = rs.getInt(1)+1;
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    // save rating
    public void insertRating(){
       try
        {
             System.out.println("Generating id automatically...");
            GenerateID();
            System.out.println("id= " + id);
            
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(host, uname, pass);

            System.out.println("inserting data...");
            command = con.prepareStatement("INSERT INTO RATINGS VALUES (?,?,?,?)");
            command.setInt(1, id);
            command.setString(2, CurrentUser.user);
            command.setString(3, CurrentUser.role);
            command.setInt(4, counter);

            System.out.println("excution process...");
            command.executeUpdate();

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
        SystemName = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        SystemName1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 466));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 466));

        SystemName.setBackground(new java.awt.Color(207, 222, 231));
        SystemName.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SystemName.setForeground(new java.awt.Color(133, 89, 165));
        SystemName.setText("Help us to improve ourself by rating the application:");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/logo.png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(190, 190));

        SystemName1.setBackground(new java.awt.Color(207, 222, 231));
        SystemName1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        SystemName1.setForeground(new java.awt.Color(133, 89, 165));
        SystemName1.setText("Bug Tracking System");

        L2.setBackground(new java.awt.Color(50, 50, 50));
        L2.setForeground(new java.awt.Color(50, 50, 50));
        L2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(133, 89, 165)));
        L2.setOpaque(true);
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L2MouseExited(evt);
            }
        });

        L3.setBackground(new java.awt.Color(50, 50, 50));
        L3.setForeground(new java.awt.Color(50, 50, 50));
        L3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(133, 89, 165)));
        L3.setOpaque(true);
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L3MouseExited(evt);
            }
        });

        L1.setBackground(new java.awt.Color(50, 50, 50));
        L1.setForeground(new java.awt.Color(50, 50, 50));
        L1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(133, 89, 165)));
        L1.setOpaque(true);
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L1MouseExited(evt);
            }
        });

        L4.setBackground(new java.awt.Color(50, 50, 50));
        L4.setForeground(new java.awt.Color(50, 50, 50));
        L4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(133, 89, 165)));
        L4.setOpaque(true);
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L4MouseExited(evt);
            }
        });

        L5.setBackground(new java.awt.Color(50, 50, 50));
        L5.setForeground(new java.awt.Color(50, 50, 50));
        L5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(133, 89, 165)));
        L5.setOpaque(true);
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L5MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 89, 165));
        jLabel1.setText("1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 89, 165));
        jLabel2.setText("5");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(133, 89, 165));
        jLabel3.setText("2");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 89, 165));
        jLabel4.setText("3");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 89, 165));
        jLabel5.setText("4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(SystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(SystemName1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(SystemName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SystemName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(93, 93, 93))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        L1.setBackground(Purple);
        counter = 1;
        insertRating();
        
        System.out.println("rating added successfully...");
        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
         new Login().setVisible(true);

    }//GEN-LAST:event_L1MouseClicked

    private void L1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseEntered
        L1.setBackground(Purple);
        
    }//GEN-LAST:event_L1MouseEntered

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
         L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
        L4.setBackground(Purple);
        counter = 4;
        insertRating();
        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_L4MouseClicked

    private void L1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseExited
          L1.setBackground(Black);
    }//GEN-LAST:event_L1MouseExited

    private void L2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseEntered
         L1.setBackground(Purple);
         L2.setBackground(Purple);
    }//GEN-LAST:event_L2MouseEntered

    private void L2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseExited
         L2.setBackground(Black);
    }//GEN-LAST:event_L2MouseExited

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
        L1.setBackground(Purple);
        L2.setBackground(Purple);
        counter = 2;
        insertRating();
        
        System.out.println("rating added successfully...");
        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_L2MouseClicked

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
        counter = 3;
        insertRating();
        
        System.out.println("rating added successfully...");
        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_L3MouseClicked

    private void L3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseEntered
        L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
    }//GEN-LAST:event_L3MouseEntered

    private void L3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseExited
       L3.setBackground(Black);
    }//GEN-LAST:event_L3MouseExited

    private void L4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseEntered
        L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
        L4.setBackground(Purple);
    }//GEN-LAST:event_L4MouseEntered

    private void L4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseExited
        L4.setBackground(Black);
    }//GEN-LAST:event_L4MouseExited

    private void L5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseEntered
        L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
        L4.setBackground(Purple);
        L5.setBackground(Purple);
    }//GEN-LAST:event_L5MouseEntered

    private void L5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseExited
         L5.setBackground(Black);
    }//GEN-LAST:event_L5MouseExited

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
       L1.setBackground(Purple);
        L2.setBackground(Purple);
        L3.setBackground(Purple);
        L4.setBackground(Purple);
        L5.setBackground(Purple);
        counter = 5;
        insertRating();
        
        System.out.println("rating added successfully...");
        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_L5MouseClicked

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
                new Rating().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel SystemName;
    private javax.swing.JLabel SystemName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
