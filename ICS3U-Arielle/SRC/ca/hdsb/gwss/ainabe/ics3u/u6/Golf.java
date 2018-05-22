/*
 * Arielle
 * Thurs. Dec. 1, 2016
 * Version 1.0
 * Prints golf scores from an array. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u6;

import static ca.hdsb.gwss.ainabe.ics3u.u5.Assignments.NumbersToWords2.sopl;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables 
        int[] golf = new int[18];
        int ans = 0;

        //Input
        for (int i = 0; i < 18; i++) {
            System.out.print("Enter hole " + (i + 1) + ": ");
            golf[i] = input.nextInt();
        }

        for (int i = 0; i < 18; i++) {
            System.out.print("Hole " + (i + 1) + ": ");
            sopl(golf[i] + "");
        }
        sopl("Total score: " + addArray(golf));
        System.out.println("Highest score: " + ans);

    }

    public static int addArray(int data[]) {
        int ans = 0;
        for (int i = 0; i < data.length; i++) {
            ans += data[i];
        }
        return ans;
    }
    
    public static int getMax(int data[]){
        int checker = data.length; 
        int max = 0;
        for (int pass = 0; pass < data.length - 1; pass++) {
            checker--;
            int c;
            for (c = 0; c < checker; c++) {

                if (data[c] > data[max]) {
                    max = c;
                }

            }
        }
        
        return max; 
    }

}
