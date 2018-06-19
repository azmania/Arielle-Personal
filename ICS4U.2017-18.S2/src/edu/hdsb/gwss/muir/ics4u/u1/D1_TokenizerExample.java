/*
 * CLASS NOTES EXAMPLE
 */
package edu.hdsb.gwss.muir.ics4u.u1;

import java.util.StringTokenizer;
import javax.print.DocFlavor;

/**
 * String Tokenizer Example(s)
 *
 * @author Wm.Muir
 * @version 2017-18.S2
 */
public class D1_TokenizerExample {

    public static void main(String[] args) {
        
        String birthDate, currentDate;
        String birthYear, birthMonth, birthDay;
        String currentYear, currentMonth, currentDay;
        String s = "01-02-2000 02-09-2018";
        
        StringTokenizer st = new StringTokenizer( s );
        
        birthDate = st.nextToken();
        currentDate = st.nextToken();
        
        // BIRTH DATE
        st = new StringTokenizer( birthDate, "-" );
        birthMonth = st.nextToken();
        birthDay = st.nextToken();
        birthYear = st.nextToken();
        
        // CURRENT DATE
        st = new StringTokenizer( currentDate, "-" );
        currentMonth = st.nextToken();
        currentDay = st.nextToken();
        currentYear = st.nextToken();
        
        // YEARS
        System.out.println( birthYear + " " + currentYear );

        
        // HOW MANY TOKENS?
        s = "1 2 3 4 5 6 7 .. 100";
        st = new StringTokenizer( s, " " );
        
        while( st.hasMoreTokens() ) {
            System.out.println( st.nextToken() );
        }
        
    }

}
