import java.util.*;

public class deepDive_arrays_basics_2 {
	public static void main(String... args) {
		int[] array =  { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 220, 
						 221, 222, 223, 224, 225, 226, 227, 228, 229, 330, 331, 332, 333, 334, 335, 336, 337, 
						 338, 339, 440, 441, 442, 443, 444, 445, 446, 474, 448,449,550
						};
		//pre_populate(array);
		System.out.println("Here are the numbers that are even numbers divisible by 11  from the array:");
		Print(array);
		// now  add 1 to each element in the array
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
	 * print even numbers  divisible by 11 only*/
	public static void Print(int[] array )  {
		// loop through each element in the array.
		for (int i = 0; i < array.length ; i++) {
			if (array[i]%2 == 0 && array[i]%11 == 0) {
				System.out.print(array[i] + ", ");
			}
		}
	}
	/**
	 * @param integer array 
	 * add 1 to each element in the array*/
	public static void Add(int[] array) {
		/* loop through each element in the array*/ 
		for (int i = 0; i < array.length; i++) {
			array[i] += 1;// add 1 to each element
		}
	}
}