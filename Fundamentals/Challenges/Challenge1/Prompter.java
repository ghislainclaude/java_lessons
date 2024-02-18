import java.util.Scanner;

public class Prompter {
	/*
	* Prompt the user for the iput and then get it nad retrun it as a 
	string*/
	public static String prompt(String promtMessage) {
		Scanner scan = new Scanner(System.in);
		System.out.print(promtMessage);
		String userInput = scan.next();
		return userInput;
	}
}