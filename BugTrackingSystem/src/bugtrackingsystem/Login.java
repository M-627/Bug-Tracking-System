package bugtrackingsystem;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

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
        userLabel1 = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        jCTextField1 = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 900));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));

        passField.setBackground(new java.awt.Color(50, 50, 50));
        passField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        passField.setForeground(new java.awt.Color(133, 89, 165));
        passField.setToolTipText("Enter your password");
        passField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(109, 177, 147)));
        passField.setPreferredSize(new java.awt.Dimension(500, 50));

        userLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(109, 177, 147));
        userLabel.setText("Username:");
        userLabel.setPreferredSize(new java.awt.Dimension(210, 30));

        passLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        passLabel.setForeground(new java.awt.Color(109, 177, 147));
        passLabel.setText("Password:");
        passLabel.setPreferredSize(new java.awt.Dimension(210, 30));

        forgotLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 89, 165));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Your Credentials");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 50));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images/logo login.png"))); // NOI18N

        userLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(109, 177, 147));
        userLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images/password.png"))); // NOI18N
        userLabel1.setPreferredSize(new java.awt.Dimension(210, 30));

        userLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(109, 177, 147));
        userLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images/person intro.png"))); // NOI18N
        userLabel2.setPreferredSize(new java.awt.Dimension(210, 30));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(133, 89, 165));
        rSMaterialButtonCircle1.setForeground(new java.awt.Color(50, 50, 50));
        rSMaterialButtonCircle1.setText("Login");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });

        jCTextField1.setBackground(new java.awt.Color(50, 50, 50));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(109, 177, 147)));
        jCTextField1.setForeground(new java.awt.Color(133, 89, 165));
        jCTextField1.setPhColor(new java.awt.Color(109, 177, 147));
        jCTextField1.setPlaceholder("Enter your username...\n");
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(userLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(forgotLabel)
                            .addComponent(passLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(Logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotLabel)
                .addGap(18, 18, 18)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
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

    private void forgotLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotLabelMouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField1ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel forgotLabel;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
