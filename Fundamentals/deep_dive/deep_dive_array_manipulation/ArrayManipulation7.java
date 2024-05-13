public class ArrayManipulation7 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1,0, 0};

        printArray("array before trim ",array);

        //This trim will work       
        array = trim(array);

        printArray("array after trim ",array);
    }
    /***
     * adding the item by resizes the array
     * @param an array of integers
     * @return a resizes smaller array without 0*/
    //TODO: This method throws an exception please fix it.
    public static int [] trim(int[] arrayToAddTo){
        int initialSize = arrayToAddTo.length;
        //First lets just iterate through the array
        //If we find a slot with a zero we use it and return
        //If this is the case then we do not resize all is good.
        //If we reach this block it means there was a 0 slot available
        //This means the array is due for trimming. i.e. deleting on the slots with zero
        int newSizeLess = 0;
        //write a for loop that counts all the zeros and adds 1 to newSizeLess for each
        for (int i=0; i< initialSize; i++) 
            if (arrayToAddTo[i] == 0) 
                ++newSizeLess;
        int newSize = initialSize - newSizeLess;
        //Create an array that is equal to newSize
        int[] newarr = new int[newSize];
        //copy elements over that are not zero. They should fit into the new smaller array
        int j= 0;
        for (int i=0; i< newSize; i++)
            if (arrayToAddTo[i] >  0)
                newarr[j++] = arrayToAddTo[i];
        //Note this line is buggy as it uses the old array
        //Your code should use the new array
        //This should return the new array
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
}
