public class ArrayManipulation3 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before swapping ",array);
        // Alternative
       /* for (int i=0; i< array.length -1; i++) { // outer loop walk around the elements in the array 
            for (int j = 0; j< array.length - i -1; j++) { // access the neighbouring elements 
                if (array[i] > array[j+1]) { // if the left element is bigger swap the elements
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        } */ 
        // call the sort method in the main 
        quicksort(array, 0, array.length -1);
        printArray("array after swapping ",array);
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
