import java.util.Scanner;
import java.util.regex.*;

public class CodeAlongMenu {
	public static int[][] table;
	public static void main(String[] args ) {
		// populated 2d array of size 10X10  
		table = new  int[][]{
					{    69,    138,   207,    276,   345,  414,    1104,    12,     24,    55  }, 
					{   483,    552,   621,    690,   759,  828,     639,   721,     13,   8008 },
					{   897,    966,  1035,   1104,  1173, 1932,     882,  365,     81,   7005 },
					{	 70,     71,    72,     76,    83,  419,     446,   474,    503,   533 },
    				{	 89,     96,   104,    113,   123,  734,     771,   809,    848,   888 },
    				{	134,    146,   159,    173,   188,  564,     596,   629,    663,   698 },
    				{	204,    221,   289,    258,   278,  929,     971,  1014,   1058,  1103 },
    				{	299,    321,   344,    386,   393,  929,     971,  1014,   1058,  103 },
    				{   1587,  1656,   1725,  1794,  1863,  2070,   1149, 1196,   1244,  1283 },
    				{   1242,  1311,   1380,  1449,  1514,  2001,    929,   971,   1014,  1058 }
    			};
    	int option = printMenu();
    	switch (option) {
    		case 1:
    			printArray("row:", getRow(promptRow()));
    		break;
    		case 2:
    			printArray("column:", getColumn(5));
    		break;
    		case 3:
    			System.out.println("Cell Value: " +  getCell(promptCell()));
    		break;
    	}
    	/*;
    	
    	System.out.println("Cell Value: " +  getCell(-1, 5));*/
	}

	public static int printMenu() {
		System.out.println("************************************************************************************************");
		System.out.println("					row, column or cell based 													");
		System.out.println("					1. row 																		");
		System.out.println("					2. columns																	");
		System.out.println("					3. getCell																	");
		System.out.println("					4. exit																		");
		System.out.println("************************************************************************************************");
		// 
		String option = prompt("Select one of the option above by entering one of the numbers of the option above (1, 2, ..or 4): ");
		while (!validate(option) || ( Integer.parseInt(option) <= 0 || Integer.parseInt(option) >=5 )) {
			option = prompt("Please Select one of the option above by entering one of the numbers of the option above (1, 2, ..or 4): ");
		}
		return Integer.parseInt(option);
	}

	public static boolean validate(String option) {
		// boolean isOperator = false;
		// Build a 
		String regex = "[+-]?[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(option);
		// return a boolean if the is a digit between 0 to 9
		return matcher.find();
	}


	public static String prompt(String message) {
		System.out.print(message);
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		return userInput;
	}
	/**
     * prompt the user return the row at the given position
     * @return an array of integer**/
	public static int promptRow() {
		String row = prompt("Enter the number of the row you would like to view: ");
		while (!validate(row) ||  Integer.parseInt(row) < 0 && Integer.parseInt(row) <  table.length-1 ) {
			row = prompt("PLease Enter the number (0 t0 9) of the row you would like to view: ");;
		}
		return Integer.parseInt(row);
	}
	/**
     * prompt the user return the row at the given position
     * @return an array of integer**/
	public static int promptColumn() {
		String col = prompt("Enter the number of the column you would like to view: ");
		while (!validate(col) ||  Integer.parseInt(col) < 0 && Integer.parseInt(col) <  table.length -1 ) {
			col = prompt("PLease Enter the number (0 t0 9) of the row you would like to view: ");;
		}
		return Integer.parseInt(col);
	}
	
	public static int[] promptCell() {
		int [] co_ordinates = new int[2];
		co_ordinates[0] = promptRow();
		co_ordinates[1] = promptColumn();
		return co_ordinates;
	}
	/**
     * Alternative
     * return the row at the given position
     * @param variable integers 
     * @return an array of integer**/
	/*public static int[] getRow(int row) {
		// checks is the row value is in bounds of array
		if (row >= 0 && row < table.length )
			return table[row];
		else 
			throw new IndexOutOfBoundsException("The row " + row + " is out of bounds");
	}*/


	/**
     * 
     * return the row at the given position
     * @param variable integers 
     * @return an array of integer**/
	public static int[] getRow(int row) {
		// checks is the row value is in bounds of arra
		return (row >= 0 && row < table.length )? table[row]: new int[0];
	}

	public static int[] ErrorMessage(int row) {
		throw new IndexOutOfBoundsException("The row " + row + " is out of bounds");
	}
	/**
     * return a array of column 
     * @param  variable integers 
     * @return an array of integer**/
	public static int[] getColumn(int column) {
		int value = 0;
		int[] columns = new int[table.length];
		// checks if the column us out of bounds 
		if (column >= 0 && column < table.length ) {
			for (int i= 0; i < table.length; i++) {
				for (int j=0; j< table[i].length; j++) {
					if (j == column )
						columns[value++] = table[i][j]; 
				}
			}
		}
		else 
			throw new IndexOutOfBoundsException("The column " + column + " is out of bounds");
		return columns;
	}

	/**
     * return a value  
     * @param  variable integers 
     * @return an value of integer**/
	/*public static int getCell(int row, int column) {
		// check if the row and column is a bounds of the array 
		if ((row > 0 && row < table.length ) && (column > 0 && column < table.length )) 
			return table[row][column];
		else 
			throw new IndexOutOfBoundsException("The column or row" + column + " or " + row + " is out of bounds");
	}*/

	/**
     * Alternative
     * return a value  
     * @param  two variable integers 
     * @return an value of integer**/
	public static int getCell(int[] coordinates) {
		// checks is the row value is in bounds of arra
		return (coordinates[0] >= 0 && coordinates[0] < table.length ) && (coordinates[0] >= 0 && coordinates[0] < table.length )? table[coordinates[0]][coordinates[1]] : ErrorMessage(coordinates[0], coordinates[1]);
	}
	/**
     * Overloading 
     * 
     * @param two variable integers 
     * @return Error message **/
	public static int ErrorMessage(int row, int column) {
		throw new IndexOutOfBoundsException("The column or row" + column + " or " + row + " is out of bounds");
	}

	/**
	 * 
     * pretty print each element to show the default values
     * @param  string prefix, array of integers **/
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}