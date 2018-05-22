/*
 * Arielle
 * Mon. Nov. 28, 2016
 * Version 1.0
 * Prints directions from compass information.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5.Assignments;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input =  new Scanner (System.in);
        
        //Variables
        String text, answer;
        
        //Input
        System.out.println("Palindrome Checker!");
        System.out.print("Enter word: ");
        text = input.nextLine();
        
        //Processing
        answer = text;
       for (int i = 0; i < text.length() - 1; i++ ){
            answer = answer.substring (0, i) + answer.charAt(text.length() - 1) + answer.substring(i, answer.length() - 1);
        }
       //Output
       System.out.println(text + " backwards is " + answer);
       if (answer.equalsIgnoreCase(text)){
           System.out.println(text + " is a palindrome.");
       }
       else {
           System.out.println(text + " is not a palindrome.");
       }
       
    }
    
}
