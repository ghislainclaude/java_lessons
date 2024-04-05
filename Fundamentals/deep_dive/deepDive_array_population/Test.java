import java.util.*;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[100];
		NeverStop(arr);
		//System.out.println(9%6);
		System.out.println(Arrays.toString(arr));
	}

	public static void NeverStop(int[] arr) {
		int i = 1;
		int value = 0;
		int iteratorAmount = arr.length;
		while (i < arr.length) {
			if (value%2 == 0 && arr[i] > 0) {
				arr[i] = value; 
			}
			if (arr[i] == 0) 
				i--;
			i++;
			value++; 
		}
	}


	/***Populate an array of even numbers 
	 * @param array of even numbers  
	 * @return array of even numbers */
	public static int[] Prime(int[] arr ) {
		int[] prime = arr;
		int index = 0;
		int factor = 0;
		System.out.println(factor);
		// iterate occuring to size of loop 
		outer: for (int i=0; i< prime.length; i++ ) {
			factor = 0;
			if (arr[i] <=1) continue outer;
			// check if loop variable is prime number 
			inner: for (int j=1; j <= arr[i]; j++) {
				if ( (arr[i]%j) == 0) {
					factor++;
					if (factor == 2) prime[index] = arr[i];
				}
				// assign loop variable to element in array 
			}
			//index++;
		}
		return prime;// return a odd array 
	}
}