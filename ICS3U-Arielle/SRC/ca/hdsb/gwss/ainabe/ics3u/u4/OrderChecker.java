/*
* Arielle
 * Fri. Oct. 14, 2016
 * Version 1.0
 * Calculating washers, nuts and bolts (if).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double boltPrice = 0.05;
        final double nutPrice = 0.03;
        final double washerPrice = 0.01;
        
        //Objects
        Scanner input = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //Variables
        int bolts, washers, nuts;
        
        //Input
        System.out.println("How many bolts? ");
        bolts = input.nextInt();
        System.out.println("How many washers? ");
        washers = input.nextInt();
        System.out.println("How many nuts? ");
        nuts = input.nextInt(); 
        
        //Processing
        if (nuts < bolts){
            System.out.println("Check the Order: too few nuts");
        }
        else if (washers <= (2 * bolts)) {
            System.out.println("Check the Order: too few washers");
        }
        else {
            System.out.println("Order OK");
        }
        
        double price = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        
        //Output
        System.out.println("Total Cost: " + money.format (price));
    }
    
}
