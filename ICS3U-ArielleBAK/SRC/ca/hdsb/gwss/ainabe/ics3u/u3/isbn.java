/*
 * Arielle
 * Tues. Oct. 11, 2016
 * Version 1.0
 * Calculating ISBN
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Arielle
 */
public class isbn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final int ISBNA = 9;
        final int ISBNB = 7 * 3;
        final int ISBNC = 8;
        final int ISBND = 0 * 3;
        final int ISBNE = 9;
        final int ISBNF = 2*3;
        final int ISBNG = 1;
        final int ISBNH = 4*3;
        final int ISBNI = 1;
        final int ISBNJ = 8*3;
        
        // Variables
        int isbnK;
        int isbnL;
        int isbnM;
        
        //Objects
        Scanner input = new Scanner (System.in);
        
        //Input 
        System.out.println("International Standard Book Number");
        System.out.println("Enter Digit 11:");
        isbnK = input.nextInt();
        System.out.println("Enter Digit 12:");
        isbnL = input.nextInt();
        System.out.println("Enter Digit 13:");
        isbnM = input.nextInt();
        
        //Processing
        isbnL = isbnL*3;
        int sum = ISBNA +
        ISBNB +
        ISBNC +
        ISBND +
        ISBNE +
        ISBNF +
        ISBNG +
        ISBNH +
        ISBNI +
        ISBNJ +
        isbnK +
        isbnL +
        isbnM
         ;
        
        //Output
        System.out.println("You're 1-3 sum is: " + sum);
    }
    
}
