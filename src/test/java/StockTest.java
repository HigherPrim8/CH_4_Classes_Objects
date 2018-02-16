import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StockTest {

	private Stock stock;

	@BeforeEach
	public void setup() {
		stock = new Stock("AAPL", "Apple Inc.");
		stock.setCurrentPrice(171.37);
		stock.setPreviousClosingPrice(171.05);
	}

	@Test
	public void stockTest() {
		assertEquals("AAPL", stock.getSymbol());
		assertEquals("Apple Inc.", stock.getName());
		assertEquals(171.37, stock.getCurrentPrice());
		assertEquals(171.05, stock.getPreviousClosingPrice());
		assertEquals(0.1867304662426289, stock.getChangePercent());
	}
}
