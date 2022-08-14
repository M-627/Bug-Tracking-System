/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author mariam
 */
public class Tester1 extends javax.swing.JFrame implements dataConnection {

    public Tester1() {
        initComponents();
        showPieChart();
    }

    //pie chart code
    public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "in progress" , new Double( 20 ) );  
      barDataset.setValue( "to be tested" , new Double( 20 ) );
      barDataset.setValue( "closed" , new Double( 10 ) ); 
      barDataset.setValue( "open" , new Double( 40 ) ); 
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Bug Status",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("in progress", new Color(150,89,165));
        piePlot.setSectionPaint("to be tested", new Color(109,177,147));
        piePlot.setSectionPaint("closed", new Color(217,217,217));
      piePlot.setSectionPaint("open", new Color(50,50,50));
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
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
        noOfProjects = new javax.swing.JPanel();
        PN = new javax.swing.JLabel();
        ProjectNumber = new javax.swing.JLabel();
        project = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        Search = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bug = new javax.swing.JPanel();
        noOfProjects1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ProjectNumber1 = new javax.swing.JLabel();
        ProjectNumber2 = new javax.swing.JLabel();
        noOfProjects2 = new javax.swing.JPanel();
        PN2 = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(217, 217, 217));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(50, 50, 50));
        SidePanel.setPreferredSize(new java.awt.Dimension(340, 768));

        testerLogo.setBackground(new java.awt.Color(40, 40, 40));
        testerLogo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        testerLogo.setForeground(new java.awt.Color(150, 89, 165));
        testerLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/person tester.png"))); // NOI18N
        testerLogo.setText("Tester Name");
        testerLogo.setOpaque(true);

        Dashlogo.setBackground(new java.awt.Color(150, 89, 165));
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
                .addGap(73, 73, 73)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BugLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dashlogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(LogoutLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addComponent(testerLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addComponent(testerLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(Dashlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(ProjectLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(BugLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(LogoutLogo)
                .addGap(68, 68, 68))
        );

        backgroundPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        topPanel.setBackground(new java.awt.Color(50, 50, 50));
        topPanel.setPreferredSize(new java.awt.Dimension(1026, 60));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        backgroundPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));

        dashboard.setBackground(new java.awt.Color(217, 217, 217));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ProjectNumber.setText("Number of projects assigned to you");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(noOfProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(694, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ProjectNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", dashboard);

        project.setBackground(new java.awt.Color(217, 217, 217));

        jScrollPane2.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane2.setForeground(new java.awt.Color(50, 50, 50));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Project Name", "Creation Date", "description", "project Type"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(222, 222, 222));
        rSTableMetro1.setColorFilasBackgound1(new java.awt.Color(222, 222, 222));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(222, 222, 222));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorForegroundHead(new java.awt.Color(222, 222, 222));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(109, 177, 147));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(222, 222, 222));
        rSTableMetro1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rSTableMetro1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        rSTableMetro1.setRowHeight(20);
        jScrollPane2.setViewportView(rSTableMetro1);

        Search.setBackground(new java.awt.Color(217, 217, 217));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search.setForeground(new java.awt.Color(109, 177, 147));
        Search.setToolTipText("Make your search from here");
        Search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search.setPhColor(new java.awt.Color(150, 89, 165));
        Search.setPlaceholder("Search....");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(222, 222, 222));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 50, 50));
        jLabel2.setText("Project Details:");

        javax.swing.GroupLayout projectLayout = new javax.swing.GroupLayout(project);
        project.setLayout(projectLayout);
        projectLayout.setHorizontalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(projectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        projectLayout.setVerticalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
        );

        jTabbedPane1.addTab("tab2", project);

        bug.setBackground(new java.awt.Color(217, 217, 217));

        noOfProjects1.setBackground(new java.awt.Color(50, 50, 50));
        noOfProjects1.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(133, 89, 165)));
        noOfProjects1.setPreferredSize(new java.awt.Dimension(260, 140));

        jLabel3.setBackground(new java.awt.Color(50, 50, 50));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        jLabel3.setText("10");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout noOfProjects1Layout = new javax.swing.GroupLayout(noOfProjects1);
        noOfProjects1.setLayout(noOfProjects1Layout);
        noOfProjects1Layout.setHorizontalGroup(
            noOfProjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjects1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noOfProjects1Layout.setVerticalGroup(
            noOfProjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjects1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        ProjectNumber1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ProjectNumber1.setForeground(new java.awt.Color(50, 50, 50));
        ProjectNumber1.setText("Number of opened bugs");

        ProjectNumber2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ProjectNumber2.setForeground(new java.awt.Color(50, 50, 50));
        ProjectNumber2.setText("Number of closed bugs");

        noOfProjects2.setBackground(new java.awt.Color(50, 50, 50));
        noOfProjects2.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfProjects2.setPreferredSize(new java.awt.Dimension(260, 140));

        PN2.setBackground(new java.awt.Color(50, 50, 50));
        PN2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PN2.setForeground(new java.awt.Color(217, 217, 217));
        PN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        PN2.setText(" 10");
        PN2.setOpaque(true);

        javax.swing.GroupLayout noOfProjects2Layout = new javax.swing.GroupLayout(noOfProjects2);
        noOfProjects2.setLayout(noOfProjects2Layout);
        noOfProjects2Layout.setHorizontalGroup(
            noOfProjects2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjects2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(PN2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        noOfProjects2Layout.setVerticalGroup(
            noOfProjects2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfProjects2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PN2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelBarChart.setBackground(new java.awt.Color(217, 217, 217));
        panelBarChart.setForeground(new java.awt.Color(217, 217, 217));
        panelBarChart.setPreferredSize(new java.awt.Dimension(540, 346));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout bugLayout = new javax.swing.GroupLayout(bug);
        bug.setLayout(bugLayout);
        bugLayout.setHorizontalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(noOfProjects1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectNumber2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noOfProjects2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(bugLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        bugLayout.setVerticalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bugLayout.createSequentialGroup()
                        .addComponent(ProjectNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfProjects2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bugLayout.createSequentialGroup()
                        .addComponent(ProjectNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfProjects1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", bug);

        backgroundPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 28, 1030, 740));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1384, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       int choose = 1;
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
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectLogoMouseClicked

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
        // TODO add your handling code here:
    }//GEN-LAST:event_BugLogoMouseClicked

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
        this. dispose();
        y.show();
       
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tester1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tester1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tester1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tester1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tester1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BugLogo;
    private javax.swing.JLabel Dashlogo;
    private javax.swing.JLabel LogoutLogo;
    private javax.swing.JLabel PN;
    private javax.swing.JLabel PN2;
    private javax.swing.JLabel ProjectLogo;
    private javax.swing.JLabel ProjectNumber;
    private javax.swing.JLabel ProjectNumber1;
    private javax.swing.JLabel ProjectNumber2;
    private app.bolivia.swing.JCTextField Search;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel bug;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel noOfProjects;
    private javax.swing.JPanel noOfProjects1;
    private javax.swing.JPanel noOfProjects2;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel project;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JLabel testerLogo;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
