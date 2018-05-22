/*
 * Arielle
 * Tues. Dec. 13, 2016
 * Version 1.0
 * Calculating the arrival time from the departure time and time zone offset. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1ainabeari
 */
public class TimeZones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Objects
        calculateETA();

    }

    public static void calculateETA() throws FileNotFoundException {
        File file = new File("DATA1.txt");
        Scanner input = new Scanner(file);
        
        File file2 = new File("DATA2.txt");
        PrintWriter output = new PrintWriter(file2);
        
        
        while (input.hasNext()){
        StringTokenizer str = new StringTokenizer( input.nextLine(), " ", false);
        String day = " SAME DAY";
        String time = str.nextToken();
        String flightLength = str.nextToken();
        String timeZoneOffset = str.nextToken();
        System.out.println( time );
        System.out.println( flightLength );
        System.out.println( timeZoneOffset );
        
        StringTokenizer st = new StringTokenizer (time, ":", false);
        
        int hour = Integer.parseInt(st.nextToken());
        int flightTime = (Integer.parseInt(flightLength) + hour) + Integer.parseInt(timeZoneOffset); 
        hour = flightTime; 
        
        if (hour < 0){
            hour += 24;
            day = " DAY BEFORE";
        }
        
        else if (hour > 23){
            hour -= 24;
            day = " DAY AFTER";
        }
        String min = st.nextToken();
        String sec = st.nextToken();
        
        
        output.println("ETA: " + hour + ":" + min + ":" + sec + day);
        }
        
        output.close();
        
        
       
        

    }

}
