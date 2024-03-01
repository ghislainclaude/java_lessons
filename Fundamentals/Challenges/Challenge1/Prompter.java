import java.util.Scanner;// Import the Scanner class for reading input from the console

public class Prompter {
	/***
	 * @param promptMessage The message to display to the user as a prompt.
	 * @return The user's input as a String.
	 * */
	public static String prompt(String promtMessage) {
		System.out.print(promtMessage);  // Display the prompt message to the user
		Scanner scan = new Scanner(System.in);// Create a new Scanner object to read input from the console
		String userInput = scan.nextLine();// Read the nextLine token of input from the user and store it in a String variable
		return userInput;// Return the user's input as a String
	}
}