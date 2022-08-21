/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.UIManager;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import static bugtrackingsystem.dataConnection.host;
import static bugtrackingsystem.dataConnection.pass;
import static bugtrackingsystem.dataConnection.uname;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
/**
 *
 * @author mariam
 */

  //DB connection objects
   
public class Devoloper extends javax.swing.JFrame implements dataConnection {

    public Devoloper() {
        initComponents();
        getConnected();
        this.setLocationRelativeTo(null);

    }
    Connection conObj = null;
    Statement smtObj = null;
    ResultSet resObj = null;
    
     PreparedStatement command;
    
    public void getConnected()
    {
        try
        {
            conObj = DriverManager.getConnection(host, uname, pass);
            smtObj = conObj.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
            //resObj = smtObj.executeQuery("SELECT USERS.USERNAME, PROJECTS.PROJECTNAME, PROJECTS.CREATIONDATE FROM ASSIGNMENTS INNER JOIN PROJECTS ON PROJECTS.PROJECTID = ASSIGNMENTS.PROJECTID RIGHT JOIN USERS ON USERS.USERID = ASSIGNMENTS.USERID where projects.projectid=?");
            resObj = smtObj.executeQuery("SELECT DISTINCT USERS.USERNAME, PROJECTS.PROJECTNAME FROM  ASSIGNMENTS INNER JOIN PROJECTS ON PROJECTS.PROJECTID = ASSIGNMENTS.PROJECTID INNER JOIN USERS ON USERS.USERID = ASSIGNMENTS.USERID INNER JOIN BUGS ON BUGS.PROJECTID=ASSIGNMENTS.PROJECTID");
            
            jTable1.setModel(DbUtils.resultSetToTableModel(resObj));
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        testerName = new javax.swing.JLabel();
        testerLogo = new javax.swing.JLabel();
        Dashlogo = new javax.swing.JLabel();
        ProjectLogo = new javax.swing.JLabel();
        BugLogo = new javax.swing.JLabel();
        LogoutLogo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        noOfProjects = new javax.swing.JPanel();
        PN = new javax.swing.JLabel();
        noOfBugs = new javax.swing.JPanel();
        BN = new javax.swing.JLabel();
        ProjectNumber = new javax.swing.JLabel();
        BugNumber = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(50, 50, 50));
        SidePanel.setPreferredSize(new java.awt.Dimension(340, 768));

        testerName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        testerName.setForeground(new java.awt.Color(150, 89, 165));
        testerName.setText("Devoloper Name");

        testerLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/person tester.png"))); // NOI18N

        Dashlogo.setBackground(new java.awt.Color(150, 89, 165));
        Dashlogo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Dashlogo.setForeground(new java.awt.Color(50, 50, 50));
        Dashlogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dashlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/dashboard.png"))); // NOI18N
        Dashlogo.setText("     Dashboard");
        Dashlogo.setOpaque(true);
        Dashlogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashlogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashlogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashlogoMouseExited(evt);
            }
        });

        ProjectLogo.setBackground(new java.awt.Color(50, 50, 50));
        ProjectLogo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        ProjectLogo.setForeground(new java.awt.Color(109, 177, 147));
        ProjectLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ProjectLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        ProjectLogo.setText("        Projects");
        ProjectLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        ProjectLogo.setOpaque(true);
        ProjectLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProjectLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProjectLogoMouseExited(evt);
            }
        });

        BugLogo.setBackground(new java.awt.Color(50, 50, 50));
        BugLogo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        BugLogo.setForeground(new java.awt.Color(109, 177, 147));
        BugLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BugLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BugLogo.setText("       Bugs");
        BugLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        BugLogo.setOpaque(true);
        BugLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BugLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BugLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BugLogoMouseExited(evt);
            }
        });

        LogoutLogo.setBackground(new java.awt.Color(50, 50, 50));
        LogoutLogo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        LogoutLogo.setForeground(new java.awt.Color(109, 177, 147));
        LogoutLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/logout.png"))); // NOI18N
        LogoutLogo.setText("         logout");
        LogoutLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        LogoutLogo.setOpaque(true);
        LogoutLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testerLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(testerName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dashlogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BugLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(testerLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(Dashlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(ProjectLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BugLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(LogoutLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        jPanel8.setBackground(new java.awt.Color(50, 50, 50));
        jPanel8.setPreferredSize(new java.awt.Dimension(1026, 60));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 60));

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jTable1.setBackground(new java.awt.Color(50, 50, 50));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setPreferredSize(new java.awt.Dimension(535, 1320));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        noOfProjects.setBackground(new java.awt.Color(50, 50, 50));
        noOfProjects.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(133, 89, 165)));
        noOfProjects.setPreferredSize(new java.awt.Dimension(260, 140));

        PN.setBackground(new java.awt.Color(50, 50, 50));
        PN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PN.setForeground(new java.awt.Color(217, 217, 217));
        PN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        PN.setText(" 10");
        PN.setOpaque(true);

        javax.swing.GroupLayout noOfProjectsLayout = new javax.swing.GroupLayout(noOfProjects);
        noOfProjects.setLayout(noOfProjectsLayout);
        noOfProjectsLayout.setHorizontalGroup(
            noOfProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjectsLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        noOfProjectsLayout.setVerticalGroup(
            noOfProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjectsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PN)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        noOfBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        BN.setBackground(new java.awt.Color(50, 50, 50));
        BN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BN.setForeground(new java.awt.Color(217, 217, 217));
        BN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BN.setText("10");
        BN.setOpaque(true);

        javax.swing.GroupLayout noOfBugsLayout = new javax.swing.GroupLayout(noOfBugs);
        noOfBugs.setLayout(noOfBugsLayout);
        noOfBugsLayout.setHorizontalGroup(
            noOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfBugsLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(BN, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        noOfBugsLayout.setVerticalGroup(
            noOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfBugsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BN)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ProjectNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ProjectNumber.setForeground(new java.awt.Color(50, 50, 50));
        ProjectNumber.setText("Number of projects assigned to you");

        BugNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BugNumber.setForeground(new java.awt.Color(50, 50, 50));
        BugNumber.setText("Number of bugs assigned to you to be tested:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noOfProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BugNumber))
                .addGap(68, 68, 68))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BugNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));

        jTable2.setBackground(new java.awt.Color(50, 50, 50));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setRowHeight(35);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));

        jTable3.setBackground(new java.awt.Color(50, 50, 50));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setRowHeight(35);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 1030, 760));

        setSize(new java.awt.Dimension(1384, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 int choose=1;
    private void ProjectLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseClicked
    jTabbedPane1.setSelectedIndex(1);
    Color black =Color.decode("#323232");
    Color green =Color.decode("#6DB193");
    Color pink =Color.decode("#9659A5");
    Dashlogo.setBackground(black);
    Dashlogo.setForeground(green);
    BugLogo.setBackground(black);
    BugLogo.setForeground(green);
    ProjectLogo.setBackground(pink);
    ProjectLogo.setForeground(black);
    choose=2;
    try
        {
             
           //command=conObj.prepareStatement("select projects.projectid, projects.projectname, projects.creationdate , projects.creationtime FROM PROJECTS where " );
           command=conObj.prepareStatement("SELECT userid, PROJECTID FROM ASSIGNMENTS AS AHMED WHERE USERID=?"+"SELECT projects.projectname, users.username from AHMED inner join users on users.userid= AHMED.userid INNER JOIN PROJECTS ON PROJECTS.PROJECTID = AHMED.PROJECTID");
           command.setInt(1,CurrentUser.id);
           resObj=command.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(resObj));
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_ProjectLogoMouseClicked

    private void DashlogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseClicked
    jTabbedPane1.setSelectedIndex(0);
    Color black =Color.decode("#323232");
    Color green =Color.decode("#6DB193");
    Color pink =Color.decode("#9659A5");
    Dashlogo.setBackground(pink);
    Dashlogo.setForeground(black);
    BugLogo.setBackground(black);
    BugLogo.setForeground(green);
    ProjectLogo.setBackground(black);
    ProjectLogo.setForeground(green);
    choose=1;
// TODO add your handling code here:
    }//GEN-LAST:event_DashlogoMouseClicked

    private void BugLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseClicked
       jTabbedPane1.setSelectedIndex(2);
    Color black =Color.decode("#323232");
    Color green =Color.decode("#6DB193");
    Color pink =Color.decode("#9659A5");
    Dashlogo.setBackground(black);
    Dashlogo.setForeground(green);
    BugLogo.setBackground(pink);
    BugLogo.setForeground(black);
    ProjectLogo.setBackground(black);
    ProjectLogo.setForeground(green);
    choose=3;
        try
        {
           command=conObj.prepareStatement("select bugs.bugname, bugs.description, bugs.dateassigned , bugs.dateresolved FROM BUGS WHERE DEVELOPERID = ?" );
           command.setInt(1,CurrentUser.id);
           resObj=command.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(resObj));
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    
// TODO add your handling code here:
    }//GEN-LAST:event_BugLogoMouseClicked

    private void ProjectLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseEntered
       if(choose==2){}
       else{
           Color haver =Color.decode("#3B3B3B");
           ProjectLogo.setBackground(haver);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectLogoMouseEntered

    private void ProjectLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseExited
        if (choose==2){}
        else{
        Color black =Color.decode("#323232");
       ProjectLogo.setBackground(black);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_ProjectLogoMouseExited

    private void DashlogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseEntered
       if(choose==1){}
       else{
           Color haver =Color.decode("#3B3B3B");
           Dashlogo.setBackground(haver);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_DashlogoMouseEntered

    private void DashlogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseExited
    if (choose==1){}
    else{
        Color black =Color.decode("#323232");
        Dashlogo.setBackground(black);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_DashlogoMouseExited

    private void BugLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseEntered
       if(choose==3){}
       else{
           Color haver =Color.decode("#3B3B3B");
          BugLogo.setBackground(haver);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_BugLogoMouseEntered

    private void BugLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseExited
       if (choose==3){}
    else{
        Color black =Color.decode("#323232");
        BugLogo.setBackground(black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BugLogoMouseExited

    private void LogoutLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseClicked
        Login y = new Login();
        y.show();
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_LogoutLogoMouseClicked

    private void LogoutLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseEntered
        Color haver =Color.decode("#3B3B3B");
        LogoutLogo.setBackground(haver);
// TODO add your handling code here:
    }//GEN-LAST:event_LogoutLogoMouseEntered

    private void LogoutLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseExited
       Color black =Color.decode("#323232");
        LogoutLogo.setBackground(black);
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutLogoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            
            }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Devoloper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devoloper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BN;
    private javax.swing.JLabel BugLogo;
    private javax.swing.JLabel BugNumber;
    private javax.swing.JLabel Dashlogo;
    private javax.swing.JLabel LogoutLogo;
    private javax.swing.JLabel PN;
    private javax.swing.JLabel ProjectLogo;
    private javax.swing.JLabel ProjectNumber;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel noOfBugs;
    private javax.swing.JPanel noOfProjects;
    private javax.swing.JLabel testerLogo;
    private javax.swing.JLabel testerName;
    // End of variables declaration//GEN-END:variables
}
