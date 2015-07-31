/*
 Author Marius Vorosila x13419708
Ref:// Method of opening videous is based on
http://stackoverflow.com/questions/3775373/java-how-to-add-image-to-jlabel
this multimedia section is responsible to open and display photos,
 */

package worldcupapp;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marius
 */
public class MmPhotoGUI extends javax.swing.JFrame {
    
  

    /**
     * Creates new form multimedia
     */
    public MmPhotoGUI() {
        initComponents();
       
           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homeLbl = new javax.swing.JLabel();
        newsLbl = new javax.swing.JLabel();
        setLbl = new javax.swing.JLabel();
        fixLbl = new javax.swing.JLabel();
        mmLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbDisplay = new javax.swing.JPanel();
        lbPhoto = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbDisplay1 = new javax.swing.JPanel();
        lbPhoto1 = new javax.swing.JLabel();
        lbTitle1 = new javax.swing.JLabel();
        lbDisplay2 = new javax.swing.JPanel();
        lbPhoto2 = new javax.swing.JLabel();
        lbTitle3 = new javax.swing.JLabel();
        lbDisplay3 = new javax.swing.JPanel();
        lbPhoto3 = new javax.swing.JLabel();
        lbTitle5 = new javax.swing.JLabel();
        lbDisplay4 = new javax.swing.JPanel();
        lbPhoto4 = new javax.swing.JLabel();
        lbTitle2 = new javax.swing.JLabel();
        lbDisplay5 = new javax.swing.JPanel();
        lbPhoto5 = new javax.swing.JLabel();
        lbTitle4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(105, 768));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mmLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fixLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        lbDisplay.setBackground(new java.awt.Color(204, 51, 255));
        lbDisplay.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhotoMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Photo #1");

