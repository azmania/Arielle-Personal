/*
 * Arielle
 * Mon. Nov. 14, 2016
 * Version 1.0
 * Counting vowels.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class VowelCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String text;
        int vowels = 0;

        String answer;

        //Input
        System.out.print("Enter Sentence: ");
        text = input.nextLine();

        //Processing
        for (int i = 0; i < text.length(); i++) {

            answer = text.substring(i, i + 1);

            switch (answer) {
                case "a":
                case "A":  
                case "e":
                case "E":
                case "i":
                case "I":                  
                case "o":
                case "O":
                case "U":
                case "u":
                    vowels++;
                    break;

            }
        }

        //Output
        System.out.println("Vowels: " + vowels);
    }

}
