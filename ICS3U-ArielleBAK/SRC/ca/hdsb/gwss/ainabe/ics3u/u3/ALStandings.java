/*
 * Arielle A.
 * Monday September 26, 2016
 * Version 1.0
 * American League East standings
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class ALStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Teams
       
    /*    System.out.println("Teams           W   L   PCT");
        System.out.println("1. Red Sox     92   64  .590");
        System.out.println("2. Toronto Blue Jays   86   69  .555");
        System.out.println("3. Orioles     85   71  .545");
       */ 
    
        Scanner input = new Scanner (System.in);
        String lSpaces = "%-20s";
    
    
        //Standing table
        System.out.format("%3s | "+lSpaces+ " | %3s| %3s | %4s \n", 
                "#", "Team", "W", "L", "PCT");
        System.out.format("%3s | "+lSpaces+" | %3s| %3s | %4s \n", 
                "1", "Red Sox", "92", "64", ".590");
        System.out.format("%3s | "+lSpaces+" | %3s| %3s | %4s \n", 
                "2", "Toronto Blue Jays", "86", "69", ".555");
        System.out.format("%3s | "+lSpaces+" | %3s| %3s | %4s \n", 
                "3", "Orioles", "85", "71", ".545");
        
    }
    
}
