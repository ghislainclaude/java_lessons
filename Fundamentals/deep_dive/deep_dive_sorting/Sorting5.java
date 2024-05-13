public class Sorting5 {
	public static void main(String...args) {
		int[] arr = new int[]{
					69,    138,   207,    276,   345,  414,    1104,    12,     24,    55  , 
					483,    552,   621,    690,   759,  828,     639,   721,     13,   8008 ,
					897,    966,  1035,   1104,  1173, 1932,      882,  365,     81,   7005, 
					70,     71,    72,     76,    83
				};
		printArray("Initial array: ", arr);
		//print(arr);
		arr = Add(arr);
        System.out.println();
		printArray("Array after addition: ", arr);
		quicksort(arr, 0, arr.length -1);
		// BubbileSort(arr);
        System.out.println();
        printArray("Print Sorted array: ", arr);
	}

    /**
     * Using the bubble up technique to sort the array 
     * @param array of integer **/
	public static void BubbileSort(int[] arr) {
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


	/****
     * split the array into two parts one smaller than the pivot 
     * and one bigger than the pivot 
     *  @param array of integers, and two integer **/
    public static void quicksort(int[] arr, int begin, int end ) {
        // Check is the start index is lower than the finish inex 
        if (begin < end) {
            // return a pivot index used
            int divideIndex = dividingUp(arr, begin, end);
            // sort the numbers smaller than the privotial number  
            quicksort(arr, begin, divideIndex -1);
            // Sort the number bigger that the pivoital number 
            quicksort(arr, divideIndex +1, end);
        }
    }

    /***
     * assign the last elemnent of array as pivot
     * Dividing the array into element smaller then pivot and greater than the pivot
     * @param array of integers, and two integer 
     * @return the pivot index ****/
    public static int dividingUp(int[] arr, int begin, int end) {
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

	/***Alternative solution to extend the arrray and add item to int
     * @param array of integer **/
    /*public static int[] Add(int[] arr) {
        //  add 60 to the 20th element then add 61 to the 61st element
        arr[20] += 60;
        // create new array size of extended array
        int[] newarr = new int[arr.length + 20];
        // use arraycopy to copy all the content from initial array and to new extend array
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        int _61st = 60 + newarr[61];
        // add 61 to the 61st element in the array.
        newarr[arr.length + 11]= _61st;
        // return the new array 
        return newarr;
    }*/
    /**Extend the intial array and addd item to the array
     * @param array of intege 
     * @return the extended array **/
    public static int[] Add(int[] arr) {
        // create an new array with a larger length that 50 
        int[] newarr = new int[arr.length + 20];
        // using for loop to copy the element for the old array to the new array 
        for (int i= 0; i< arr.length; i++) {
            newarr[i] = arr[i];
            // add 60 to the 20th element
            if (i == 20) {
                arr[i] += 20;
                newarr[i] = arr[i];
            }
        }
        // add 61 to the 61st element in the array.
        newarr[arr.length + 11]= 60 + newarr[arr.length + 11];
        return newarr;
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


    public static void print(int[] arr) {
    	System.out.print("**************************************************************");
    	int elementperRow = 5;
    	for (int i=0; i< arr.length; i++) {
    		System.out.print(arr[i] + ", ");
    		if ((i+2)%elementperRow == 0) 
    			System.out.println();
    	}
    }
} 