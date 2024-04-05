import java.lang.*;

public class CodeAlong2 {
	public static void main(String... args) {
		// Declare array of size 100
		int[] arr = new int[100];
		int[] des_arr = new int[16];
		populate(arr);
		printArray("Populateed array of random numbers before the copy: ", arr);
		System.out.println();
		printArray("desination array before the copy: ", des_arr);
		// Use System.arraycopy() method to copy a sub-array from position 15 to 31.
		System.arraycopy(arr, 15, des_arr, 0, 16);
		System.out.println();
		printArray("Populateed array of random numbers after the copy: ", arr);
		System.out.println();
		printArray("desination array before the copy: ", des_arr);
	}
	/***
	 * populate an array with random values using math.random
	 * @param array of integer **/
	public static void populate(int[] arr) {
		int max = 100;
		int min = 0;
		// using classic for loop to populate a random value at each number 
		for (int i=0; i< arr.length; i++) {
			int range = (max - min) + 1;
			int random = (int)(Math.random() * range) + min;
			arr[i] = random;
		}
	}

	/***
	 * Alternative 
	 * populate an array with random values using math.random
	 * @param array of integer **/
	/*public static void populate(int[] arr) {
		int max = 100;
		int min = 0;
		int i=0;
		// using classic for loop to populate a random value at each number 
		if (i< arr.length) {
			do {
				int range = (max - min) + 1;
				int random = (int)(Math.random() * range) + min;
				arr[i] = random;
				i++;
			}while (i< arr.length);
		}
	}*/

	/**
     * pretty print each element to show the default values
     * @param  string prefix, array of integers **/
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