package worldcupapp;

/*
 * NewsMenu.java
 * Version 2014-04-16
 * Date 16th April 2014
 * @reference http://www.youtube.com/watch?v=Q2itkhLHaeE
 * @author Nilsson Denver 13114492
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static worldcupapp.NewsAdd.NewsArrList;

public class NewsMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewsApp
     */
    public NewsMenu() {
//
        // Declare objects required to read from file
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        //use a try statement

        try {
            //create objects
            inFile = new File("news.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);
            //read arrayList from file

            NewsArrList = (ArrayList<NewsOther>) oStream.readObject();
            //loop through the ArrayList
            //for (int i = 0; i<qList.size(); i =i+1){
            //            for(NewsOther x:NewsArrList){
            //Print the contents of each object
            //                JOptionPane.showMessageDialog(null,"Item 1 "+x.getArticlenbr());
            //            }        

            //close the stream
            oStream.close();
        } //catch IOException
        catch (IOException e) {
            System.out.println(e);
        } //catch classNotFoundException
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        initComponents();
    }

    //this method closes the previous JPanel and opens a new JPanel
    //reference: http://www.youtube.com/watch?v=Q2itkhLHaeE
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        btnNews = new javax.swing.JButton();
        btnPlayerNews = new javax.swing.JButton();
        btnTeamNews = new javax.swing.JButton();
        btnNewsIconSideRight = new javax.swing.JButton();
        btnNewsAddSideBar = new javax.swing.JButton();
        sidebar = new javax.swing.JPanel();
        homeLbl = new javax.swing.JLabel();
        newsLbl = new javax.swing.JLabel();
        setLbl = new javax.swing.JLabel();
        fixLbl = new javax.swing.JLabel();
        mmLbl = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("News Central");
        setBackground(new java.awt.Color(255, 255, 204));

        btnNews.setBackground(new java.awt.Color(255, 255, 204));
        btnNews.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/news_images/newsnewsmenu.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnNews, org.jdesktop.beansbinding.ELProperty.create("${toolTipText}"), btnNews, org.jdesktop.beansbinding.BeanProperty.create("rolloverIcon"));
        bindingGroup.addBinding(binding);

        btnNews.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnNewsItemStateChanged(evt);
            }
        });
        btnNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsActionPerformed(evt);
            }
        });
        btnNews.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnNewsFocusGained(evt);
            }
        });

        btnPlayerNews.setBackground(new java.awt.Color(255, 255, 204));
        btnPlayerNews.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnPlayerNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/news_images/newsplayermenu.png"))); // NOI18N
        btnPlayerNews.setPreferredSize(new java.awt.Dimension(500, 200));
        btnPlayerNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayerNewsActionPerformed(evt);
            }
        });

        btnTeamNews.setBackground(new java.awt.Color(255, 255, 204));
        btnTeamNews.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnTeamNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/news_images/newsteammenu.png"))); // NOI18N
        btnTeamNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamNewsActionPerformed(evt);
            }
        });

        btnNewsIconSideRight.setBackground(new java.awt.Color(255, 255, 204));
        btnNewsIconSideRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/news_images/newsnewsnews.png"))); // NOI18N
        btnNewsIconSideRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsIconSideRightActionPerformed(evt);
            }
        });

        btnNewsAddSideBar.setBackground(new java.awt.Color(255, 255, 204));
        btnNewsAddSideBar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnNewsAddSideBar.setToolTipText("ADMIN - News Add");
        btnNewsAddSideBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsAddSideBarActionPerformed(evt);
            }
        });

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setPreferredSize(new java.awt.Dimension(105, 768));

        homeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.home.empty.png"))); // NOI18N
        homeLbl.setToolTipText("Home");
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });

        newsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.newspaper.png"))); // NOI18N
        newsLbl.setToolTipText("News");
        newsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsLblMouseClicked(evt);
            }
        });

        setLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.settings.png"))); // NOI18N
        setLbl.setToolTipText("Settings");
        setLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setLblMouseClicked(evt);
            }
        });

        fixLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.sport.football.png"))); // NOI18N
        fixLbl.setToolTipText("Fixtures");
        fixLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fixLblMouseClicked(evt);
            }
        });

        mmLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.video.gallery.png"))); // NOI18N
        mmLbl.setToolTipText("MultiMedia");
        mmLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mmLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewsAddSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(504, 504, 504))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTeamNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlayerNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewsIconSideRight, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNews, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnTeamNews, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlayerNews, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNewsIconSideRight, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewsAddSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(1042, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsActionPerformed
        // TODO add your handling code here:
        close();
        NewsGUI myNewsGUI = new NewsGUI();
        myNewsGUI.setVisible(true);
    }//GEN-LAST:event_btnNewsActionPerformed

    private void btnTeamNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamNewsActionPerformed
        // TODO add your handling code here:
        close();
        new NewsTeamGUI().setVisible(true);
    }//GEN-LAST:event_btnTeamNewsActionPerformed

    private void btnPlayerNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayerNewsActionPerformed
        // TODO add your handling code here:
        close();
        new NewsPlayerGUI2().setVisible(true);
    }//GEN-LAST:event_btnPlayerNewsActionPerformed

    private void btnNewsIconSideRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsIconSideRightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewsIconSideRightActionPerformed

    private void btnNewsAddSideBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsAddSideBarActionPerformed
        // TODO add your handling code here:
        NewsAdd myNewsAdd = new NewsAdd();
        myNewsAdd.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNewsAddSideBarActionPerformed

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        // this method is opening the particular GUI , and hides the previous , eg if you are in section "highlights" and you click on "top 10" section
        // it will open "top 10 " and will hide "highlights

        MasterMenu m = new MasterMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeLblMouseClicked

    private void newsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsLblMouseClicked

        NewsMenu myNews = new NewsMenu();
        myNews.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newsLblMouseClicked

    private void setLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLblMouseClicked

        UserSettings u = new UserSettings();
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_setLblMouseClicked

    private void fixLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixLblMouseClicked

        FixGUITest myFix = null;
        try {
            myFix = new FixGUITest();
        } catch (IOException ex) {
            Logger.getLogger(MmMultimediaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        myFix.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fixLblMouseClicked

    private void mmLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmLblMouseClicked

        // this method is opening the particular GUI , and hides the previous , eg if you are in section "highlights" and you click on "top 10" sectio
        // it will open "top 10 " and will hide "highlights
        MmMultimediaGUI myMulti = new MmMultimediaGUI();
        myMulti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mmLblMouseClicked

    private void btnNewsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNewsFocusGained
        btnNewsIconSideRight.setText("text");
    }//GEN-LAST:event_btnNewsFocusGained

    private void btnNewsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnNewsItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewsItemStateChanged

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
            java.util.logging.Logger.getLogger(NewsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNews;
    private javax.swing.JButton btnNewsAddSideBar;
    private javax.swing.JButton btnNewsIconSideRight;
    private javax.swing.JButton btnPlayerNews;
    private javax.swing.JButton btnTeamNews;
    private javax.swing.JLabel fixLbl;
    private javax.swing.JLabel homeLbl;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel mmLbl;
    private javax.swing.JLabel newsLbl;
    private javax.swing.JLabel setLbl;
    private javax.swing.JPanel sidebar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}