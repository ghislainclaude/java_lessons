import java.util.Scanner;
import java.util.regex.*;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones." +
							"Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers,");
		String max = prompt("Starting from 0 enter an number of where you like the Fibonacci sequence to end at: ");
		while (!validate(max) || Integer.parseInt(max) < 0) {
			max = prompt("PLease enter a valid number of where you like the Fibonacci sequence to end at:  ");
		}
		// once out the loop then call fibona
		// create an array large enough to house all Fibonacci sequence number 
		int[] fibonacci_seq = new int[Integer.parseInt(max)];
		/*for (int i = 0; i< Integer.parseInt(max); i++)
			fibonacci_seq[i] = fibonacci( Integer.parseInt(max));*/
		// re-assign the values Fibonacci sequence into the array 
		//fibonacci_seq = fibonacci(Integer.parseInt(max), fibonacci_seq);
		// pretty print the array 
		printArray("Fibonacci sequence: ", fibonacci_seq);
	}	
	/**Checks in the string is valid digit number 
	 * @param string value
	 * @return a boolean value**/
	public static boolean validate(String option) {
		// boolean isOperator = false;
		String regex = "[+-]?[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(option);
		// return a boolean if the is a digit between 0 to 9
		return matcher.find();
	}

	/***Prompt the user with message aswell as take in the ipput string 
	 * @param string value message **/
	public static String prompt(String message) {
		System.out.print(message);
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		return userInput;
	}


	/**This method stores the retruns the fibonacci number as elements in an array 
	 * @param integer variable, and array 
	 * @return array of integer **/
	public static int[] fibonacci(int max, int[] sequence) {
		// Intialize the terms
		int num1=0, num2 =1;
		for (int i=0; i< max; i++) {
			sequence[i] = num1;
			// swap 
			// we get the next number after the first two numnber by adding the prevouse number
			// numner 1 and 2 
			int temp = num2 + num1;
			num1 = num2;
			num2 = temp;
			// we swap the number so that we number increase afther the addition of the  prevouse numbers
		}
		return sequence;
	}


	/**
	 * Example of dynamic programming 
	 * This method stores the retruns the fibonacci number as elements in an array 
	 * @param integer variable
	 * @return array of integer **/
	/*public static int fibonacci(int n) {
		// array to house the fibonacci numbers
		int f[] = new int[n+2];
		int i;
		f[0] = 0;
		f[1] = 1;
		for (i=2; i<= n; i++) {
			// add the 2 pervious number together 
			f[i] =  f[i-1] + f[i-2];
		}
		// nth fibonacci
		return f[n];
	}
*/
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