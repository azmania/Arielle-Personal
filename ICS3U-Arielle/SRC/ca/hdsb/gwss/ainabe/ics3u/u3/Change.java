/*
 * Arielle
 * Wed. Sept. 28, 2016
 * Version 1.0
 * Figuring out minimal amount of change for a value in cents
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

/**
 *
 * @author 1ainabeari
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int cents = 178;
        int q = cents/25;
        cents = cents - (q * 25);
        int d = cents/10;
    //it also helps to use % for things like doubles where the int rule wont work.No remainder
        cents = cents - (d * 10);
        int n = cents/5;
        cents = cents - (n * 5); 
        int p = cents;
        
        int change = q + d + n + p;
        
        //Output
        System.out.println("Value of Change in Cents: " + cents);
        System.out.println("Least Number of Coins Needed: " + change);
        System.out.println("Quarters: " + q);
        System.out.println("Dimes: " + d);
        System.out.println("Nickels: " + n);
        System.out.println("Pennies: " + p);
        
    }
    
}
