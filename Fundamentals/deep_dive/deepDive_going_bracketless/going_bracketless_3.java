public class going_bracketless_3 {
	public static void main(String[] args) {
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
		If the value is greater than 2 it should print greater than 2.
		If the value is greater than 3 it should print greater than 3.
		If the value is greater than 4 it should print greater than 4.
		If the value is greater than 5 it should print greater than 5.
		If the value is greater than 6 it should print greater than 6.
		If the value is greater than 7 it should print greater than 7.
		If the value is greater than 8 it should print greater than 8.

	**/
	public static void print(int arr[]) {
		int i=0;
		if (i< arr.length) {
			do
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
				System.out.println(arr[i] + " is greater than 5");// 
				// checks if element is greater than 6 and smaller than 8
				else if (arr[i] > 6 && arr[i] < 8)
				System.out.println(arr[i] + " is greater than 6"  );
				// checks if element is greater than 7 and smaller than 9
				else if (arr[i] > 7 && arr[i] < 9)
				System.out.println(arr[i]+  " is greater than 7"  );
				// checks if element is greater than 8 and smaller than 6
				else if (arr[i] > 8 && arr[i] < 10)
				System.out.println(arr[i] +" is greater than 8" );
			while (++i < arr.length);
		}
	}


	/*Alternative **/
	/*public static void print(int arr[]) {
		int i=0;
		if (i< arr.length) {
			do
				switch(arr[i]) {
					case 2:
						System.out.println(arr[i] + " is greater than 1"  );
					break; 
					case 3:
						System.out.println(arr[i] + " is greater than 2" );
					break;
					case 4:
						System.out.println(arr[i] +" is  greater that 3"   );
					break;
					case 5:
						System.out.println(arr[i] +" is  greater than 4"   );
					break;
					case 6:
						System.out.println(arr[i] + " is  greater than 5");
					break; 
					case 7:
						System.out.println(arr[i] + " is greater than 6"  );
					break; 
					case 8:
						System.out.println(arr[i]+  " is greater than 7"  );
					break; 
					case 9: 
						System.out.println(arr[i] +" is greater than 8" );
					break;
					default:
						System.out.println(arr[i] +" is not greater than 1" );
					break;
				}
			while (++i < arr.length);
		}
	} */
}