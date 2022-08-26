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
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
public class BugTrial extends javax.swing.JFrame {

     //controller
    TesterController Tester = new TesterController();
    
    // Colors  global variables
    Color Black =Color.decode("#323232");
    Color Green =Color.decode("#6DB193");
    Color Purple =Color.decode("#9659A5");
    Color Grey =Color.decode("#3B3B3B");
    
    // importatnt variables
    int BugId = 0; // for storing data in bugTable
    
    public BugTrial() {
        initComponents();
        //View bugTable for specific project
        Tester.ViewBugTable2();
        BugTable.setModel(DbUtils.resultSetToTableModel(Tester.getResObj()));
        //make the textField of projectId uneditable & has the value of current project on it
        IDOfProject.setEditable(false);
        IDOfProject.setText(String.valueOf(CurrentProject.projectId));
        showPieChart();
    }
    
     public void showPieChart(){
        
        //create dataset (percentage should be changed auto from table to another one)
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "in progress" , new Double( 20 ) );  
      barDataset.setValue( "to be tested" , new Double( 20 ) );
      barDataset.setValue( "closed" , new Double( 10 ) ); 
      barDataset.setValue( "open" , new Double( 40 ) ); 
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Bug Status",barDataset, false,true,false);
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TableOfBugs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BugTable = new javax.swing.JTable();
        DetailsOfBugs = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        LogoOfSearch = new javax.swing.JLabel();
        Search2 = new app.bolivia.swing.JCTextField();
        BugDetails = new javax.swing.JPanel();
        CreationDate = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BugDetailsLabel = new javax.swing.JLabel();
        BugNameLabel = new javax.swing.JLabel();
        ProjectIdLabel = new javax.swing.JLabel();
        ReporterIdLabel = new javax.swing.JLabel();
        IDOfProject = new app.bolivia.swing.JCTextField();
        NameOfBug = new app.bolivia.swing.JCTextField();
        BugCreationDate = new com.toedter.calendar.JDateChooser();
        IDOfTester = new app.bolivia.swing.JCTextField();
        DeveloperNameLabel = new javax.swing.JLabel();
        IdOfDeveloper = new app.bolivia.swing.JCTextField();
        DescriptionLabel = new javax.swing.JLabel();
        Description = new app.bolivia.swing.JCTextField();
        StatusLabel = new javax.swing.JLabel();
        StatusBox = new javax.swing.JComboBox<>();
        SeverityLabel = new javax.swing.JLabel();
        SeverityBox = new javax.swing.JComboBox<>();
        TypeLabel = new javax.swing.JLabel();
        TypeBox = new javax.swing.JComboBox<>();
        UpdateButton = new javax.swing.JButton();
        OverView = new javax.swing.JPanel();
        OpenBug = new javax.swing.JLabel();
        noOfOpenedBugs = new javax.swing.JPanel();
        OP = new javax.swing.JLabel();
        Inprogress = new javax.swing.JLabel();
        noOfInProgressBugs = new javax.swing.JPanel();
        IPB = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        noOfCloseBugs = new javax.swing.JPanel();
        CB = new javax.swing.JLabel();
        ToBeTested = new javax.swing.JLabel();
        noOfToBeTestedBugs = new javax.swing.JPanel();
        TBT = new javax.swing.JLabel();
        closeBug = new javax.swing.JLabel();
        cancel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 740));

        jTabbedPane1.setBackground(new java.awt.Color(50, 50, 50));
        jTabbedPane1.setForeground(new java.awt.Color(217, 217, 217));
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
        DetailsOfBugs.setForeground(new java.awt.Color(150, 89, 165));
        DetailsOfBugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        DetailsOfBugs.setText("Bug Table:");
        DetailsOfBugs.setPreferredSize(new java.awt.Dimension(160, 40));

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

        Cancel.setBackground(new java.awt.Color(109, 177, 147));
        Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(50, 50, 50));
        Cancel.setText("Cancel");
        Cancel.setToolTipText("Enter ok to exit this window");
        Cancel.setPreferredSize(new java.awt.Dimension(133, 42));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });

        LogoOfSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/search2.png"))); // NOI18N
        LogoOfSearch.setText("jLabel1");

        Search2.setBackground(new java.awt.Color(50, 50, 50));
        Search2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Search2.setForeground(new java.awt.Color(109, 177, 147));
        Search2.setToolTipText("Make your search from here");
        Search2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search2.setPhColor(new java.awt.Color(150, 89, 165));
        Search2.setPlaceholder("Search....");
        Search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout TableOfBugsLayout = new javax.swing.GroupLayout(TableOfBugs);
        TableOfBugs.setLayout(TableOfBugsLayout);
        TableOfBugsLayout.setHorizontalGroup(
            TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableOfBugsLayout.createSequentialGroup()
                .addGroup(TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableOfBugsLayout.createSequentialGroup()
                        .addComponent(DetailsOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 446, Short.MAX_VALUE))
                    .addGroup(TableOfBugsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableOfBugsLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableOfBugsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoOfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        TableOfBugsLayout.setVerticalGroup(
            TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableOfBugsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DetailsOfBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoOfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(TableOfBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bug Table", TableOfBugs);

        BugDetails.setBackground(new java.awt.Color(50, 50, 50));
        BugDetails.setForeground(new java.awt.Color(217, 217, 217));
        BugDetails.setToolTipText("");
        BugDetails.setPreferredSize(new java.awt.Dimension(800, 600));

        CreationDate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CreationDate.setForeground(new java.awt.Color(109, 177, 147));
        CreationDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreationDate.setText("Creation Date:");
        CreationDate.setToolTipText("");
        CreationDate.setPreferredSize(new java.awt.Dimension(150, 45));

        cancel1.setBackground(new java.awt.Color(133, 89, 165));
        cancel1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        cancel1.setForeground(new java.awt.Color(50, 50, 50));
        cancel1.setText("Cancel");
        cancel1.setPreferredSize(new java.awt.Dimension(150, 45));
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
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

        AddButton.setBackground(new java.awt.Color(133, 89, 165));
        AddButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        AddButton.setForeground(new java.awt.Color(50, 50, 50));
        AddButton.setText("Confirm");
        AddButton.setPreferredSize(new java.awt.Dimension(150, 45));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        BugDetailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        BugDetailsLabel.setForeground(new java.awt.Color(133, 89, 165));
        BugDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BugDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        BugDetailsLabel.setText("Bug Details:");
        BugDetailsLabel.setPreferredSize(new java.awt.Dimension(800, 90));

        BugNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BugNameLabel.setForeground(new java.awt.Color(109, 177, 147));
        BugNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BugNameLabel.setText("Bug Name:");
        BugNameLabel.setToolTipText("");
        BugNameLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        ProjectIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProjectIdLabel.setForeground(new java.awt.Color(109, 177, 147));
        ProjectIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProjectIdLabel.setText("Project ID:");
        ProjectIdLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        ReporterIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ReporterIdLabel.setForeground(new java.awt.Color(109, 177, 147));
        ReporterIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReporterIdLabel.setText("Reporter Id:");
        ReporterIdLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        IDOfProject.setBackground(new java.awt.Color(50, 50, 50));
        IDOfProject.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        IDOfProject.setForeground(new java.awt.Color(133, 89, 165));
        IDOfProject.setToolTipText("Make your search from here");
        IDOfProject.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        IDOfProject.setPhColor(new java.awt.Color(150, 89, 165));
        IDOfProject.setPlaceholder("Project ID.....");
        IDOfProject.setPreferredSize(new java.awt.Dimension(250, 40));

        NameOfBug.setBackground(new java.awt.Color(50, 50, 50));
        NameOfBug.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        NameOfBug.setForeground(new java.awt.Color(133, 89, 165));
        NameOfBug.setToolTipText("Make your search from here");
        NameOfBug.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        NameOfBug.setPhColor(new java.awt.Color(150, 89, 165));
        NameOfBug.setPlaceholder("name...");
        NameOfBug.setPreferredSize(new java.awt.Dimension(250, 40));
        NameOfBug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameOfBugActionPerformed(evt);
            }
        });

        BugCreationDate.setBackground(new java.awt.Color(50, 50, 50));
        BugCreationDate.setForeground(new java.awt.Color(150, 89, 165));

        IDOfTester.setBackground(new java.awt.Color(50, 50, 50));
        IDOfTester.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        IDOfTester.setForeground(new java.awt.Color(133, 89, 165));
        IDOfTester.setToolTipText("Make your search from here");
        IDOfTester.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        IDOfTester.setPhColor(new java.awt.Color(150, 89, 165));
        IDOfTester.setPlaceholder("Tester ID.....");
        IDOfTester.setPreferredSize(new java.awt.Dimension(250, 40));

        DeveloperNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DeveloperNameLabel.setForeground(new java.awt.Color(109, 177, 147));
        DeveloperNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeveloperNameLabel.setText("Developer Name:");
        DeveloperNameLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        IdOfDeveloper.setBackground(new java.awt.Color(50, 50, 50));
        IdOfDeveloper.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        IdOfDeveloper.setForeground(new java.awt.Color(133, 89, 165));
        IdOfDeveloper.setToolTipText("Make your search from here");
        IdOfDeveloper.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        IdOfDeveloper.setPhColor(new java.awt.Color(150, 89, 165));
        IdOfDeveloper.setPlaceholder("Developer Id.....");
        IdOfDeveloper.setPreferredSize(new java.awt.Dimension(250, 40));

        DescriptionLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(109, 177, 147));
        DescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescriptionLabel.setText("Description:");
        DescriptionLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        Description.setBackground(new java.awt.Color(50, 50, 50));
        Description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 89, 165)));
        Description.setForeground(new java.awt.Color(133, 89, 165));
        Description.setToolTipText("Make your search from here");
        Description.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Description.setPhColor(new java.awt.Color(150, 89, 165));
        Description.setPlaceholder("Developer Name.....");
        Description.setPreferredSize(new java.awt.Dimension(250, 40));

        StatusLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(109, 177, 147));
        StatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusLabel.setText("Status:");
        StatusLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        StatusBox.setBackground(new java.awt.Color(50, 50, 50));
        StatusBox.setForeground(new java.awt.Color(133, 89, 165));
        StatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Open", "In progress", "To be tested", "Closed" }));

        SeverityLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SeverityLabel.setForeground(new java.awt.Color(109, 177, 147));
        SeverityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeverityLabel.setText("Severity:");
        SeverityLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        SeverityBox.setBackground(new java.awt.Color(50, 50, 50));
        SeverityBox.setForeground(new java.awt.Color(133, 89, 165));
        SeverityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Critical", "Major", "Moderate", "Minor", "Cosmitic" }));

        TypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(109, 177, 147));
        TypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeLabel.setText("Type:");
        TypeLabel.setPreferredSize(new java.awt.Dimension(150, 45));

        TypeBox.setBackground(new java.awt.Color(50, 50, 50));
        TypeBox.setForeground(new java.awt.Color(133, 89, 165));
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Content", "Functional", "Visual", " " }));

        UpdateButton.setBackground(new java.awt.Color(109, 177, 147));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(50, 50, 50));
        UpdateButton.setText("Edit");
        UpdateButton.setPreferredSize(new java.awt.Dimension(150, 45));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BugDetailsLayout = new javax.swing.GroupLayout(BugDetails);
        BugDetails.setLayout(BugDetailsLayout);
        BugDetailsLayout.setHorizontalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(DeveloperNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReporterIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BugNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDOfProject, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(NameOfBug, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(BugCreationDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(IDOfTester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(IdOfDeveloper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BugDetailsLayout.createSequentialGroup()
                                .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(TypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BugDetailsLayout.createSequentialGroup()
                                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SeverityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatusBox, 0, 348, Short.MAX_VALUE)
                                    .addComponent(SeverityBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(Description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addComponent(BugDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        BugDetailsLayout.setVerticalGroup(
            BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BugDetailsLayout.createSequentialGroup()
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BugDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProjectIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDOfProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameOfBug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BugNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BugCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SeverityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SeverityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReporterIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDOfTester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BugDetailsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeveloperNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdOfDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(BugDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bug Details", BugDetails);

        OverView.setBackground(new java.awt.Color(50, 50, 50));
        OverView.setForeground(new java.awt.Color(217, 217, 217));
        OverView.setToolTipText("");
        OverView.setPreferredSize(new java.awt.Dimension(915, 600));

        OpenBug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OpenBug.setForeground(new java.awt.Color(217, 217, 217));
        OpenBug.setText("Number of opened bugs:");

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

        Inprogress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Inprogress.setForeground(new java.awt.Color(217, 217, 217));
        Inprogress.setText("Number of in progress bugs:");

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

        panelBarChart.setBackground(new java.awt.Color(50, 50, 50));
        panelBarChart.setForeground(new java.awt.Color(217, 217, 217));
        panelBarChart.setPreferredSize(new java.awt.Dimension(540, 346));
        panelBarChart.setLayout(new java.awt.BorderLayout());

        noOfCloseBugs.setBackground(new java.awt.Color(50, 50, 50));
        noOfCloseBugs.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(109, 177, 147)));
        noOfCloseBugs.setPreferredSize(new java.awt.Dimension(260, 140));

        CB.setBackground(new java.awt.Color(50, 50, 50));
        CB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        CB.setForeground(new java.awt.Color(217, 217, 217));
        CB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/bugs.png"))); // NOI18N
        CB.setText(" 10");
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
                .addGap(22, 22, 22)
                .addComponent(CB)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ToBeTested.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ToBeTested.setForeground(new java.awt.Color(217, 217, 217));
        ToBeTested.setText("Number of to be tested bugs:");

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
                .addGap(50, 50, 50)
                .addComponent(TBT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        noOfToBeTestedBugsLayout.setVerticalGroup(
            noOfToBeTestedBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfToBeTestedBugsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TBT)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        closeBug.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        closeBug.setForeground(new java.awt.Color(217, 217, 217));
        closeBug.setText("Number of closed bugs:");

        cancel2.setBackground(new java.awt.Color(133, 89, 165));
        cancel2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        cancel2.setForeground(new java.awt.Color(50, 50, 50));
        cancel2.setText("Cancel");
        cancel2.setPreferredSize(new java.awt.Dimension(150, 45));
        cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OverViewLayout = new javax.swing.GroupLayout(OverView);
        OverView.setLayout(OverViewLayout);
        OverViewLayout.setHorizontalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(460, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfCloseBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToBeTested, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBug, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(OpenBug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inprogress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );
        OverViewLayout.setVerticalGroup(
            OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverViewLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(ToBeTested, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfToBeTestedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(closeBug, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfCloseBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OverViewLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(OverViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OverViewLayout.createSequentialGroup()
                            .addComponent(OpenBug, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noOfOpenedBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(126, 126, 126)
                            .addComponent(Inprogress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(noOfInProgressBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(OverViewLayout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(182, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Over View", OverView);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        UpdateButton.setVisible(false);
        deleteButton.setVisible(false);
        IDOfProject.setEditable(false);
        IDOfProject.setText(String.valueOf(CurrentProject.projectId));
        BugId = Tester.GenerateBugID();
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(Purple);
        Add.setForeground(Black);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(Green);
        Add.setForeground(Black);
    }//GEN-LAST:event_AddMouseExited

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_CancelMouseClicked

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setBackground(Purple);
        Cancel.setForeground(Black);
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setBackground(Green);
        Cancel.setForeground(Black);
    }//GEN-LAST:event_CancelMouseExited

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void NameOfBugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameOfBugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameOfBugActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel2ActionPerformed

    private void BugTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BugTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) BugTable.getModel();
        
        System.out.println("storing the value of row choosen...");
        int row = BugTable.getSelectedRow();
        
        System.out.println("dispaying the row value...");
        System.out.println("row = " + row);
        
         System.out.println("turning to BugDetails panel to show the information choosen...");
        jTabbedPane1.setSelectedIndex(1);
        
        System.out.println("check if the status of this bug is closed or not to  make add&update&delete buttons to be unvisible...");
         String Status = (String) model.getValueAt(row, 10);
        System.out.println("status = " + Status);
        
        if ("C".equals(Status)) {
            AddButton.setVisible(false);
            UpdateButton.setVisible(false);
            deleteButton.setVisible(false);
        } else {
            AddButton.setVisible(false);
            UpdateButton.setVisible(true);
            deleteButton.setVisible(true);
        }

        System.out.println("storing data in its place in text fields...");
        
        BugId = Integer.valueOf(model.getValueAt(row, 0).toString());
        NameOfBug.setText(model.getValueAt(row, 1).toString());
        IDOfTester.setText(model.getValueAt(row, 3).toString());
        IdOfDeveloper.setText(model.getValueAt(row, 4).toString());
        Description.setText(model.getValueAt(row, 5).toString());
         Date date = (Date) (model.getValueAt(row, 11));
        BugCreationDate.setDate(date);
        
        String Severity = model.getValueAt(row, 8).toString();
        System.out.println("severity = " + Severity);
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
        
        String  Type = model.getValueAt(row, 9).toString();
        System.out.println("Type = " + Type);
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
        
        switch (Status) {
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
        
    }//GEN-LAST:event_BugTableMouseClicked

    private void Search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search2KeyReleased
        DefaultTableModel model = (DefaultTableModel) BugTable.getModel();

        String Searching = Search2.getText();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        BugTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Searching));
    }//GEN-LAST:event_Search2KeyReleased

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
                new BugTrial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddButton;
    private com.toedter.calendar.JDateChooser BugCreationDate;
    private javax.swing.JPanel BugDetails;
    private javax.swing.JLabel BugDetailsLabel;
    private javax.swing.JLabel BugNameLabel;
    private javax.swing.JTable BugTable;
    private javax.swing.JLabel CB;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel CreationDate;
    private app.bolivia.swing.JCTextField Description;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel DetailsOfBugs;
    private javax.swing.JLabel DeveloperNameLabel;
    private app.bolivia.swing.JCTextField IDOfProject;
    private app.bolivia.swing.JCTextField IDOfTester;
    private javax.swing.JLabel IPB;
    private app.bolivia.swing.JCTextField IdOfDeveloper;
    private javax.swing.JLabel Inprogress;
    private javax.swing.JLabel LogoOfSearch;
    private app.bolivia.swing.JCTextField NameOfBug;
    private javax.swing.JLabel OP;
    private javax.swing.JLabel OpenBug;
    private javax.swing.JPanel OverView;
    private javax.swing.JLabel ProjectIdLabel;
    private javax.swing.JLabel ReporterIdLabel;
    private app.bolivia.swing.JCTextField Search2;
    private javax.swing.JComboBox<String> SeverityBox;
    private javax.swing.JLabel SeverityLabel;
    private javax.swing.JComboBox<String> StatusBox;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TBT;
    private javax.swing.JPanel TableOfBugs;
    private javax.swing.JLabel ToBeTested;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton cancel2;
    private javax.swing.JLabel closeBug;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel noOfCloseBugs;
    private javax.swing.JPanel noOfInProgressBugs;
    private javax.swing.JPanel noOfOpenedBugs;
    private javax.swing.JPanel noOfToBeTestedBugs;
    private javax.swing.JPanel panelBarChart;
    // End of variables declaration//GEN-END:variables
}
