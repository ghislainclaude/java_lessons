public class fizzbuzz {
	public static void main(String[] args) {
		// iterate through number form 1 to 100 
		for (int i=1; i< 100; i++) {
			String message = "";
			// numbers which are multiples of both three and five print "FizzBuzz".
			if (i%3==0 && i%5==0) 
				message = "FizzBuzz";
			// multiples of three print "Fizz"
			else if (i%3==0)
				message = "Fizz";
			// multiples of five print "Buzz".
			else if (i%5==0)
				message = "Buzz";
			else 
				message=Integer.toString(i);
			print(message);
		}
	}
	/**Accept ans string and output it **/
	public static void print(String message) {
		System.out.print(message+ ", ");
	}
}