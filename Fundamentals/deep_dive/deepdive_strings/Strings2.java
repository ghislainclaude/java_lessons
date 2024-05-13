import java.util.StringTokenizer;
import java.lang.*;
import java.util.*;

public class Strings2 {
	public static void main(String[] args ) {
		String line = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n";
        // Split the string into a 2d array
        String newLine[][] = splitLine(line);
        // Covert the string array of numnber too integer 
        int[][] array = ConvertNumberStrings(splitLine(line));
		// Print the array before sorting 
		print2dArray("Array before sorted in order: ", array);
        // for each 1d array in the 2 array sort the 1d array 
        for (int[] tabl: array) {
        	quicksort_asc(tabl, 0, tabl.length -1);
        }
		// Print the sorted contents of the array.
		print2dArray("Array sorted in ascending order: ", array);
		// sort it in descending order
		// for each 1d array in the 2 array sort the 1d array 
        for (int[] tabl: array) {
        	quicksort_desc(tabl, 0, tabl.length -1);
        }
		// Print the sorted contents of the array
		print2dArray("Array sorted in descending order: ", array);
	}

	/***
	 * This method split the array into at \n and then into sub array at ,
	 * @param array of integer 
	 * @return 2 dimensional array of string */
	public static String[][] splitLine(String lines) {
		int rowSize = lines.split(",").length - lines.split(",").length/2;
		String[] newarr[] = new String[lines.split("\n").length][rowSize]; 
		// intial loop values 
		int i= 0; // variable for row
		int j=0; // String[] col = new int[lines.split("\n").length];
		// Split the array at \n
		String[] row = lines.split("\n");
		for (i=0; i< row.length; i++) {
			String[] col = row[i].split(",");
			// Spit the array at 
			for (j=0; j< col.length; j++) {
				// Store in 2d array 
				newarr[i][j] = col[j];
			}
		}
		return newarr;
	}


	/**
     * Using the bubble up technique to sort the array 
     * @param array of integer **/
	public static void BubbileSort_asc(int[][] arr) {
		for (int[] row : arr ) {
			for (int i=0; i< row.length -1; i++) { // outer loop walk around the elements in the array 
            	for (int j = 0; j< row.length - i -1; j++) { // access the neighbouring elements 
                	if (row[i] < row[j+1]) { // if the left element is bigger swap the elements
                    	int temp = row[j];
                    	row[j]=row[j+1];
                    	row[j+1]=temp;
                	}
            	}
        	}
		}
	}


	/**
     * Using the bubble up technique to sort the array 
     * @param array of integer **/
	public static void BubbileSort_desc(int[][] arr) {
		for (int[] row : arr ) {
			for (int i=0; i< row.length -1; i++) { // outer loop walk around the elements in the array 
            	for (int j = 0; j< row.length - i -1; j++) { // access the neighbouring elements 
                	if (row[i] < row[j+1]) { // if the left element is bigger swap the elements
                    	int temp = row[j];
                    	row[j]=row[j+1];
                    	row[j+1]=temp;
                	}
            	}
        	}
		}
	}

	/****
     * split the array into two parts one smaller than the pivot 
     * and one bigger than the pivot 
     *  @param array of integers, and two integer **/
    public static void quicksort_asc(int[] arr, int begin, int end ) {
        // Check is the start index is lower than the finish inex 
        if (begin < end) {
            // return a pivot index used
            int divideIndex = dividingUp_asc(arr, begin, end);
            // sort the numbers smaller than the privotial number  
            quicksort_asc(arr, begin, divideIndex -1);
            // Sort the number bigger that the pivoital number 
            quicksort_asc(arr, divideIndex +1, end);
        }
    }

        /***
     * assign the last elemnent of array as pivot
     * Dividing the array into element smaller then pivot and greater than the pivot
     * @param array of integers, and two integer 
     * @return the pivot index ****/
    public static int dividingUp_asc(int[] arr, int begin, int end) {
        int pivot = arr[end]; // assign the final elemnt of the array as the pivot 
        int i = (begin -1 );
        for (int j=begin; j< end; j++) {
            // checks if the elements in the array is greate than choosen pivot
            if (arr[j] <= pivot) {
                i++;
                // shuffle the number less than the pivot to the left 
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Shuffle the number getter than pivot to the right 
        int temp = arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        // return  pivor index after swapping 
        return i+1;
    }


    /****
     * split the array into two parts one smaller than the pivot 
     * and one bigger than the pivot 
     *  @param array of integers, and two integer **/
    public static void quicksort_desc(int[] arr, int begin, int end ) {
        // Check is the start index is lower than the finish inex 
        if (begin < end) {
            // return a pivot index used
            int divideIndex = dividingUp_desc(arr, begin, end);
            // sort the numbers smaller than the privotial number  
            quicksort_desc(arr, begin, divideIndex -1);
            // Sort the number bigger that the pivoital number 
            quicksort_desc(arr, divideIndex +1, end);
        }
    }

        /***
     * assign the last elemnent of array as pivot
     * Dividing the array into element smaller then pivot and greater than the pivot
     * @param array of integers, and two integer 
     * @return the pivot index ****/
    public static int dividingUp_desc(int[] arr, int begin, int end) {
        int pivot = arr[end]; // assign the final elemnt of the array as the pivot 
        int i = (begin -1 );
        for (int j=begin; j< end; j++) {
            // checks if the elements in the array is greate than choosen pivot
            if (arr[j] >= pivot) {
                i++;
                // shuffle the number less than the pivot to the left 
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Shuffle the number getter than pivot to the right 
        int temp = arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        // return  pivor index after swapping 
        return i+1;
    }


	/**Alternative **/
	/*public static String[][] splitLine(String[] lines) {
		String[] newarr[] = new String[]; 
		// intial loop values 
		int i= 0; // variable for row
		int j=0; // variable for column
		String row= "";
		StringTokenizer table = new StringTokenizer(string, "\n");
		while (table.hasMoreTokens()) {
			// find the row of the 2 do array 
			row =  new StringTokenizer(table.nextToken(), "\n");
			while (row.hasMoreTokens()) {
				fianlstring[i][j++] = newstring.nextToken();
			}
			i++;
		}
		return newarr;
	}for(String cell : col) {
					newarr[i][j] = cell;
				}*/

	/**Using varags format to create a string, convert string array into int array and return 
	 * the int array 
	 * @param array of string 
	 * @return array of integer **/
	public static int[][] ConvertNumberStrings(String[][] line) {
		int[][] arr = new int[line.length][line[0].length];
		// intial loop values 
		int i= 0; // variable for row
		int j=0; // variable for column
		for (int row= 0; row< line.length; row++) {
			for (int col= 0; col< line[row].length; col++ ) {
				arr[row][col] = Integer.parseInt(line[row][col]);
			}
		}
		return arr;
	}

	public static void print2dArray(String prefix, int[][] array) {
		System.out.print(prefix);
		for (int row=0; row< array.length ; row++ ) {
			System.out.print("\n[");
			for (int col=0; col< array[row].length; col++) {
				System.out.print(array[row][col] + ", ");
			}
			System.out.print("]\n");			
		}
		
	}

}