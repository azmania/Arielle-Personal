
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A & J
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner (System.in);
        
        //Variables
        int sum = 0;
        
        StringTokenizer str = new StringTokenizer (input.nextLine());
        //Looping
       
        int[] rows1 = new int[4];
        int[] rows2 = new int[4];  
        int[] rows3 = new int[4];  
        int[] rows4 = new int[4];  
        int i = 0;
            while (str.hasMoreTokens()){
                
                i++;
                rows1[i] += Integer.parseInt(str.nextToken()); 
                sum += rows1[i];
            }
        
            str = new StringTokenizer (input.nextLine());
            int sum2 = 0;
            i = 0;
            while (str.hasMoreTokens()){
                i++;
                rows2[i] = Integer.parseInt(str.nextToken());
                sum2 += rows2[i]; 
            }
            if (sum != sum2){
                System.out.println("not magic");
                
            }
            
            str = new StringTokenizer (input.nextLine());
            int sum3 = 0;
            int j = 0;
            while (str.hasMoreTokens()){
                j++;
                rows3[j] = Integer.parseInt(str.nextToken());
                sum3 += rows3[j]; 
            }
            if (sum != sum3){
                System.out.println("not magic");
                
            }
            
            str = new StringTokenizer (input.nextLine());
            int sum4 = 0;
            i = 0;
            while (str.hasMoreTokens()){
                i++;
                rows4[i] = Integer.parseInt(str.nextToken());
                sum4 += rows4[i]; 
            }
            if (sum != sum4){
                System.out.println("not magic");
                
            }
            int sum5 = 0;
            for (int k = 0; k < rows1.length; k++){
               sum5 = rows1[k] + rows2[k] + rows3[k] + rows4[k];
               if (sum != sum5){
                   System.out.println("not magic");
               }
            }
           
            System.out.println("magic");
    }
    
}
