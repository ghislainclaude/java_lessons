public class deepDive_arrays_basics_9 {
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
    	System.out.println("Here are the numbers that are even numbers and divisible by 11 from the array 2 dimensional array printed: ");
    	Print(array);
    	System.out.println("\n**************************************************************************");
	}

	/**
	 * print even numbers and numbers divisible by 11 only.
	 * **/
	public static void Print(int[][] array) {
		int i=0;
		int j=0;
		while ( i<array.length) {
			while ( j<array[i].length) {
				int even  = array[i][j]%2;
				// checks if each elements is even 
				switch (even) {
					case 0:
						// check if each element is divisible by 11 
						int divisible = array[i][j]%11;
						switch (divisible) 
						{
							case 0:
								System.out.print(""+ array[i][j] + ", ");
							break;
						}
					break; 
				}
				j++;
			}
			i++;
		}
	}

	/**
	 * add 1 to each element in the 2 dimensiona array.
	 * **/
	public static void AddToEach(int[][] array) {
		int i=0;
		int j=0;
		// check if the boolean expression evaluates to true 
		while ( i< array.length) {
			while ( j< array[i].length ) {
				array[i][j] += 1;//add 1 to each element
				j++;
			}
			i++;
		}
	}
}