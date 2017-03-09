/**
 * The Cruise Ship class extends the ship class
 * and adds in a max passengers variable
 */
public class CruiseShip extends Ship {

	private int maxPassengers; //Sets a variable for max passengers
	/**
	 * Creates a cruise that accepts a ship name
	 * and max passengers number and sets the variables
	 */
	public CruiseShip(String n, int mP) {
		super.setShipName(n);
		setMaxPassengers(mP);
	}
	/**
	 * Method that sets the max passengers
	 */
	public void setMaxPassengers(int mP) {
		this.maxPassengers = mP;
	}
	/**
	 * Method that returns the max passengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}
	/**
	 * toString method that displays the ship name
	 * and max passengers
	 */
	public String toString() {
		String str;
		str = "Ship Name: " + super.getShipName() +
				"\nMax Passengers: " + maxPassengers;
		return str;
	}

}
