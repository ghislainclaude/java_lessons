public class ArrayManipulation8_2 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        arrayA = sub( arrayA, arrayB);
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size a - duplicates
        int duplicateCount = 0;
        for ( int i= 0, j=0; i< arrayA.length || j< arrayB.length; j++ , i++) {
            if (arrayA[i] == arrayB[j]) 
                duplicateCount++;
        }
        //copy non-duplicates into the new array contigously.
        //define int duplicateCount = 0;
        //count duplicate and duplicateCount++ for each
        int initialSize = arrayA.length;
        //create new array that is initialSize - duplicateCount;
        int[] newarr = new int[initialSize - duplicateCount];
        int k = 0;
        //write a loop that skips duplicate as it copies from a to b
        for (int i= 0, j=0; i< arrayA.length || j< arrayB.length; j++ , i++) {
            if (arrayA[i] != arrayB[j])
                newarr[k++] = arrayA[i]; 
        }
        //Note this line is buggy as it returns arrayA
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
