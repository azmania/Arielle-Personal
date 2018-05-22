/*
 * Arielle
 * Wed. Nov. 2, 2016
 * Version 1.0
 * Calculating numbers closer to two.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        long d = 1;
        double num = 0;
        long loopcount = 0;
        
        //Output
        System.out.println("This program will demonstrate the result of adding the numbers 1, 1/2, 1/4, 1/8, 1/16, "
                + "\n... and so on getting closer and closer to 2 without becoming 2.");
        
        //Processing
        while (num < 2.0){
            System.out.print(num + " + 1/" + d + " = ");
            num += 1.0/d;
            System.out.println(num);
            d *= 2;
            loopcount++;
        }
        
        //Output (Loop Counter)   
        System.out.println("\nIt took " + loopcount + " times to get to 2.0");
    }
    
}
