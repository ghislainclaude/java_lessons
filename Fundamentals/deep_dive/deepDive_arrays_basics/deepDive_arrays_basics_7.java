public class deepDive_arrays_basics_7 {
	public static void main(String[] args) {
		int[][] array = {
    						{70, 71, 72, 76, 77 ,83},
    						{89, 88 ,96, 104, 111 ,113, 123},
    						{134, 146, 154 ,159, 173, 188},
    						{204, 221, 231 ,289, 258, 278},
    						{299, 321, 344, 352 ,386, 393},
    						{419, 446,  474, 451, 503, 533},
    						{550 ,564, 596, 629, 663, 698},
    						{734, 771, 781 ,809, 848, 888},
    						{902, 929, 971,  1014, 1058, 1001 ,1103},
    						{1149, 1155, 1196, 1244, 1283 ,1333}
    	};
    	System.out.println("Here is the 2 dimensional array printed in a matrix format:");
    	Print(array);
    	System.out.println("\n**************************************************************************");
		System.out.println("Now I add 1 to each element in the array");
		AddToEach(array);
		System.out.println("Here is the changed array printed in a matrix format:");
		// print the incremented values in the array
		Print(array);
		System.out.println("\n**************************************************************************");
	}

	/**
	 * print each element using a for loop.
	 * **/
	public static void Print(int[][] array) {
		for (int i=0; i<array.length; i++) {
			// iterate throught the array 
			for (int j=0; j<array[i].length; j++) {
				System.out.print(""+ array[i][j] + ", ");
			}
			System.out.println();
		}
	}

	/**
	 * add 1 to each element in the 2 dimensiona array.
	 * **/
	public static void AddToEach(int[][] array) {
		for (int i=0; i< array.length; i++) {
			/*iterate through each element in the array */
			for (int j=0; j< array[i].length; j++ ) {
				array[i][j] += 1;// add 1 to each element
			}
		}
	}

} 