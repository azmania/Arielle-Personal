/*
 * Arielle
 * Fri. Oct. 14, 2016
 * Version 1.0
 * Calculating whether or not you get discounts (if).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double discount = 0.1;
        
        //Objects
        Scanner input = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance ();
        
        // Variables
        double purchases;
        
        //Input
        System.out.println ("Enter amount of purchases: ");
        purchases = input.nextDouble (); 
        
        //Processing
        if (purchases > 10.0) {
            purchases = purchases * 0.9;
           
        }
        
        
        //Output
        System.out.println("Price after discounts: " + money.format (purchases));
    }
    
}
