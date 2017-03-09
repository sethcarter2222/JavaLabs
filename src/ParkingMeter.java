
public class ParkingMeter {

	private double numMinutesPurchased;  //Number of parking meter minutes purchased
	
	/**
	 * Default no argument constructor
	 * for initializing the fields
	 */
	public ParkingMeter() {
		this.numMinutesPurchased = 0;
	}
	
	/**
	 * Constructor to set the instance fields
	 * @param numMinutesPurchased
	 */
	public ParkingMeter(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
		System.out.println("Parking Meter has been created");
	}

	/**
	 * Copy constructor to copy a ParkingMeter object
	 */
	public ParkingMeter(ParkingMeter parkingMeter) {
		this.numMinutesPurchased = parkingMeter.numMinutesPurchased;
	}

	@Override
	/**
	 * Creates a toString for the ParkingMeter class that displays the
	 * amount of minutes purchased
	 */
	public String toString() {
		String str = "Number of minutes purchased: " + numMinutesPurchased;
		System.out.println(str);
		return str;
	}

	/**
	 * A public method that returns the number of minutes purchased
	 */
	public double getNumMinutesPurchased() {
		return numMinutesPurchased;
	}

	/**
	 * A public method that sets the number of minutes purchased
	 */
	public void setNumMinutesPurchased(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}
}
