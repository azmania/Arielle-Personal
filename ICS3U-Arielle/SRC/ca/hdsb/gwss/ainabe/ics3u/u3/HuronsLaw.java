/*
 * Arielle
 * Thurs. Sept. 29, 2016
 * Version 1.1
 * HUron's Law
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class HuronsLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CONSTANTS
        //Variables
        double a;
        double b;
        double c;
        double s, huron, area;

        //Objects
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.println("What is Side a?");
         a = input.nextDouble();
        System.out.println("What is Side b?");
        b = input.nextDouble();
        System.out.println("What is Side c?");
        c = input.nextDouble();

        // PROCESSING
        s = a + b + c / 2;
        huron = s * (s - a) * (s - b) * (s - c);
        area = Math.sqrt(huron);
        
        //OUTPUT
        //Example
        System.out.println("Here is the area of your triangle:");
        System.out.println("Area = " + area);
    }

}
