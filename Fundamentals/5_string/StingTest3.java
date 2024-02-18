import java.util.*;

public class StingTest3{
	public static void main(String[] args) {
		
		System.out.println("PLease enter an random sentance:");
		Scanner scan = new Scanner(System.in);
		String masterline = scan.next();
		System.out.println("PLease enter the rest of this sentence");
		String rest = scan.next();
		String totaluserInput = masterline.concat(rest);
		System.out.println("Here is the concatenated Compound Sentence "+ totaluserInput);
	}
}