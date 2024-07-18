public class ByteTest2 {
	public static void main(String[] args) {
		String s = "-123";
		Byte val =  new Byte(s);
		byte val2 = Byte.valueOf(s);
		System.out.println(val2+", " + val);
	}
}