
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1ainabeari
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        
        //Variables
        String n = input.nextLine();
        StringTokenizer str = new StringTokenizer(n);

        //Processing
        for (int i = 0; i < n.length(); i++){
            for (int l = 0; l < n.length(); i++){
                if (n.charAt(i).equals(n.charAt(l)+"")){
                    for(int p = l; p < l - i; p--){
                        String pal; 
                        pal.concat(n.charAt(p) + "");
                    
                }
                    
                    if (pal.equals)
            }
        }
    }
    
}
