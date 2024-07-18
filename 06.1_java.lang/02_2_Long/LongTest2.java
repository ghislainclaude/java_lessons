public class LongTest2 {
	public static void main(String[] args) {
		//String nm = ;
		Long val = new Long("2");
		long val2 = val.longValue();
		Long val3 = new Long(val2);
		Long val4 = Long.parseLong("123");
		System.out.println("Long: " + val + ", long: " + val2 + ", long to Long: " + val3 + "\n" + ", String to Long: " + val4);
	}
}