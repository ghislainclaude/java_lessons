public class NestedFor {
	public static void main(String[] agrs) {
		for (int i = 0; i<5; i++ ) {
			//System.out.println("Outer =" + i);
			for (int j=0; j<5; j++) {
				System.out.println("Outer = " + i + " Inner = " + j);
			} 
		}
	}
}