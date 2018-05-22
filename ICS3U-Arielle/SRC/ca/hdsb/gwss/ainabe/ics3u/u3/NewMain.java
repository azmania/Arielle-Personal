/*
 * Arielle
 * Thursday September 29,2016.
 * Version 1.0
 * Working with scanner and inputs
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        //Variables
        int age = 16;
        String name; 
        
        //Objects
        /*Scanner input = new Scanner ( System.in );
        
        //Example
        System.out.println ("What is your last name?");
        name = input.nextLine();
        
        System.out.println("Hello " + name);
        
        System.out.println ("What is your age?");
        age = input.nextInt();
        
        System.out.println(name + " is " + age + " years old");
        */
        //Money
        double change = 17.87956857478384;
        NumberFormat currency
                =NumberFormat.getCurrencyInstance();
        
        System.out.println(currency.format(change));
        
        NumberFormat decimal
                =NumberFormat.getNumberInstance();
        //decimal.setMinimumFractionsDigits(3);
        //decimal.setMaximumFractionsDigits();
    }
    
}
