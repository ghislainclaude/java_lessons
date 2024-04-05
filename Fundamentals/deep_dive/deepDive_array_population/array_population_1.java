import java.lang.Math;

public class array_population_1 {
	public static void main(String[] args)  {
		// Declare a 3D empty 
		int[] arr[][] = new int[10][10][3];
		int[] arr2d[] = new int[10][10];
		// call method that Populate with random number
		System.out.println("Here is the 3 dimensional array printed in a matrix format:");
		populate3D(arr);
		print3D(arr);
		System.out.println("Here is the 2 dimensional array printed in a matrix format:");
		populate2D(arr2d);
		print2D(arr2d);
	}
	/***Populate both the 3d array with random numbers using Math.random()***/
	public static void populate3D(int[] arr[][]) {
		// iterated through the 2 array inside the 3d array 
		for (int tabl = 0; tabl< arr.length; tabl++) {
			// iterated through the 1d array inside the 2d array 
			for (int row= 0; row< arr[tabl].length; row++) {
				// iterated through the elements of array inside the 1d array 
				for (int col=0; col< arr[tabl][row].length; col++ ) {
					int max = 69;// intialize a max and a min
					int min = 0;// intialize a max and a min
					int range = (max - min) + 1;// intialize a max and a min
					// create an a random number using math random 
					int rand = (int)((int)(Math.random() * range)+ min );
					arr[tabl][row][col] = rand; // replace the element in the array with a random numbers 
				}
			}
		}
	}

	/**Populate the 2d array with random numbers using Math.random()**/
	public static void populate2D(int[] arr[]) {
		for (int row = 0; row < arr.length; row++) {
			for (int col=0; col< arr[row].length; col++) {
				int max = 69;
				int min = 0; 
				int range = (max - min) + 1;
				int rand = (int)((int)(Math.random() * range ) + min);
				arr[row][col] = rand;
			}
		}
	}


	/***Print contents of 2d arrays***/
	public static void print2D(int arr[][]) {
		// each 1d arry in the 2d array is now tabl 2d array 
		for (int[] row: arr) {
			// each element in the 2d array is now tabl 2d array 
			for (int col: row) {
				System.out.print(col + ", ");
			}
			System.out.println();
		}
	}

	/***Alternative***/
	/*public static void print2D(int arr[][]) {
		for (int row = 0; arr.length; row++) {
			for (int col = 0; arr[row].length; col++) {
				System.out.println(arr[row][col] + ", ");
			}
			System.out.println();
		}
	}*/
	/***Altternative
	 * Populate both the 3d array random numbers with random numbers using Math.random() ***/
/*	public static void populate(int[] arr[][]) {
		// each 2d arry in the 3d array is now tabl 2d array 
		for (int[][] tabl : arr) {
			// iterate through a 2d array normally 
			for(int row = 0; row< tabl.length; row++) {
				for (int col=0; col< tabl[row].length; col++) {
					int max = 69;
					int min = 0;
					int range = (max - min) + 1;
					int rand = (int)((int)(Math.random() * range)+ min );
					tabl[row][col] = rand; 
				}
			}
		}
	}
*/

	/**Print array content of 3d array ***/
	public static void print3D(int[] arr[][]) {
		// each 2d arry in the 3d array is now tabl 2d array 
		for (int[][] tabl : arr) {
			// 
			for (int row = 0; row< tabl.length; row++) {
				for (int col=0; col< tabl[row].length; col++ ) {
					System.out.print(tabl[row][col] + ", ");
				}
				System.out.println();
			} 
			System.out.println();
		}
	}
}