/**
 * Creates a custom exception that gives a custom error
 * message for invalid id number
 */
public class InvalidId extends Exception {

	public InvalidId() {
		super("Error: Invalid ID number entered");
	}

}
