public class Stock {

	/**
	 * Design a class named Stock. The Stock class should contain the following
	 * - A string data field named symbol for the stock's symbol
	 * - A string data field named name for the stock's name
	 * - A double data field named previousClosingPrice that stores the stocks price for the previous day
	 * - A double data field named currentPrice that stores the stock price for the current time
	 * - A constructor that creates a stock with specified symbol and name
	 * - Getters for each of the data fields
	 * - Setter method for previousClosingPrice and currentPrice
	 * - A method named getChangePercent() that returns the percentage changed from previousClosingPrice to CurrentPrice
	 * precentChange = ((currentPrice - closingPrice) / currentPrice) * 100
	 */

	private String Symbol;
	private String Name;
	private double previousClosingPrice;
	private double currentPrice;

	// A constructor that creates a stock with specified symbol and name
	public Stock(String s, String n) {
		this.Symbol = s;
		this.Name = n;
	}

	// Getters for each of the data fields
	public String getSymbol() {
		return this.Symbol;
	}

	public String getName() {
		return this.Name;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	// Setter method for previousClosingPrice and currentPrice
	public void setSymbol(String s) {
		this.Symbol = s;
	}

	public void setName(String n) {
		this.Name = n;
	}

	public void setPreviousClosingPrice(double pcp) {
		this.previousClosingPrice = pcp;
	}

	public void setCurrentPrice(double cp) {
		this.currentPrice = cp;
	}

	// A method named getChangePercent() that returns the percentage changed from previousClosingPrice to CurrentPrice
	// precentChange = ((currentPrice - closingPrice) / currentPrice) * 100
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
	}
}
