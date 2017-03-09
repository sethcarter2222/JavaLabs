/**
 * This class is in charge of the fuel gauge of a car
 * that can hold 15 gallons, and has methods for incrementing
 * and decrementing the fuel in the car
 */
public class FuelGauge {

	private double fuel;  // Sets a private double for fuel
	public FuelGauge() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * A copy constructor that sets the fuel of the
	 * object in the argument equal to the fuel variable
	 * @param fuel
	 */
	public FuelGauge(double fuel) {
		this.fuel = fuel;
	}
	
	/**
	 * A public method for returning the amount of fuel
	 * @return
	 */
	public double getFuel() {
		return fuel;
	}
	
	/**
	 * A public method for adding a gallon of fuel to
	 * the current amount, up to 15 gallons
	 */
	public void addFuel(double fuel) {
		while (this.fuel <= 15) {
			this.fuel = fuel;
			++fuel;
		}
		System.out.println("The tank is full");
	}

	/**
	 * A public method for taking a gallon of fuel from
	 * the car till the tank is empty
	 */
	public void subFuel(double fuel) {
		if (this.fuel > 0) {
		fuel = 1;
		this.fuel -= fuel;
		}
		System.out.println("The tank is now empty.");
	}
}
