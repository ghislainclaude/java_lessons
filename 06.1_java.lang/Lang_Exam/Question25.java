public class Question25 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5};
		char[] arrch = {'a', 'b', 'c', 'd', 'e'};
		byte[] arrb = {1, 2, 3, 5};
		//Charset charset = null;
		String s = new String(); // String()
		String s1 = new String(arrb); // String(byte[] bytes)
		//String s2 = new String(arrb, charset); // String(byte[] bytes, Charset charset)
		String s3 = new String(arrb, 0);// String(charset int hibyte)
		String s4 = new String(arrb, 0, 1);// String(charset, int offset, int length)
		//String s5 = new String(arrb, 5, 5, charset);
		String s5 = new String(arrb, 0, 1, 2);// String(charset, int hibyte, int offset, int count)
		//String s6 = new String(arrb, "Hello, world");// String(byte[] bytes, String name)
		String s7 = new String(arrch);// String(char[] value)
		String s8 = new String(arrch, 3 , 2);// String(char[] value, int offset, int count)
		String s9 = new String(arrInt, 0, 2);// String(int[] codePoints, int offsets, int count)
		String s10 = new String("Wagwann");// String(String original )
		String s11 = new String(new StringBuffer("Wagwann"));// String(StringBuffer buffer)
		String s12 = new String(new StringBuilder("Wagwann"));// String(StringBuilder builerd)
	}
}