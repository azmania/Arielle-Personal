/*
 * Arielle
 * Wed. Nov. 2, 2016
 * Version 1.0
 * Fibonacci Series in (first 20 terms).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int a = 1;
        int b = 0;
        
        //Output (Info)
        System.out.println("This program will print the first twenty terms of the Fibonacci series:\n");
        
        //Processing
        for (int term = 0; term < 20; term++){
            int num = a + b;
            System.out.print(num + ", ");
            a = b; 
            b = num ;
          
            
        }
    }
    
}
