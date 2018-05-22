/*
 * Arielle
 * Wed. Sept. 28, 2016
 * Version 1.0
 * Figuring out area and perimeter of a rectangle
 */
package ca.hdsb.gwss.ainabe.ics3u.u3;

/**
 *
 * @author 1ainabeari
 */
public class AreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        double w = 5;
        double l = 20;
        double area = l * w;
        double perimeter = l * 2 + w * 2;
        
        //Names
        System.out.println("Width of Rectangle = " + w);
        System.out.println("Length of Rectangle = " + l);
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
        
        
    }
    
}
