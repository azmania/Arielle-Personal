/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.ainabe.ics3u.u4;

/**
 *
 * @author 1ainabeari
 */
public class introLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a, b;
        
        System.out.format("%6s %6s |  %6s \n,","A", "B", "A.B");
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",a, b, a&&b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",b, b, a&&b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",a, a, a&&b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",b, a, a&&b);
        
        //OR
        System.out.format("%6s %6s |  %6s \n,","A", "B", "A + B");
        //CASE 2
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",a, b, a||b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",b, b, a||b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s %6s |  %6s \n,",a, a, a||b);
        
        //CASE 1
        a = false;
        b = true;
        System.out.format("%6s | %6s \n,",b, a, a||b);
        
        //NOT
        System.out.format("%6s | %6s\n,","A","!A");
        //CASE 2
        a = false;
        b = true;
        System.out.format("%6s |  %6s\n,",a, !a);
        
        //XOR
        if (a==b) {
        System.out.println(false);
        
        
        
        
    }
        else {
            System.out.println(true);
        }
    
}
}
