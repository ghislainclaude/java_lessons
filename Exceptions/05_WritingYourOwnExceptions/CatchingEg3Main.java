public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}catch (CLaudeException ce) {
			System.out.println(ce.getMessage());
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
