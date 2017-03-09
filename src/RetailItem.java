/**
 * This program determines if illegal variables were passed in for the
 * amount of units, or their price and throws custom exceptions if there
 * are
 */
public class RetailItem {
	private String description; //Creates a variable for item description
	private int unitsOnHand;    //Creates a variable for amount of units
	private double price;       //Creates a variable for item price
/**
 * Constructor accepts the amount of units and price of items, and throws
 * custom exceptions if either of the values are invalid
 */
	public RetailItem(int unitsOnHand, double price) throws NegativePrice, 
	NegativeUnits {
		if (unitsOnHand < 0) {
			throw new NegativeUnits();
		}
		if (price < 0) {
			throw new NegativePrice();
		}
	}
}
