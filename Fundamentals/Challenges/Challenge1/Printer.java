public class Printer{
	/**
     * Prints various details about a person, including name, surname, date of birth, distance from a favorite store, age, and miles.
     * It also includes conversions of age to milliseconds, hexadecimal, and binary, and distance conversion to meters.
     *
     * @param name The person's first name.
     * @param surname The person's surname.
     * @param dateOfBirth The person's date of birth.
     * @param distanceFromStore The distance from the person's favorite store in kilometers.
     * @param age The person's age in years.
     * @param miles The distance from the store in miles.
     */
	public static void print(String name, String surname, 
		String date_of_birth, String distance_from_store, int age, int miles) {
		//Print header and personal information
		System.out.println("\n======================================================================================");
		System.out.println("Hello, " + name + " " + surname);
		System.out.println("======================================================================================");
		System.out.println("Your name is " + name);
		System.out.println("Your surname is " + surname);
		System.out.println("Your date of birth is " + date_of_birth);
		// Print distance from store
		System.out.println("======================================================================================");
		System.out.println("Your favourite store " + distance_from_store + "km from your home?");
		System.out.println("You are "+ age +" years old" );
		System.out.println("Your age "+ (long)(age*31556926000L) +" year old in milliseconds" );
		// Print age in hexadecimal and binary
		System.out.println("======================================================================================");
		System.out.println("You age is "+ (Integer.toHexString((int)(age))) +" in hexadecimal" );
		System.out.println("You are "+ decimalToBinary((int)(age))+ " old in binary");
		// Print distance in miles and meters
		System.out.println("======================================================================================");
		System.out.println("The distance form the shop is " + miles + " in  miles");
		System.out.println("The distance form the shop is " + (int)(miles*1609.34) + " in meter");
		System.out.println("======================================================================================");
	}
	/**
     * Converts an integer to a binary string.
     *
     * @param binary An array of binary digits.
     * @param id The number of digits in the binary representation.
     * @return The binary string representation.
     */
	private static String printBinary(int[] binary, int id) {
		StringBuilder stringbinary = new StringBuilder();
		for (int i=id - 1; i >= 0; i--) {
			stringbinary.append(binary[i]);
		}
		return  stringbinary.toString();
	} 
	/**
     * Converts a decimal number to its binary representation as a string.
     *
     * @param number The decimal number to convert.
     * @return The binary string representation of the number.
     */
	private static String decimalToBinary(int number) {
		// initialzie an array and give it binary size 
		int[] binary = new int[35];
		int id = 0;
		// Convert the decimal number to binary 
		while (number > 0) {
			binary[id++] = number %2;
			number = number / 2;
		}
		return printBinary(binary, id);
	}
}