import java.util.*;

public class deepDive_arrays_basics_6 {
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
		Random random = new Random();
		for (int i =0; i < array.length; i++) {
			array[i] = random.nextInt(200);
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
		// intialization bloc;
		int elementsPerRow = 10;
		int i= 0;
		// intialization block
		while ( i< array.length) {
			int even = array[i]%2 ;
			int divisible = array[i]%11;
			// check if each element is even number
			switch (even) {
				case 0:
					// check if each elememnt is ivisible by 11
					switch (divisible) {
						case 0:
							System.out.print(" "+array[i] + " ");
						break; 
					}
				break;
			}
			i++;
		}
	}
	/**
	 * add 1 to each element in the array**/
	 public static void AddToEach(int array[]) {
	 	int i=0;
	 	while ( i< array.length) {
	 		array[i] += 1;
	 		i++;
	 	}
	}
}