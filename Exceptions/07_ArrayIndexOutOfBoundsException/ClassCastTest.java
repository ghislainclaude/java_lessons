 public class ClassCastTest {
	public static void main(String[] args) {
		
		Object exception = new Object();
		
		System.out.println("Step 1");
		
		Exception exception2 = (Exception)exception;
		
		System.out.println("Step 2");
	}
}
