/*
 * Arielle
 * Wed. Sept. 28, 2016
 * Version 1.0
 * Playing with math
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

/**
 *
 * @author 1ainabeari
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Declare variables
        int b = 5;
        int a = 4; 
        double abs = Math.abs(b);
        System.out.println("Let b = " + b);
        System.out.println("Let a = " + a);
        
        //Math
        System.out.println("b + a = " + (b + a));
        System.out.println("b * a = " + (b * a));
        System.out.println("b / a = " + (b / a));
        System.out.println("Modulus of b = " + abs);
    }
    
}
