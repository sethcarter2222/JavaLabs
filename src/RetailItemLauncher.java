/**
 * Launcher for the RetailItem class that creates an instance
 * with a negative price and an instance with negative units 
 * and demonstrates the custom exceptions
 */
public class RetailItemLauncher {

	public static void main(String[] args) {
		/**
		 * Try/catch statement that has negative units
		 */
		try {
		RetailItem item1 = new RetailItem(-2, 59.95);
		} catch(NegativeUnits e) {
			System.out.println(e.getMessage());
		} catch(NegativePrice e) {
			System.out.println(e.getMessage());
		}
		/**
		 * try/catch statement that has negative price
		 */
		try {
			RetailItem item2 = new RetailItem(4, -22.3);
			} catch(NegativeUnits e) {
				System.out.println(e.getMessage());
			} catch(NegativePrice e) {
				System.out.println(e.getMessage());
			}
	}

}
