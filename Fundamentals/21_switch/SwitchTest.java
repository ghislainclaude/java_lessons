public class SwitchTest {
	public static void main(String[] args) {
		int a= 2;


		switch (a) {
			case 1:
				System.out.println("Cool 1");
			break;
			case 2:
				System.out.println("Cool 2");
			break;
			case 3:
				System.out.println("Cool 3");
			break;
			default:
			System.out.println("Not Cool"); 
		}

		// if (a == 1) {
		// 	System.out.println("Cool 1");
		// }else if (a == 2) {
		// 	System.out.println("Cool 2");
		// }else if (a == 3) {
		// 	System.out.println("Cool 3");
		// }else {
		// 	System.out.println("Not cool");
		// }
	}
}