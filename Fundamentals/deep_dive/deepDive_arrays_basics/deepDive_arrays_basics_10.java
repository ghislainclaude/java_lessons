import java.util.*;

public class deepDive_arrays_basics_10 {
	public static void main(String[] args) {
		int[][] array = new int[100][30];
		popuate(array);
		System.out.println("Here is the 2 dimensional array printed in a matrix format:");
		Print(array);
		System.out.println("\n**************************************************************************");
		System.out.println("Now I add 1 to each element in the array");
		AddToEach(array);
		System.out.println("Here is the changed array printed in a matrix format:");
		Print(array);
		System.out.println("\n**************************************************************************");
	}

	/*populate each element using a for loop*/
	public static void popuate(int[] array[]) {
		Random random = new Random();
		for (int i=0; i<array.length ; i++ ) {
			for (int j= 0; j< array[i].length; j++) {
				array[i][j] = random.nextInt(3000);
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

	/*print each element using a for loop*/
	public static void Print(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col=0; col< array[row].length; col++) {
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