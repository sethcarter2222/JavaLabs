/**
 * Creates a custom exception that extends the Exception
 * that has custom error message for negative units
 */
public class NegativeUnits extends Exception {

	public NegativeUnits() {
		super("Error: Negative amount of units entered");
	}
}
