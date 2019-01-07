import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

	Calculator calculator;

	@Before
	public void setUp() {
		this.calculator = new Calculator();
	}

	@Test
	public void TestAddition() {
		assertEquals(4, this.calculator.add(1,3));
	}

	@Test
	public void TestSubtract() {
		assertEquals(12, this.calculator.subtract(20,8));
	}

	@Test
	public void TestMultiply() {
		assertEquals(800, this.calculator.multiply(80,10));
	}

	@Test
	public void TestDivide() {
		assertEquals(100, this.calculator.divide(8000,80));
	}
}
