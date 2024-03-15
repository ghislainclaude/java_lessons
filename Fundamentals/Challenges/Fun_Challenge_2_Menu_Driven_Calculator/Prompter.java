import java.util.*;


public class Prompter {
	public static String prompt(String message) {
		System.out.print(message);
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		return userInput ;
	}
}


/***
 * The are four type of Conversion in java
 * Implicit Type Conversion
 * Explicit Type Conversion 
 * Widening Casting 
 * Narrowing Casting
 * */