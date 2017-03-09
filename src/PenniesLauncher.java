import java.util.Scanner;  // Imports the java Scanner class
public class PenniesLauncher {

	/**
	 * This is a launcher for the Pennies class
	 * Which takes an amount of days from the user
	 * and displays the result if their payment
	 * started at 1¢ and doubling each day
	 * @param args
	 */
	public static void main(String[] args) {
		
		int days;    // sets a variable for days
		
		/**
		 * Creates a new instance of the Scanner class
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Asks the user for the amount of days works and stores their
		 * input in the days variable
		 */
		System.out.println("Your salary starts at a penny, but it double each day.");
		System.out.println("Please enter the amount of days you have worked.");
		days = input.nextInt();
		
		/**
		 * Creates a new instance of the Pennies class
		 */
		Pennies pen1 = new Pennies();
		
		/**
		 * Sets the days through the setDays method and uses the getGuap method to 
		 * display and calculate the result
		 */
		pen1.setDays(days);
		pen1.getGuap();
		
	}

}
