/*
 * Arielle
 * Mon. Nov. 14, 2016
 * Version 1.0
 * Prints directions from compass information.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String direction, degrees, start, end;

        //Input
        System.out.println("When entering direction please use this format:"
                + "\n(startdegreesdirection) All directions should be in all caps and degrees must have two digits");
        do{
        System.out.print("Enter Direction: ");
        direction = input.nextLine();
        } while (direction.substring(0, 1).equals("S") && direction.substring(3, 4).equals("N")
                || direction.substring(0, 1).equals("N") && direction.substring(3, 4).equals("S")
                || direction.substring(0, 1).equals("W") && direction.substring(3, 4).equals("E")
                || direction.substring(0, 1).equals("E") && direction.substring(3, 4).equals("W"));

        //Processing
        degrees = direction.substring(1, 3);

        switch (direction.substring(0, 1)) {
            case "S":
                start = "South";
                break;
            case "W":
                start = "West";
                break;
            case "E":
                start = "East";
                break;
            case "N":
                start = "North";
                break;
            default:
                start = "(No Direction inputed, remmeber all CAPS!)";
        }

        switch (direction.substring(3, 4)) {
            case "S":
                end = "South";
                break;
            case "W":
                end = "West";
                break;
            case "E":
                end = "East";
                break;
            case "N":
                end = "North";
                break;
            default:
                end = "(No Direction inputed, remmeber all CAPS!)";
        }
        
        //Output
        System.out.println("Start " + start + " and head " + degrees + " degrees " + end + ".");
    }

}
