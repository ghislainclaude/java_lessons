import java.util.StringTokenizer;

public class Strings1 {
	public static void main(String... args) {
		String line = "1,4,3,2,3,7,5,6,9";
		// Create new array feom the old array using "," as the delimiter
		String[]  newLine = line.split(",");
		/*String[] newLine= delimiterRemover(line);*/
		// Covert the string array of numnber too integer 
		int[] array = ConvertNumberStrings(newLine);
		// sort it in ascending orde
		quicksort_asc(array, 0, array.length -1);
		// Print the sorted contents of the array.
		printArray("Array sorted in ascending order: ", array);
		// sort it in descending order
		quicksort_desc(array, 0, array.length -1);
		// Print the sorted contents of the array
		printArray("Array sorted in descending order: ", array);
	}

	/**Alternative Solution to splitting the array using the the delimiter
	 * @param array of string
	 * @return array of string values **/
	public static String[] delimiterRemover(String Integer) {
		String[] fianlstring = new String[Integer.length()/ 2 + 1];
		int i= 0;
		StringTokenizer newstring = new StringTokenizer(Integer, ",");
		// 
		while (newstring.hasMoreTokens()) {
			fianlstring[i++] = newstring.nextToken();
		}
		return fianlstring;
	}

	/**Using varags format to create a string, convert string array into int array and return 
	 * the int array 
	 * @param array of string 
	 * @return array of integer **/
	public static int[] ConvertNumberStrings(String... line) {
		int[] arr = new int[line.length];
		int j= 0;
		for (String i: line) {
			arr[j++] = Integer.parseInt(i);
		}
		return arr;
	}


	/**
     * Using the bubble up technique to sort the array 
     * @param array of integer **/
	public static void BubbileSort_asc(int[] arr) {
		for (int i=0; i< arr.length -1; i++) { // outer loop walk around the elements in the array 
            for (int j = 0; j< arr.length - i -1; j++) { // access the neighbouring elements 
                if (arr[i] < arr[j+1]) { // if the left element is bigger swap the elements
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
	}


	/**
     * Using the bubble up technique to sort the array 
     * @param array of integer **/
	public static void BubbileSort_desc(int[] arr) {
		for (int i=0; i< arr.length -1; i++) { // outer loop walk around the elements in the array 
            for (int j = 0; j< arr.length - i -1; j++) { // access the neighbouring elements 
                if (arr[i] > arr[j+1]) { // if the left element is bigger swap the elements
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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

    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

}