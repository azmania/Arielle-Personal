/*
 * Arielle
 * Wed. Nov. 2, 2016
 * Version 1.0
 * Calculating erosion for Canada till land is not suitable to grow.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double topsoil = 30;
        int years = 0;
        
        //Processing
        while (topsoil > 9){
            topsoil = topsoil - (topsoil*0.01) + 0.005;
            years ++;
        }
        
        //Output
        System.out.println("Careless land management causes approximately 1 percent of the topsoil to erode each year. "
                + "\nIt is then lost forever, since it takes nature approximately 500 years to produce 2.5 cm of topsoil. "
                + "\nAt 9 cm the topsoil is so shallow that crops cannot be grown on a large scale. "
                + "\nIf Canada has about 30 cm of topsoil, how many years will it take for the depth to be reduced to 9 cm?\n");
        System.out.println("It takes " + years + " years for the soil to erode, "
                + "to a depth at which crops can't grow.");
    }
    
}
