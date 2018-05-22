/*
 * Arielle
 * Mon. Dec. 12, 2016
 * Version 1.0
 * Learning about the unit. Information important for performance task. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7.testCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class StartOfUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //Creating a new file and PrintWriter (fix imports)
        File file = new File("numbers.doc"); //Access is denied when u put C: and two back slashes because of security, no Writing on windows' hard drive.
        PrintWriter output = new PrintWriter(file); // There is an unaccounted for exception (throw it, do not catch)
        //Outputting numbers (So that they are saved on the file)
        int data[] = new int[100];
        for (int i = 0; i < data.length; i++) {
            output.println((int) (Math.random() * 1000) + 1);
        }
        //Java has a buffer so that it waits till there is a sufficuient amount of data before
        //printing. Then you tie up the garbage bag (stop printing data in that file).
        output.close();
        
        Scanner input = new Scanner(file);
        //Using inputs with files
        int i =0;
        while (input.hasNext()) {
            input.nextLine();
        }
    }
    
    

}
