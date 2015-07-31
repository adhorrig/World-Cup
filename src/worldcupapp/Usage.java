package worldcupapp;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author anthonybloomer
 */
public class Usage {

    public void getUsage() {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        int count = 0;
        FileReader fr;
        BufferedReader br;

        try {
            f = new File("usage.txt");
            if (f.exists()) {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                int current = Integer.parseInt(br.readLine());
                count = current + 1;
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(Integer.toString(count));
                bw.close();

            } else {
                f = new File("usage.txt");
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                count = count + 1;
                bw.write(Integer.toString(count));
                bw.close();
            }

        } catch (IOException e) {
            System.out.println("Error writing to file." + e);
        }

    }
}
