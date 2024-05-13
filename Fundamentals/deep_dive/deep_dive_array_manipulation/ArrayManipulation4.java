public class ArrayManipulation4 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};
        printArray("array before overwriting ",array);

        array[array.length - 1] = -1;
        array[array.length - 2] = -1;

        // declare smaller array 
        int[] smaller_array = new int[array.length - 2];
        int value = 0;
        // loop through array and assighn the new none deleted element to teh smaller array
        for (int i = 0; i< array.length; i++) {
            // if the element is not -1 then is not delete 
            if (array[i] != -1)
                smaller_array[value++] = array[i];
        }
        /*int i= 0;
        while (i< array.length) {
            if (array[i] != -1) 
                smaller_array[value++] = array[i];
            i++;
        }*/

        printArray("array after overwriting ",smaller_array);

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
