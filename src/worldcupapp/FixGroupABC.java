/*
 *FixGroupABC.java
 *4/3/2014
 *@authod Adam Horrigan, x13735825.
 */
package worldcupapp;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FixGroupABC extends javax.swing.JFrame {

    FixReadFile r = new FixReadFile("fixtures.txt"); //Create an instance of FixReadFile
    FixDataTableModel theTableModel; // FixDataTableModel variable to hold theTableModel
    ArrayList<String> listOfLines = new ArrayList<>(); //Declare and create an ArrayList called listOfLines.

    /**
     * Creates new form table
     */
    public FixGroupABC() throws IOException {

        listOfLines = r.OpenFile();

        theTableModel = new FixDataTableModel(listOfLines); // Create an instance of the theTableModel and pass listOfLines into it.
        // initialise the form
        initComponents();
        getContentPane().setBackground(new Color(255,255,0));
        this.setLocationRelativeTo(null);

    }

    public void foo() { //Method to read file into an ArrayList.
        String file_name = "test.txt";

        try {
            FixReadFile file = new FixReadFile(file_name);

            listOfLines = file.OpenFile(); // Assign List of Lines to OpenFile method.

        } catch (IOException e) {
            System.out.println(e.getMessage());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        butgrpABC = new javax.swing.ButtonGroup();
        tabGroupA = new javax.swing.JScrollPane();
        tabGroupa = new javax.swing.JTable();
        tabGroupB = new javax.swing.JScrollPane();
        tabGroupb = new javax.swing.JTable();
        tabGroupC = new javax.swing.JScrollPane();
        tabGroupc = new javax.swing.JTable();
        lblGroupA = new javax.swing.JLabel();
        lblGroupB = new javax.swing.JLabel();
        lblGroupC = new javax.swing.JLabel();
        radbutBrazil = new javax.swing.JRadioButton();
        radbutCroatia = new javax.swing.JRadioButton();
        radbutMexico = new javax.swing.JRadioButton();
        radbutCameroon = new javax.swing.JRadioButton();
        radbutSpain = new javax.swing.JRadioButton();
        radbutNetherlands = new javax.swing.JRadioButton();
        radbutChile = new javax.swing.JRadioButton();
        radbutAustralia = new javax.swing.JRadioButton();
        radbutColumbia = new javax.swing.JRadioButton();
        radbutGreece = new javax.swing.JRadioButton();
        radbutIvory = new javax.swing.JRadioButton();
        radbutJapan = new javax.swing.JRadioButton();
        lblPredict = new javax.swing.JLabel();
        lblBrazil = new javax.swing.JLabel();
        lblCroatia = new javax.swing.JLabel();
        lblMexico = new javax.swing.JLabel();
        lblCameroon = new javax.swing.JLabel();
        lblSpain = new javax.swing.JLabel();
        lblNetherlands = new javax.swing.JLabel();
        lblChile = new javax.swing.JLabel();
        lblAustralia = new javax.swing.JLabel();
        lblColumbia = new javax.swing.JLabel();
        lblGreece = new javax.swing.JLabel();
        lblIvory = new javax.swing.JLabel();
        lblJapan = new javax.swing.JLabel();
        panelLeft = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblNews = new javax.swing.JLabel();
        lblFixtures = new javax.swing.JLabel();
        lblMultimedia = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();

        jTable2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"14/06 - 13:00", "Belo Horizonte", "Columbia v Greece"},
                {"14/06 - 22:00", "Recife", "Ivory Coast v Japan"},
                {"19/06 - 13:00", "Brasilia", "Columbia v Ivory Coast"},
                {"19/06 - 19:00", "Natal", "Japan v Greece"},
                {"24/06 - 16:00", "Cuiaba", "Japan v Colombia"},
                {"24/06 - 17:00", "Fortalezza", "Greece v Ivory Coast"}
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        tabGroupa.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        tabGroupa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(0), listOfLines.get(6), listOfLines.get(12)},
                {listOfLines.get(1), listOfLines.get(7), listOfLines.get(13)},
                {listOfLines.get(2), listOfLines.get(8), listOfLines.get(14)},
                {listOfLines.get(3), listOfLines.get(9), listOfLines.get(15)},
                {listOfLines.get(4), listOfLines.get(10), listOfLines.get(16)},
                {listOfLines.get(5), listOfLines.get(11), listOfLines.get(17)}
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupA.setViewportView(tabGroupa);

        getContentPane().add(tabGroupA);
        tabGroupA.setBounds(148, 79, 530, 125);

        tabGroupb.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        tabGroupb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(18), listOfLines.get(24), listOfLines.get(30)},
                {listOfLines.get(19), listOfLines.get(25), listOfLines.get(31)},
                {listOfLines.get(20), listOfLines.get(26), listOfLines.get(32)},
                {listOfLines.get(21), listOfLines.get(27), listOfLines.get(33)},
                {listOfLines.get(22), listOfLines.get(28), listOfLines.get(34)},
                {listOfLines.get(23), listOfLines.get(29), listOfLines.get(35)},
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupB.setViewportView(tabGroupb);

        getContentPane().add(tabGroupB);
        tabGroupB.setBounds(148, 251, 530, 124);

        tabGroupc.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        tabGroupc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(36), listOfLines.get(42), listOfLines.get(48)},
                {listOfLines.get(37), listOfLines.get(43), listOfLines.get(49)},
                {listOfLines.get(38), listOfLines.get(44), listOfLines.get(50)},
                {listOfLines.get(39), listOfLines.get(45), listOfLines.get(51)},
                {listOfLines.get(40), listOfLines.get(46), listOfLines.get(52)},
                {listOfLines.get(41), listOfLines.get(47), listOfLines.get(53)}
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupC.setViewportView(tabGroupc);

        getContentPane().add(tabGroupC);
        tabGroupC.setBounds(148, 434, 530, 125);

        lblGroupA.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupA.setText("Group A");
        getContentPane().add(lblGroupA);
        lblGroupA.setBounds(148, 38, 62, 23);

        lblGroupB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupB.setText("Group B");
        getContentPane().add(lblGroupB);
        lblGroupB.setBounds(148, 222, 61, 23);

        lblGroupC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupC.setText("Group C");
        getContentPane().add(lblGroupC);
        lblGroupC.setBounds(148, 393, 61, 23);

        butgrpABC.add(radbutBrazil);
        radbutBrazil.setText("Brazil");
        radbutBrazil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutBrazilActionPerformed(evt);
            }
        });
        getContentPane().add(radbutBrazil);
        radbutBrazil.setBounds(722, 88, 80, 23);

        butgrpABC.add(radbutCroatia);
        radbutCroatia.setText("Croatia");
        radbutCroatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutCroatiaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutCroatia);
        radbutCroatia.setBounds(821, 88, 80, 23);

        butgrpABC.add(radbutMexico);
        radbutMexico.setText("Mexico");
        radbutMexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutMexicoActionPerformed(evt);
            }
        });
        getContentPane().add(radbutMexico);
        radbutMexico.setBounds(722, 111, 80, 23);

        butgrpABC.add(radbutCameroon);
        radbutCameroon.setText("Cameroon");
        radbutCameroon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutCameroonActionPerformed(evt);
            }
        });
        getContentPane().add(radbutCameroon);
        radbutCameroon.setBounds(821, 111, 90, 23);

        butgrpABC.add(radbutSpain);
        radbutSpain.setText("Spain");
        radbutSpain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutSpainActionPerformed(evt);
            }
        });
        getContentPane().add(radbutSpain);
        radbutSpain.setBounds(722, 137, 80, 23);

        butgrpABC.add(radbutNetherlands);
        radbutNetherlands.setText("Netherlands");
        radbutNetherlands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutNetherlandsActionPerformed(evt);
            }
        });
        getContentPane().add(radbutNetherlands);
        radbutNetherlands.setBounds(821, 137, 110, 23);

        butgrpABC.add(radbutChile);
        radbutChile.setText("Chile");
        radbutChile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutChileActionPerformed(evt);
            }
        });
        getContentPane().add(radbutChile);
        radbutChile.setBounds(722, 163, 90, 23);

        butgrpABC.add(radbutAustralia);
        radbutAustralia.setText("Australia");
        radbutAustralia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutAustraliaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutAustralia);
        radbutAustralia.setBounds(821, 163, 110, 23);

        butgrpABC.add(radbutColumbia);
        radbutColumbia.setText("Columbia");
        radbutColumbia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutColumbiaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutColumbia);
        radbutColumbia.setBounds(722, 189, 100, 23);

        butgrpABC.add(radbutGreece);
        radbutGreece.setText("Greece");
        radbutGreece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutGreeceActionPerformed(evt);
            }
        });
        getContentPane().add(radbutGreece);
        radbutGreece.setBounds(821, 189, 90, 23);

        butgrpABC.add(radbutIvory);
        radbutIvory.setText("Ivory Coast");
        radbutIvory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutIvoryActionPerformed(evt);
            }
        });
        getContentPane().add(radbutIvory);
        radbutIvory.setBounds(722, 215, 100, 23);

        butgrpABC.add(radbutJapan);
        radbutJapan.setText("Japan");
        radbutJapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutJapanActionPerformed(evt);
            }
        });
        getContentPane().add(radbutJapan);
        radbutJapan.setBounds(823, 215, 80, 23);

        lblPredict.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblPredict.setText("Predicted line ups:");
        getContentPane().add(lblPredict);
        lblPredict.setBounds(722, 38, 139, 23);

        lblBrazil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/brazil.png"))); // NOI18N
        getContentPane().add(lblBrazil);
        lblBrazil.setBounds(700, 260, 300, 390);
        lblBrazil.setVisible(false);

        lblCroatia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/croatia.png"))); // NOI18N
        getContentPane().add(lblCroatia);
        lblCroatia.setBounds(700, 260, 300, 390);
        lblCroatia.setVisible(false);

        lblMexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/mexico.png"))); // NOI18N
        getContentPane().add(lblMexico);
        lblMexico.setBounds(700, 260, 300, 390);
        lblMexico.setVisible(false);

        lblCameroon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/cameroon.png"))); // NOI18N
        getContentPane().add(lblCameroon);
        lblCameroon.setBounds(700, 260, 300, 390);
        lblCameroon.setVisible(false);

        lblSpain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/spain.png"))); // NOI18N
        getContentPane().add(lblSpain);
        lblSpain.setBounds(700, 260, 300, 390);
        lblSpain.setVisible(false);

        lblNetherlands.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/netherlands.png"))); // NOI18N
        getContentPane().add(lblNetherlands);
        lblNetherlands.setBounds(700, 260, 300, 390);
        lblNetherlands.setVisible(false);

        lblChile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/chile.png"))); // NOI18N
        getContentPane().add(lblChile);
        lblChile.setBounds(700, 260, 300, 390);
        lblChile.setVisible(false);

        lblAustralia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/australia.png"))); // NOI18N
        getContentPane().add(lblAustralia);
        lblAustralia.setBounds(700, 260, 300, 390);
        lblAustralia.setVisible(false);

        lblColumbia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/columbia.png"))); // NOI18N
        getContentPane().add(lblColumbia);
        lblColumbia.setBounds(700, 260, 300, 390);
        lblColumbia.setVisible(false);

        lblGreece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/greece.png"))); // NOI18N
        getContentPane().add(lblGreece);
        lblGreece.setBounds(700, 260, 300, 390);
        lblGreece.setVisible(false);

        lblIvory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/ivory.png"))); // NOI18N
        getContentPane().add(lblIvory);
        lblIvory.setBounds(700, 260, 300, 390);
        lblIvory.setVisible(false);

        lblJapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/japan.png"))); // NOI18N
        getContentPane().add(lblJapan);
        lblJapan.setBounds(700, 260, 300, 390);
        lblJapan.setVisible(false);

        panelLeft.setBackground(new java.awt.Color(51, 51, 51));
        panelLeft.setForeground(new java.awt.Color(51, 51, 51));
        panelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.home.empty.png"))); // NOI18N
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        panelLeft.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 50));

        lblNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.newspaper.png"))); // NOI18N
        lblNews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewsMouseClicked(evt);
            }
        });
        panelLeft.add(lblNews, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 50));

        lblFixtures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.sport.football.png"))); // NOI18N
        lblFixtures.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFixturesMouseClicked(evt);
            }
        });
        panelLeft.add(lblFixtures, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 40));

        lblMultimedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.video.gallery.png"))); // NOI18N
        lblMultimedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMultimediaMouseClicked(evt);
            }
        });
        panelLeft.add(lblMultimedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 60));

        lblSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/sidebar_icons/appbar.settings.png"))); // NOI18N
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingsMouseClicked(evt);
            }
        });
        panelLeft.add(lblSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 50));

        getContentPane().add(panelLeft);
        panelLeft.setBounds(-1, -1, 100, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radbutBrazilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutBrazilActionPerformed
        // TODO add your handling code here:
        lblJapan.setVisible(false);  //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblBrazil.setVisible(true);
    }//GEN-LAST:event_radbutBrazilActionPerformed

    private void radbutCroatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutCroatiaActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblJapan.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblCroatia.setVisible(true);
    }//GEN-LAST:event_radbutCroatiaActionPerformed

    private void radbutMexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutMexicoActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblJapan.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblMexico.setVisible(true);
    }//GEN-LAST:event_radbutMexicoActionPerformed

    private void radbutCameroonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutCameroonActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblJapan.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblCameroon.setVisible(true);
    }//GEN-LAST:event_radbutCameroonActionPerformed

    private void radbutSpainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutSpainActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblJapan.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblSpain.setVisible(true);
    }//GEN-LAST:event_radbutSpainActionPerformed

    private void radbutNetherlandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutNetherlandsActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblJapan.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblNetherlands.setVisible(true);
    }//GEN-LAST:event_radbutNetherlandsActionPerformed

    private void radbutChileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutChileActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblJapan.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblChile.setVisible(true);
    }//GEN-LAST:event_radbutChileActionPerformed

    private void radbutAustraliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutAustraliaActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblJapan.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblAustralia.setVisible(true);
    }//GEN-LAST:event_radbutAustraliaActionPerformed

    private void radbutColumbiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutColumbiaActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblJapan.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblColumbia.setVisible(true);
    }//GEN-LAST:event_radbutColumbiaActionPerformed

    private void radbutGreeceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutGreeceActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblJapan.setVisible(false);
        lblIvory.setVisible(false);
        lblGreece.setVisible(true);
    }//GEN-LAST:event_radbutGreeceActionPerformed

    private void radbutIvoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutIvoryActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblJapan.setVisible(false);
        lblIvory.setVisible(true);

    }//GEN-LAST:event_radbutIvoryActionPerformed

    private void radbutJapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutJapanActionPerformed
        // TODO add your handling code here:
        lblBrazil.setVisible(false); //Switch between predicted teams.
        lblCroatia.setVisible(false);
        lblMexico.setVisible(false);
        lblCameroon.setVisible(false);
        lblSpain.setVisible(false);
        lblNetherlands.setVisible(false);
        lblChile.setVisible(false);
        lblAustralia.setVisible(false);
        lblColumbia.setVisible(false);
        lblGreece.setVisible(false);
        lblIvory.setVisible(false);
        lblJapan.setVisible(true);
    }//GEN-LAST:event_radbutJapanActionPerformed

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        MasterMenu MM = new MasterMenu();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblNewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewsMouseClicked
        // TODO add your handling code here:
        NewsMenu NM = new NewsMenu();
        NM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblNewsMouseClicked

    private void lblFixturesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFixturesMouseClicked
        // TODO add your handling code here:
        FixGUITest GT = null;
        try {
            GT = new FixGUITest();
        } catch (IOException ex) {
            Logger.getLogger(FixGroupABC.class.getName()).log(Level.SEVERE, null, ex);
        }
        GT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblFixturesMouseClicked

    private void lblMultimediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMultimediaMouseClicked
        // TODO add your handling code here:
        MmMultimediaGUI MMGUI = new MmMultimediaGUI();
        MMGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMultimediaMouseClicked

    private void lblSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseClicked
        // TODO add your handling code here:
        UserSettings SetUS = new UserSettings();
        SetUS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblSettingsMouseClicked

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
            java.util.logging.Logger.getLogger(FixGroupABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixGroupABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixGroupABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixGroupABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FixGroupABC().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FixGroupABC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup butgrpABC;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAustralia;
    private javax.swing.JLabel lblBrazil;
    private javax.swing.JLabel lblCameroon;
    private javax.swing.JLabel lblChile;
    private javax.swing.JLabel lblColumbia;
    private javax.swing.JLabel lblCroatia;
    private javax.swing.JLabel lblFixtures;
    private javax.swing.JLabel lblGreece;
    private javax.swing.JLabel lblGroupA;
    private javax.swing.JLabel lblGroupB;
    private javax.swing.JLabel lblGroupC;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIvory;
    private javax.swing.JLabel lblJapan;
    private javax.swing.JLabel lblMexico;
    private javax.swing.JLabel lblMultimedia;
    private javax.swing.JLabel lblNetherlands;
    private javax.swing.JLabel lblNews;
    private javax.swing.JLabel lblPredict;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblSpain;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JRadioButton radbutAustralia;
    private javax.swing.JRadioButton radbutBrazil;
    private javax.swing.JRadioButton radbutCameroon;
    private javax.swing.JRadioButton radbutChile;
    private javax.swing.JRadioButton radbutColumbia;
    private javax.swing.JRadioButton radbutCroatia;
    private javax.swing.JRadioButton radbutGreece;
    private javax.swing.JRadioButton radbutIvory;
    private javax.swing.JRadioButton radbutJapan;
    private javax.swing.JRadioButton radbutMexico;
    private javax.swing.JRadioButton radbutNetherlands;
    private javax.swing.JRadioButton radbutSpain;
    private javax.swing.JScrollPane tabGroupA;
    private javax.swing.JScrollPane tabGroupB;
    private javax.swing.JScrollPane tabGroupC;
    private javax.swing.JTable tabGroupa;
    private javax.swing.JTable tabGroupb;
    private javax.swing.JTable tabGroupc;
    // End of variables declaration//GEN-END:variables
}
