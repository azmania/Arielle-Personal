/*
 * Arielle
 * Thurs. Nov. 17, 2016
 * Version 1.0
 * Story.
 */
package Random;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Story {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner (System.in);
        
        //Variables
        //Character
        String name, mom, dad, bro;
        boolean redo;
        
        //Setting 
        
        
        //Intro: Info
        do{
        System.out.println("Welcome to YOUR Story \n"
                + "Please enter the following character info.\n");
        
        System.out.print("What is your name?: ");
        name = input.nextLine();
        System.out.print("What is the name of your Mother?: ");
        mom = input.nextLine();
        System.out.print("What is the name of your Father?: ");
        dad = input.nextLine();
        System.out.print("What is the name of your brother?: ");
        bro = input.nextLine();
        
        System.out.println("\nInformation: ");
        System.out.println("Mother's name: " + mom);
        System.out.println("Father's name: " + dad);
        System.out.println("Brother's name: " + bro);
        
        System.out.println("\nDo you want to continue? "
                + "\n(type true to continue and false to alter information) ");
        redo = input.nextBoolean();
        
        } while(redo == false);
        
        //Setting 
        
        do{
            System.out.println("Now time for some setting info! \n"
                    + "Please enter the corresponding letter the description you want.");
            
            System.out.println("(1) You live in a chic condo in downtown Toronto."
                    + "\nYour family is doing well financially and you go to a "
                    + "\nspecialized school where you are struggling to keep your grades up."
                    + "\nYou have a close group of friends who are always have your back.");
            
            System.out.println("(2) You live in an apartement in which your family is struggling");
            
        } while (1 == 2);
        
    }
    
}
