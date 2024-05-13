public class ArrayManipulation1 {
    public static void main(String[]args){
        int[] array = new int[10];
        //Populate array with random numbers
        array = populate(array);
        printArray("array with random numbers ",array);

        //Add a for loop in the indicated position that we clear the array by setting all the values to 0.
        for (int i= 0; i< array.length; i++) {
            array[i] = 0;
        }
        /*Alternative 
        int i=0;
        while (i< array.length) {
            array[i] = 0;
            i++;
        }*/
        printArray("array with zeros ",array);
    }

    public static int[] populate(int[] arr) {
        int[] newarr =  new int[arr.length];
        int max = 10;
        int min = 0;
        // using classic for loop to populate a random value at each number 
        for (int i=0; i< arr.length; i++) {
            int range = (max - min) + 1;
            int random = (int)(Math.random() * range) + min;
            newarr[i] = random;
        }
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
