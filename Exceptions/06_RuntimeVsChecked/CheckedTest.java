public class CheckedTest {
	public static void main(String[] args) throws ClaudeException  {
		throw new ClaudeException("Claude we have an error occured.");
	}
}
