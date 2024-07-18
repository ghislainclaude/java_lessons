public class Question29 {
	public static void main(String[] args) {
		String s = "Contentment!";

		int middle = s.length()/ 2;
		String nt = s.substring(middle -1, middle +1 );
		System.out.println(s.lastIndexOf(nt, middle));

		char c1 = ("abcdef").charAt(3);

		char c = s.charAt(0);
		System.out.println(c1);
	}
}


