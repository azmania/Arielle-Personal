/*
 * Arielle
 * Wed. Oct. 26, 2016
 * Version 1.0
 * Caculating Moose herd.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class MooseHerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int t;
        double n = 0;
        
        //Processing
        
        for (t = 0;t < 26 && n < 81; t++){
            double pow = Math.pow(0.83, t);
            n = (int) (220 / ( 1 + 10 * pow));
            System.out.println(n);
        }
        System.out.println("Years: " + t);
        
    }
    
}
