/*
* Arielle
 * Mon. Oct. 10, 2016
 * Version 1.0
 * Calculating cost of banquet hall
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * ME
 * @author Arielle
 */
public class hallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double hall = 350; 
        
        //Variables 
        String name;
        int numGuest;
        double pricepp = 20;
        
        //Objects
        Scanner input = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        
        //Input
        System.out.println("Welcome to Arielle's Dining Hall, What is your name?");
        name = input.nextLine();
        System.out.println("Hello " + name + ", what is the cost per person?");
        pricepp = input.nextDouble( );
        System.out.println("Excellent, now how many guest will be attending?");
        numGuest = input.nextInt();
        
        //Processing
        double totCost = numGuest*pricepp + hall;
        
        //Output
        System.out.println("Thankyou for your participation, your total cost for the evening is:");
        System.out.println (money.format(totCost));
        System.out.println("Have a nice day!");
    }
    
}
