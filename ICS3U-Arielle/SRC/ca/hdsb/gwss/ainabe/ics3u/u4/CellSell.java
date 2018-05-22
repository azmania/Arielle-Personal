/*
 * Arielle
 * Mon. Oct. 17, 2016
 * Version 1.0
 * Determining best cell plan (if).
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class CellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int eveningMin, daytimeMin, weekendMin;
        int planA, planB;

        //Input
        System.out.println("Insert daytime minutes: ");
        daytimeMin = input.nextInt();
        System.out.println("Insert evening minutes: ");
        eveningMin = input.nextByte();
        System.out.println("Insert weekend minutes: ");
        weekendMin = input.nextInt();

        //IF Statements
        if (daytimeMin < 0 || eveningMin < 0 || weekendMin < 0) {
            System.out.println("BAD DATA PLEASE TRY AGAIN");
        } else {
            
            planA = 0;            
            if (daytimeMin > 100) {
                planA = (daytimeMin - 100)*25;
            }             
            planA = planA + eveningMin * 15 + weekendMin * 20;
            
            planB = 0;
            if (daytimeMin > 250) {
                planB = (daytimeMin - 250) * 45; 
            } 
            
            planB = planB + eveningMin * 35 + weekendMin * 25;

            System.out.println("Plan A: " + planA + " cents");
            System.out.println("Plan B: " + planB + " cents");

            if (planB < planA) {
                System.out.println("Plan B is cheaper.");

            } else if (planB > planA) {
                System.out.println("Plan A is cheaper");
            } else {
                System.out.println("Plan A and Plan B are the same price.");
            }
        }
    }

}
