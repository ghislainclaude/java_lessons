public class String_StartsWith {
	public static void main(String[] args) {
		String s = "Claude";
		boolean boolVal = s.startsWith("C");
		System.out.println(boolVal);


		boolean boolVal2 = s.startsWith("C", 0);
		System.out.println(boolVal2);
	}
}