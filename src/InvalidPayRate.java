/**
 * Creates a custom exception that gives a custom error
 * message for invalid pay rate
 */
public class InvalidPayRate extends Exception {

	public InvalidPayRate() {
		super("Error: Invalid pay rate entered");
	}

}
