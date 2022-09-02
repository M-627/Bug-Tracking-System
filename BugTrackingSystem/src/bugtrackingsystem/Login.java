package bugtrackingsystem;

import bugtrackingsystem.dataConnection.*;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.sql.*;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    //DB connection objects
    dataConnection con = new dataConnection() {};
    Activity action = new Activity();
    int counter2 = 0;
    
    public Login() {
        initComponents();
        con.getConnected("SELECT * FROM USERS");
        this.setLocationRelativeTo(null);
    }
    
    //Filling ACTIVITIES table
    
    
    //"Forgot Password?" Font Changer
    Font orgFont;
    private void getFont(java.awt.event.MouseEvent evt)
    {
        orgFont = evt.getComponent().getFont();
        Map attributes = orgFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(orgFont.deriveFont(attributes));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passField = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        forgotLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        passLogo = new javax.swing.JLabel();
        userLogo = new javax.swing.JLabel();
        LoginButton = new necesario.RSMaterialButtonCircle();
        userField = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 900));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 900));

        passField.setBackground(new java.awt.Color(50, 50, 50));
        passField.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        passField.setForeground(new java.awt.Color(133, 89, 165));
        passField.setToolTipText("Enter your password...");
        passField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(109, 177, 147)));
        passField.setPreferredSize(new java.awt.Dimension(500, 50));

        userLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(109, 177, 147));
        userLabel.setText("Username:");
        userLabel.setPreferredSize(new java.awt.Dimension(210, 30));

        passLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        passLabel.setForeground(new java.awt.Color(109, 177, 147));
        passLabel.setText("Password:");
        passLabel.setPreferredSize(new java.awt.Dimension(210, 30));

        forgotLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        forgotLabel.setForeground(new java.awt.Color(109, 177, 147));
        forgotLabel.setText("Forgot Password?");
        forgotLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotLabelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 89, 165));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Your Credentials");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 50));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/logo login.png"))); // NOI18N

        passLogo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        passLogo.setForeground(new java.awt.Color(109, 177, 147));
        passLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/password.png"))); // NOI18N
        passLogo.setPreferredSize(new java.awt.Dimension(210, 30));

        userLogo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userLogo.setForeground(new java.awt.Color(109, 177, 147));
        userLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bugtrackingsystem/icons/images/person intro.png"))); // NOI18N
        userLogo.setPreferredSize(new java.awt.Dimension(210, 30));

        LoginButton.setBackground(new java.awt.Color(133, 89, 165));
        LoginButton.setBorder(null);
        LoginButton.setForeground(new java.awt.Color(50, 50, 50));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        userField.setBackground(new java.awt.Color(50, 50, 50));
        userField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(109, 177, 147)));
        userField.setForeground(new java.awt.Color(133, 89, 165));
        userField.setToolTipText("Enter your username...");
        userField.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        userField.setPhColor(new java.awt.Color(109, 177, 147));
        userField.setPlaceholder(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(passLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(forgotLabel)
                            .addComponent(passLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 280, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotLabel)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Bug Tracking System");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgotLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseEntered
        getFont(evt);
    }//GEN-LAST:event_forgotLabelMouseEntered

    private void forgotLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseExited
        evt.getComponent().setFont(orgFont);
    }//GEN-LAST:event_forgotLabelMouseExited
int counter=0;
    private void forgotLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseClicked
        String frgtnUser = JOptionPane.showInputDialog(rootPane, "Enter your username:");
        try
        {
            con.getConnected("SELECT * FROM USERS");
            while (con.resObj.next())
            {
                if (frgtnUser.equals(con.resObj.getString("USERNAME")))
                {
                    String frgtnRole = con.resObj.getString("ROLE");
                    int frgtnID = con.resObj.getInt("USERID");
                    new CurrentUser(frgtnUser, frgtnRole, frgtnID);
                    action.activity("Requested password reset");
                }
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if(con.smtObj != null)
                    con.smtObj.close();
            }
            catch(SQLException e)
            {
                System.out.println("Couldn't close query");
            }
        }
    }//GEN-LAST:event_forgotLabelMouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        
        try
        {
            //Connecting to DB
            con.getConnected("SELECT * FROM USERS");
            
            String user = userField.getText();
            String pass = passField.getText();
            String role = "";
            int id=0;
            int userFound = 0;
            int passFound = 0;
            
            //Checking credentials
            while (con.resObj.next())
            {
                if (user.equals(con.resObj.getString("USERNAME")))
                {
                    userFound = 1;
                    if (pass.equals(con.resObj.getString("PASSWORD")))
                    {
                        passFound = 1;
                        role = con.resObj.getString("ROLE");
                        id = con.resObj.getInt("userid");
                        new CurrentUser(user, role,id);
                    }
                    break;
                }
            }
            
            //Redirection
            if (role.equals("A"))
            {
                action.activity("Logged in");
                new Administrator().setVisible(true);
                this.dispose();
            }
            else if (role.equals("D"))
            {
                action.activity("Logged in");
                new Devoloper().setVisible(true);
                this.dispose();
            }
            else if (role.equals("T"))
            {
                action.activity("Logged in");
                new Tester().setVisible(true);
                this.dispose();
            }  
            
            //Failed login attempts
            PreparedStatement add;
            counter2++;
            
            if (userFound == 0 && passFound == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Incorrect credentials");
                add = con.conObj.prepareStatement("INSERT INTO FAILEDLOGINS VALUES (?, ?, CURRENT_DATE, CURRENT_TIME)");
                add.setString(1, user);
                add.setString(2, pass);
                add.executeUpdate();
            }
            else if (userFound == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Incorrect credentials");
                add = con.conObj.prepareStatement("INSERT INTO FAILEDLOGINS VALUES (' ', ?, CURRENT_DATE, CURRENT_TIME)");
                add.setString(2, pass);
                add.executeUpdate();
            }
            else if (passFound == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Incorrect credentials");
                add = con.conObj.prepareStatement("INSERT INTO FAILEDLOGINS VALUES (?, ' ', CURRENT_DATE, CURRENT_TIME)");
                add.setString(1, user);
                add.executeUpdate();
            }
            if (counter2 == 5)
                System.exit(0);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if(con.smtObj != null)
                    con.smtObj.close();
            }
            catch(SQLException e)
            {
                System.out.println("Couldn't close query");
            }
        }
    }//GEN-LAST:event_LoginButtonActionPerformed
    
public static void main(String args[]) throws UnsupportedLookAndFeelException{
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
                        UIManager.setLookAndFeel(new FlatDarkLaf());

            }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.RSMaterialButtonCircle LoginButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel forgotLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLogo;
    private app.bolivia.swing.JCTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLogo;
    // End of variables declaration//GEN-END:variables
}
