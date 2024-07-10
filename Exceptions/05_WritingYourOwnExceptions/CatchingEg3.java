public class CatchingEg3 {
	public void doSomething() throws CLaudeException{
		int i = 42;
		
		if(i > 30){
			throw new CLaudeException("Claude an error has occurred");
		}
		System.out.println("Doing something...");
	}
}
