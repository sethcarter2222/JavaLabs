/**
 * Creates a custom exception that gives a custom error
 * message for invalid name
 */
public class InvalidName extends Exception{

	public InvalidName() {
		super("Error: Name entered was blank");
	}

}
