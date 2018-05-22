/*
 * Arielle
 * Fri. Sept. 30, 2016
 * Version 1.0
 * Days to hours
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class DaysHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constants

        //Variables
        int tothours;
        int hours;
        int days;

        //Objects
        Scanner input = new Scanner(System.in);

//Input
        System.out.println("Hours: ");
        tothours = input.nextInt();

        //Processing
        days = tothours / 24;
        tothours = tothours - (days * 24);
        hours = tothours / 1;
        
        //Output
        System.out.println("That is " + days + " days and " + hours + " hours.");

    }
}