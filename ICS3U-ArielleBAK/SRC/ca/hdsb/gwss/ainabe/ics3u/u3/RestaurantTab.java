/*
 * Arielle
 * Wed. Sept. 28, 2016
 * Version 1.0
 * Figuring out price of meal with hst
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.text.NumberFormat;

/**
 *
 * @author 1ainabeari
 */
public class RestaurantTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        NumberFormat currency
                =NumberFormat.getCurrencyInstance();
        double apt = 5.99;
        double ent = 10.99;
        double dess = 7.99;
        double stot = apt + ent + dess;
        double tot = stot * 1.13;
        String tot2 = currency.format(tot);
        
        //Bill
        System.out.println("Bill");
        System.out.println("Appetizer: $" + apt);
        System.out.println("Entree: $" + ent);
        System.out.println("Dessert: $" + dess);
        System.out.println("Subtotal: $" + stot);
        System.out.println("Total: " + tot2);
        
    }
    
}
