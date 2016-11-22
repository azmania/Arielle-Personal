
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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "Special Day";
        int month = input.nextInt();
        int day = input.nextInt();

        if (day < 16 && month < 3) {
            System.out.println("Before");
        
        }
        if (day + month > 20) {
            System.out.println("After");
        }

    }

}
