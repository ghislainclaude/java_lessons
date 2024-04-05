public class going_bracketless_2 {
	public static void main(String... args) {
		int[] arr = new int[10];
		populate(arr);
		print(arr);
	}

	/**
	 * populate the array using an loop **/
	 public static void populate(int[] arr) {
	 	int i=0;
	 	while( i< arr.length) 
	 		arr[i] = i++;// makes the intialized loop value the element in the array 
	}

	/**
	 *  If the value is greater than 1 it should print greater than 1.
		If the value is greater than 1 it should print greater than 2.
		If the value is greater than 1 it should print greater than 3.
		If the value is greater than 1 it should print greater than 4.
		If the value is greater than 1 it should print greater than 5.
		If the value is greater than 1 it should print greater than 6.
		If the value is greater than 1 it should print greater than 7.
		If the value is greater than 1 it should print greater than 8.
		If the value is greater than 1 it should print greater than 9.

	**/
	public static void print(int arr[]) {
		// iterate through each element in the array
		int i=0; 
		while (++i < arr.length) 
			// checks if element is greater than one and smaller than 3
			if (arr[i] > 1 && arr[i] < 3)
				System.out.println(arr[i] + " is greater than 1"  );
			// checks if element is greater than 2 and smaller than 4
			else if (arr[i] > 2 && arr[i] < 4)
				System.out.println(arr[i] + " is greater than 2" );
			// checks if element is greater than 3 and smaller than 5
			else if (arr[i]> 3 && arr[i] < 5)
				System.out.println(arr[i] +" is greater that 3"   );
			// checks if element is greater than 4 and smaller than 6
			else if (arr[i] > 4  && arr[i] < 6)
				System.out.println(arr[i] +" is greater than 4"   );
			// checks if element is greater than 5 and smaller than 7
			else if (arr[i] > 5  && arr[i] < 7)
				System.out.println(arr[i] + " is greater than 5");
			// checks if element is greater than 6 and smaller than 8
			else if (arr[i] > 6 && arr[i] < 8)
				System.out.println(arr[i] + " is greater than 6"  );
			// checks if element is greater than 7 and smaller than 9
			else if (arr[i] > 7 && arr[i] < 9)
				System.out.println(arr[i]+  " is greater than 7"  );
			// checks if element is greater than 8 and smaller than 6
			else if (arr[i] > 8 && arr[i] < 10)
				System.out.println(arr[i] +" is greater than 8" );
	}
}