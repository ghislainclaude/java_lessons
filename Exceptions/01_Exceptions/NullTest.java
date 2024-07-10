public class NullTest {

	static NullObject nullObject;
	
	public static void main(String[] args) {
		try {
			System.out.println("Start");
			nullObject.test();
			System.out.println("Finished");
		}catch (NullPointerException e)
		{
			System.out.println("Error" + e);
		}
		
	}

}
