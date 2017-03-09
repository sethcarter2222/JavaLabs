/**
 * Class serves as a super class for creating ships
 * and stores the ship name and years built
 */
public class Ship {

	private String shipName; //Creates a string for the ship name
	private String yearBuilt;//Creates a string for the year built
	/**
	 * Default no argument constructor
	 */
	public Ship() {

	}
	/**
	 * Method that accepts a String and assigns it as
	 * the ship name variable
	 */
	public void setShipName(String n) {
		this.shipName = n;
	}
	/**
	 * Method that returns the ship name
	 */
	public String getShipName() {
		return shipName;
	}
	/**
	 * Method that accepts a String and assigns it
	 * to the yearBuilt variable
	 */
	public void setYearBuilt(String yB) {
		this.yearBuilt = yB;
	}
	/**
	 * Method that returns the yearBuilt
	 */
	public String getYearBuilt() {
		return yearBuilt;
	}
	/**
	 * toString method for returning the ship's name
	 * and year built
	 */
	public String toString() {
		String str;
		str = "Ship Name: " + shipName +
				"\nYear Built: " + yearBuilt;
		return str;
	}

}
