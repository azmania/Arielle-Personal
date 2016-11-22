
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
public class SpecialDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Scanner
        Scanner input = new Scanner(System.in);

        int[]  values = {1,2,3,5};
        
        
        boolean finished = true;
        int month = 5;
        int day =13;
        
        
        if (month < 3){
            System.out.println("before");
        }
        if (month > 3){
            System.out.println("after");
        }
       
    }

}
