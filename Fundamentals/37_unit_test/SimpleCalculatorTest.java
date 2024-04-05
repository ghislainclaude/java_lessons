import org.junit.*;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {
	@Test
	public void TwoPlustwoShouldEqual(){
		var simpleCal = new SimpleCalculator();
		assertEquals(4, simpleCal.add(2, 2));
	}

	@Test
	public void TwoPlusTenShouldEqual(){
		var simpleCal = new SimpleCalculator();
		assertEquals(10, simpleCal.add(2, 8));
	}

}