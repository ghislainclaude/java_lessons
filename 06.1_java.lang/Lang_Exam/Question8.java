public class Question8 {
	public static void main(String[] args) {
		String s1 = "Whatever";
		String s2 = new String("Whatever");
		String s3 = new String("Who");
		/*theb compiler will create a one copy of whatever and
		put in the ppl and there will be strings Whatever and Whpo created 
		at runtime */
		/*THe compile wull create a string whatever and put 
		in the pool, and there wull be a string created at runtime*/
	}
}