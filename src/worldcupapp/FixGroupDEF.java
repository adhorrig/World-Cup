/*
 *FixGroupDEF.java
 *4/3/2014
 *@authod Adam Horrigan, x13735825.
 */
package worldcupapp;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FixGroupDEF extends javax.swing.JFrame {

    FixReadFile r = new FixReadFile("fixtures.txt"); //Create an instance of FixReadFile
    FixDataTableModel theTableModel; // FixDataTableModel variable to hold theTableModel
    ArrayList<String> listOfLines = new ArrayList<>(); //Declare and create an ArrayList called listOfLines.

    /**
     * Creates new form table
     */
    public FixGroupDEF() throws IOException {

        listOfLines = r.OpenFile(); // Assign List of Lines to OpenFile method. 

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

            listOfLines = file.OpenFile();

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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        butgrpDEF = new javax.swing.ButtonGroup();
        tabGroupD = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tabGroupE = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tabGroupF = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lblGroupD = new javax.swing.JLabel();
        lblGroupE = new javax.swing.JLabel();
        lblGroupF = new javax.swing.JLabel();
        radbutUru = new javax.swing.JRadioButton();
        radbutCosta = new javax.swing.JRadioButton();
        radbutEng = new javax.swing.JRadioButton();
        radbutItaly = new javax.swing.JRadioButton();
        radbutSwitz = new javax.swing.JRadioButton();
        RedbutEcuador = new javax.swing.JRadioButton();
        radbutFrance = new javax.swing.JRadioButton();
        redbutHonduras = new javax.swing.JRadioButton();
        radbutArgentina = new javax.swing.JRadioButton();
        radbutBosnia = new javax.swing.JRadioButton();
        radbutIran = new javax.swing.JRadioButton();
        radbutNigeria = new javax.swing.JRadioButton();
        lblLineUp = new javax.swing.JLabel();
        lblUruguay = new javax.swing.JLabel();
        lblCosta = new javax.swing.JLabel();
        lblEngland = new javax.swing.JLabel();
        lblItaly = new javax.swing.JLabel();
        lblSwitz = new javax.swing.JLabel();
        lblEcuador = new javax.swing.JLabel();
        lblFrance = new javax.swing.JLabel();
        lblHond = new javax.swing.JLabel();
        lblArgentina = new javax.swing.JLabel();
        lblBosnia = new javax.swing.JLabel();
        lblIran = new javax.swing.JLabel();
        lblNigeria = new javax.swing.JLabel();
        panelLeft = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblNews = new javax.swing.JLabel();
        lblFixtures = new javax.swing.JLabel();
        lblMultimedia = new javax.swing.JLabel();
        lblSettings = new javax.swing.JLabel();

        jTable3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15/06 - 19:00", "Rio De Janeiro", "Argentina v Bosnia and Herzegovina"},
                {"16/06 - 16:00", "Curitiba", "Iran v Nigeria"},
                {"21/06 - 13:00", "Belo Horizonte", "Argentina v Iran"},
                {"21/06 - 18:00", "Cuiaba", "Nigeria v Bosnia and Herzegovina"},
                {"25/06 - 13:00", "Port Alegre", "Nigeria v Argentina"},
                {"25/06 - 13:00", "Salvador", "Bosnia and Herzegovina v Iran"}
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(54), listOfLines.get(60), listOfLines.get(66)},
                {listOfLines.get(55), listOfLines.get(61), listOfLines.get(67)},
                {listOfLines.get(56), listOfLines.get(62), listOfLines.get(68)},
                {listOfLines.get(57), listOfLines.get(63), listOfLines.get(69)},
                {listOfLines.get(58), listOfLines.get(64), listOfLines.get(70)},
                {listOfLines.get(59), listOfLines.get(65), listOfLines.get(71)},
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupD.setViewportView(jTable1);

        getContentPane().add(tabGroupD);
        tabGroupD.setBounds(148, 66, 530, 125);

        jTable2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(72), listOfLines.get(78), listOfLines.get(84)},
                {listOfLines.get(73), listOfLines.get(79), listOfLines.get(85)},
                {listOfLines.get(74), listOfLines.get(80), listOfLines.get(86)},
                {listOfLines.get(75), listOfLines.get(81), listOfLines.get(87)},
                {listOfLines.get(76), listOfLines.get(82), listOfLines.get(88)},
                {listOfLines.get(77), listOfLines.get(83), listOfLines.get(89)},
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupE.setViewportView(jTable2);

        getContentPane().add(tabGroupE);
        tabGroupE.setBounds(148, 243, 530, 125);

        jTable4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {listOfLines.get(90), listOfLines.get(96), listOfLines.get(102)},
                {listOfLines.get(91), listOfLines.get(97), listOfLines.get(103)},
                {listOfLines.get(92), listOfLines.get(98), listOfLines.get(104)},
                {listOfLines.get(93), listOfLines.get(99), listOfLines.get(105)},
                {listOfLines.get(94), listOfLines.get(100),listOfLines.get(106)},
                {listOfLines.get(95), listOfLines.get(101),listOfLines.get(107)},
            },
            new String [] {
                "Date / Time", "Venue", "Match"
            }
        ));
        tabGroupF.setViewportView(jTable4);

        getContentPane().add(tabGroupF);
        tabGroupF.setBounds(148, 427, 530, 125);

        lblGroupD.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupD.setText("Group D");
        getContentPane().add(lblGroupD);
        lblGroupD.setBounds(148, 25, 62, 23);

        lblGroupE.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupE.setText("Group F");
        getContentPane().add(lblGroupE);
        lblGroupE.setBounds(148, 386, 59, 23);

        lblGroupF.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblGroupF.setText("Group E");
        getContentPane().add(lblGroupF);
        lblGroupF.setBounds(148, 209, 60, 23);

        butgrpDEF.add(radbutUru);
        radbutUru.setText("Uruguay");
        radbutUru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutUruActionPerformed(evt);
            }
        });
        getContentPane().add(radbutUru);
        radbutUru.setBounds(724, 66, 80, 23);

        butgrpDEF.add(radbutCosta);
        radbutCosta.setText("Costa Rica");
        radbutCosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutCostaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutCosta);
        radbutCosta.setBounds(813, 66, 100, 23);

        butgrpDEF.add(radbutEng);
        radbutEng.setText("England");
        radbutEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutEngActionPerformed(evt);
            }
        });
        getContentPane().add(radbutEng);
        radbutEng.setBounds(724, 89, 90, 23);

        butgrpDEF.add(radbutItaly);
        radbutItaly.setText("Italy");
        radbutItaly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutItalyActionPerformed(evt);
            }
        });
        getContentPane().add(radbutItaly);
        radbutItaly.setBounds(813, 89, 80, 23);

        butgrpDEF.add(radbutSwitz);
        radbutSwitz.setText("Switzerland");
        radbutSwitz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutSwitzActionPerformed(evt);
            }
        });
        getContentPane().add(radbutSwitz);
        radbutSwitz.setBounds(724, 113, 90, 23);

        butgrpDEF.add(RedbutEcuador);
        RedbutEcuador.setText("Ecuador");
        RedbutEcuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedbutEcuadorActionPerformed(evt);
            }
        });
        getContentPane().add(RedbutEcuador);
        RedbutEcuador.setBounds(813, 113, 90, 23);

        butgrpDEF.add(radbutFrance);
        radbutFrance.setText("France");
        radbutFrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutFranceActionPerformed(evt);
            }
        });
        getContentPane().add(radbutFrance);
        radbutFrance.setBounds(724, 140, 80, 23);

        butgrpDEF.add(redbutHonduras);
        redbutHonduras.setText("Honduras");
        redbutHonduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redbutHondurasActionPerformed(evt);
            }
        });
        getContentPane().add(redbutHonduras);
        redbutHonduras.setBounds(813, 140, 100, 23);

        butgrpDEF.add(radbutArgentina);
        radbutArgentina.setText("Argentina");
        radbutArgentina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutArgentinaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutArgentina);
        radbutArgentina.setBounds(724, 168, 90, 23);

        butgrpDEF.add(radbutBosnia);
        radbutBosnia.setText("Bosnia");
        radbutBosnia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutBosniaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutBosnia);
        radbutBosnia.setBounds(813, 168, 90, 23);

        butgrpDEF.add(radbutIran);
        radbutIran.setText("Iran");
        radbutIran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutIranActionPerformed(evt);
            }
        });
        getContentPane().add(radbutIran);
        radbutIran.setBounds(724, 194, 80, 23);

        butgrpDEF.add(radbutNigeria);
        radbutNigeria.setText("Nigeria");
        radbutNigeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbutNigeriaActionPerformed(evt);
            }
        });
        getContentPane().add(radbutNigeria);
        radbutNigeria.setBounds(813, 194, 100, 23);

        lblLineUp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblLineUp.setText("Predicted line ups:");
        getContentPane().add(lblLineUp);
        lblLineUp.setBounds(737, 25, 139, 23);

        lblUruguay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/uruguay.png"))); // NOI18N
        getContentPane().add(lblUruguay);
        lblUruguay.setBounds(700, 270, 280, 360);
        lblUruguay.setVisible(false);

        lblCosta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/costa.png"))); // NOI18N
        getContentPane().add(lblCosta);
        lblCosta.setBounds(700, 270, 280, 360);
        lblCosta.setVisible(false);

        lblEngland.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/england.png"))); // NOI18N
        lblEngland.setText("el1");
        getContentPane().add(lblEngland);
        lblEngland.setBounds(700, 270, 280, 360);
        lblEngland.setVisible(false);

        lblItaly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/italy.png"))); // NOI18N
        getContentPane().add(lblItaly);
        lblItaly.setBounds(700, 270, 280, 360);
        lblItaly.setVisible(false);

        lblSwitz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/switz.png"))); // NOI18N
        getContentPane().add(lblSwitz);
        lblSwitz.setBounds(700, 270, 280, 360);
        lblSwitz.setVisible(false);

        lblEcuador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/ecuador.png"))); // NOI18N
        getContentPane().add(lblEcuador);
        lblEcuador.setBounds(700, 270, 280, 360);
        lblEcuador.setVisible(false);

        lblFrance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/france.png"))); // NOI18N
        getContentPane().add(lblFrance);
        lblFrance.setBounds(700, 270, 280, 360);
        lblFrance.setVisible(false);

        lblHond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/honduras.png"))); // NOI18N
        getContentPane().add(lblHond);
        lblHond.setBounds(700, 270, 280, 360);
        lblHond.setVisible(false);

        lblArgentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/argentina.png"))); // NOI18N
        getContentPane().add(lblArgentina);
        lblArgentina.setBounds(700, 270, 280, 360);
        lblArgentina.setVisible(false);

        lblBosnia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/bosnia.png"))); // NOI18N
        getContentPane().add(lblBosnia);
        lblBosnia.setBounds(700, 270, 280, 360);
        lblBosnia.setVisible(false);

        lblIran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/iran.png"))); // NOI18N
        getContentPane().add(lblIran);
        lblIran.setBounds(700, 270, 280, 360);
        lblIran.setVisible(false);

        lblNigeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/images/nigeria.png"))); // NOI18N
        lblNigeria.setText("jLabel1");
        getContentPane().add(lblNigeria);
        lblNigeria.setBounds(700, 270, 280, 360);
        lblNigeria.setVisible(false);

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

    private void radbutUruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutUruActionPerformed
        // TODO add your handling code here:
        lblNigeria.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblUruguay.setVisible(true);
    }//GEN-LAST:event_radbutUruActionPerformed

    private void radbutCostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutCostaActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblNigeria.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblCosta.setVisible(true);
    }//GEN-LAST:event_radbutCostaActionPerformed

    private void radbutEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutEngActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblNigeria.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblEngland.setVisible(true);
    }//GEN-LAST:event_radbutEngActionPerformed

    private void radbutItalyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutItalyActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblNigeria.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblItaly.setVisible(true);;
    }//GEN-LAST:event_radbutItalyActionPerformed

    private void radbutSwitzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutSwitzActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblNigeria.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblSwitz.setVisible(true);
    }//GEN-LAST:event_radbutSwitzActionPerformed

    private void RedbutEcuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedbutEcuadorActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblNigeria.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblEcuador.setVisible(true);
    }//GEN-LAST:event_RedbutEcuadorActionPerformed

    private void radbutFranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutFranceActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblNigeria.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblFrance.setVisible(true);
    }//GEN-LAST:event_radbutFranceActionPerformed

    private void redbutHondurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redbutHondurasActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblNigeria.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblHond.setVisible(true);
    }//GEN-LAST:event_redbutHondurasActionPerformed

    private void radbutArgentinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutArgentinaActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblNigeria.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblArgentina.setVisible(true);
    }//GEN-LAST:event_radbutArgentinaActionPerformed

    private void radbutBosniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutBosniaActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblNigeria.setVisible(false);
        lblIran.setVisible(false);
        lblBosnia.setVisible(true);
    }//GEN-LAST:event_radbutBosniaActionPerformed

    private void radbutIranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutIranActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblNigeria.setVisible(false);
        lblIran.setVisible(true);
    }//GEN-LAST:event_radbutIranActionPerformed

    private void radbutNigeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbutNigeriaActionPerformed
        // TODO add your handling code here:
        lblUruguay.setVisible(false); //Switch between predicted teams.
        lblCosta.setVisible(false);
        lblEngland.setVisible(false);
        lblItaly.setVisible(false);
        lblSwitz.setVisible(false);
        lblEcuador.setVisible(false);
        lblFrance.setVisible(false);
        lblHond.setVisible(false);
        lblArgentina.setVisible(false);
        lblBosnia.setVisible(false);
        lblIran.setVisible(false);
        lblNigeria.setVisible(true);
    }//GEN-LAST:event_radbutNigeriaActionPerformed

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
            Logger.getLogger(FixGroupDEF.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FixGroupDEF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixGroupDEF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixGroupDEF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixGroupDEF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FixGroupDEF().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FixGroupDEF.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RedbutEcuador;
    private javax.swing.ButtonGroup butgrpDEF;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblArgentina;
    private javax.swing.JLabel lblBosnia;
    private javax.swing.JLabel lblCosta;
    private javax.swing.JLabel lblEcuador;
    private javax.swing.JLabel lblEngland;
    private javax.swing.JLabel lblFixtures;
    private javax.swing.JLabel lblFrance;
    private javax.swing.JLabel lblGroupD;
    private javax.swing.JLabel lblGroupE;
    private javax.swing.JLabel lblGroupF;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHond;
    private javax.swing.JLabel lblIran;
    private javax.swing.JLabel lblItaly;
    private javax.swing.JLabel lblLineUp;
    private javax.swing.JLabel lblMultimedia;
    private javax.swing.JLabel lblNews;
    private javax.swing.JLabel lblNigeria;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblSwitz;
    private javax.swing.JLabel lblUruguay;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JRadioButton radbutArgentina;
    private javax.swing.JRadioButton radbutBosnia;
    private javax.swing.JRadioButton radbutCosta;
    private javax.swing.JRadioButton radbutEng;
    private javax.swing.JRadioButton radbutFrance;
    private javax.swing.JRadioButton radbutIran;
    private javax.swing.JRadioButton radbutItaly;
    private javax.swing.JRadioButton radbutNigeria;
    private javax.swing.JRadioButton radbutSwitz;
    private javax.swing.JRadioButton radbutUru;
    private javax.swing.JRadioButton redbutHonduras;
    private javax.swing.JScrollPane tabGroupD;
    private javax.swing.JScrollPane tabGroupE;
    private javax.swing.JScrollPane tabGroupF;
    // End of variables declaration//GEN-END:variables
}
