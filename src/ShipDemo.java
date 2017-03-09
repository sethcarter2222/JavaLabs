/**
 * This class creates different ship objects, 
 * sets the data and prints out the results
 */
public class ShipDemo {
/**
 * Main method for starting the program
 */
	public static void main(String[] args) {
		/**
		 * Creates an array for 6 different ship objects
		 */
		Ship[] ships = new Ship[6];
		/**
		 * Creates two ship objects and uses the setShipName
		 * and setYearBuilt methods to set the necessary variables
		 */
		ships[0] = new Ship();
		ships[0].setShipName("Santa Maria");
		ships[0].setYearBuilt("1403");
		ships[1] = new Ship();
		ships[1].setShipName("C.S.S. Hunley");
		ships[1].setYearBuilt("1863");
		/**
		 * Creates two new instances of the CruiseShip class
		 */
		ships[2] = new CruiseShip("Titanic", 2223);
		ships[3] = new CruiseShip("HMS Victory", 312);
		/**
		 * Creates two new instances of the CargoShip class
		 */
		ships[4] = new CargoShip("Bismark", 3407);
		ships[5] = new CargoShip("Arizona", 2086);
		/**
		 * Displays the info of each ship through toString
		 * methods
		 */
		System.out.println("**********Ship 1**********");
		System.out.println(ships[0]);
		System.out.println("\n**********Ship 2**********");
		System.out.println(ships[1]);
		System.out.println("\n**********Ship 3**********");
		System.out.println(ships[2]);
		System.out.println("\n**********Ship 4**********");
		System.out.println(ships[3]);
		System.out.println("\n**********Ship 5**********");
		System.out.println(ships[4]);
		System.out.println("\n**********Ship 6**********");
		System.out.println(ships[5]);

	}

}
