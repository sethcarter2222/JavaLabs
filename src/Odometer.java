/**
 * This class is responsible for knowing the current mileage of
 * a car and determine the miles driven a decrement the gallons
 * accordingly through the FuelGauge class
 */
public class Odometer {

	private int miles;      //Sets a private variable for miles
	private int mileCount;  //Sets a private variable for mileCount
	private int miley;      //Sets a private int for something that I thought would help but didn't
	private FuelGauge car1;  //Creates an instance of the car
	
	/**
	 * Default no argument constructor
	 */
	public Odometer() {
	}

	/**
	 * Public method for returning the amount of miles
	 */
	public int getMiles() {
		return miles;
	}
	
	/**
	 * Public method for setting the amount of miles
	 * this is an incomplete thought
	 */
	public void setMiles(int miles) {
		this.miley = miles;
		int mile = 1;
		while (mile < miles) {
			this.miles += mile;
			if (mile >= miles) {
				mileCount = miles / 24;
				continue;
			}
			break;
		}
		if (this.miles <= 999999) {
		this.miles = 0;
		System.out.println("The odometer has been reset.");
		}
	}
	
	/**
	 * One of the methods I started working on to try and get the program
	 * to work but gave up because chapter 6 is the worst
	 * @return
	 */
	public int setTrip () {
		while (this.mileCount <= this.miley) {
			System.out.printf("The current driven amount is: %d\nThe current amount of gallons used are: \n", miles);
		}
		return mileCount;
	}
}
