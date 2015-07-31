/*
 *FixGroupDEF.java
 *4/3/2014
 *@authod Adam Horrigan, x13735825.
 *@reference http://www.reddit.com/r/javahelp/comments/21y86u/how_can_i_check_if_a_method_is_being_executed/
 */
package worldcupapp;

import java.awt.List;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class FixReadFile {

    private String path;
    private String aLine;

    public FixReadFile(String file_path) {
        path = file_path;
    }

    public ArrayList<String> OpenFile() throws IOException {

        /*
         *@reference http://www.reddit.com/r/javahelp/comments/21y86u/how_can_i_check_if_a_method_is_being_executed/
         */
        /*
         *I wrote an original method to read and open files which is posted at the end, the method below is a modified version which was made by an online user.
         *My code was modified as with the modified version, it made what I was trying to do a whole lot easier.
         *I was also able to use an ArrayList much easier as I previously used .addall to fill the ArrayList in my main class with the Array from OpenFile() and readLines().
         */
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        ArrayList<String> textData = new ArrayList<String>();
        String aLine;
        while ((aLine = textReader.readLine()) != null) {
            System.out.println(aLine);  //debug
            textData.add(aLine);

        }

        textReader.close();
        return textData;

    }

}

/*
My original method which does the same thing as the method above, just with an Array instead of an ArryaList
*And in more lines of code.

public String[] OpenFile() throws IOException {

    FileReader fr = new FileReader(path);
    BufferedReader textReader = new BufferedReader(fr);

    int numberOfLines = readLines();
    String[] textData = new String[numberOfLines];

    for (int i = 0; i < numberOfLines; i++) {
        textData[i] = textReader.readLine();
    }

    textReader.close();
    return textData;

}

int readLines() throws IOException {
    FileReader file_to_read = new FileReader(path);
    BufferedReader bf = new BufferedReader(file_to_read);

    String aLine;
    int numberOfLines = 0;
    while ((aLine = bf.readLine()) != null) {
        numberOfLines++;
    }

    bf.close();
    return numberOfLines;
}
*/
