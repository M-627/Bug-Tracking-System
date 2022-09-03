/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackingsystem;


import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author mariam
 */
public class BugDetails extends javax.swing.JFrame implements Colors {

    //CONTROLLER
    TesterController BugDetail = new TesterController();

    //IMPORTANT VALUES
    int BugId = 0;  //FOR STORING THE BUGID  
    int edit = 0; // USED AS AN INDICATOR FOR UPDATE OPERATION
    int add = 0; //USED AS AN INDICATOR FOR INSERT OPERATION

    public BugDetails() {
        initComponents();

        //VIEW BUGTABLE FOR SPECIFIC PROJECT 
        BugDetail.ViewProjectBugsTable();
        BugTable.setModel(DbUtils.resultSetToTableModel(BugDetail.getResObj()));

        //LET SOME FIELDS AND BUTTONS TO BE UNENABLED
        IDOfProject.setEnabled(false);
        IDOfProject.setText(String.valueOf(CurrentProject.projectId));
        NameOfBug.setEnabled(false);
        IDOfTester.setEnabled(false);
        IDOfTester.setText(String.valueOf(CurrentUser.id));
        IdOfDeveloper.setEnabled(false);
        Description.setEnabled(false);
        StatusBox.setEnabled(false);
        SeverityBox.setEnabled(false);
        TypeBox.setEnabled(false);
        ConfirmButton.setEnabled(false);
        EditButton.setVisible(false);
        DeleteButton.setEnabled(false);

        //VIEW BUG CARD 
        OP.setText(String.valueOf(BugDetail.ViewOpenedCard()));
        IPB.setText(String.valueOf(BugDetail.ViewInProgressCard()));
        TBT.setText(String.valueOf(BugDetail.ViewToBeTestedCard()));
        CB.setText(String.valueOf(BugDetail.ViewClosedCard()));

        //SHOW PIE CHART
        showPieChart();
        
        // SET THE JFRAME TO BE IN THE CENTER 
        this.setLocationRelativeTo(null);

    }

