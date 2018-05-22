/*
 * Arielle
 * Tues. Oct. 25, 2016
 * Version 1.0
 * Calculating sum, difference, quotient and product from two variables.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class SwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);
        NumberFormat num = NumberFormat.getIntegerInstance();
        num.setMaximumFractionDigits(2);

        // Variables 
        double x, y;
        int operator;

        //Output (Info)
        System.out.println("CALCULATOR:"
                + "\nThis program will calculate the "
                + "sum, quotient, product and difference of two values.");
        System.out.println("Enter 1 for addition,"
                + "\n2 for subtraction,"
                + "\n3 for division,"
                + "\n4 for multiplication"
                + "\nand 5 to end program.");
        //Input
        System.out.print("Enter x value: ");
        x = input.nextDouble();
        System.out.print("Enter y value: ");
        y = input.nextDouble();
        System.out.print("Enter operator number (1-5): ");
        operator = input.nextInt();

        //Processing
        switch (operator) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(Math.abs(x - y));
                break;
            case 3:
                System.out.println(num.format(x / y));
                break;
            case 4:
                System.out.println(num.format(x * y));
                break;
            case 5:
                break;
            default:
                System.out.println("ERROR BAD DATA, PLEASE TRY AGAIN.");

        }
    }

}
