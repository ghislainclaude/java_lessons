import java.util.Scanner;


public class Prompter {
	/**This method prints a display message and collect the user input and return it as a string
	 * @param String variable 
	 * @return the user input as string **/
	public static String prompt(String message) {
		System.out.print(message);
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		return userInput;
	}
}