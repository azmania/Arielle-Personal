/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Speed1 {

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
