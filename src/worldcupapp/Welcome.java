package worldcupapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anthonybloomer Student Number: 13114271 World Cup App. Group 3.
 */
public class Welcome extends javax.swing.JFrame {

    private ArrayList<User> aList;
    private int count;

    /**
     * Creates new form Settings
     */
    public Welcome() {
        initComponents();
        aList = new ArrayList<>();
        count = aList.size();
        this.readFile();
        this.setLocationRelativeTo(null);
    }

    private void readFile() {
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("user.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            ArrayList<User> xList;
            xList = (ArrayList<User>) oStream.readObject();
            aList = xList;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        signupLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        pwdLbl = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        mailLbl = new javax.swing.JLabel();
        teamLbl = new javax.swing.JLabel();
        mailFld = new javax.swing.JTextField();
        teamFld = new javax.swing.JTextField();
        pwFld = new javax.swing.JPasswordField();
        noBtn = new javax.swing.JRadioButton();
        newsletterLbl = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        signupLbl.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        signupLbl.setForeground(new java.awt.Color(0, 148, 52));
        signupLbl.setText("Sign Up");
        signupLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLblMouseClicked(evt);
            }
        });

        usernameLbl.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        usernameLbl.setText("Username");

        pwdLbl.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        pwdLbl.setForeground(new java.awt.Color(255, 255, 255));
        pwdLbl.setText("Password:");

        usernameFld.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        usernameFld.setForeground(new java.awt.Color(51, 51, 51));

        mailLbl.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        mailLbl.setForeground(new java.awt.Color(255, 255, 255));
        mailLbl.setText("Email:");

        teamLbl.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        teamLbl.setForeground(new java.awt.Color(255, 255, 255));
        teamLbl.setText("Favourite Team:");

        mailFld.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        mailFld.setForeground(new java.awt.Color(51, 51, 51));

        teamFld.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        teamFld.setForeground(new java.awt.Color(51, 51, 51));

        pwFld.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N

        noBtn.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        noBtn.setForeground(new java.awt.Color(255, 255, 255));
        noBtn.setText("No");

        newsletterLbl.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        newsletterLbl.setForeground(new java.awt.Color(255, 255, 255));
        newsletterLbl.setText("Sign up for the official newsletter:");

        yesBtn.setBackground(new java.awt.Color(255, 255, 255));
        yesBtn.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        yesBtn.setForeground(new java.awt.Color(255, 255, 255));
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/bg.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 52));
        jLabel1.setText("Welcome.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailLbl)
                                    .addComponent(mailFld, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newsletterLbl))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yesBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(noBtn))
                                    .addComponent(teamFld)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(signupLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwdLbl)
                                        .addComponent(pwFld, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailLbl)
                    .addComponent(teamLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noBtn)
                    .addComponent(yesBtn)
                    .addComponent(newsletterLbl))
                .addGap(50, 50, 50)
                .addComponent(signupLbl)
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 757);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void signupLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLblMouseClicked
        // TODO add your handling code here:

        User u = new User();

        String name = usernameFld.getText();
        String team = teamFld.getText();
        String email = mailFld.getText();
        String subscribed = "You're subscribed to our newsletter.";
        String ns = "You're not subscribed to our newsletter.";

        char[] pass = pwFld.getPassword();
        String pw = "";
        for (char x : pass) {
            pw += x;
        }

        if (!email.contains("@") || email.isEmpty() || email.length() < 3) {
            JOptionPane.showMessageDialog(null, "You did not enter a valid Email address . Please try again.");
        } else if (name.isEmpty() || !name.matches(".*\\w.*")) {
            JOptionPane.showMessageDialog(null, "You did not enter a valid username. Please try again.");
        } else if (pw.isEmpty() || !pw.matches(".*\\w.*")) {
            JOptionPane.showMessageDialog(null, "You did not enter a valid password. Please try again.");
        } else {

            u.setUsername(name);
            u.setPw(pw);

            if (team.equals("") || team.length() < 2) {
                u.setTeam("N/A");
            } else {
                u.setTeam(team);
            }
            u.setEmail(email);

            if (yesBtn.isSelected()) {
                u.setSubscription(subscribed);
            } else {
                u.setSubscription(ns);
            }

            aList.add(u);
            count++;

            File outFile;
            FileOutputStream fStream;
            ObjectOutputStream oStream;

            try {
                outFile = new File("user.data");
                fStream = new FileOutputStream(outFile);
                oStream = new ObjectOutputStream(fStream);

                oStream.writeObject(aList);

                oStream.close();
                Usage theUsage = new Usage();
                theUsage.getUsage();
                MasterMenu m = new MasterMenu();
                m.setVisible(true);
                this.dispose();
            } catch (IOException e) {
                System.out.println(e);
            }

            File in = new File("current.data");

            if (in.exists()) {
                in.delete();
                System.out.println("Not needed right now.");
            }
        }
    }//GEN-LAST:event_signupLblMouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mailFld;
    private javax.swing.JLabel mailLbl;
    private javax.swing.JLabel newsletterLbl;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JPasswordField pwFld;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JTextField teamFld;
    private javax.swing.JLabel teamLbl;
    private javax.swing.JTextField usernameFld;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}