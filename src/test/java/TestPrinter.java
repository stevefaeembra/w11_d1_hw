import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestPrinter {

	private Printer printer;

	@Before
	public void setUp() {
		printer = new Printer();
		printer.refill(100);
	}

	@Test
	public void checkInitialSetUp() {
		assertEquals(100, printer.getPagesLeft());
		assertEquals(1000, printer.getTonerLeft());
	}

	@Test
	public void checkTopUp() {
		printer.refill(100);
		assertEquals(200, printer.getPagesLeft());
		assertEquals(1000, printer.getTonerLeft());
	}

	@Test
	public void checkJobConsumesStuff() {
		printer.print(10,5);
		assertEquals(50, printer.getPagesLeft());
		assertEquals(950, printer.getTonerLeft());
	}

	@Test
	public void checkJobNotStartedIfNotEnoughConsumables() {
		printer.print(100,50);
		assertEquals(100, printer.getPagesLeft());
		assertEquals(1000, printer.getTonerLeft());
	}



}
