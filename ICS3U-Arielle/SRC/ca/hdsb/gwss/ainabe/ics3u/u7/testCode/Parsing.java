/*
 * Arielle
 * Tues. Dec. 13, 2016
 * Version 1.0
 * Learning abot StringTokenizers. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7.testCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1ainabeari
 */
public class Parsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        StringTokenizer str;  //Cuts up text files into tokens based on the symbol you tell it ti remove (for .csv files it's commas). Have to know what each token means yourself.
        File file = new File (".csv");
        Scanner input = new Scanner (file);
        
        while (input.hasNext()){
            System.out.println(input.nextLine());
        }
        
         while (input.hasNext()){
            str = new StringTokenizer(input.nextLine(), ",", false); //Default is spaces, true or false means whether or not you create atoken from the deliminator. 
        }
    }
    
}
