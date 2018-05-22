/*
 * Arielle
 * Thurs. Dec. 14, 2016
 * Version 1.0
 * Testing Methods dealing with arrays (Sorting, searching, max, min, testing, etc.). 
 */
package ca.hdsb.gwss.ainabe.ics3u.u6;

/**
 *
 * @author 1ainabeari
 */
public class ArrayUtilTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int[] data = {2, 4};
        testFindMax(data);
        testFindMin(data);
        testGetAvg(data);
        testLinearSearch(data);
        testSelectionSort(data);
        testBinarySearch(data);
        testLinearSearch(data);
        testSum(data); 

       
    }

    public static void testFindMax(int[] data) {
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: findMax");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers.");
        Method.sopl("Post Condition: The value of the index found is larger than all other values in the array.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index of max data): ");
        Method.sopl("" + ArrayUtil.findMax(data));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            assert (data[i] <= data[ArrayUtil.findMax(data)]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testFindMin(int[] data) {
        //Variables
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case : findMin");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers.");
        Method.sopl("Post Condition: The value of the index found is smaller than all other values in the array.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index of max data): ");
        Method.sopl("" + ArrayUtil.findMin(data));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            assert (data[i] >= data[ArrayUtil.findMin(data)]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testGetAvg(int[] data) {
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: getAvg");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers.");
        Method.sopl("Post Condition: The integer generated is the sum of all the values of each index, divided by the number of indecies.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nMean Data: ");
        Method.sopl("" + ArrayUtil.getAvg(data));

        //Confirm (Test)
        assert (ArrayUtil.getAvg(data) == ArrayUtil.sum(data) / data.length);

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }
    
    public static void testSum (int[] data){
        //Variables
        boolean passedTest = true;
        int sum;

        //Display conditions
        Method.sopl("Test Case : sum");
        Method.sopl("Pre Conditions (for test): An array with integers in arithmatic sequence with an even data length.");
        Method.sopl("Post Condition: The value of returned number is equal to the sum of the values of all the indecies.\n");

        //Display Data
        Method.sop("Data: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (sum): ");
        Method.sopl("" + ArrayUtil.sum(data));

        //Confirm (Test)
        
        sum = (data.length / 2) * (data[0] + data[data.length - 1 ]);
        assert (sum == ArrayUtil.sum(data));

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testLinearSearch(int[] data) {
        //Variables       
        boolean passedTest = true;
        int sV = 0;

        //Display conditions
        Method.sopl("Test Case: linearSearch");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers.");
        Method.sopl("Post Condition: The value of the index found is equal to search value.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index of 0): ");
        Method.sopl("" + ArrayUtil.linearSearch(data, sV));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            sV = data[i];
            assert (data[i] == data[ArrayUtil.linearSearch(data, sV)]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testBinarySearch(int[] data) {
        //Variables       
        boolean passedTest = true;
        int sV = 0;

        //Display conditions
        Method.sopl("Test Case: binarSearch");
        Method.sopl("Pre Conditions: Sorted array with positive and negative integers.");
        Method.sopl("Post Condition: The value of the index found is equal to search value.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index 0): ");
        Method.sopl("" + ArrayUtil.binarySearch(data, sV));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            sV = data[i];
            assert (data[i] == data[ArrayUtil.binarySearch(data, sV)]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testSelectionSort(int[] data) {
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: selectionSort\n");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers\n.");
        Method.sopl("Post Condition: If the boolean argument in the second parameter is true then the"
                + "\nvalue of the first index must be less than or equal to the value of any other index."
                + "\nAlso the value of the last index must be greater than the value of any other index."
                + "\nAnd vice versa for false (descending order).\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (ascending order): ");
        ArrayUtil.selectionSort(data, true);
        //Test ascending
        for (int i = 0; i < data.length; i++) {
            assert (data[i] >= data[0]);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i] <= data[data.length - 1]);
        }
        //Sort data (descending)
        Method.sop("\nData After (descending order): ");
        ArrayUtil.selectionSort(data, false);

        //Test descending
        for (int i = 0; i < data.length; i++) {
            assert (data[i] <= data[0]);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i] >= data[data.length - 1]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

    public static void testBubbleSort(int[] data) {
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: bubbleSort\n");
        Method.sopl("Pre Conditions: Unsorted array with positive and negative integers\n.");
        Method.sopl("Post Condition: If the boolean argument in the second parameter is true then the"
                + "\nvalue of the first index must be less than or equal to the value of any other index."
                + "\nAlso the value of the last index must be greater than the value of any other index."
                + "\nAnd vice versa for false (descending order).\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (ascending order): ");
        ArrayUtil.bubbleSort(data, true);
        //Test ascending
        for (int i = 0; i < data.length; i++) {
            assert (data[i] >= data[0]);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i] <= data[data.length - 1]);
        }
        //Sort data (descending)
        Method.sop("\nData After (descending order): ");
        ArrayUtil.bubbleSort(data, false);

        //Test descending
        for (int i = 0; i < data.length; i++) {
            assert (data[i] <= data[0]);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i] >= data[data.length - 1]);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }
    
    public static void testBinarySearch(String[] data){
        //Variables       
        boolean passedTest = true;
        String sV = "A";

        //Display conditions
        Method.sopl("Test Case: binarSearch");
        Method.sopl("Pre Conditions: Sorted array with positive and negative Strings.");
        Method.sopl("Post Condition: The value of the index found is equal to search value.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index of A): ");
        Method.sopl("" + ArrayUtil.binarySearch(data, sV));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            sV = data[i];
            assert( i == ArrayUtil.binarySearch(data, sV) );
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }
    
    public static void testLinearSearch(String[] data){
        //Variables       
        boolean passedTest = true;
        String sV = "A";

        //Display conditions
        Method.sopl("Test Case: linearSearch");
        Method.sopl("Pre Conditions: Unsorted array with Strings.");
        Method.sopl("Post Condition: The value of the index found is equal to search value.\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (Index of A): ");
        Method.sopl("" + ArrayUtil.linearSearch(data, sV));

        //Confirm (Test)
        for (int i = 0; i < data.length; i++) {
            sV = data[i];
            assert (data[i].equalsIgnoreCase(data[ArrayUtil.linearSearch(data, sV)]));
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }
    
    public static void testSelectionSort (String[] data){
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: selectionSort\n");
        Method.sopl("Pre Conditions: Unsorted array with Strings.\n");
        Method.sopl("Post Condition: If the boolean argument in the second parameter is true then the"
                + "\nvalue of the first index must be less than or equal to the value of any other index."
                + "\nAlso the value of the last index must be greater than the value of any other index."
                + "\nAnd vice versa for false (descending order).\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (ascending order): ");
        ArrayUtil.selectionSort(data, true);
        //Test ascending
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[0]) <= 0); //data[i] >= data[0]
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[data.length - 1]) >= 0);
        }
        //Sort data (descending)
        Method.sop("\nData After (descending order): ");
        ArrayUtil.selectionSort(data, false);

        //Test descending
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[0]) >= 0);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[data.length - 1]) <= 0);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }
    
    public static void testBubbleSort (String[] data){
        //Variables       
        boolean passedTest = true;

        //Display conditions
        Method.sopl("Test Case: bubbleSort\n");
        Method.sopl("Pre Conditions: Unsorted array with Strings.\n");
        Method.sopl("Post Condition: If the boolean argument in the second parameter is true then the"
                + "\nvalue of the first index must be less than or equal to the value of any other index."
                + "\nAlso the value of the last index must be greater than the value of any other index."
                + "\nAnd vice versa for false (descending order).\n");

        //Display Data
        Method.sop("Data Before: ");
        Method.displayArray(data);

        //Sort Data
        Method.sop("\nData After (ascending order): ");
        ArrayUtil.bubbleSort(data, true);
        //Test ascending
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[0]) <= 0); //data[i] >= data[0]
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[data.length - 1]) >= 0);
        }
        //Sort data (descending)
        Method.sop("\nData After (descending order): ");
        ArrayUtil.bubbleSort(data, false);

        //Test descending
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[0]) >= 0);
        }
        for (int i = 0; i < data.length; i++) {
            assert (data[i].compareTo(data[data.length - 1]) <= 0);
        }

        //Output Results
        Method.sopl("\nDoes the method work? " + passedTest);
    }

}
