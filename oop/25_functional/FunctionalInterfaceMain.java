public class FunctionalInterfaceMain {
	public static void main(String[] args) {

		/*int a = 5;
		functionalInterface02 funInter = (int x) -> ++x;

		int result = funInter.increment(a);
		System.out.println(result); */
		int a = 5, b = 6;
		functionalInterface03 funInter = (int x , int y) -> x+ y;

		int result = funInter.add(a, b);
		System.out.println(result);
	}
}