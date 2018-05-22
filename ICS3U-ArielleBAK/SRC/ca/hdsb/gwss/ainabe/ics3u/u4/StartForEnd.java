/*
 * Arielle
 * Wed. Oct. 26, 2016
 * Version 1.0
 * Ask for start and end and print number in between (inclusive).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class StartForEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner (System.in);
        
        //Variables
        int start, end;
        
        //Input
        System.out.print("Enter Start Integer: ");
        start = input.nextInt();
        System.out.print("Enter End Integer: ");
        end = input.nextInt();
        
        //Processing 
        if (start < 0 || end < 0) {
            System.out.println("ERROR BAD DATA, PLEASE TRY AGAIN");
        }
        else{
        if (start > end){
            for (int i = end; i >= start; i -= 1 ){
                System.out.println(i);
            }
        }
        else {
            for ( int i = start; i <=end; i++){
                System.out.println(i);
            }
        }
        }
        
    }
    
}
