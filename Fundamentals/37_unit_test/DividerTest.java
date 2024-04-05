import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest {
	@Test 
	public void testDivideByZero() {
		var divider = new Divider();
		assertEquals(0.0f, (float)divider.divideByZero(0f), 0);
	}

	@Test
	public void testDivideByNegative() {
		var divider = new Divider();
		assertEquals(-2.0f, (float)divider.divideByNegative(-4f, -2f), 0);
	}

	@Test
	public void testdivideByPositive() {
		var divider = new Divider();
		assertEquals(4.0f, (float)divider.divideByPositive(8f, 2f), 0);
	}
}