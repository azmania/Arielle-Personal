/*
 * Arielle
 * Tues. Nov. 1, 2016
 * Version 1.0
 * Calculating ounces to grams.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

import java.text.NumberFormat;

/**
 *
 * @author 1ainabeari
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        NumberFormat num = NumberFormat.getIntegerInstance();
        num.setMaximumFractionDigits(2);
        // Loop
        System.out.format("%10s %10s\n", "Ounces", "Grams");
        for (int ounces = 0; ounces < 16; ounces++){
            double grams = 28.35 * ounces;
            System.out.format("%10s %10s\n", num.format(ounces), num.format(grams));
        }
    }
    
}
