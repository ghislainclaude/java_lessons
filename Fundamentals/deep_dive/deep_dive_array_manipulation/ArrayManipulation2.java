public class ArrayManipulation2 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before swapping ",array);
       /* for (int i=0; i< array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }*/
        // Alternatively Two pointer technique
        int i = 0; // first ponter 
        int j = array.length -1;// second pointer 
        while(i< j) {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        } 
        printArray("array after swapping ",array);
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
