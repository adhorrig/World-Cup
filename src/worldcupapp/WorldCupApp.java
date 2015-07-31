package worldcupapp;


import java.io.File;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anthonybloomer
 */
public class WorldCupApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File inFile = new File("user.data");

        if (!inFile.exists()) {
            Welcome w = new Welcome();
            w.setVisible(true);

        } else {
            MasterMenu h = new MasterMenu();
            h.setVisible(true);
            Usage theUsage = new Usage();
            theUsage.getUsage();

        }
    }
}
