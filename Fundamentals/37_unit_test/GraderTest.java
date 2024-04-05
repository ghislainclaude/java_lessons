import org.junit.*;
import static org.junit.Assert.*;

public class GraderTest {
	@Test 
	public void fiftyNineShouldReturnF() {
		var grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(59));
	}
}