        javax.swing.GroupLayout lbDisplayLayout = new javax.swing.GroupLayout(lbDisplay);
        lbDisplay.setLayout(lbDisplayLayout);
        lbDisplayLayout.setHorizontalGroup(
            lbDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbDisplayLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbPhoto)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        lbDisplayLayout.setVerticalGroup(
            lbDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPhoto)
                .addGap(30, 30, 30))
        );

        lbDisplay1.setBackground(new java.awt.Color(255, 0, 0));
        lbDisplay1.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhoto1MouseClicked(evt);
            }
        });

        lbTitle1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle1.setText("Photo #2");

        javax.swing.GroupLayout lbDisplay1Layout = new javax.swing.GroupLayout(lbDisplay1);
        lbDisplay1.setLayout(lbDisplay1Layout);
        lbDisplay1Layout.setHorizontalGroup(
            lbDisplay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbDisplay1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(lbDisplay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay1Layout.createSequentialGroup()
                        .addComponent(lbPhoto1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay1Layout.createSequentialGroup()
                        .addComponent(lbTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        lbDisplay1Layout.setVerticalGroup(
            lbDisplay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPhoto1)
                .addGap(29, 29, 29))
        );

        lbDisplay2.setBackground(new java.awt.Color(204, 102, 0));
        lbDisplay2.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhoto2MouseClicked(evt);
            }
        });

        lbTitle3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle3.setText("Photo #4");

        javax.swing.GroupLayout lbDisplay2Layout = new javax.swing.GroupLayout(lbDisplay2);
        lbDisplay2.setLayout(lbDisplay2Layout);
        lbDisplay2Layout.setHorizontalGroup(
            lbDisplay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(lbDisplay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhoto2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay2Layout.createSequentialGroup()
                        .addComponent(lbTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(31, 31, 31))
        );
        lbDisplay2Layout.setVerticalGroup(
            lbDisplay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPhoto2)
                .addGap(29, 29, 29))
        );

        lbDisplay3.setBackground(new java.awt.Color(0, 204, 255));
        lbDisplay3.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhoto3MouseClicked(evt);
            }
        });

        lbTitle5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle5.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle5.setText("Photo #5");

        javax.swing.GroupLayout lbDisplay3Layout = new javax.swing.GroupLayout(lbDisplay3);
        lbDisplay3.setLayout(lbDisplay3Layout);
        lbDisplay3Layout.setHorizontalGroup(
            lbDisplay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(lbDisplay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhoto3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay3Layout.createSequentialGroup()
                        .addComponent(lbTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(31, 31, 31))
        );
        lbDisplay3Layout.setVerticalGroup(
            lbDisplay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(lbPhoto3)
                .addGap(29, 29, 29))
        );

        lbDisplay4.setBackground(new java.awt.Color(153, 153, 255));
        lbDisplay4.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhoto4MouseClicked(evt);
            }
        });

        lbTitle2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle2.setText("Photo #3");

        javax.swing.GroupLayout lbDisplay4Layout = new javax.swing.GroupLayout(lbDisplay4);
        lbDisplay4.setLayout(lbDisplay4Layout);
        lbDisplay4Layout.setHorizontalGroup(
            lbDisplay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(lbDisplay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhoto4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay4Layout.createSequentialGroup()
                        .addComponent(lbTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(31, 31, 31))
        );
        lbDisplay4Layout.setVerticalGroup(
            lbDisplay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(lbPhoto4)
                .addGap(29, 29, 29))
        );

        lbDisplay5.setBackground(new java.awt.Color(153, 0, 0));
        lbDisplay5.setPreferredSize(new java.awt.Dimension(201, 196));

        lbPhoto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/multimidia-icons/camera.png"))); // NOI18N
        lbPhoto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPhoto5MouseClicked(evt);
            }
        });

        lbTitle4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitle4.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle4.setText("Photo #6");

        javax.swing.GroupLayout lbDisplay5Layout = new javax.swing.GroupLayout(lbDisplay5);
        lbDisplay5.setLayout(lbDisplay5Layout);
        lbDisplay5Layout.setHorizontalGroup(
            lbDisplay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbDisplay5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(lbDisplay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay5Layout.createSequentialGroup()
                        .addComponent(lbPhoto5)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay5Layout.createSequentialGroup()
                        .addComponent(lbTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        lbDisplay5Layout.setVerticalGroup(
            lbDisplay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbDisplay5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(lbPhoto5)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lbDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDisplay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lbDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDisplay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1040, 816));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        // TODO add your handling code here:
        MasterMenu m = new MasterMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeLblMouseClicked

    private void newsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsLblMouseClicked
        // TODO add your handling code here:
        NewsMenu myNews = new NewsMenu();
        myNews.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newsLblMouseClicked

    private void setLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLblMouseClicked
        // TODO add your handling code here:
        UserSettings u = new UserSettings();
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_setLblMouseClicked

    private void fixLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixLblMouseClicked
        // TODO add your handling code here:
        FixGUITest myFix = null;
        try {
            myFix = new FixGUITest();
        } catch (IOException ex) {
            Logger.getLogger(MmPhotoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        myFix.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fixLblMouseClicked

    private void mmLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmLblMouseClicked
        
        MmMultimediaGUI myMulti = new MmMultimediaGUI();
        myMulti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mmLblMouseClicked

    private void lbPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhotoMouseClicked
    //http://stackoverflow.com/questions/3775373/java-how-to-add-image-to-jlabel
   //this methos is opening and displaying photo by using jlabel "MmPhotoView"
        
       MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/ibra.jpg");
       img.setVisible(true);
      
        
    }//GEN-LAST:event_lbPhotoMouseClicked

    private void lbPhoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhoto1MouseClicked
     
        MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/ballo.jpg");
       img.setVisible(true);
    }//GEN-LAST:event_lbPhoto1MouseClicked

    private void lbPhoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhoto2MouseClicked
      
        MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/ronaldo.jpg");
       img.setVisible(true);
    }//GEN-LAST:event_lbPhoto2MouseClicked

    private void lbPhoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhoto3MouseClicked
       
        MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/why.jpg");
        img.setVisible(true);
    }//GEN-LAST:event_lbPhoto3MouseClicked

    private void lbPhoto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhoto4MouseClicked
       
        MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/messi.jpg");
       img.setVisible(true);
    }//GEN-LAST:event_lbPhoto4MouseClicked

    private void lbPhoto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPhoto5MouseClicked
 
        MmPhotoView img = new MmPhotoView("/worldcupapp/mmPhoto/neymar.jpg");
       img.setVisible(true);
    }//GEN-LAST:event_lbPhoto5MouseClicked

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
            java.util.logging.Logger.getLogger(MmMultimediaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmMultimediaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmMultimediaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmMultimediaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MmMultimediaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fixLbl;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel lbDisplay;
    private javax.swing.JPanel lbDisplay1;
    private javax.swing.JPanel lbDisplay2;
    private javax.swing.JPanel lbDisplay3;
    private javax.swing.JPanel lbDisplay4;
    private javax.swing.JPanel lbDisplay5;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbPhoto1;
    private javax.swing.JLabel lbPhoto2;
    private javax.swing.JLabel lbPhoto3;
    private javax.swing.JLabel lbPhoto4;
    private javax.swing.JLabel lbPhoto5;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbTitle2;
    private javax.swing.JLabel lbTitle3;
    private javax.swing.JLabel lbTitle4;
    private javax.swing.JLabel lbTitle5;
    private javax.swing.JLabel mmLbl;
    private javax.swing.JLabel newsLbl;
    private javax.swing.JLabel setLbl;
    // End of variables declaration//GEN-END:variables
}
