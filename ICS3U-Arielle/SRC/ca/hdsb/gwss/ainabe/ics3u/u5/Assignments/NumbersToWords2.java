/*
 * Arielle
 * Mon. Nov. 21, 2016
 * Version 1.0
 * Outputs name of number. Also added methods sop and sopl.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5.Assignments;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class NumbersToWords2 {
    static int tens;
    static int ones;
    static int teens;
    static String num;
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner (System.in);
        
        //Input
        sop("Enter number: ");
        num = input.nextLine();
        if (num.length() > 1){
        tens = Integer.parseInt(num.charAt(num.length() - 2)+ "");
        }

        //Output
        num = "1";
        
        if (num.length() > 1){
        tens = Integer.parseInt(num.charAt(num.length() - 2)+ "");
        }
        if (tens == 1){
            if (num.length() < 3){
            System.out.println(
            teens()
            );
            }
            else {
                System.out.println(
                ones(3) + " Hundred " + teens()
                );
            }
            
        }
        else if(num.length() == 2){
            System.out.println(
              tens() + " " + ones(1)
            );
        }
        else if (num.length() == 3){
            System.out.println(
            ones(3) + " Hundred " + tens() + " " + ones(1)
            );
        }
        else {
            System.out.println(
            ones(1)
            );
        }
        int n = Integer.parseInt(num);
        n++;
        num = n + "";
        
        
        
    }
    
    public static String tens(){
        String result = "";
        switch (tens){
            case 1:
                result = teens();
            case 2:
                result = "Twenty";
                break;
            case 3:
                result  = "Thirty";
                break;
            case 4:
                result = "Forty";
                break;
            case 5:
                result =  "Fifty";
                break;
            case 6:
                result =  "Sixty";
                break;
            case 7:
                result =  "Seventy";
                break;
            case 8:
                result =  "Eighty";
                break;
            case 9:
                result =  "Ninety";
                break;
        }
        
        return result;
    }
    
    public static String teens(){
        String result = "";
        teens = Integer.parseInt(num.charAt(num.length() - 1)+ "");
        switch (teens){
            case 0:
                result = "Ten";
                break;
            case 1:
                result = "Eleven";
                break;
                
            case 2:
                result = "Twelve";
                break;
            case 3:
                result  = "Thirteen";
                break;
            case 4:
                result = "Fourteen";
                break;
            case 5:
                result =  "Fifteen";
                break;
            case 6:
                result =  "Sixteen";
                break;
            case 7:
                result =  "Seventeen";
                break;
            case 8:
                result =  "Eighteen";
                break;
            case 9:
                result =  "Nineteen";
                break; 
        }
        return result;
        
    }
    
    public static String ones(int n){
        String result = "";
        ones = Integer.parseInt(num.charAt(num.length() - n)+ "");
        switch (ones){
            case 1:
                result = "One";
                break;
                
            case 2:
                result = "Two";
                break;
            case 3:
                result  = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result =  "Five";
                break;
            case 6:
                result =  "Six";
                break;
            case 7:
                result =  "Seven";
                break;
            case 8:
                result =  "Eight";
                break;
            case 9:
                result =  "Nine";
                break; 
        }
        return result;
    }
    
    public static void sop(String l){
        System.out.print(l);
    }
    
    public static void sopl(String l){
        System.out.println(l);
    }
    
    
}
