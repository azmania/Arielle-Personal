/*
 * Arielle
 * Wed. Nov. 16, 2016
 * Version 1.0
 * Varifies SIN.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class SINChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat dec = NumberFormat.getNumberInstance();
        dec.setMaximumFractionDigits(1);

        //Variables
        String sin, a;
        int check = 0;
        int ans, check2;
        double divide;
        

        //Input
        System.out.println("Validating SIN \n");
        System.out.print("Enter SIN: ");
        sin = input.nextLine();

        //Processing
        //Adding
        for (int i = 1; i < 8; i += 2) {
            ans = Integer.parseInt( sin.charAt(i) + "" );
            ans *= 2;
            if (ans > 9){
                a = Integer.toString(ans);
                ans = Integer.parseInt( a.charAt(0) + "" ) + Integer.parseInt( a.charAt(1) + "" );
            }
            check += ans;

        }

        for (int i = 0; i < 7; i += 2) {
            ans = Integer.parseInt( sin.charAt(i) + "" );
            check += ans;
        }
       
        //Subtracting from nearest 10th
       divide = (double) Math.floor(check / 10) + 1.0;
       divide *= 10;
       check = (int) divide - check;

       //Is SIN valid?
       check2 = Integer.parseInt( sin.charAt(8) + "" );
       if (check2 == check){
           System.out.println("Your SIN is valid");
       }
       
       else {
           System.out.println("Your SIN is not vald.");
       }
       
        

    }

}
