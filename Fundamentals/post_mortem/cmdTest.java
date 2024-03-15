/**
 * 
 * The The echoing command is java cmdTest "127" 127**/


public class cmdTest {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (a == b) {
			System.out.println("All equal");
		}else {
			System.out.println("not all equal");
		}
	}
}