import java.util.*;

public class deepDive_arrays_basics_11 {
	public static void main(String[] args) {
		int[][] array = new int[100][30];
		popuate(array);
		System.out.println("Here are the odd numbers values within the array and divisible by 8 only from the array 2 dimensional array printed: ");
		Print(array);
		System.out.println("\n**************************************************************************");
	}

	/*populate each element using a for loop*/
	public static void popuate(int[] array[]) {
		// Intialize a Random onject 
		Random random = new Random();
		for (int i=0; i<array.length ; i++ ) {
			for (int j= 0; j< array[i].length; j++) {
				array[i][j] = random.nextInt(3000);// add random number as element  between 0 and 30000
			}
		}
	}
	/*Alternative populate each element using a for loop*/
	/*public static void popuate(int[] array[]) {
		for (int i=0; i<array.length ; i++ ) {
			for (int j= 0; j< array[i].length; j++) {
				array[i][j] = i + j;
			}
		}
	}*/

	/*odd numbered values and numbers divisible by 8 only*/
	public static void Print(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			// iterate through each element in the array
			for (int col=0; col< array[row].length; col++) {
				// check odd numbered values and numbers divisible by 8 only
				if (array[row][col]%2 != 0 || array[row][col]%8 == 0)
				System.out.print(array[row][col] + "\t ");
			}
		}
	}

	/*add 1 to each element in the array.*/
	public static void AddToEach(int[][] array) {
		for (int i = 0; i< array.length; i++) {
			for (int j= 0; j< array[i].length; j++) {
				array[i][j] += 1;
			}
		}
	}

}
