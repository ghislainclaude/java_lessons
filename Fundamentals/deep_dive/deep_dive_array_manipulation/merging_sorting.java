public class merging_sorting {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        printArray("arrayA before merging ",arrayA);
        printArray("arrayB before merging ",arrayB);
        printArray("Merged  array ", merge( arrayA, arrayB));
        int[] combined_arr = merge( arrayA, arrayB);
        mergeSort(combined_arr, combined_arr.length);
        printArray("Sorted Merged  array ", combined_arr);
    }

    /****
     *  array into two parts one smaller than the pivot 
     * and one bigger than the pivot 
     *  @param array of integers, and two integer **/
    public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        int[] mergearr = new int[arrayA.length + arrayB.length];
        int point1 = 0;// start at the beging of merged array 
        int point2 = mergearr.length -1 ; // start at the end of merged array 
        int i = 0;
        //copy both array into the new array contigously.
        // Using populate the being of the merged array with array A and end of merged array with array B
        while (point1 < (arrayA.length -1) || point2 > (arrayB.length -1)) {
            mergearr[point1] = arrayA[point1];
            mergearr[point2] = arrayB[i];
            point1++;
            point2--;
            i++;
        }
        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return mergearr;
    }

    /****
     *  Add each  
     *  @param two array of integers **/
    /*public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        int[] mergearr = new int[arrayA.length + arrayB.length];
        //copy both array into the new array contigously.
        System.arraycopy(arrayA, 0, mergearr, 0, arrayA.length);
        // start copying at the end where array A was populated
        System.arraycopy(arrayA, 0, mergearr, arrayA.length, arrayA.length);
        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return mergearr;
    }*/

    /****
     *  Split the array into two left and right side and sort each side 
     *  @param array of integers, and one integer **/
    public static void mergeSort(int[] arr, int length) {
        // checks if the size of the array is greater than two so that it can be divided 
        if (length < 2)
            return;
        //initialize loop values 
        int mid = length/2;
        int[] leftside = new int[mid];
        int[] rightside = new int[length - mid];
        // split the initial array into a left side 
        for (int i=0; i< mid; i++) 
            leftside[i] = arr[i];
        // split the initial array into a right side 
        for (int i=mid; i< length; i++) 
            rightside[i-mid] =arr[i];
        // sort the left hand side
        mergeSort(leftside, mid);
        // sort the right hand side 
        mergeSort(rightside, length - mid);
        // merge the two side back into ine arrat 
        merge(arr, leftside, rightside, mid, length - mid);
    }

    public static void merge(int[] arr, int[] leftside, int rightside[], int l, int r) {
        int i=0, j= 0, k=0;
        while (i< l && j< r) {
            if (leftside[i] <= rightside[j] )
                arr[k++] = leftside[i++];
            else 
                arr[k++] = rightside[j++];
        }
        while(i< l) 
            arr[k++] = leftside[i++];
        while (j < r) 
            arr[k++] = rightside[j++];
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
