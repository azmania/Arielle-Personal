/*
 * Arielle
 * Thurs. Sept. 29, 2016
 * Version 1.0
 * finding out digits
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

/**
 *
 * @author 1ainabeari
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables
        int ones = 1;
        int tens = 10;
        tens = tens / 10;
        int hund = 300;
        hund = hund / 100;
        int thous = 4000;
        thous = thous / 1000;
        String num = "Enter a four digit number: " + thous + hund + tens + ones;
        
        /* Another method
        * int x = 123;
        * ones: x % 10
        * tens: (x/10) % 10
        * hundreds (x/100) % 10
        */
        
        //Output
        System.out.println(num);
        System.out.println("Ones: " + ones);
        System.out.println("Tens: " + tens);
        System.out.println("Hundreds: " + hund);
        System.out.println("Thousand: " + thous);

    }

}
