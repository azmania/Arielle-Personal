/*
 * Arielle
 * Mon. Nov. 14, 2016
 * Version 1.0
 * Prints square from letters.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5.Assignments;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner (System.in);
        //Variables
        String text, answer;
        int o = 0;
        
        //Input
        System.out.print("Enter Word: ");
        text = input.nextLine();
        
        //Processing
        System.out.println(text);
        for (int i = 0; i < text.length() - 1; i++ ){
            text = text.substring(o + 1) + text.charAt(o);
            System.out.println(text);
            
        }
    }
    
}
