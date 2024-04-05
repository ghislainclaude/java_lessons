import java.util.*;

public class deepDive_arrays_basics_4 {
	public static void main(String[] args) {
		int[] array = new int[50];
		populate(array);
		System.out.println("Here is the array printed in a matrix format:");
		Print(array);
		System.out.println("**************************************************************************");
		System.out.println("Now I add 1 to each element in the array");
		AddToEach(array);
		System.out.println("Here is the changed array printed in a matrix format:");
		Print(array);
		System.out.println("**************************************************************************");

	}

	/**
	 * populate each element using a for loop
	 * @param int array**/
	public static void populate(int[] array) {
		Random random = new Random();
		// Intialize a Random onject 
		for (int i =0; i < array.length; i++) {
			array[i] = random.nextInt(500); // add random number as element in the array
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
	}*/

	/**
	 * print each element using a for loop**/
	public static void Print(int[] array) {
		int elementsPerRow = 10;
		for (int i= 0; i< array.length; i++) {
			System.out.print(" "+array[i] + " ");
			if ((i + 1) %elementsPerRow == 0 ) 
				System.out.println();
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