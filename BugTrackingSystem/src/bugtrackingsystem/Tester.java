/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mariam
 */
public class Tester extends javax.swing.JFrame implements Colors {

    //CONTROLLER
    TesterController Tester = new TesterController();
    Activity tester = new Activity();

    //SOURCE CODE GLOBAL VARIABLES
    private int choose = 1;    // USED IN SPECIFY WHICH PANEL SHOULD BE VIEWD 

    public Tester() {
        initComponents();
        //VIEW NAME OF THE TESTER 
        testerLogo.setText(CurrentUser.user);

        //VIEW ASSIGNED BUGTABLE IN DASHBOARD 
        Tester.ViewBugTable();
        bugTable.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));

        //VIEW BUG CARD 
        BN.setText(String.valueOf(Tester.ViewBugCard()));

        // SET THE JFRAME TO BE IN THE CENTER 
        this.setLocationRelativeTo(null);
    }

    //"Relad table" FONT CHANGER 
    Font orgFont;

    private void getFont(java.awt.event.MouseEvent evt) {
        orgFont = evt.getComponent().getFont();
        Map attributes = orgFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(orgFont.deriveFont(attributes));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        testerLogo = new javax.swing.JLabel();
        Dashlogo = new javax.swing.JLabel();
        ProjectLogo = new javax.swing.JLabel();
        BugLogo = new javax.swing.JLabel();
        LogoutLogo = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        Search1 = new app.bolivia.swing.JCTextField();
        searchLogo = new javax.swing.JLabel();
        noOfBugs = new javax.swing.JPanel();
        BN = new javax.swing.JLabel();
        BugNumber = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bugTable = new javax.swing.JTable();
        ReloadLabel = new javax.swing.JLabel();
        project = new javax.swing.JPanel();
        Search = new app.bolivia.swing.JCTextField();
        SearchLogo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        projects = new javax.swing.JTable();
        ProjectsDetails = new javax.swing.JLabel();
        noOfProjects = new javax.swing.JPanel();
        PN = new javax.swing.JLabel();
        ProjectNumber = new javax.swing.JLabel();
        bug = new javax.swing.JPanel();
        ProjectsPanel = new javax.swing.JPanel();
        LogoOfSearch = new javax.swing.JLabel();
        Search2 = new app.bolivia.swing.JCTextField();
        ProjectDetails2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        projects1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(217, 217, 217));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(50, 50, 50));
        SidePanel.setPreferredSize(new java.awt.Dimension(340, 768));

        testerLogo.setBackground(new java.awt.Color(40, 40, 40));
        testerLogo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        testerLogo.setForeground(new java.awt.Color(133, 89, 165));
        testerLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testerLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/person tester.png"))); // NOI18N
        testerLogo.setText("Tester");
        testerLogo.setOpaque(true);
        testerLogo.setPreferredSize(new java.awt.Dimension(300, 60));

        Dashlogo.setBackground(new java.awt.Color(133, 89, 165));
        Dashlogo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Dashlogo.setForeground(new java.awt.Color(50, 50, 50));
        Dashlogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dashlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/dashboard.png"))); // NOI18N
        Dashlogo.setText("Dashboard");
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
        ProjectLogo.setText("Projects");
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
        BugLogo.setText("Bugs");
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
        LogoutLogo.setText("Logout");
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
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(testerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BugLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProjectLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dashlogo, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addComponent(LogoutLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addComponent(testerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(Dashlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(ProjectLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(BugLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(LogoutLogo))
        );

        backgroundPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        topPanel.setBackground(new java.awt.Color(50, 50, 50));
        topPanel.setPreferredSize(new java.awt.Dimension(1026, 60));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        backgroundPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 0, 1070, 60));

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));

        dashboard.setBackground(new java.awt.Color(217, 217, 217));

        Search1.setBackground(new java.awt.Color(217, 217, 217));
        Search1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(133, 89, 165)));
        Search1.setForeground(new java.awt.Color(109, 177, 147));
        Search1.setToolTipText("Make your search from here");
        Search1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search1.setPhColor(new java.awt.Color(133, 89, 165));
        Search1.setPlaceholder("Search....");
        Search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search1MouseClicked(evt);
            }
        });
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });
        Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search1KeyReleased(evt);
            }
        });

        searchLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        searchLogo.setText("jLabel1");

        noOfBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfBugs.setToolTipText("Number of bugs assigned to you to be tested");
        noOfBugs.setPreferredSize(new java.awt.Dimension(260, 140));
        noOfBugs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noOfBugsMouseClicked(evt);
            }
        });

        BN.setBackground(new java.awt.Color(50, 50, 50));
        BN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        BN.setForeground(new java.awt.Color(217, 217, 217));
        BN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BN.setText("0");
        BN.setToolTipText("Number of bugs assigned to you to be tested");
        BN.setOpaque(true);
        BN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BNMouseClicked(evt);
            }
        });

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

        BugNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BugNumber.setForeground(new java.awt.Color(50, 50, 50));
        BugNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BugNumber.setText("Number of bugs assigned to you to be tested");

        bugTable.setBackground(new java.awt.Color(50, 50, 50));
        bugTable.setForeground(new java.awt.Color(217, 217, 217));
        bugTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bugTable.setIntercellSpacing(new java.awt.Dimension(1, 6));
        bugTable.setPreferredSize(new java.awt.Dimension(380, 1030));
        bugTable.setRowHeight(40);
        bugTable.setSelectionBackground(new java.awt.Color(109, 177, 147));
        bugTable.setSelectionForeground(new java.awt.Color(50, 50, 50));
        bugTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bugTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bugTable);

        ReloadLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ReloadLabel.setForeground(new java.awt.Color(133, 89, 165));
        ReloadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReloadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/reload-small.png"))); // NOI18N
        ReloadLabel.setText("Reload Table:");
        ReloadLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReloadLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReloadLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReloadLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(searchLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReloadLabel)
                            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BugNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(BugNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(ReloadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        jTabbedPane1.addTab("tab1", dashboard);

        project.setBackground(new java.awt.Color(217, 217, 217));

        Search.setBackground(new java.awt.Color(217, 217, 217));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(133, 89, 165)));
        Search.setForeground(new java.awt.Color(109, 177, 147));
        Search.setToolTipText("Make your search from here");
        Search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search.setPhColor(new java.awt.Color(133, 89, 165));
        Search.setPlaceholder("Search....");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        SearchLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        SearchLogo.setText("jLabel1");

        projects.setBackground(new java.awt.Color(50, 50, 50));
        projects.setForeground(new java.awt.Color(217, 217, 217));
        projects.setModel(new javax.swing.table.DefaultTableModel(
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
        projects.setToolTipText("Select a row to show the assigned people in this project");
        projects.setIntercellSpacing(new java.awt.Dimension(1, 6));
        projects.setMaximumSize(new java.awt.Dimension(2147483647, 160));
        projects.setMinimumSize(new java.awt.Dimension(540, 1031));
        projects.setPreferredSize(new java.awt.Dimension(380, 1030));
        projects.setRowHeight(40);
        projects.setSelectionBackground(new java.awt.Color(109, 177, 147));
        projects.setSelectionForeground(new java.awt.Color(50, 50, 50));
        projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(projects);

        ProjectsDetails.setBackground(new java.awt.Color(222, 222, 222));
        ProjectsDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectsDetails.setForeground(new java.awt.Color(133, 89, 165));
        ProjectsDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectsDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        ProjectsDetails.setText("Project Details");

        noOfProjects.setBackground(new java.awt.Color(50, 50, 50));
        noOfProjects.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(133, 89, 165)));
        noOfProjects.setToolTipText("Number of projects assigned to you");
        noOfProjects.setPreferredSize(new java.awt.Dimension(260, 140));
        noOfProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noOfProjectsMouseClicked(evt);
            }
        });

        PN.setBackground(new java.awt.Color(50, 50, 50));
        PN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PN.setForeground(new java.awt.Color(217, 217, 217));
        PN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        PN.setText("0");
        PN.setToolTipText("Number of projects assigned to you");
        PN.setOpaque(true);
        PN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout noOfProjectsLayout = new javax.swing.GroupLayout(noOfProjects);
        noOfProjects.setLayout(noOfProjectsLayout);
        noOfProjectsLayout.setHorizontalGroup(
            noOfProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjectsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        noOfProjectsLayout.setVerticalGroup(
            noOfProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjectsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PN)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ProjectNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ProjectNumber.setForeground(new java.awt.Color(50, 50, 50));
        ProjectNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectNumber.setText("Number of projects assigned to you");
        ProjectNumber.setPreferredSize(new java.awt.Dimension(276, 23));

        javax.swing.GroupLayout projectLayout = new javax.swing.GroupLayout(project);
        project.setLayout(projectLayout);
        projectLayout.setHorizontalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectLayout.createSequentialGroup()
                        .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProjectNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addComponent(SearchLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProjectsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        projectLayout.setVerticalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectLayout.createSequentialGroup()
                .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ProjectNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(projectLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProjectsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("tab2", project);

        bug.setBackground(new java.awt.Color(217, 217, 217));

        ProjectsPanel.setBackground(new java.awt.Color(217, 217, 217));

        LogoOfSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        LogoOfSearch.setText("jLabel1");

        Search2.setBackground(new java.awt.Color(217, 217, 217));
        Search2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search2.setForeground(new java.awt.Color(109, 177, 147));
        Search2.setToolTipText("Make your search from here");
        Search2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search2.setPhColor(new java.awt.Color(150, 89, 165));
        Search2.setPlaceholder("Search....");
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });
        Search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search2KeyReleased(evt);
            }
        });

        ProjectDetails2.setBackground(new java.awt.Color(217, 217, 217));
        ProjectDetails2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectDetails2.setForeground(new java.awt.Color(150, 89, 165));
        ProjectDetails2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        ProjectDetails2.setText("Project Details:");
        ProjectDetails2.setPreferredSize(new java.awt.Dimension(160, 40));

        projects1.setBackground(new java.awt.Color(50, 50, 50));
        projects1.setForeground(new java.awt.Color(217, 217, 217));
        projects1.setModel(new javax.swing.table.DefaultTableModel(
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
        projects1.setToolTipText("Select a row to show the assigned people in this project");
        projects1.setIntercellSpacing(new java.awt.Dimension(1, 6));
        projects1.setMaximumSize(new java.awt.Dimension(2147483647, 160));
        projects1.setMinimumSize(new java.awt.Dimension(540, 1031));
        projects1.setPreferredSize(new java.awt.Dimension(380, 1030));
        projects1.setRowHeight(40);
        projects1.setSelectionBackground(new java.awt.Color(109, 177, 147));
        projects1.setSelectionForeground(new java.awt.Color(50, 50, 50));
        projects1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projects1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(projects1);

        javax.swing.GroupLayout ProjectsPanelLayout = new javax.swing.GroupLayout(ProjectsPanel);
        ProjectsPanel.setLayout(ProjectsPanelLayout);
        ProjectsPanelLayout.setHorizontalGroup(
            ProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(LogoOfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 769, Short.MAX_VALUE))
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProjectsPanelLayout.setVerticalGroup(
            ProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(ProjectDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoOfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(638, 638, 638))
        );

        javax.swing.GroupLayout bugLayout = new javax.swing.GroupLayout(bug);
        bug.setLayout(bugLayout);
        bugLayout.setHorizontalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProjectsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bugLayout.setVerticalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProjectsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", bug);

        backgroundPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 8, 1070, 760));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1371, 804));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashlogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        choose = 1;
        Dashlogo.setBackground(Purple);
        Dashlogo.setForeground(Black);
        BugLogoMouseExited(evt);
        ProjectLogoMouseExited(evt);
    }//GEN-LAST:event_DashlogoMouseClicked

    private void DashlogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseEntered
        if (choose == 1) {
        } else {
            Dashlogo.setBackground(Gray);
        }
    }//GEN-LAST:event_DashlogoMouseEntered

    private void DashlogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashlogoMouseExited
        if (choose == 1) {
        } else {
            Dashlogo.setBackground(Black);
            Dashlogo.setForeground(Green);
        }

    }//GEN-LAST:event_DashlogoMouseExited

    private void ProjectLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        choose = 2;
        ProjectLogo.setBackground(Purple);
        ProjectLogo.setForeground(Black);
        DashlogoMouseExited(evt);
        BugLogoMouseExited(evt);

        System.out.println("View projects table...");

        Tester.ViewProjectsTable();
        projects.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));

        System.out.println("View number of projects...");

        PN.setText(String.valueOf(Tester.ViewProjectCard()));
    }//GEN-LAST:event_ProjectLogoMouseClicked

    private void ProjectLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseEntered
        if (choose == 2) {
        } else {
            ProjectLogo.setBackground(Gray);
        }
    }//GEN-LAST:event_ProjectLogoMouseEntered

    private void ProjectLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectLogoMouseExited
        if (choose == 2) {
        } else {
            ProjectLogo.setBackground(Black);
            ProjectLogo.setForeground(Green);
        }
    }//GEN-LAST:event_ProjectLogoMouseExited

    private void BugLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseClicked
        jTabbedPane1.setSelectedIndex(2);
        choose = 3;
        BugLogo.setBackground(Purple);
        BugLogo.setForeground(Black);
        DashlogoMouseExited(evt);
        ProjectLogoMouseExited(evt);

        System.out.println("View projects table...");
        Tester.ViewProjectsTable();
        projects1.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));
    }//GEN-LAST:event_BugLogoMouseClicked

    private void BugLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseEntered
        if (choose == 3) {
        } else {
            BugLogo.setBackground(Gray);
        }
    }//GEN-LAST:event_BugLogoMouseEntered

    private void BugLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugLogoMouseExited
        if (choose == 3) {
        } else {
            BugLogo.setBackground(Black);
            BugLogo.setForeground(Green);
        }
    }//GEN-LAST:event_BugLogoMouseExited

    private void LogoutLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseClicked
       tester.activity ("Logged out");
        new Rating().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutLogoMouseClicked

    private void LogoutLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseEntered
        LogoutLogo.setBackground(Gray);
    }//GEN-LAST:event_LogoutLogoMouseEntered

    private void LogoutLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLogoMouseExited
        LogoutLogo.setBackground(Black);
        LogoutLogo.setForeground(Green);
    }//GEN-LAST:event_LogoutLogoMouseExited

    private void Search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search1MouseClicked
        Search1.setText("");
    }//GEN-LAST:event_Search1MouseClicked

    private void Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search1KeyReleased
        Tester.searchBugs(Search1.getText());
        bugTable.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));
    }//GEN-LAST:event_Search1KeyReleased

    private void noOfProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noOfProjectsMouseClicked

    }//GEN-LAST:event_noOfProjectsMouseClicked

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        Tester.searchProjects(Search.getText());
        projects.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));
    }//GEN-LAST:event_SearchKeyReleased

    private void projectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsMouseClicked
        try {
            System.out.println("storing the value of row choosen...");

            int selectedID = (int) projects.getValueAt(projects.getSelectedRow(), 0);
            CurrentProject Project = new CurrentProject((selectedID));
            ProjectDetails add = new ProjectDetails();
            add.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_projectsMouseClicked

    private void noOfBugsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noOfBugsMouseClicked

    }//GEN-LAST:event_noOfBugsMouseClicked

    private void PNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PNMouseClicked
        noOfProjectsMouseClicked(evt);
    }//GEN-LAST:event_PNMouseClicked

    private void BNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BNMouseClicked
        noOfBugsMouseClicked(evt);
    }//GEN-LAST:event_BNMouseClicked

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search1ActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        Search.setText("");
    }//GEN-LAST:event_SearchMouseClicked

    private void projects1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projects1MouseClicked
        try {
            System.out.println("storing the value of row choosen...");

            int selectedID = (int) projects1.getValueAt(projects1.getSelectedRow(), 0);
            CurrentProject Project = new CurrentProject((selectedID));
            BugDetails add = new BugDetails();
            add.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_projects1MouseClicked

    private void Search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search2KeyReleased
        Tester.searchProjects(Search2.getText());
        projects1.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));
    }//GEN-LAST:event_Search2KeyReleased

    private void bugTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bugTableMouseClicked
        try {
            System.out.println("storing the value of row choosen...");

            int selectedID = (int) bugTable.getValueAt(bugTable.getSelectedRow(), 0);
            CurrentBug Bug = new CurrentBug((selectedID));
            BugInformation add = new BugInformation(selectedID);
            add.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bugTableMouseClicked

    private void ReloadLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadLabelMouseEntered
        getFont(evt);
    }//GEN-LAST:event_ReloadLabelMouseEntered

    private void ReloadLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadLabelMouseExited
        evt.getComponent().setFont(orgFont);
    }//GEN-LAST:event_ReloadLabelMouseExited

    private void ReloadLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadLabelMouseClicked
        //VIEW ASSIGNED BUGTABLE IN DASHBOARD
        Tester.ViewBugTable();
        bugTable.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));

        //VIEW BUG CARD
        BN.setText(String.valueOf(Tester.ViewBugCard()));
    }//GEN-LAST:event_ReloadLabelMouseClicked

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search2ActionPerformed

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BN;
    private javax.swing.JLabel BugLogo;
    private javax.swing.JLabel BugNumber;
    private javax.swing.JLabel Dashlogo;
    private javax.swing.JLabel LogoOfSearch;
    private javax.swing.JLabel LogoutLogo;
    private javax.swing.JLabel PN;
    private javax.swing.JLabel ProjectDetails2;
    private javax.swing.JLabel ProjectLogo;
    private javax.swing.JLabel ProjectNumber;
    private javax.swing.JLabel ProjectsDetails;
    private javax.swing.JPanel ProjectsPanel;
    private javax.swing.JLabel ReloadLabel;
    private app.bolivia.swing.JCTextField Search;
    private app.bolivia.swing.JCTextField Search1;
    private app.bolivia.swing.JCTextField Search2;
    private javax.swing.JLabel SearchLogo;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel bug;
    private javax.swing.JTable bugTable;
    private javax.swing.JPanel dashboard;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel noOfBugs;
    private javax.swing.JPanel noOfProjects;
    private javax.swing.JPanel project;
    private javax.swing.JTable projects;
    private javax.swing.JTable projects1;
    private javax.swing.JLabel searchLogo;
    private javax.swing.JLabel testerLogo;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
