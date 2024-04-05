public class BubbleSort {
	public static void main() {
		int[] array = {20, 35, , -15, 7, 55, 1, -22};

	}

	public static void swap(int[] array, int i, int j) {
		if (i != j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}else {
			return;
		}
	}
}