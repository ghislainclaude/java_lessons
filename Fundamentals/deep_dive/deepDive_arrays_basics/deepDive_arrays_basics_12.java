import java.util.*;

public class deepDive_arrays_basics_12 {
	public static void main(String[] args) {
		int[][] array = new int[100][30];
		popuate(array);
		System.out.println("Here are the odd numbers values within the array and divisible by 8 only from the array 2 dimensional array printed: ");
		Print(array);
		System.out.println("\n**************************************************************************");
	}

	/*populate each element using a for loop*/
	public static void popuate(int[] array[]) {
		Random random = new Random();
		int i=0;
		int j= 0; 
		while ( i<array.length ) {
			while ( j< array[i].length) {
				array[i][j] = random.nextInt(3000);
				j++;
			}
			i++ ;
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

	/*odd numbered values within the array and numbers divisible by 8 only*/
	public static void Print(int[][] array) {
		int row = 0; 
		int col=0;
		while (row < array.length) {
			while( col< array[row].length) {
				int even = array[row][col]%2;
				int divisible = array[row][col]%8;
				// checks if each elements is even 
				switch (even) {
					case 0:
					break;
					default:
						// check if each element is divisible by 11 
						switch (divisible) 
						{
							case 0:
								System.out.print(array[row][col] + "\t ");
							break;
						}
					break; 
				}
			 	col++;
			}
			row++;
		}
	}

	/*add 1 to each element in the array.*/
	public static void AddToEach(int[][] array) {
		// intialize loop variables 
		int i = 0;
		int j= 0;
		// check the boolean expression evaluates to true 
		while ( i< array.length) {
			while ( j< array[i].length) {
				array[i][j] += 1;
				j++;
			}
			i++;
		}
	}

}