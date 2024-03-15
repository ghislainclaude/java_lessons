public class AllEqual {
	public static void main(String[] args) {
		String[] values= new String[]{};
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[3]);

		if (a==b && a==c) {
			System.out.println("all equal");
		}else {
			System.out.println("not all equal");
		}
	}
}