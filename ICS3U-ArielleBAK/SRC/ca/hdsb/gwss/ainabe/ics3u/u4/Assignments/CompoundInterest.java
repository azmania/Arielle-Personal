/*
 * Arielle
 * Wed. Nov. 2, 2016
 * Version 1.0
 * Calculating interest and total amount of money each year.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Variables
        double interest, investment;
        int years;

        //Output
        System.out.println("This program will output a title table\n"
                + "displaying yearly investemnts of up to 15 years.");
        
        //Processing
        do {
            System.out.print("Enter the yearly investment: ");
            investment = input.nextDouble();

            if (investment <= 0.01){
                System.out.println("Investments must be atleast $0.01.\n"
                        + "Please try again.");
            }
            
        } while (investment <= 0.01);
        do{
        System.out.print("Enter the interest: ");
        interest = input.nextDouble();
         if (interest < 0.00001 || interest > 100){
             System.out.println("Investemnts must be atleast 0.00001% and no higher than 100%.\n"
                     + "Please try again.");
         }
        } while (interest < 0.00001 || interest > 100);
        do{
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        if (years < 1){
            System.out.println("Number of years must be atleast 1.\n"
                    + "Please try again.");
        }
        } while (years < 1);
        
        //Output (table) 
        System.out.format("%5s %20s %10s %20s\n","Years","Amount in Account", "Interest", "Total");
        //Loops
        int num = 0;
        if (years >15){
           num = 15;
        }
        else {
           num = years;
        }
        for (years = 1;years <= num; years++){
            double amount = investment;
            interest = interest/100 * amount;
            double total = amount + interest; 
            investment = total + investment;
            System.out.format("%5s %20s %10s %20s\n", years, money.format(amount), money.format(interest), money.format(total));
            
        }
    }

}
