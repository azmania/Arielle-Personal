/*
 * Arielle
 * Sat. Oct. 22, 2016
 * Version 1.0
 * Determining if the shape is a triangle based on lengthof sides entered.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner (System.in);
        //Variables
        double side1, side2, side3;
        boolean triangle;
        
        //Output Information
        System.out.println("A triangle can be determined from the length of the sides. "
                + "\nA triangle must have the sum of two side lengths greater than the third side.");
        
        //Input
        System.out.print("Enter side 1: ");
        side1 = input.nextDouble();
        System.out.print("Enter side 2: ");
        side2 = input.nextDouble();
        System.out.print("Enter side 3: ");
        side3 = input.nextDouble();
        
        //Processing (if statements)
        triangle = false;
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("ERROR BAD DATA, TRY AGAIN.");
        }
        else {
            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2 ) {
                triangle = true;
            }
        }
        
        //Output (results)
        System.out.println("Is it a triangle?");
        System.out.println(triangle);
        
        //Variables
        boolean right = false;
        //Output
        System.out.println("All right triangles follow pythagorean theorem (a^2 + b^2 = c^2)."
                + "\nUsing that theorum, this program will determine whether the sides you have entered make a right triangle.");
        
        //Processing
        if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
                || Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)
                || Math.pow(side3, 2) + Math.pow(side1, 2) == Math.pow(side2, 2)){
            right = true;
        }
        
        //Output
        System.out.println("Does your triangle have a right angle? ");
        System.out.println(right);
        
    }
    
}
