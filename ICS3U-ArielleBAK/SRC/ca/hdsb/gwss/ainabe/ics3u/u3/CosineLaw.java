/*
 * Arielle
 * Mon. Oct. 10, 2016
 * Version 1.0
 * Cosines Law
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Arielle
 */
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double a; 
        double b;
        double c;
        
        //Objects
        Scanner input = new Scanner (System.in);
        //Input
        System.out.println("Huron's Law, please input variabes:");
        System.out.println("What is side a?");
        a = input.nextDouble(); 
        System.out.println("What is side b?");
        b = input.nextDouble();
        System.out.println("What is angle C?");
        c = input.nextDouble();
        
        //Processing
        double cosC = Math.cos(c);
        double cosinesLaw = 
               Math.sqrt( Math.pow(a,2) * Math.pow(b,2) - 2*a*b*cosC);
        
        //Output
        System.out.println("Length of side c:");
        System.out.println(cosinesLaw);
        
        
        
        
    }
    
}
