/*
 * Arielle
 * Mon. Oct. 17, 2016
 * Version 1.0
 * Determining type of Alien (if).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner (System.in);
        
        //Variables
        int antenna, eyes;
        
        //Input
        System.out.println ("Enter number of antenna: ");
        antenna = input.nextInt();
        System.out.println ("Enter number of eyes: ");
        eyes = input.nextInt();
        System.out.println("Potential Suspects: ");
        
        //Processing
        if (antenna < 0 || eyes < 0 ) {
            System.out.println("BAD DATA PLEASE TRY AGAIN");
        }
        else if (antenna >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (antenna <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antenna <= 2 && eyes <= 3){
            System.out.println("GraemeMercurian");
        }
        else {
            System.out.println("There are no potential suspects");
        }
    }
    
}
