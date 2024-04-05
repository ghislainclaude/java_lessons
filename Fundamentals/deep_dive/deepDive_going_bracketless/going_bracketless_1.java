public class going_bracketless_1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		populate(arr);
		print(arr);
	}

	/**
	 * populate the array using an loop **/
	 public static void populate(int[] arr) {
	 	for (int i=0; i< arr.length; i++) 
	 		arr[i] = i;// makes the intialized loop value the element in the array 
	}

	/**
	 * If the value is greater than 1 it should print greater than 1.
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
		for (int i=0; i< arr.length; i++) 
			// checks if element is greater than one and smaller than 3
			if (arr[i] > 1 && arr[i] < 3)
				System.out.println(arr[i] + " greater than " + arr[i -1]);
			// checks if element is greater than 2 and smaller than 4
			else if (arr[i] > 2 && arr[i] < 4)
				System.out.println(arr[i] + " greater than "+  arr[i -1]);
			// checks if element is greater than 3 and smaller than 5
			else if (arr[i]> 3 && arr[i] < 5)
				System.out.println(arr[i] +" greater that " +  arr[i -1]);
			// checks if element is greater than 4 and smaller than 6
			else if (arr[i] > 4  && arr[i] < 6)
				System.out.println(arr[i] +" greater than " +  arr[i -1]);
			// checks if element is greater than 5 and smaller than 7
			else if (arr[i] > 5  && arr[i] < 7)
				System.out.println(arr[i] + " greater than "+  arr[i -1]);
			// checks if element is greater than 6 and smaller than 8
			else if (arr[i] > 6 && arr[i] < 8)
				System.out.println(arr[i] + " greater than " +  arr[i -1]);
			// checks if element is greater than 7 and smaller than 9
			else if (arr[i] > 7 && arr[i] < 9)
				System.out.println(arr[i]+  " greater than " +  arr[i -1]);
			// checks if element is greater than 8 and smaller than 6
			else if (arr[i] > 8 && arr[i] < 10)
				System.out.println(arr[i] +" greater than " +  arr[i -1]);
	}

	/**Alternatively***/
	/*public static void print(int arr[]) {
		// iterate through each element in the array 
		String message = "";
		for (int i=0; i< arr.length; i++) 
			// checks if element is greater than one and smaller than 3
			message =  (arr[i] > 1 && arr[i] < 3)? arr[i] + " greater than " + arr[i -1 ]: arr[i] + "is not greater than " + arr[i -1 ];// print the value is greater than 1 it should print greater than 2.
			System.out.println(message);
			// checks if element is greater than 2 and smaller than 4
			message = (arr[i] > 2 && arr[i] < 4) ? arr[i] + "is not greater than " + arr[i -1 ] : arr[i] + "is not greater than " + arr[i -1 ];
			System.out.println(message);
			// checks if element is greater than 3 and smaller than 5
			message = (arr[i]> 3 && arr[i] < 5) ? arr[i] + "is not greater than " + arr[i -1 ] : arr[i] + "is not greater than " + arr[i -1 ];
			System.out.println(message);
			/*else if ( i > 3 && i < 5)
				System.out.println(i +" greater that " +  [i -1]);// the value is greater than 1 it should print greater than 4.
			// checks if element is greater than 4 and smaller than 6
			else if ( i > 4  && i < 6)
				System.out.println(i +" greater than " +  [i -1]);// the value is greater than 1 it should print greater than 5.
			// checks if element is greater than 5 and smaller than 7
			else if (i > 5  && i < 7)
				System.out.println(i + " greater than "+  [i -1]);// 
			// checks if element is greater than 6 and smaller than 8
			else if (i > 6 && i < 8)
				System.out.println(i + " greater than " +  [i -1]);
			// checks if element is greater than 7 and smaller than 9
			else if (i > 7 && i < 9)
				System.out.println(i +  " greater than " +  [i -1]);
			// checks if element is greater than 8 and smaller than 6
			else if ( i > 8 && i < 10)
				System.out.println( i +" greater than " +  [i -1]);
	}*/
}