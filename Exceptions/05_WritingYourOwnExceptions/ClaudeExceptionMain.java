public class ClaudeExceptionMain {
	public static void main(String[] args) {
		try {
			throw new CLaudeException("Wagwann");
		}catch (CLaudeException ce) {
			System.out.print(ce.getMessage());
		}
	}
}