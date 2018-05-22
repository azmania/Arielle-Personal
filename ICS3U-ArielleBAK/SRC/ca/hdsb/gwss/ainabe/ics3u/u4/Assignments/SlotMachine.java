/*
 * Arielle
 * Wed. Nov. 9, 2016
 * Version 1.0
 * Creating a slot machine game.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4.Assignments;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);

        //Local Variables
        int play;
        int ran1, ran2, ran3, tokens;
        int count = 0;
        boolean me = false;
        int tokensWon;

        //Loop
        do {
            //Start tokens
            tokens = 10;

            //Output (Info)
            System.out.println("Slot machine game: "
                    + "\nYou will be given 50 tokens to start,"
                    + "\nClick 1 to spin the wheel."
                    + "\nIf you get all 1s you get 4 tokens,"
                    + "\nAll 2s 6 tokens,"
                    + "\nAll 3s 8 tokens"
                    + "\nAnd all 4s 10 tokens."
                    + "\nEach spin costs 1 token.\n");

            //Input (Start Game)
            do {
                System.out.println("Ready? (Click 1 to start)");
                play = input.nextInt();
                if (play != 1) {
                    System.out.println("Please press 1 to start");
                }
            } while (play != 1);

            do {
                //Variables
                ran1 = (int) (Math.random() * 4) + 1;
                ran2 = (int) (Math.random() * 4) + 1;
                ran3 = (int) (Math.random() * 4) + 1;
                //Slots
                System.out.println(ran1 + " " + ran2 + " " + ran3);

                //Attempts
                count++;
                System.out.println("Attempts: " + count);
                
                //Processing (Winnings)
                if (ran1 != ran2 || ran2 != ran3) {
                    tokens -= 1;
                    System.out.println("Sorry you lose."
                            + "\nTokens: " + tokens);
                } else {
                    switch (ran1) {
                        case 1:
                            tokens += 3;
                            break;
                        case 2:
                            tokens += 5;
                            break;
                        case 3:
                            tokens += 7;
                            break;
                        case 4:
                            tokens += 9;
                            break;

                    }
                    tokensWon = ran1 * 2 + 2;
                    System.out.println("********************************************");
                    System.out.println("********************************************");
                    System.out.println("***             YOU WON                  ***");
                    System.out.println("********************************************");
                    System.out.println("********************************************");
                    System.out.println("Congrats, you won " + tokensWon + " tokens!"
                            + "\nYou now have " + tokens + " tokens.");

                }
                

                //Output (End?)
                
                if (tokens < 1) {
                    System.out.println("GAME OVER. Unless you are Arielle you can continue with negative tokens."
                                + "\nAre you Arielle?");
                        me = input.nextBoolean();
                        if (me == true){
                            play = 1;
                        }
                        else{
                    do{
                       
                        System.out.println("Insufficient tokens for next round. Press 3 to restart and 2 to end.");
                        play = input.nextInt();
                
                        if (play != 3 || play != 2) {
                            System.out.println("Please select one of the options");
                        }
                        
                    
                    } while (play != 3 && play != 2);
                }
            
                } else {
                    System.out.println("Good game! Press 1 to play again, 2 to finish or 3 to restart.");

                    do {
                        play = input.nextInt();
                        if (play < 1 || play > 3) {
                            System.out.println("Please select one of the options.");
                        }
                    } while (play < 1 || play > 3);
                }
                
            } while (play == 1);
        } while (play == 3);
        
        //Goodbye
        if (play == 2) {
            System.out.println("Thanks for playing! See you soon."
                    + "\n(づ｡◕‿‿◕｡)づ");
        }

    }

}
