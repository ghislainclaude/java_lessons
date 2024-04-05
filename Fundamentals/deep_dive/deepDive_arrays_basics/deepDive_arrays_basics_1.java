import java.util.*;

public class deepDive_arrays_basics_1 {
	public static void main(String... args) {
		int[] array =  { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 220, 
						 221, 222, 223, 224, 225, 226, 227, 228, 229, 330, 331, 332, 333, 334, 335, 336, 337, 
						 338, 339, 440, 441, 442, 443, 444, 445, 446, 474, 448,449,550
						};
		//pre_populate(array);
		System.out.println("Here is the array printed in a matrix format:");
		Print(array);
		System.out.println("\n**************************************************************************");
		System.out.println("Now I add 1 to each element in the array");
		Add(array);
		System.out.println("Here is the changed array printed in a matrix format:");
		Print(array);
		System.out.println("**************************************************************************");
	}

	/***
	 * Alternatuve 
	 * pre-populate the the array with 50 rand 4
	 * @param int array
	**/ 
	/*public static void pre_populate(int[] array) {
		Random random = new Random();
		for (int i= 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
	}*/
	/**
	 * @param integer array 
	 *print each element using a for loop */
	public static void Print(int[] array )  {
		int elementsPerRow = 10;
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + ", ");
			if ((i + 1) %elementsPerRow == 0 ) {
                System.out.println(); // Move to the next line after every 10 elements
            }
		}
	}


	/**
	 * @param integer array 
	 * add 1 to each element in the array*/
	public static void Add(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] += 1;
		}
	}
}