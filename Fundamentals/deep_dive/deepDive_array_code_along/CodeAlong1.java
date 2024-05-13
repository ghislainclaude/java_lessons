wupublic class CodeAlong1 {
	public static void main(String[] args) {
		count();
		int max = 15;
		// populated 1d array of size of 25
		int[] max_array = {
						   69, 138, 207, 276, 345, 414, 
					       483, 552, 621, 690, 759, 828,
					       897, 966, 1035, 1104, 1173, 1932,
					      1242, 1311, 1380, 1449, 1514, 2001,
					      1587, 1656, 1725, 1794, 1863, 2070
					    };
		// populated 2d array of size 10X10  
		int[][] max_2d_array = {
					{    69,    138,   207,    276,   345,  414,    1104,    12,     24,    55  }, 
					{   483,    552,   621,    690,   759,  828,     639,   721,     13,   8008 },
					{   897,    966,  1035,   1104,  1173, 1932,      882,  365,     81,   7005 },
					{	 70,     71,    72,     76,    83,  419,     446,   474,    503,   533 },
    				{	 89,     96,   104,    113,   123,  734,     771,   809,    848,   888 },
    				{	134,    146,   159,    173,   188,  564,     596,   629,    663,   698 },
    				{	204,    221,   289,    258,   278,  929,     971,  1014,   1058,  1103 },
    				{	299,    321,   344,    386,   393,  929,     971,  1014,   1058,  103 },
    				{   1587,  1656,   1725,  1794,  1863,  2070,   1149, 1196,   1244,  1283 },
    				{   1242,  1311,   1380,  1449,  1514,  2001,    929,   971,   1014,  1058 }
    				};

    	count(max);
    	count(max_array); 
		count(max_2d_array);
	}

	/*public static void count() {
		System.out.println("************************* Step One ***************************");
		for (int i=0; i< 10; i++) {
			System.out.print((i) + ", ");
		}
	}*/

	/*** Step 2  ***/
	public static void count() {
		System.out.println("************************* Step Two ***************************");
		int i=0;
		if (i< 10) {
			do {
				System.out.print((i) + ", ");
				i++;
			}while (i< 10);
		}
	}

	/*** Step 3 ***/
	/*public static void count() {
		System.out.println("************************* Step Three ***************************");
		int i=0;
		while (i< 10) {
			System.out.print(i + ", ");
			i++;
		}
	}*/
	/*** Step 4 
	 * prints out the the index value based on variable 
	 * @param integer variable ***/
	public static void count(int max) {
		System.out.println("\n************************* Step Four ***************************");
		int i=0;
		while (i< max) {
			System.out.print((i) + ", ");
			i++;
		}
	}

	/*** Step 5 part one
	 * print code of one dimensional array 
	 * @param array of integers ***/
	public static void count(int[] max) {
		System.out.println("\n************************* Step Five ***************************");
		int elementPerRow = 5;
		int i=0;
		while (i< max.length) {
			System.out.print((max[i]) + ",   ");
			
			if ((i+1)%elementPerRow == 0) {
				System.out.println();
			}
			i++;
		}
	}

	/*** Step 5 part two
	 * prints the content of the 2d array 
	 * @param 2 dimensional array of integers ***/
	public static void count(int[][] max) {
		System.out.println("\n************************* Step Five ***************************");
		int elementPerRow = 5;
		int row=0;
		while (row< max.length) {
			int col = 0;
			while (col < max[row].length) {
				System.out.print(max[row][col] + ", ");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}