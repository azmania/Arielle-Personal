/*
 * Arielle
 * Wed. Nov. 16, 2016
 * Version 1.0
 * Calculates speed.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Arielle
 */
public class Speed {

    static double distance;
    static double time;
    static double calc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Enter distance (metres): ");
        distance = input.nextDouble();
        System.out.print("Enter time (Seconds): ");
        time = input.nextDouble();

        calculations();

        //Output
        System.out.println("Speed: " + calculations() + " metres per second.");

    }

    public static double calculations() {

        calc = distance / time;
        return calc;
    }

}
