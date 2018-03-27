
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1ainabeari
 */
public class Mai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner (System.in);
        // Variables
        int w = 0;
        String n;
        
        //Processing
        while (input.hasNext()){
            n = input.nextLine();
            if (n.equals("W")){
                w += 1;
            }
        }
        
        if (w >= 5){
            System.out.println("1");
        }
        else if (w >= 3){
            System.out.println("2");
        }
        else if (w >= 1){
            System.out.println("3");
        }
        else {
            System.out.println("-1");
        }
    }
    
}
