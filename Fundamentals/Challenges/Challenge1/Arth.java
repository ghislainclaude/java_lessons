public class Arth {
	public static void main(String[] args) {
		/**
		 * if we store a value of smaller datatype to variable of larger datatype then the value
		 * is implicitly type casted(autmattically converted) into a larger datatype variable
		 * */
		char c = 'a';
		char b = c + 'b';
		System.out.println(b);
	}
}