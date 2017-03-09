/**
 * Creates a custom exception that gives a custom error
 * message for invalid hours
 */
public class InvalidHours extends Exception {

	public InvalidHours() {
		super("Error: Invalid amount entered for hours");
	}

}
