/**
 * Creates a custom exception that extends the Exception
 * that has custom error message for negative price
 */
public class NegativePrice extends Exception {

	public NegativePrice() {
		super("Error: Negative entered price");
	}
}
