/*
 * Arielle
 * Fri. Dec. 9, 2016
 * Version 1.0
 * Declaring usefiul methods. 
 */
package ca.hdsb.gwss.ainabe.ics3u.u6;

/**
 *
 * @author 1ainabeari
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void sopl(String n){
        System.out.println(n);
    }
    
    public static void sop(String n){
        System.out.print(n);
    }
    
    public static void displayArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
        System.out.println();
    }
    
    public static void displayArray(double[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
        System.out.println();
    }
    
    public static void displayArray(String[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
        System.out.println();
    }
    

    
    public static void swap(int[] data, int x, int y) {
        int z = data[y];
        data[y] = data[x];
        data[x] = z;

    }
    
    public static void swap(double[] data, int x, int y) {
        double z = data[y];
        data[y] = data[x];
        data[x] = z;

    }
    
    public static void swap(String[] data, int x, int y) {
        String z = data[y];
        data[y] = data[x];
        data[x] = z;

    }
    
}
