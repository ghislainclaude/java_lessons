public class BreakTest {
	public static void main(String[] args) {
		int limit = 7;
		for (int i = 0; i <10; i++) {
			System.out.println("Counter = " + i);
			id (i == limit) break;
		}
	}
}