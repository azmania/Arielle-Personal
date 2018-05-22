/*
 * Arielle
 * Mon. Nov. 28, 2016
 * Version 1.0
 * Going from standard to traditional time.
 */
package ca.hdsb.gwss.ainabe.ics3u.u5.Assignments;

import static ca.hdsb.gwss.ainabe.ics3u.u5.Assignments.NumbersToWords2.sop;
import static ca.hdsb.gwss.ainabe.ics3u.u5.Assignments.NumbersToWords2.sopl;
import java.util.Scanner;

/**
 *
 * @author Arielle
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String time, ans;
       // int resultH, resultM;
        //int m;

        //Input
        do{
        sop("Enter time(hh:mm xx): ");
        time = input.nextLine().replace(" ", "");
        
        //CVonvert to Standard or Traditional
        if (time.substring(time.length() - 2).equalsIgnoreCase("am") || time.substring(time.length() - 2).equalsIgnoreCase("pm")) {
            ans = convertToStandard(time);
            sopl(ans);
        } else {
            ans = convertToTraditional(time);
            sopl(ans);
        }
         
        } while(ans.equals("ERROR INVALID TIME, PLEASE TRY AGAIN."));

    //}
    }

    public static String convertToTraditional(String time) {
        int resultH = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int resultM = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        String resultMS = "";
        String result;
        if (resultM > 59 || resultM < 0 || resultH > 23 || resultH < 1){
            result = "ERROR INVALID TIME, PLEASE TRY AGAIN.";
        }
        else {
        if (resultM < 10) {
            resultMS = "0" + resultM;
        } else if (resultM == 0) {
            resultMS = "00";
        } else {
            resultMS = resultM + "";
        }
        if (resultH > 12) {
            resultH -= 12;
            result = resultH + ":" + resultMS + " pm";
        } else {
            if (resultH == 0){
                resultH = 12;
            }
            result = resultH + ":" + resultMS + " am";
        }
        }
        return result;

    }

    public static String convertToStandard(String time) {
        int resultH = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int resultM = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.indexOf("m") - 2));
        String m = time.substring(time.indexOf("m") - 1);
        String resultMS = "";
        if (resultM > 59 || resultM < 0 || resultH > 23 || resultH < 1){
            return "ERROR INVALID TIME, PLEASE TRY AGAIN.";
        }
        else {
        if (m.equals("pm")) {
            if (resultH == 12){
                resultH = 12;
            }
            else{
            resultH += 12;
            }
        }
        else if (resultH == 12){
            resultH = 0;
        }
        if (resultM < 10 && resultM > 0) {
            resultMS = "0" + resultM;
        } else if (resultM == 0) {
            resultMS = "00";
        }
        }

        return resultH + ":" + resultMS;
    }
}
