/*
 * Arielle
 * Sun. Oct. 22, 2016
 * Version 1.0
 * Displaying information on acid rain and determining safe pH levels for fish.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        // Variables
        double pH;

        //Output Information
        System.out.println("ACID RAIN");
        System.out.println("Acid rain is a danger for ecosystems, they can kill the wildlife living in them.\n "
                + "This program will determine if the pH level entered for water is safe for fish to live in. ");

        //Input
        System.out.print("Enter pH level: ");
        pH = input.nextDouble();

        //Processing
        if (pH < 0 || pH > 14) {
            System.out.println("ERROR BAD DATA, PLEASE TRY AGAIN.");
            System.out.println("Remember pH is on a scale from 0 - 14 (inclusive)");
        } else if (pH > 7.45) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH < 6.45) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        }
    }

}
