public class deepDive_arrays_basics_8 {
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
    	System.out.println("Here are the numbers that are even numbers and divisible by 1 from the array 2 dimensional array printed: ");
    	Print(array);
    	System.out.println("\n**************************************************************************");
	}

	/**
	 * print even numbers and numbers divisible by 11 only.
	 * **/
	public static void Print(int[][] array) {
		for (int i=0; i<array.length; i++) {
			// iterate through the array
			for (int j=0; j<array[i].length; j++) {
				// checks even numbers and numbers divisible by 11 only.
				if (array[i][j]%2 == 0 && array[i][j]%11 == 0) {
					System.out.print(""+ array[i][j] + ", ");
				}
			}
		}
	}

	/**
	 * add 1 to each element in the array.
	 * **/
	public static void AddToEach(int[][] array) {
		for (int i=0; i< array.length; i++) {
			// iterate through the elements of the 2d array 
			for (int j=0; j< array[i].length; j++ ) {
				array[i][j] += 1;//add 1 to each element
			}
		}
	}

} 