import java.util.*;

public class QuickSort {
	public static void main(String[] args ) {
		int[] array = {22, -15, 35, 77, 55, 12, 89};;
		quickSort(array, 0, array.length -1);
		PrintArray(array);
	}

	public static void quickSort(int[] array,  int start, int end) {
		if (start < end) {
			int dividingUpIndex = dividingUp(array, start, end);

			quickSort(array, start, dividingUpIndex - 1);
			quickSort(array, dividingUpIndex + 1, end);
		}
	}

	public static void PrintArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static int dividingUp(int array[], int start, int end) {
		int pivot = array[end];
		int i = (start - 1);
		for (int j=start; j< end; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		swap(array, i, end);
		return i + 1;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i+1];
		array[i+1] = array[j];
		array[j] = temp;
	}
}