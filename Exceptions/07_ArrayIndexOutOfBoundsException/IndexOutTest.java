public class IndexOutTest {
	public static void main(String[] args)  {
		try {
			int [] array = {444,55,666};
		
			int value = array[4];
		
			System.out.println("Value = "+value);
		}catch (RuntimeException re) {
			System.out.println("Array index is out of bounds ");
		}
		

	}
}
