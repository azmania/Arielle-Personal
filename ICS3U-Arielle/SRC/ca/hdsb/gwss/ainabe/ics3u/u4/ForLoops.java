/*
 * Arielle
 * Wed. Oct. 26, 2016
 * Version 1.0
 * Learning for loops.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For loops are good for if you know start and end
        /* 
        Java garbage collector collects variables outside the scope once they are out 
        of use.
        It will finish statement then it will run it again untill the second statemnt is false.
        (boolean condition)
        ++ is a post incrimator and will makae value only after command (not in SOP)
        */
        
        for (int x = 0; x < 100 ; x += 2){
            System.out.println(x);
        }
    }
    
}
