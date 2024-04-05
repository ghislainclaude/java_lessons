import java.util.*;

public class deepDive_arrays_basics_5 {
	public static void main(String[] args) {
		int[] array = new int[50];
		populate(array);
		System.out.println("Here are the numbers that are even numbers and divisible by 11 from the array:");
		Print(array);
		System.out.println("\n**************************************************************************");
	}

	/**
	 * populate each element using a for loop
	 * @param int array**/
	public static void populate(int[] array) {
		// Intialize a Random onject 
		Random random = new Random();
		for (int i =0; i < array.length; i++) {
			array[i] = random.nextInt(500);// add random number as element 
		}
	}

	/**
	 * Alternative 
	 * populate each element using a for loop
	 * @param int array**/
	/*public static void populate(int[] array) {
		Random random = new Random();
		for (int i: array) {
			i = random.nextInt(500);
		}
	}
	*/
	/**
	 * print even numbers and divisible by 11 only **/
	public static void Print(int[] array) {
		int elementsPerRow = 10;
		for (int i= 0; i< array.length; i++) {
			// check even numbers values and numbers divisible by 11 only
			if (array[i]%2 == 0 && array[i]%11 == 0) {
				System.out.print(" "+array[i] + " ");
			}
			
		}
	}
	/**
	 * add 1 to each element in the array**/
	 public static void AddToEach(int array[]) {
	 	for (int i=0; i< array.length; i++) {
	 		array[i] += 1;
	 	}
	}
}