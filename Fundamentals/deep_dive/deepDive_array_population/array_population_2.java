import java.lang.Math;

public class array_population_2 {
	public static void main(String[] args) {
		// intialize arrays 
		int[][] arr = new int[3][100];
		int[] odd = new int[100];
		int[] even = new int[100];
		int[] prime = new int[100];
		
		// assign the returned array to the intial declared arrays
		odd = Odd(odd);
		even = Even(even);
		prime = Prime(prime);
		// populate the 2 dimensional rows with the different one day array 
		populate(arr, odd, even, prime);

		System.out.println("***************************************************************************************");
		System.out.println("Here is all the firts 100 odd numbers in printed in a matrix format:");
		print1d(odd);
		System.out.println("\n***************************************************************************************");
		System.out.println("Here is all the first 100 even numbers in printed in a matrix format:");
		print1d(even);
		System.out.println("\n***************************************************************************************");
		System.out.println("Here is all the prime the first numbers in printed in a matrix format:");
		print1d(prime);
		System.out.println("\n***************************************************************************************");
		System.out.println("Here is the 2 dimensional array printed in a matrix format:");
		print(arr);
	}
	/***Populate 2 dimensional array 
	 * @param 2 dimensional array  
	 *  */
	public static void populate(int[][] arr, int[] odd, int[] even, int[] prime ) {
		int i=0;
		// loop through the 1d array inside the 2 dimensional
		for (int row=0; row<arr.length; row++) {
			// assign 
			if (row == 0) 
				arr[row] = odd;
			else if (row== 1) 
				arr[row] = even;
			else arr[row] = prime;
		}
	}


	/***
	 * Alternative
	 * Populate 2 dimensional array 
	 * @param 2 dimensional array  
	 *  */
	/*public static void populate(int[][] arr, int[] odd, int[] even, int[] prime ) {
		int i=0;
		// loop through the 1d array inside the 2 dimensional
		for (int row=0; row<arr.length; row++) {
			// assign 
			switch (row) 
			{
				case 0:
					arr[row] = odd;
				break;
				case 1:
					arr[row] = even;
				break; 
				case 2:
					arr[row] = prime;
				break;
			}
		}
	}*/

	/*public static void populate1d() {}*/

	/***Populate an array of odd numbers 
	 * @param array of odd numbers  
	 * @return array of odd numbers */
	public static int[] Odd(int[] odd) {
		/*int index = 0;*/
		int i=0;
		int value = 1; 
		while ( i< odd.length) {
			// check if the value is odd 
			if (value%2 != 0 ) 
				// assign loop value to element in array 
				odd[i] = value;
			// chech to see if element is and keep index at the same place 
			if (odd[i] == 0 ) 
				i--;
			i++;
			value++;
		}
		return odd;// return a array of odd number  
	}

	/***Populate an array of even numbers 
	 * @param array of even numbers  
	 * @return array of even numbers */
	public static int[] Even(int[] even ) {
		/*int index = 0;*/
		int i=0;
		int value = 1;
		while ( i< even.length) {
			// check if the loop variable is even
			if (value%2 == 0 ) 
				// assign loop value to element in array 
				even[i] = value;
			if (even[i] == 0 ) 
				i--;
			i++;
			value++;
		}
		return even;// return an array of even 
	}
/***Populate an array of even numbers 
	 * @param array of even numbers  
	 * @return array of even numbers */
	public static int[] Prime(int[] prime ) {
		/*int index = 0;*/
		int i=0;
		int value = 2;
		int factor = 0;
		while ( i< prime.length) {
			factor = 0;
			if (value <= 1) continue;
			// identify manu how factors the value has 
			for (int j=1; j<= value; j++) {
				// checks the value has factor
				if ((value%j) == 0 ) 
					factor++;
				// assign loop value to element in array 
			}
			// checks if value has only two factor it is a prime number
			if (factor == 2)  
				// assign the value with only two factors to the element in the array
				prime[i] = value;
			// checks if element is array is 0 
			if (prime[i] == 0 ) i--;// ensure index does not move up
			++i;
			value++;
		}
		return prime;// return an array of prime numbers  
	}


	/***2 dimensional array printed in a matrix format 
	 * @param  2 dimensional array  
	 *  */
	public static void print(int[][] arr) {
		int elementPerRow = 9;
		for (int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if (arr[row][col] != 0) {
					System.out.print(arr[row][col]+ ", "); 
					if ((col+1)%elementPerRow == 0)
						System.out.println();
				}
				
			}
			System.out.println("\n");
		}
	}

	/*** array printed in a matrix format 
	 * @param  1 dimensional array  
	 *  */
	public static void print1d(int[] arr) {
		int elementPerRow = 9;
		for (int i=0; i< arr.length; i++) {
				if (arr[i] != 0) {
					System.out.print(arr[i] + ", ");
				if ((i+1)%elementPerRow == 0) {
					System.out.println();
				}
			}
		}
	}
}