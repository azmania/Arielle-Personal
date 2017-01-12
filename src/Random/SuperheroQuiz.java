/*
 * Arielle
 * Mon. Dec. 19, 2016
 * Version 1.0
 * Which hero are you?. 
 */
package Random;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class SuperheroQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        
        //Variables 
        //characters
        int storm = 0;
        int msmarvel = 0;
        int wonderwoman = 0;
        
        //choosing
        int choice = 0; 
        
        //Input
        sopl("Which Super Hero Are You??");
        sopl("\n\n\n Ready? (Press Enter)");
        input.nextLine();
        sopl("1. Female(1) or Male(2)? Or Both(3)?");
        choice += input.nextInt();
        switch(choice){
            case 1:
                storm += 1;
                msmarvel += 1;
                wonderwoman += 1;
                break;
            case 2:
                break;
            case 3:
                storm += 1;
                msmarvel += 1;
                wonderwoman += 1;
                break;
            default:
                
        }
        
    }
    
    public static void sopl(String n){
        System.out.println(n);
    }
    
}
