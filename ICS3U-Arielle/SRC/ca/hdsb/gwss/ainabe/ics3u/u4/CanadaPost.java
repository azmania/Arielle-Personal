/*
 * Arielle
 * Sat. Oct. 22, 2016
 * Version 1.0
 * Calculating cost of mailing letter based on weight in first or second class.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Arielle
 */
public class CanadaPost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Variables
        boolean clas;
        double cost = 0, weight;

        //Output (Intro)
        System.out.println("This program will determine the cost of mailing "
                + "\n a first or second class letter based on mass in grams.");

        //Input
        System.out.print("Enter true for first class and false for second: ");
        clas = input.nextBoolean();
        System.out.print("Enter weight in grams: ");
        weight = input.nextInt();
        
        //First or Second class
        if (weight < 0) {
            System.out.println("ERROR BAD DATA, PLEASE TRY AGAIN");
        } else {
            if (clas == false) {
                if (weight <= 30) {
                    cost = 0.3;
                } else if (weight <= 50) {
                    cost = 0.5;
                } else if (weight <= 100) {
                    cost = 0.6;
                } else {
                    cost = 0.6 + ((weight - 100) / 50 * 0.19);
                }
            } else if (weight <= 30) {
                cost = 0.4;
            } else if (weight <= 50) {
                cost = 0.6;
            } else if (weight <= 100) {
                cost = 0.8;
            } else {
                cost = 0.6 + ((weight - 100) / 50 * 0.29);
            }

            //Output (Price)
            System.out.println("The cost of sending this letter is: " + money.format(cost));
        }

        
    }

}
