 public class ClassCastTest {
	public static void main(String[] args) {
		
		Object exception = new Object();
		Exception exception2;
		
		System.out.println("Step 1");
		if (exception instanceof Exception)
			exception2 = (Exception)exception;
		
		System.out.println("Step 2");
	}
}
