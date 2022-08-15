/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
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
        Search1 = new app.bolivia.swing.JCTextField();
        searchLogo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        noOfProjects = new javax.swing.JPanel();
        PN = new javax.swing.JLabel();
        ProjectNumber = new javax.swing.JLabel();
        noOfBugs = new javax.swing.JPanel();
        BN = new javax.swing.JLabel();
        BugNumber = new javax.swing.JLabel();
        project = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojerusan.RSTableMetro();
        Search = new app.bolivia.swing.JCTextField();
        SearchLogo = new javax.swing.JLabel();
        ProjectsDetails = new javax.swing.JLabel();
        bug = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        ProjectsPanel = new javax.swing.JPanel();
        LogoOfSearch = new javax.swing.JLabel();
        Search2 = new app.bolivia.swing.JCTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojerusan.RSTableMetro();
        ProjectDetails2 = new javax.swing.JLabel();
        BugDetails = new javax.swing.JPanel();
        BugName = new javax.swing.JLabel();
        NameOfBug = new app.bolivia.swing.JCTextField();
        CreationDate = new javax.swing.JLabel();
        ReporterName = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        AssigneeName = new javax.swing.JLabel();
        Severity = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        DescriptionTextField = new app.bolivia.swing.JCTextField();
        NameOfReporter = new javax.swing.JComboBox<>();
        BugTable = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        SeverityComboBox = new javax.swing.JComboBox<>();
        LoGo = new javax.swing.JLabel();
        Search3 = new app.bolivia.swing.JCTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        rSTableMetro4 = new rojerusan.RSTableMetro();
        DetailsOfBugs = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        NameOfAssignee = new app.bolivia.swing.JCTextField();
        OverView = new javax.swing.JPanel();
        noOfOpenedBugs = new javax.swing.JPanel();
        OP = new javax.swing.JLabel();
        bugs = new javax.swing.JLabel();
        bugs2 = new javax.swing.JLabel();
        noOfClosedBugs = new javax.swing.JPanel();
        CB = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        noOfInProgressBugs = new javax.swing.JPanel();
        IPB = new javax.swing.JLabel();
        bugs3 = new javax.swing.JLabel();
        noOfToBeTestedBugs = new javax.swing.JPanel();
        TBT = new javax.swing.JLabel();
        bugs4 = new javax.swing.JLabel();

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
            .addComponent(testerLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BugLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(80, 80, 80)
                .addComponent(LogoutLogo))
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

        Search1.setBackground(new java.awt.Color(217, 217, 217));
        Search1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search1.setForeground(new java.awt.Color(109, 177, 147));
        Search1.setToolTipText("Make your search from here");
        Search1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search1.setPhColor(new java.awt.Color(150, 89, 165));
        Search1.setPlaceholder("Search....");

        searchLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        searchLogo.setText("jLabel1");

        jScrollPane3.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane3.setForeground(new java.awt.Color(50, 50, 50));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(50, 50, 50));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(50, 50, 50));
        rSTableMetro1.setColorFilasBackgound1(new java.awt.Color(217, 217, 217));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(217, 217, 217));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorForegroundHead(new java.awt.Color(217, 217, 217));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(150, 89, 165));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(50, 50, 50));
        jScrollPane3.setViewportView(rSTableMetro1);

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

        ProjectNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ProjectNumber.setForeground(new java.awt.Color(50, 50, 50));
        ProjectNumber.setText("Number of projects assigned to you");

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

        BugNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BugNumber.setForeground(new java.awt.Color(50, 50, 50));
        BugNumber.setText("Number of bugs assigned to you to be tested:");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(searchLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BugNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(ProjectNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(BugNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("tab1", dashboard);

        project.setBackground(new java.awt.Color(217, 217, 217));

        jScrollPane2.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane2.setForeground(new java.awt.Color(50, 50, 50));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(50, 50, 50));
        rSTableMetro2.setColorBordeFilas(new java.awt.Color(50, 50, 50));
        rSTableMetro2.setColorFilasBackgound1(new java.awt.Color(217, 217, 217));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(217, 217, 217));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(150, 89, 165));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(150, 89, 165));
        rSTableMetro2.setColorForegroundHead(new java.awt.Color(217, 217, 217));
        rSTableMetro2.setColorSelBackgound(new java.awt.Color(150, 89, 165));
        rSTableMetro2.setColorSelForeground(new java.awt.Color(50, 50, 50));
        jScrollPane2.setViewportView(rSTableMetro2);

        Search.setBackground(new java.awt.Color(217, 217, 217));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search.setForeground(new java.awt.Color(109, 177, 147));
        Search.setToolTipText("Make your search from here");
        Search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search.setPhColor(new java.awt.Color(150, 89, 165));
        Search.setPlaceholder("Search....");

        SearchLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        SearchLogo.setText("jLabel1");

        ProjectsDetails.setBackground(new java.awt.Color(222, 222, 222));
        ProjectsDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectsDetails.setForeground(new java.awt.Color(150, 89, 165));
        ProjectsDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        ProjectsDetails.setText("Project Details:");

        javax.swing.GroupLayout projectLayout = new javax.swing.GroupLayout(project);
        project.setLayout(projectLayout);
        projectLayout.setHorizontalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SearchLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(projectLayout.createSequentialGroup()
                                .addComponent(ProjectsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectLayout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283))))))
        );
        projectLayout.setVerticalGroup(
            projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(ProjectsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
        );

        jTabbedPane1.addTab("tab2", project);

        bug.setBackground(new java.awt.Color(217, 217, 217));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1025, 701));

        jTabbedPane2.setBackground(new java.awt.Color(150, 89, 165));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane2.setForeground(new java.awt.Color(109, 177, 147));
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

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

        jScrollPane4.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane4.setForeground(new java.awt.Color(50, 50, 50));
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro3.setColorBackgoundHead(new java.awt.Color(50, 50, 50));
        rSTableMetro3.setColorBordeFilas(new java.awt.Color(50, 50, 50));
        rSTableMetro3.setColorFilasBackgound1(new java.awt.Color(217, 217, 217));
        rSTableMetro3.setColorFilasBackgound2(new java.awt.Color(217, 217, 217));
        rSTableMetro3.setColorFilasForeground1(new java.awt.Color(150, 89, 165));
        rSTableMetro3.setColorFilasForeground2(new java.awt.Color(150, 89, 165));
        rSTableMetro3.setColorForegroundHead(new java.awt.Color(217, 217, 217));
        rSTableMetro3.setColorSelBackgound(new java.awt.Color(150, 89, 165));
        rSTableMetro3.setColorSelForeground(new java.awt.Color(50, 50, 50));
        jScrollPane4.setViewportView(rSTableMetro3);

        ProjectDetails2.setBackground(new java.awt.Color(217, 217, 217));
        ProjectDetails2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectDetails2.setForeground(new java.awt.Color(150, 89, 165));
        ProjectDetails2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/projects.png"))); // NOI18N
        ProjectDetails2.setText("Project Details:");
        ProjectDetails2.setPreferredSize(new java.awt.Dimension(160, 40));

        javax.swing.GroupLayout ProjectsPanelLayout = new javax.swing.GroupLayout(ProjectsPanel);
        ProjectsPanel.setLayout(ProjectsPanelLayout);
        ProjectsPanelLayout.setHorizontalGroup(
            ProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ProjectsPanelLayout.createSequentialGroup()
                .addGroup(ProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProjectsPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(LogoOfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 499, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(692, 692, 692))
        );

        jTabbedPane2.addTab("Projects", ProjectsPanel);

        BugDetails.setBackground(new java.awt.Color(217, 217, 217));

        BugName.setBackground(new java.awt.Color(217, 217, 217));
        BugName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BugName.setForeground(new java.awt.Color(150, 89, 165));
        BugName.setText("Bug Name:");
        BugName.setPreferredSize(new java.awt.Dimension(160, 40));

        NameOfBug.setBackground(new java.awt.Color(217, 217, 217));
        NameOfBug.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        NameOfBug.setForeground(new java.awt.Color(109, 177, 147));
        NameOfBug.setToolTipText("Make your search from here");
        NameOfBug.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        NameOfBug.setPhColor(new java.awt.Color(150, 89, 165));
        NameOfBug.setPlaceholder("name...");
        NameOfBug.setPreferredSize(new java.awt.Dimension(250, 40));

        CreationDate.setBackground(new java.awt.Color(217, 217, 217));
        CreationDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CreationDate.setForeground(new java.awt.Color(150, 89, 165));
        CreationDate.setText("Creation Date:");
        CreationDate.setPreferredSize(new java.awt.Dimension(160, 40));

        ReporterName.setBackground(new java.awt.Color(217, 217, 217));
        ReporterName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ReporterName.setForeground(new java.awt.Color(150, 89, 165));
        ReporterName.setText("Reporter name:");
        ReporterName.setPreferredSize(new java.awt.Dimension(160, 40));

        Status.setBackground(new java.awt.Color(217, 217, 217));
        Status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Status.setForeground(new java.awt.Color(150, 89, 165));
        Status.setText("Status:");
        Status.setPreferredSize(new java.awt.Dimension(160, 40));

        AssigneeName.setBackground(new java.awt.Color(217, 217, 217));
        AssigneeName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AssigneeName.setForeground(new java.awt.Color(150, 89, 165));
        AssigneeName.setText("Assignee name:");
        AssigneeName.setPreferredSize(new java.awt.Dimension(160, 40));

        Severity.setBackground(new java.awt.Color(217, 217, 217));
        Severity.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Severity.setForeground(new java.awt.Color(150, 89, 165));
        Severity.setText("Severity:");
        Severity.setPreferredSize(new java.awt.Dimension(160, 40));

        Description.setBackground(new java.awt.Color(217, 217, 217));
        Description.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Description.setForeground(new java.awt.Color(150, 89, 165));
        Description.setText("Description:");
        Description.setPreferredSize(new java.awt.Dimension(200, 109));

        DescriptionTextField.setBackground(new java.awt.Color(217, 217, 217));
        DescriptionTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        DescriptionTextField.setForeground(new java.awt.Color(109, 177, 147));
        DescriptionTextField.setToolTipText("Make your search from here");
        DescriptionTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        DescriptionTextField.setPhColor(new java.awt.Color(150, 89, 165));
        DescriptionTextField.setPlaceholder("Description....");
        DescriptionTextField.setPreferredSize(new java.awt.Dimension(200, 109));
        DescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTextFieldActionPerformed(evt);
            }
        });

        NameOfReporter.setBackground(new java.awt.Color(217, 217, 217));
        NameOfReporter.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NameOfReporter.setForeground(new java.awt.Color(150, 89, 165));
        NameOfReporter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NameOfReporter.setMinimumSize(new java.awt.Dimension(250, 40));
        NameOfReporter.setPreferredSize(new java.awt.Dimension(250, 40));

        BugTable.setBackground(new java.awt.Color(217, 217, 217));
        BugTable.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BugTable.setForeground(new java.awt.Color(150, 89, 165));
        BugTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BugTable.setText("Bugs table");
        BugTable.setPreferredSize(new java.awt.Dimension(160, 40));

        StatusComboBox.setBackground(new java.awt.Color(217, 217, 217));
        StatusComboBox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        StatusComboBox.setForeground(new java.awt.Color(150, 89, 165));
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open", "Close", "In progress", "To be Tested" }));
        StatusComboBox.setMinimumSize(new java.awt.Dimension(250, 40));
        StatusComboBox.setPreferredSize(new java.awt.Dimension(250, 40));

        SeverityComboBox.setBackground(new java.awt.Color(217, 217, 217));
        SeverityComboBox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SeverityComboBox.setForeground(new java.awt.Color(150, 89, 165));
        SeverityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SeverityComboBox.setMinimumSize(new java.awt.Dimension(250, 40));
        SeverityComboBox.setPreferredSize(new java.awt.Dimension(250, 40));

        LoGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        LoGo.setText("jLabel1");

        Search3.setBackground(new java.awt.Color(217, 217, 217));
        Search3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search3.setForeground(new java.awt.Color(109, 177, 147));
        Search3.setToolTipText("Make your search from here");
        Search3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search3.setPhColor(new java.awt.Color(150, 89, 165));
        Search3.setPlaceholder("Search....");

        jScrollPane5.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane5.setForeground(new java.awt.Color(50, 50, 50));
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSTableMetro4.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro4.setColorBackgoundHead(new java.awt.Color(50, 50, 50));
        rSTableMetro4.setColorBordeFilas(new java.awt.Color(50, 50, 50));
        rSTableMetro4.setColorFilasBackgound1(new java.awt.Color(217, 217, 217));
        rSTableMetro4.setColorFilasBackgound2(new java.awt.Color(217, 217, 217));
        rSTableMetro4.setColorFilasForeground1(new java.awt.Color(150, 89, 165));
        rSTableMetro4.setColorFilasForeground2(new java.awt.Color(150, 89, 165));
        rSTableMetro4.setColorForegroundHead(new java.awt.Color(217, 217, 217));
        rSTableMetro4.setColorSelBackgound(new java.awt.Color(150, 89, 165));
        rSTableMetro4.setColorSelForeground(new java.awt.Color(50, 50, 50));
        jScrollPane5.setViewportView(rSTableMetro4);

        DetailsOfBugs.setBackground(new java.awt.Color(217, 217, 217));
        DetailsOfBugs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DetailsOfBugs.setForeground(new java.awt.Color(150, 89, 165));
        DetailsOfBugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        DetailsOfBugs.setText("Bug Details:");
        DetailsOfBugs.setPreferredSize(new java.awt.Dimension(160, 40));

        AddButton.setBackground(new java.awt.Color(109, 177, 147));
        AddButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AddButton.setForeground(new java.awt.Color(50, 50, 50));
        AddButton.setText("Add");
        AddButton.setPreferredSize(new java.awt.Dimension(160, 40));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(109, 177, 147));
        ClearButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(50, 50, 50));
        ClearButton.setText("Clear");
        ClearButton.setPreferredSize(new java.awt.Dimension(160, 40));

        UpdateButton.setBackground(new java.awt.Color(109, 177, 147));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(50, 50, 50));
        UpdateButton.setText("Update");
        UpdateButton.setPreferredSize(new java.awt.Dimension(160, 40));

        DeleteButton.setBackground(new java.awt.Color(109, 177, 147));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(50, 50, 50));
        DeleteButton.setText("Delete");
        DeleteButton.setPreferredSize(new java.awt.Dimension(160, 40));

        NameOfAssignee.setBackground(new java.awt.Color(217, 217, 217));
        NameOfAssignee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        NameOfAssignee.setForeground(new java.awt.Color(109, 177, 147));
        NameOfAssignee.setToolTipText("Make your search from here");
        NameOfAssignee.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        NameOfAssignee.setPhColor(new java.awt.Color(150, 89, 165));
        NameOfAssignee.setPlaceholder("Assignee name...");
        NameOfAssignee.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout BugDetailsLayout = new javax.swing.GroupLayout(BugDetails);
        BugDetails.setLayout(BugDetailsLayout);
        BugDetailsLayout.setHorizontalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(LoGo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BugDetailsLayout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BugDetailsLayout.createSequentialGroup()
                                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(BugDetailsLayout.createSequentialGroup()
                                    .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ReporterName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(BugDetailsLayout.createSequentialGroup()
                                            .addComponent(NameOfReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)
                                            .addComponent(Severity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SeverityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BugDetailsLayout.createSequentialGroup()
                                                .addComponent(AssigneeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NameOfAssignee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(BugDetailsLayout.createSequentialGroup()
                                                .addComponent(NameOfBug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(BugTable, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(499, Short.MAX_VALUE))
            .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BugDetailsLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(DetailsOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );
        BugDetailsLayout.setVerticalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameOfBug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssigneeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameOfAssignee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReporterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameOfReporter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Severity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeverityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BugTable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BugDetailsLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(DetailsOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1200, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Bug details", BugDetails);

        OverView.setBackground(new java.awt.Color(217, 217, 217));

        noOfOpenedBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfOpenedBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(133, 89, 165)));
        noOfOpenedBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        OP.setBackground(new java.awt.Color(50, 50, 50));
        OP.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        OP.setForeground(new java.awt.Color(217, 217, 217));
        OP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        OP.setText("10");
        OP.setOpaque(true);

        javax.swing.GroupLayout noOfOpenedBugsLayout = new javax.swing.GroupLayout(noOfOpenedBugs);
        noOfOpenedBugs.setLayout(noOfOpenedBugsLayout);
        noOfOpenedBugsLayout.setHorizontalGroup(
            noOfOpenedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfOpenedBugsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(OP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        noOfOpenedBugsLayout.setVerticalGroup(
            noOfOpenedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfOpenedBugsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(OP)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        bugs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bugs.setForeground(new java.awt.Color(50, 50, 50));
        bugs.setText("Number of opened bugs:");

        bugs2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bugs2.setForeground(new java.awt.Color(50, 50, 50));
        bugs2.setText("Number of closed bugs:");

        noOfClosedBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfClosedBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfClosedBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        CB.setBackground(new java.awt.Color(50, 50, 50));
        CB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        CB.setForeground(new java.awt.Color(217, 217, 217));
        CB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        CB.setText(" 10");
        CB.setOpaque(true);

        javax.swing.GroupLayout noOfClosedBugsLayout = new javax.swing.GroupLayout(noOfClosedBugs);
        noOfClosedBugs.setLayout(noOfClosedBugsLayout);
        noOfClosedBugsLayout.setHorizontalGroup(
            noOfClosedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfClosedBugsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        noOfClosedBugsLayout.setVerticalGroup(
            noOfClosedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfClosedBugsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CB)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelBarChart.setBackground(new java.awt.Color(217, 217, 217));
        panelBarChart.setForeground(new java.awt.Color(217, 217, 217));
        panelBarChart.setPreferredSize(new java.awt.Dimension(540, 346));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        noOfInProgressBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfInProgressBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(133, 89, 165)));
        noOfInProgressBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        IPB.setBackground(new java.awt.Color(50, 50, 50));
        IPB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        IPB.setForeground(new java.awt.Color(217, 217, 217));
        IPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        IPB.setText("10");
        IPB.setOpaque(true);

        javax.swing.GroupLayout noOfInProgressBugsLayout = new javax.swing.GroupLayout(noOfInProgressBugs);
        noOfInProgressBugs.setLayout(noOfInProgressBugsLayout);
        noOfInProgressBugsLayout.setHorizontalGroup(
            noOfInProgressBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfInProgressBugsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(IPB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noOfInProgressBugsLayout.setVerticalGroup(
            noOfInProgressBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfInProgressBugsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(IPB)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        bugs3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bugs3.setForeground(new java.awt.Color(50, 50, 50));
        bugs3.setText("Number of to be tested bugs:");

        noOfToBeTestedBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfToBeTestedBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfToBeTestedBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        TBT.setBackground(new java.awt.Color(50, 50, 50));
        TBT.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TBT.setForeground(new java.awt.Color(217, 217, 217));
        TBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        TBT.setText(" 10");
        TBT.setOpaque(true);

        javax.swing.GroupLayout noOfToBeTestedBugsLayout = new javax.swing.GroupLayout(noOfToBeTestedBugs);
        noOfToBeTestedBugs.setLayout(noOfToBeTestedBugsLayout);
        noOfToBeTestedBugsLayout.setHorizontalGroup(
            noOfToBeTestedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfToBeTestedBugsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(TBT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noOfToBeTestedBugsLayout.setVerticalGroup(
            noOfToBeTestedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfToBeTestedBugsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TBT)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        bugs4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bugs4.setForeground(new java.awt.Color(50, 50, 50));
        bugs4.setText("Number of in progress bugs:");

        javax.swing.GroupLayout OverViewLayout = new javax.swing.GroupLayout(OverView);
        OverView.setLayout(OverViewLayout);
        OverViewLayout.setHorizontalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(bugs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bugs4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverViewLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noOfClosedBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(bugs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OverViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(bugs3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        OverViewLayout.setVerticalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverViewLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OverViewLayout.createSequentialGroup()
                                .addComponent(bugs2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noOfClosedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OverViewLayout.createSequentialGroup()
                                .addComponent(bugs, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)
                        .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OverViewLayout.createSequentialGroup()
                                .addComponent(bugs4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OverViewLayout.createSequentialGroup()
                                .addComponent(bugs3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(OverViewLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(747, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("over view", OverView);

        jScrollPane1.setViewportView(jTabbedPane2);

        javax.swing.GroupLayout bugLayout = new javax.swing.GroupLayout(bug);
        bug.setLayout(bugLayout);
        bugLayout.setHorizontalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bugLayout.setVerticalGroup(
            bugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", bug);

        backgroundPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 28, 1030, 740));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1371, 804));
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

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextFieldActionPerformed

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
                new Tester1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AssigneeName;
    private javax.swing.JLabel BN;
    private javax.swing.JPanel BugDetails;
    private javax.swing.JLabel BugLogo;
    private javax.swing.JLabel BugName;
    private javax.swing.JLabel BugNumber;
    private javax.swing.JLabel BugTable;
    private javax.swing.JLabel CB;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel CreationDate;
    private javax.swing.JLabel Dashlogo;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Description;
    private app.bolivia.swing.JCTextField DescriptionTextField;
    private javax.swing.JLabel DetailsOfBugs;
    private javax.swing.JLabel IPB;
    private javax.swing.JLabel LoGo;
    private javax.swing.JLabel LogoOfSearch;
    private javax.swing.JLabel LogoutLogo;
    private app.bolivia.swing.JCTextField NameOfAssignee;
    private app.bolivia.swing.JCTextField NameOfBug;
    private javax.swing.JComboBox<String> NameOfReporter;
    private javax.swing.JLabel OP;
    private javax.swing.JPanel OverView;
    private javax.swing.JLabel PN;
    private javax.swing.JLabel ProjectDetails2;
    private javax.swing.JLabel ProjectLogo;
    private javax.swing.JLabel ProjectNumber;
    private javax.swing.JLabel ProjectsDetails;
    private javax.swing.JPanel ProjectsPanel;
    private javax.swing.JLabel ReporterName;
    private app.bolivia.swing.JCTextField Search;
    private app.bolivia.swing.JCTextField Search1;
    private app.bolivia.swing.JCTextField Search2;
    private app.bolivia.swing.JCTextField Search3;
    private javax.swing.JLabel SearchLogo;
    private javax.swing.JLabel Severity;
    private javax.swing.JComboBox<String> SeverityComboBox;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Status;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel TBT;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel bug;
    private javax.swing.JLabel bugs;
    private javax.swing.JLabel bugs2;
    private javax.swing.JLabel bugs3;
    private javax.swing.JLabel bugs4;
    private javax.swing.JPanel dashboard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel noOfBugs;
    private javax.swing.JPanel noOfClosedBugs;
    private javax.swing.JPanel noOfInProgressBugs;
    private javax.swing.JPanel noOfOpenedBugs;
    private javax.swing.JPanel noOfProjects;
    private javax.swing.JPanel noOfToBeTestedBugs;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel project;
    private rojerusan.RSTableMetro rSTableMetro1;
    private rojerusan.RSTableMetro rSTableMetro2;
    private rojerusan.RSTableMetro rSTableMetro3;
    private rojerusan.RSTableMetro rSTableMetro4;
    private javax.swing.JLabel searchLogo;
    private javax.swing.JLabel testerLogo;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
