/*
 * Arielle
 * Wed. Nov. 2, 2016
 * Version 1.0
 * Calculating when lab animals will out grow food supply.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object
        Scanner input = new Scanner(System.in);

        // Variables
        int pop = 10;
        int food = 1000;
        int hour = 1;

        //Output (Info)
        System.out.println("At present there are X animals in a lab and enough food for Y animals. "
                + "\nAt the end of every hour the population doubles, and enough food is added to support 4000 more animals. "
                + "\nDuring any hour, the animals will eat enough food for only themselves. "
                + "\nThis program will determine when the population will outgrow the food supply.");

        //Input
        do {
            System.out.print("Enter start number of animals: ");
            pop = input.nextInt();
            if (pop < 1) {
                System.out.println("Population must be more than zero, please try again.");
            }
        } while (pop < 1);
        do {
            System.out.print("Enter start amount of food: ");
            food = input.nextInt();
            if (food < pop) {
                System.out.println("There must be enough food to support the population at the start."
                        + "\nPlease try again. ");
            }
        } while (food < pop);

        //Output (Table)
        System.out.format("%10s | %20s | %20s | %20s | %20s\n", "Hour", "Animals at Start",
                "Food at Start", "Food at End", "Animals at End");
        //Processing
        while (pop <= food) {
            food -= pop;
            pop *= 2;
            food += 4000;
            System.out.format("%10s | %20s | %20s | %20s | %20s\n", hour, pop / 2,
                    food + pop / 2 - 4000, food, pop);
            hour++;
        }

    }

}
