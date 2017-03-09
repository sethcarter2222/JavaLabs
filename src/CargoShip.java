/**
 * Class extends the Ship class and creates a 
 * CargoShip variant that includes cargo capacity
 */
public class CargoShip extends Ship {

	private int cargoCapacity;//Creates a variable for cargo capacity
	/**
	 * Constructor accepts the ship name and
	 * cargo capacity and sets them.
	 */
	public CargoShip(String n, int cC) {
		super.setShipName(n);
		setCargoCapacity(cC);
	}
	/**
	 * Method for setting the cargo capacity
	 */
	public void setCargoCapacity(int cC) {
		this.cargoCapacity = cC;
	}
	/**
	 * Method that returns the cargo capacity
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	/**
	 * toString method that displays the ship name and
	 * cargo capacity
	 */
	public String toString() {
		String str;
		str = "Ship Name: " + super.getShipName() +
				"\nCargo Cpacity in tons: " + cargoCapacity;
		return str;
	}

}
