import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

	WaterBottle bottle;

	@Before
	public void setUp() {
		this.bottle = new WaterBottle();
	}

	@Test
	public void checkInitialVolume() {
		assertEquals(100,bottle.getVolume());
	}

	@Test
	public void checkSipsReduceVolume() {
		bottle.drink();
		bottle.drink();
		assertEquals(80,bottle.getVolume());
	}


	@Test
	public void checkCantReduceVolumeBelowZero() {
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		bottle.drink();
		assertEquals(0,bottle.getVolume());
	}

	@Test
	public void checkEmpty() {
		bottle.empty();
		assertEquals(0,bottle.getVolume());
	}

	@Test
	public void checkFilled() {
		bottle.fill();
		assertEquals(100,bottle.getVolume());
	}




}
