package worldcupapp;


import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anthonybloomer
 */
public class UserSettings extends javax.swing.JFrame {

    String username;
    String email;
    String team;
    String subscription;
    String pw;

    public UserSettings() {
        initComponents();
        // centers the window
        this.setLocationRelativeTo(null);
        this.osLbl.setText(System.getProperty("os.name"));
        this.osVersionLbl.setText(System.getProperty("os.version"));
        this.postUsage();
        this.readData();

        username = new String();
        email = new String();
        team = new String();
        subscription = new String();
        pw = new String();
    }

    private void postUsage() {

        File in;
        FileReader fr;
        BufferedReader br;

        try {
            in = new File("usage.txt");
            fr = new FileReader(in);
            br = new BufferedReader(fr);
            int getInt = Integer.parseInt(br.readLine());
            int count = getInt;
            usageLbl.setText("This app has been used " + count + " times!");
            br.close();

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    private void readData() {
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        File f = new File("current.data");

        if (!f.exists()) {

            try {
                inFile = new File("user.data");
                fStream = new FileInputStream(inFile);
                oStream = new ObjectInputStream(fStream);

                ArrayList<User> xList;
                xList = (ArrayList<User>) oStream.readObject();

                for (User x : xList) {
                    username = x.getUsername();
                    email = x.getEmail();
                    team = x.getTeam();
                    subscription = x.getSubscription();
                }

                nameLbl.setText(username);
                emailLbl.setText(email);
                subscriberLbl.setText(team);
                favTeamLbl.setText(subscription);

                oStream.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e);
            }

        } else {
            try {
                fStream = new FileInputStream(f);
                oStream = new ObjectInputStream(fStream);

                ArrayList<CurrentUser> cList;
                cList = (ArrayList<CurrentUser>) oStream.readObject();

                for (CurrentUser x : cList) {
                    username = x.getUsername();
                    email = x.getEmail();
                    team = x.getTeam();
                    subscription = x.getSubscription();
                }

                nameLbl.setText(username);
                emailLbl.setText(email);
                subscriberLbl.setText(team);
                favTeamLbl.setText(subscription);

                oStream.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userSetLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeLbl = new javax.swing.JLabel();
        newsLbl = new javax.swing.JLabel();
        setLbl = new javax.swing.JLabel();
        fixLbl = new javax.swing.JLabel();
        mmLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoutLbl = new javax.swing.JLabel();
        removeLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        usageLbl = new javax.swing.JLabel();
        teamLbl = new javax.swing.JLabel();
        usrEmailLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        favTeamLbl = new javax.swing.JLabel();
        nsLbl = new javax.swing.JLabel();
        subscriberLbl = new javax.swing.JLabel();
        oshLbl = new javax.swing.JLabel();
        osLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        osVersionLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Settings");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        userSetLbl.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        userSetLbl.setText("User Settings");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(105, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(105, 768));

        homeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.home.empty.png"))); // NOI18N
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });

        newsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.newspaper.png"))); // NOI18N
        newsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsLblMouseClicked(evt);
            }
        });

        setLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.settings.png"))); // NOI18N
        setLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setLblMouseClicked(evt);
            }
        });

        fixLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.sport.football.png"))); // NOI18N
        fixLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fixLblMouseClicked(evt);
            }
        });

        mmLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.video.gallery.png"))); // NOI18N
        mmLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mmLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setLbl)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(homeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(newsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(fixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(mmLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(setLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        logoutLbl.setFont(new java.awt.Font("Avenir Next", 0, 25)); // NOI18N
        logoutLbl.setForeground(new java.awt.Color(102, 0, 102));
        logoutLbl.setText("Logoff");
        logoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLblMouseClicked(evt);
            }
        });

        removeLbl.setFont(new java.awt.Font("Avenir Next", 0, 25)); // NOI18N
        removeLbl.setForeground(new java.awt.Color(102, 0, 102));
        removeLbl.setText("Remove Account");
        removeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLblMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        jLabel1.setText("Usage Stats: ");

        usernameLbl.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        usernameLbl.setText("Name: ");
        usernameLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nameLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N
        nameLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usageLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N

        teamLbl.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        teamLbl.setText("Favourite team: ");
        teamLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usrEmailLbl.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        usrEmailLbl.setText("Email:");

        emailLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N

        favTeamLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N

        nsLbl.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        nsLbl.setText("Newsletter Subscription:");

        subscriberLbl.setFont(new java.awt.Font("Avenir", 1, 20)); // NOI18N

        oshLbl.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        oshLbl.setText("Operating System:");

        osLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        jLabel2.setText("OS Version:");

        osVersionLbl.setFont(new java.awt.Font("Avenir Next", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(favTeamLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nsLbl)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutLbl)
                        .addGap(65, 65, 65)
                        .addComponent(removeLbl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(osLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oshLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usrEmailLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(emailLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(teamLbl)
                            .addComponent(usageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(osVersionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subscriberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrEmailLbl)
                    .addComponent(teamLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(subscriberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oshLbl)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(osLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(osVersionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(nsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(favTeamLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeLbl)
                    .addComponent(logoutLbl))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(userSetLbl))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userSetLbl))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        // TODO add your handling code here:
        MasterMenu m = new MasterMenu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLblMouseClicked

    private void setLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLblMouseClicked
        // TODO add your handling code here:
        MmVideousGUI m = new MmVideousGUI();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setLblMouseClicked

    private void mmLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmLblMouseClicked
        // TODO add your handling code here:
        MmMultimediaGUI m = new MmMultimediaGUI();
        m.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_mmLblMouseClicked

    private void removeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLblMouseClicked
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        int confirmReset = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove your account?");
        if (confirmReset == JOptionPane.YES_OPTION) {

            try {
                inFile = new File("user.data");
                fStream = new FileInputStream(inFile);
                oStream = new ObjectInputStream(fStream);
                ArrayList<User> xList;
                String name = JOptionPane.showInputDialog(null, "Please enter your username");
                String pass = JOptionPane.showInputDialog(null, "Please enter your password");

                xList = (ArrayList<User>) oStream.readObject();

                for (int i = 0; i < xList.size(); i++) {
                    if (xList.get(i).getUsername().equals(name) && xList.get(i).getPw().equals(pass)) {
                        xList.remove(i);
                        JOptionPane.showMessageDialog(null, "Your account has been deleted. Goodbye.");
                        Welcome w = new Welcome();
                        w.setVisible(true);
                        this.dispose();
                        oStream.close();
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_removeLblMouseClicked

    private void logoutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLblMouseClicked
        // TODO add your handling code here:
        int confirmReset = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?");
        if (confirmReset == JOptionPane.YES_OPTION) {
            System.out.println("Exiting.......");
            Login l = new Login();
            l.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutLblMouseClicked

    private void newsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsLblMouseClicked
        // TODO add your handling code here:
        NewsMenu nm = new NewsMenu();
        nm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_newsLblMouseClicked

    private void fixLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixLblMouseClicked
        // TODO add your handling code here:
        FixGUITest g = null;
        try {
            g = new FixGUITest();
        } catch (IOException ex) {
            Logger.getLogger(MasterMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fixLblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced usageFile Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(UserSettings.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSettings.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSettings().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel favTeamLbl;
    private javax.swing.JLabel fixLbl;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutLbl;
    private javax.swing.JLabel mmLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel newsLbl;
    private javax.swing.JLabel nsLbl;
    private javax.swing.JLabel osLbl;
    private javax.swing.JLabel osVersionLbl;
    private javax.swing.JLabel oshLbl;
    private javax.swing.JLabel removeLbl;
    private javax.swing.JLabel setLbl;
    private javax.swing.JLabel subscriberLbl;
    private javax.swing.JLabel teamLbl;
    private javax.swing.JLabel usageLbl;
    private javax.swing.JLabel userSetLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JLabel usrEmailLbl;
    // End of variables declaration//GEN-END:variables
}
