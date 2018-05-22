/*
 * Arielle
 * Tues. Dec. 13, 2016
 * Version 1.0
 * Random Numbner assignement with methods and files. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u7;

import static ca.hdsb.gwss.ainabe.ics3u.u6.ArrayUtil.bubbleSort;
import static ca.hdsb.gwss.ainabe.ics3u.u6.ArrayUtil.selectionSort;
import static ca.hdsb.gwss.ainabe.ics3u.u6.Method.displayArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 1ainabeari
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Variables
        int [] data = null;
        int[] data2 = null;
        
        createArray(data, data2);
        //displayArray(data);
        //Sorting
        bubbleSort(data, true);
        selectionSort(data2, true);
        
                
    }
    
    public static void createArray(int[] data, int[] data2) throws FileNotFoundException{
        File file = new File("numbers.txt");
        Scanner input = new Scanner("numbers.txt");
    
        int i = 0;
        while (input.hasNext()) {
            data[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        while (input.hasNext()) {
            data2[i] = Integer.parseInt(input.nextLine()); 
            i++;
        }
        
    }
    
}
