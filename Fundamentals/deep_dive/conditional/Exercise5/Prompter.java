import java.util.Scanner;;

public class Prompter {
	/**
	 * @param promptMessage The message to display to the user as a prompt.
	 * @return The user's input as a String.
	 * **/
	public static String prompt(String message) {
		System.out.print(message);
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}