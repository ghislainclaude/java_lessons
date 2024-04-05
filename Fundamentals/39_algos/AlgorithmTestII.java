import java.util.Random;
import java.util.*;

public class AlgorithmTestII {
	public static void main(String[] args) {
		int[][] twoDarry = new int[5][5];
		populate(twoDarry);
		for (int row = 0; row< twoDarry.length; row++) {
			for (int i= twoDarry[row].length -1; 0< i ; i--) {
				for (int j=0; j< i; j++) {
					if (twoDarry[row][j] > twoDarry[row][j + 1])
						swap(twoDarry[row], j, j+1);
				}
			}
		}
		PrintArray(twoDarry);
	}

	public static void PrintArray(int[][] array) {
		for (int row = 0; row< array.length; row++) {
			System.out.print(Arrays.toString(array[row]) );
		}
	}

	public static void BubbleSort(int [][] array) {
		/*for (int row = 0; row< array.length; row++) {
			for (int i= 0; i< array[row].length -1 ; i--) {
				for (int j=0; j< i; i++) {
					if (array[row][i]< array[row][i+1])
						swap(array[row], i, i+1);
				}
			}
		}*/
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void populate(int[][] array) {
		Random random = new Random();
		for (int row = 0; row< array.length; row++) {
			for (int col = 0;  col<array[row].length; col++) {
				array[row][col] = random.nextInt(100);
			}
		}
	}
}







