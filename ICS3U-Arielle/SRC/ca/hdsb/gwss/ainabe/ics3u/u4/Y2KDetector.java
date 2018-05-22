/*
 * Arielle
 * Mon. Oct. 17, 2016
 * Version 1.0
 * Calculating ags with years represented in 2 digits (if).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner (System.in);

        // Variables
        int currentYear, birthYear, age;
        //Input
        System.out.println("Insert Year of Birth: ");
        birthYear = input.nextInt(); 
        System.out.println("Insert Current Year: ");
        currentYear  = input.nextInt();
        
        //Processing
        age = 0;
        if (birthYear < 0 || birthYear > 100 || 
                currentYear < 0 || currentYear > 100){
            System.out.println("BAD DATA PLEASE TRY AGAIN");
        }
        else if (birthYear <= currentYear){
            age = currentYear - birthYear;
        }
        else {
            age = (currentYear + 2000)- (birthYear + 1900);
        }
        
        //Output
        System.out.println("Year of birth: " + birthYear);
        System.out.println("Current Year: " + currentYear);
        System.out.println("Age: " + age);
    }
    
}