    public void showPieChart() {

        //create dataset (percentage should be changed auto from table to another one)
        DefaultPieDataset barDataset = new DefaultPieDataset();
        double count = BugDetail.CountBugs();
        System.out.println(count);
        
        double o = (BugDetail.ViewOpenedCard()/count) * 100;
        System.out.println(o);
        
        double c = (BugDetail.ViewClosedCard() / count) * 100;
        System.out.println(c);
        
        double t = (BugDetail.ViewToBeTestedCard()  / count) * 100;
        System.out.println(t);
        
        double i = (BugDetail.ViewInProgressCard()  / count) * 100;
        System.out.println(i);
        
        barDataset.setValue("in progress", new Double(i));
        barDataset.setValue("to be tested", new Double(t));
        barDataset.setValue("closed", new Double(c));
        barDataset.setValue("open", new Double(o));

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Bug Status", barDataset, false, true, false);
        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("in progress", new Color(150, 89, 165));
        piePlot.setSectionPaint("to be tested", new Color(109, 177, 147));
        piePlot.setSectionPaint("closed", new Color(217, 217, 217));
        piePlot.setSectionPaint("open", new Color(50, 50, 50));
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

        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TableOfBugs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BugTable = new javax.swing.JTable();
        DetailsOfBugs = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        LogoOfSearch = new javax.swing.JLabel();
        Search = new app.bolivia.swing.JCTextField();
        BugDetails = new javax.swing.JPanel();
        CancelButton1 = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        BugDetailsLabel = new javax.swing.JLabel();
        ProjectIdLabel = new javax.swing.JLabel();
        IDOfProject = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameOfBug = new javax.swing.JTextField();
        TesterIdLabel = new javax.swing.JLabel();
        IDOfTester = new javax.swing.JTextField();
        DeveloperNameLabel = new javax.swing.JLabel();
        IdOfDeveloper = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        StatusLabel = new javax.swing.JLabel();
        StatusBox = new javax.swing.JComboBox<>();
        SeverityLabel = new javax.swing.JLabel();
        SeverityBox = new javax.swing.JComboBox<>();
        TypeLabel = new javax.swing.JLabel();
        TypeBox = new javax.swing.JComboBox<>();
        OverView = new javax.swing.JPanel();
        OpenBugLabel = new javax.swing.JLabel();
        noOfOpenedBugs = new javax.swing.JPanel();
        OP = new javax.swing.JLabel();
        InprogressLabel = new javax.swing.JLabel();
        noOfInProgressBugs = new javax.swing.JPanel();
        IPB = new javax.swing.JLabel();
        ToBeTestedLabel = new javax.swing.JLabel();
        noOfToBeTestedBugs = new javax.swing.JPanel();
        TBT = new javax.swing.JLabel();
        closeBugLabel = new javax.swing.JLabel();
        noOfCloseBugs = new javax.swing.JPanel();
        CB = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        CancelButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 740));

        jTabbedPane1.setBackground(new java.awt.Color(50, 50, 50));
        jTabbedPane1.setForeground(new java.awt.Color(217, 217, 217));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 740));

        TableOfBugs.setBackground(new java.awt.Color(50, 50, 50));
        TableOfBugs.setPreferredSize(new java.awt.Dimension(700, 462));

        BugTable.setBackground(new java.awt.Color(50, 50, 50));
        BugTable.setForeground(new java.awt.Color(217, 217, 217));
        BugTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BugTable.setIntercellSpacing(new java.awt.Dimension(1, 6));
        BugTable.setPreferredSize(new java.awt.Dimension(270, 606));
        BugTable.setRowHeight(40);
        BugTable.setSelectionBackground(new java.awt.Color(109, 177, 147));
        BugTable.setSelectionForeground(new java.awt.Color(50, 50, 50));
        BugTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BugTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BugTable);

        DetailsOfBugs.setBackground(new java.awt.Color(217, 217, 217));
        DetailsOfBugs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DetailsOfBugs.setForeground(new java.awt.Color(109, 177, 147));
        DetailsOfBugs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DetailsOfBugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        DetailsOfBugs.setText(" Bug Table");
        DetailsOfBugs.setPreferredSize(new java.awt.Dimension(995, 72));

        Add.setBackground(new java.awt.Color(109, 177, 147));
        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(50, 50, 50));
        Add.setText("Add  new Bug");
        Add.setToolTipText("Enter ok to exit this window");
        Add.setPreferredSize(new java.awt.Dimension(133, 42));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(109, 177, 147));
        CancelButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(50, 50, 50));
        CancelButton.setText("Cancel");
        CancelButton.setToolTipText("Enter ok to exit this window");
        CancelButton.setPreferredSize(new java.awt.Dimension(133, 42));
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

        LogoOfSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        LogoOfSearch.setText("jLabel1");

        Search.setBackground(new java.awt.Color(50, 50, 50));
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(109, 177, 147)));
        Search.setForeground(new java.awt.Color(109, 177, 147));
        Search.setToolTipText("Make your search from here");
        Search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search.setPhColor(new java.awt.Color(109, 177, 147));
        Search.setPlaceholder("Search....");
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout TableOfBugsLayout = new javax.swing.GroupLayout(TableOfBugs);
        TableOfBugs.setLayout(TableOfBugsLayout);
        TableOfBugsLayout.setHorizontalGroup(
            TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableOfBugsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableOfBugsLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableOfBugsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoOfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
            .addComponent(DetailsOfBugs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TableOfBugsLayout.setVerticalGroup(
            TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableOfBugsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DetailsOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoOfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bug Table", TableOfBugs);

        BugDetails.setBackground(new java.awt.Color(50, 50, 50));
        BugDetails.setForeground(new java.awt.Color(217, 217, 217));
        BugDetails.setToolTipText("");
        BugDetails.setPreferredSize(new java.awt.Dimension(800, 600));

        CancelButton1.setBackground(new java.awt.Color(133, 89, 165));
        CancelButton1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        CancelButton1.setForeground(new java.awt.Color(50, 50, 50));
        CancelButton1.setText("Cancel");
        CancelButton1.setPreferredSize(new java.awt.Dimension(150, 45));
        CancelButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButton1MouseExited(evt);
            }
        });
        CancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton1ActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(133, 89, 165));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(50, 50, 50));
        DeleteButton.setText("Delete");
        DeleteButton.setPreferredSize(new java.awt.Dimension(150, 45));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseExited(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ConfirmButton.setBackground(new java.awt.Color(133, 89, 165));
        ConfirmButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(50, 50, 50));
        ConfirmButton.setText("Confirm");
        ConfirmButton.setPreferredSize(new java.awt.Dimension(150, 45));
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseExited(evt);
            }
        });
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(109, 177, 147));
        EditButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        EditButton.setForeground(new java.awt.Color(50, 50, 50));
        EditButton.setText("Edit");
        EditButton.setPreferredSize(new java.awt.Dimension(150, 45));
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditButtonMouseExited(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        BugDetailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        BugDetailsLabel.setForeground(new java.awt.Color(133, 89, 165));
        BugDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BugDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BugDetailsLabel.setText("Bug Details:");
        BugDetailsLabel.setPreferredSize(new java.awt.Dimension(800, 90));

        ProjectIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectIdLabel.setForeground(new java.awt.Color(109, 177, 147));
        ProjectIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectIdLabel.setText("Project ID:");
        ProjectIdLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        IDOfProject.setBackground(new java.awt.Color(50, 50, 50));
        IDOfProject.setForeground(new java.awt.Color(217, 217, 217));
        IDOfProject.setPreferredSize(new java.awt.Dimension(219, 45));

        NameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(109, 177, 147));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Bug Name:");
        NameLabel.setToolTipText("");
        NameLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        NameOfBug.setBackground(new java.awt.Color(50, 50, 50));
        NameOfBug.setForeground(new java.awt.Color(217, 217, 217));
        NameOfBug.setPreferredSize(new java.awt.Dimension(219, 45));
        NameOfBug.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameOfBugFocusLost(evt);
            }
        });

        TesterIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TesterIdLabel.setForeground(new java.awt.Color(109, 177, 147));
        TesterIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TesterIdLabel.setText("Reporter Name:");
        TesterIdLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        IDOfTester.setBackground(new java.awt.Color(50, 50, 50));
        IDOfTester.setForeground(new java.awt.Color(217, 217, 217));
        IDOfTester.setPreferredSize(new java.awt.Dimension(219, 45));

        DeveloperNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DeveloperNameLabel.setForeground(new java.awt.Color(109, 177, 147));
        DeveloperNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeveloperNameLabel.setText("Developer Name:");
        DeveloperNameLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        IdOfDeveloper.setBackground(new java.awt.Color(50, 50, 50));
        IdOfDeveloper.setForeground(new java.awt.Color(217, 217, 217));
        IdOfDeveloper.setPreferredSize(new java.awt.Dimension(219, 45));
        IdOfDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdOfDeveloperActionPerformed(evt);
            }
        });

        DescriptionLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(109, 177, 147));
        DescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescriptionLabel.setText("Description:");
        DescriptionLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        Description.setBackground(new java.awt.Color(50, 50, 50));
        Description.setForeground(new java.awt.Color(217, 217, 217));
        Description.setPreferredSize(new java.awt.Dimension(743, 89));
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });

        StatusLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(109, 177, 147));
        StatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusLabel.setText("Status:");
        StatusLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        StatusBox.setBackground(new java.awt.Color(50, 50, 50));
        StatusBox.setForeground(new java.awt.Color(217, 217, 217));
        StatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Open", "In progress", "To be tested", "Closed" }));

        SeverityLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SeverityLabel.setForeground(new java.awt.Color(109, 177, 147));
        SeverityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeverityLabel.setText("Severity:");
        SeverityLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        SeverityBox.setBackground(new java.awt.Color(50, 50, 50));
        SeverityBox.setForeground(new java.awt.Color(217, 217, 217));
        SeverityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Critical", "Major", "Moderate", "Minor", "Cosmitic" }));

        TypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(109, 177, 147));
        TypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeLabel.setText("Type:");
        TypeLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        TypeBox.setBackground(new java.awt.Color(50, 50, 50));
        TypeBox.setForeground(new java.awt.Color(217, 217, 217));
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Content", "Functional", "Visual", " " }));

        javax.swing.GroupLayout BugDetailsLayout = new javax.swing.GroupLayout(BugDetails);
        BugDetails.setLayout(BugDetailsLayout);
        BugDetailsLayout.setHorizontalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(DeveloperNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TesterIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameOfBug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDOfProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IDOfTester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdOfDeveloper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BugDetailsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BugDetailsLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BugDetailsLayout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(SeverityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeverityBox, 0, 1, Short.MAX_VALUE)
                            .addComponent(StatusBox, 0, 0, Short.MAX_VALUE)
                            .addComponent(TypeBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)))
                    .addComponent(Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addComponent(BugDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(CancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        BugDetailsLayout.setVerticalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BugDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ProjectIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatusBox)
                    .addComponent(IDOfProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameOfBug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeverityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SeverityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TesterIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDOfTester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeveloperNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdOfDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bug Details", BugDetails);

        OverView.setBackground(new java.awt.Color(50, 50, 50));
        OverView.setForeground(new java.awt.Color(217, 217, 217));
        OverView.setToolTipText("");
        OverView.setPreferredSize(new java.awt.Dimension(915, 600));

        OpenBugLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OpenBugLabel.setForeground(new java.awt.Color(133, 89, 165));
        OpenBugLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpenBugLabel.setText("Number of opened bugs");

        noOfOpenedBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfOpenedBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        OP.setBackground(new java.awt.Color(50, 50, 50));
        OP.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        OP.setForeground(new java.awt.Color(133, 89, 165));
        OP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/opened-small.png"))); // NOI18N
        OP.setText("0");
        OP.setOpaque(true);

        javax.swing.GroupLayout noOfOpenedBugsLayout = new javax.swing.GroupLayout(noOfOpenedBugs);
        noOfOpenedBugs.setLayout(noOfOpenedBugsLayout);
        noOfOpenedBugsLayout.setHorizontalGroup(
            noOfOpenedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfOpenedBugsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(OP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noOfOpenedBugsLayout.setVerticalGroup(
            noOfOpenedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfOpenedBugsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(OP, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        InprogressLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InprogressLabel.setForeground(new java.awt.Color(133, 89, 165));
        InprogressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InprogressLabel.setText("Number of in progress bugs");

        noOfInProgressBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfInProgressBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        IPB.setBackground(new java.awt.Color(50, 50, 50));
        IPB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        IPB.setForeground(new java.awt.Color(133, 89, 165));
        IPB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/in progress-small.png"))); // NOI18N
        IPB.setText("0");
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
                .addGap(30, 30, 30)
                .addComponent(IPB, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        ToBeTestedLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ToBeTestedLabel.setForeground(new java.awt.Color(133, 89, 165));
        ToBeTestedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToBeTestedLabel.setText("Number of to be tested bugs");

        noOfToBeTestedBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfToBeTestedBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        TBT.setBackground(new java.awt.Color(50, 50, 50));
        TBT.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TBT.setForeground(new java.awt.Color(133, 89, 165));
        TBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/to be tested-small.png"))); // NOI18N
        TBT.setText(" 0");
        TBT.setOpaque(true);

        javax.swing.GroupLayout noOfToBeTestedBugsLayout = new javax.swing.GroupLayout(noOfToBeTestedBugs);
        noOfToBeTestedBugs.setLayout(noOfToBeTestedBugsLayout);
        noOfToBeTestedBugsLayout.setHorizontalGroup(
            noOfToBeTestedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfToBeTestedBugsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(TBT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        noOfToBeTestedBugsLayout.setVerticalGroup(
            noOfToBeTestedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfToBeTestedBugsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TBT)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        closeBugLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closeBugLabel.setForeground(new java.awt.Color(133, 89, 165));
        closeBugLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBugLabel.setText("Number of closed bugs");

        noOfCloseBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfCloseBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        CB.setBackground(new java.awt.Color(50, 50, 50));
        CB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        CB.setForeground(new java.awt.Color(133, 89, 165));
        CB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/closed-small.png"))); // NOI18N
        CB.setText("0");
        CB.setOpaque(true);

        javax.swing.GroupLayout noOfCloseBugsLayout = new javax.swing.GroupLayout(noOfCloseBugs);
        noOfCloseBugs.setLayout(noOfCloseBugsLayout);
        noOfCloseBugsLayout.setHorizontalGroup(
            noOfCloseBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfCloseBugsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        noOfCloseBugsLayout.setVerticalGroup(
            noOfCloseBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfCloseBugsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelBarChart.setBackground(new java.awt.Color(50, 50, 50));
        panelBarChart.setForeground(new java.awt.Color(217, 217, 217));
        panelBarChart.setPreferredSize(new java.awt.Dimension(540, 346));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        CancelButton2.setBackground(new java.awt.Color(133, 89, 165));
        CancelButton2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        CancelButton2.setForeground(new java.awt.Color(50, 50, 50));
        CancelButton2.setText("Cancel");
        CancelButton2.setPreferredSize(new java.awt.Dimension(150, 45));
        CancelButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButton2MouseExited(evt);
            }
        });
        CancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OverViewLayout = new javax.swing.GroupLayout(OverView);
        OverView.setLayout(OverViewLayout);
        OverViewLayout.setHorizontalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverViewLayout.createSequentialGroup()
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ToBeTestedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(closeBugLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noOfCloseBugs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverViewLayout.createSequentialGroup()
                        .addComponent(CancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(421, 421, 421))))
            .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(OpenBugLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InprogressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                    .addContainerGap(744, Short.MAX_VALUE)))
        );
        OverViewLayout.setVerticalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(ToBeTestedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(closeBugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfCloseBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(CancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverViewLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(OpenBugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(126, 126, 126)
                    .addComponent(InprogressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Over View", OverView);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        EditButton.setVisible(false);
        DeleteButton.setVisible(false);
        ConfirmButton.setEnabled(true);
        IDOfProject.setEnabled(false);
        IDOfProject.setText(String.valueOf(CurrentProject.projectId));
        NameOfBug.setEnabled(true);
        NameOfBug.setText("");
        IDOfTester.setEnabled(false);
        IDOfTester.setText(String.valueOf(CurrentUser.user));
        IdOfDeveloper.setEnabled(false);
        IdOfDeveloper.setText("");
        Description.setEnabled(true);
        Description.setText("");
        StatusBox.setEnabled(false);
        StatusBox.setSelectedIndex(1);
        SeverityBox.setEnabled(true);
        SeverityBox.setSelectedIndex(0);
        TypeBox.setEnabled(true);
        TypeBox.setSelectedIndex(0);

        add = 1;
        BugId = BugDetail.GenerateBugID();
        System.out.println("bugid = " + BugId);
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(Purple);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(Green);
    }//GEN-LAST:event_AddMouseExited

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void CancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseEntered
        CancelButton.setBackground(Purple);
    }//GEN-LAST:event_CancelButtonMouseEntered

    private void CancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseExited
        CancelButton.setBackground(Green);
    }//GEN-LAST:event_CancelButtonMouseExited

    private void CancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButton1ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void CancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButton2ActionPerformed

    private void BugTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugTableMouseClicked
        try {
            System.out.println("storing the value of row choosen...");

            int selectedID = (int) BugTable.getValueAt(BugTable.getSelectedRow(), 0);
            CurrentBug bug = new CurrentBug((selectedID));
            BugId = CurrentBug.BugId;
            String[] arr = BugDetail.selectedBug(selectedID);

            jTabbedPane1.setSelectedIndex(1);
            NameOfBug.setEnabled(false);
            IDOfProject.setEnabled(false);
            IDOfTester.setEnabled(false);
            IdOfDeveloper.setEnabled(false);
            Description.setEnabled(false);
            StatusBox.setEnabled(false);
            SeverityBox.setEnabled(false);
            TypeBox.setEnabled(false);

            System.out.println("check if the status of this bug is closed or not to  make add&update&delete buttons to be unvisible...");
            String status = arr[6];
            System.out.println("status = " + arr[6]);

            if (status == null) {
                status = "---";
            }

            if (status.equals("C")) {
                ConfirmButton.setEnabled(false);
                EditButton.setVisible(false);
                DeleteButton.setEnabled(false);
            } else if (!"C".equals(status) && Integer.parseInt(arr[3]) != CurrentUser.id) {
                ConfirmButton.setEnabled(false);
                EditButton.setVisible(false);
                DeleteButton.setEnabled(false);
            } else if (!"C".equals(status) && Integer.parseInt(arr[3]) == CurrentUser.id) {
                ConfirmButton.setEnabled(false);
                EditButton.setVisible(true);
                DeleteButton.setEnabled(true);
            }

            System.out.println("storing data in its place in text fields...");

            System.out.println("Name = " + arr[0]);
            NameOfBug.setText(arr[0]);

            System.out.println("PID = " + arr[1]);
            IDOfProject.setText(arr[1]);

            System.out.println("TNAME = " + arr[2]);
            IDOfTester.setText(arr[2]);

            System.out.println("DNAME = " + arr[4]);
            IdOfDeveloper.setText(arr[4]);

            System.out.println("Description = " + arr[5]);
            Description.setText(arr[5]);

            switch (status) {
                case "O":
                    StatusBox.setSelectedIndex(1);
                    break;
                case "I":
                    StatusBox.setSelectedIndex(2);
                    break;
                case "T":
                    StatusBox.setSelectedIndex(3);
                    break;
                case "C":
                    StatusBox.setSelectedIndex(4);
                    break;
                default:
                    StatusBox.setSelectedIndex(0);
                    break;
            }

            String Severity = arr[7];
            System.out.println("severity = " + Severity);

            if (Severity == null) {
                Severity = "---";
            }

            switch (Severity) {
                case "Critical":
                    SeverityBox.setSelectedIndex(1);
                    break;
                case "Major":
                    SeverityBox.setSelectedIndex(2);
                    break;
                case "Moderate":
                    SeverityBox.setSelectedIndex(3);
                    break;
                case "Minor":
                    SeverityBox.setSelectedIndex(4);
                    break;
                case "Cosmitic":
                    SeverityBox.setSelectedIndex(5);
                    break;
                default:
                    SeverityBox.setSelectedIndex(0);
                    break;
            }

            String Type = arr[8];
            System.out.println("Type = " + Type);

            if (Type == null) {
                Type = "---";
            }

            switch (Type) {
                case "Content":
                    TypeBox.setSelectedIndex(1);
                    break;
                case "Functional":
                    TypeBox.setSelectedIndex(2);
                    break;
                case "Visual":
                    TypeBox.setSelectedIndex(3);
                    break;
                default:
                    TypeBox.setSelectedIndex(0);
                    break;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_BugTableMouseClicked

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        BugDetail.searchBugDetails(Search.getText());
        BugTable.setModel(DbUtils.resultSetToTableModel(BugDetail.getResObj()));
    }//GEN-LAST:event_SearchKeyReleased

    private void IdOfDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdOfDeveloperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdOfDeveloperActionPerformed

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void EditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseEntered
        EditButton.setBackground(Purple);
    }//GEN-LAST:event_EditButtonMouseEntered

    private void EditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseExited
        EditButton.setBackground(Green);
    }//GEN-LAST:event_EditButtonMouseExited

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        edit = 1;
        Description.setEnabled(true);
        StatusBox.setEnabled(false);
        SeverityBox.setEnabled(true);
        TypeBox.setEnabled(true);
        ConfirmButton.setEnabled(true);
        DeleteButton.setEnabled(true);
        BugId = CurrentBug.BugId;
    }//GEN-LAST:event_EditButtonMouseClicked

    private void CancelButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton1MouseEntered
        CancelButton1.setBackground(Green);
    }//GEN-LAST:event_CancelButton1MouseEntered

    private void CancelButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton1MouseExited
        CancelButton1.setBackground(Purple);
    }//GEN-LAST:event_CancelButton1MouseExited

    private void CancelButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButton1MouseClicked

    private void ConfirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseEntered
        ConfirmButton.setBackground(Green);
    }//GEN-LAST:event_ConfirmButtonMouseEntered

    private void ConfirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseExited
        ConfirmButton.setBackground(Purple);
    }//GEN-LAST:event_ConfirmButtonMouseExited

    private void ConfirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseClicked
        int TID;
        String status = "";
        String Severity;
        String Type;
        int done;

        if (add == 1) {
            if (IDOfProject.getText().isEmpty() || NameOfBug.getText().isEmpty() || IDOfTester.getText().isEmpty() || Description.getText().isEmpty() || StatusBox.getSelectedIndex() == 0 || SeverityBox.getSelectedIndex() == 0 || TypeBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "missing information");
            } else {

                //FINDING THE STATUS OF BUG
                switch (StatusBox.getSelectedIndex()) {
                    case 1:
                        status = "O";
                        break;
                    case 2:
                        status = "I";
                        break;
                    case 3:
                        status = "T";
                        break;
                    case 4:
                        status = "C";
                        break;
                    default:
                        break;
                }

                //FINDING THE ID OF TESTER
                TID = BugDetail.getTesterId(IDOfTester.getText());

                Severity = SeverityBox.getSelectedItem().toString();

                Type = TypeBox.getSelectedItem().toString();

                done = BugDetail.addBug(BugId, NameOfBug.getText(), IDOfProject.getText(), TID, Description.getText(), status, Severity, Type);
                if (done == 1) {
                    JOptionPane.showMessageDialog(this, "Information added succesfully");
                    jTabbedPane1.setSelectedIndex(0);

                    // RELOAD TABLE
                    BugDetail.ViewProjectBugsTable();
                    BugTable.setModel(DbUtils.resultSetToTableModel(BugDetail.getResObj()));

                    //RELOAD BUG CARD 
                    OP.setText(String.valueOf(BugDetail.ViewOpenedCard()));
                    IPB.setText(String.valueOf(BugDetail.ViewInProgressCard()));
                    TBT.setText(String.valueOf(BugDetail.ViewToBeTestedCard()));
                    CB.setText(String.valueOf(BugDetail.ViewClosedCard()));
                }
            }
        } else if (edit == 1) {
            done = BugDetail.UpdateBug(Description.getText(), SeverityBox.getSelectedItem().toString(), TypeBox.getSelectedItem().toString(), BugId);
            if (done == 1) {
                JOptionPane.showMessageDialog(this, "Information Updated succesfully");
                jTabbedPane1.setSelectedIndex(0);

                // RELOAD TABLE
                BugDetail.ViewProjectBugsTable();
                BugTable.setModel(DbUtils.resultSetToTableModel(BugDetail.getResObj()));

                //RELOAD BUG CARD 
                OP.setText(String.valueOf(BugDetail.ViewOpenedCard()));
                IPB.setText(String.valueOf(BugDetail.ViewInProgressCard()));
                TBT.setText(String.valueOf(BugDetail.ViewToBeTestedCard()));
                CB.setText(String.valueOf(BugDetail.ViewClosedCard()));
            }

        }

    }//GEN-LAST:event_ConfirmButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        int done = BugDetail.deleteBug(BugId, NameOfBug.getText());
        if (done == 1) {
            JOptionPane.showMessageDialog(null, "Information Deleted Succesfully");
            jTabbedPane1.setSelectedIndex(0);

            //RELOAD TABLE
            BugDetail.ViewProjectBugsTable();
            BugTable.setModel(DbUtils.resultSetToTableModel(BugDetail.getResObj()));

            //RELOAD BUG CARD 
            OP.setText(String.valueOf(BugDetail.ViewOpenedCard()));
            IPB.setText(String.valueOf(BugDetail.ViewInProgressCard()));
            TBT.setText(String.valueOf(BugDetail.ViewToBeTestedCard()));
            CB.setText(String.valueOf(BugDetail.ViewClosedCard()));
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseEntered
        DeleteButton.setBackground(Green);
    }//GEN-LAST:event_DeleteButtonMouseEntered

    private void DeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseExited
        DeleteButton.setBackground(Purple);
    }//GEN-LAST:event_DeleteButtonMouseExited

    private void CancelButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton2MouseEntered
        CancelButton2.setBackground(Green);
    }//GEN-LAST:event_CancelButton2MouseEntered

    private void CancelButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton2MouseExited
        CancelButton2.setBackground(Purple);
    }//GEN-LAST:event_CancelButton2MouseExited

    private void CancelButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButton2MouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelButton2MouseClicked

    private void NameOfBugFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameOfBugFocusLost
        if (BugDetail.ChechDuplicity(NameOfBug.getText())) {
            JOptionPane.showMessageDialog(this, " Sorry this name is exist , please choose another name");
            NameOfBug.setText("");
        }
    }//GEN-LAST:event_NameOfBugFocusLost

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
                new BugDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel BugDetails;
    private javax.swing.JLabel BugDetailsLabel;
    private javax.swing.JTable BugTable;
    private javax.swing.JLabel CB;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CancelButton1;
    private javax.swing.JButton CancelButton2;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField Description;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel DetailsOfBugs;
    private javax.swing.JLabel DeveloperNameLabel;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField IDOfProject;
    private javax.swing.JTextField IDOfTester;
    private javax.swing.JLabel IPB;
    private javax.swing.JTextField IdOfDeveloper;
    private javax.swing.JLabel InprogressLabel;
    private javax.swing.JLabel LogoOfSearch;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameOfBug;
    private javax.swing.JLabel OP;
    private javax.swing.JLabel OpenBugLabel;
    private javax.swing.JPanel OverView;
    private javax.swing.JLabel ProjectIdLabel;
    private app.bolivia.swing.JCTextField Search;
    private javax.swing.JComboBox<String> SeverityBox;
    private javax.swing.JLabel SeverityLabel;
    private javax.swing.JComboBox<String> StatusBox;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TBT;
    private javax.swing.JPanel TableOfBugs;
    private javax.swing.JLabel TesterIdLabel;
    private javax.swing.JLabel ToBeTestedLabel;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel closeBugLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel noOfCloseBugs;
    private javax.swing.JPanel noOfInProgressBugs;
    private javax.swing.JPanel noOfOpenedBugs;
    private javax.swing.JPanel noOfToBeTestedBugs;
    private javax.swing.JPanel panelBarChart;
    // End of variables declaration//GEN-END:variables
}
