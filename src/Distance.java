/**
 * This class demonstrates the user inputing a
 * value for speed and hours traveled then displays
 * a table with the results for the distance per hour
 */
public class Distance {

	private double hour;         //Sets a private variable for hour
	private double mph;          //Sets a private variable for speed
	private double distance;     //Sets a private variable for distance
	private int hourCounter = 1; //Sets a private variable for a counter
	
	/**
	 * Public no argument constructor
	 */
	public Distance() {
		
	}
	
	/**
	 * Public method for setting the speed through
	 * user input
	 */
	public void setSpeed(double milesPer) {
		if (milesPer < 0) {
			System.out.println("Please enter a valid speed");
		} else {
		this.mph = milesPer;
		}
	}
	
	/**
	 * Public method for setting the hours traveled
	 * through user input
	 */
	public void setHour(double hour) {
		if(hour < 1) {
			System.out.println("Please enter a valid number of hours");
		} else {
		this.hour = hour;
		}
	}
	
	/**
	 * Public method for getting and displaying the
	 * distance traveled in table form
	 */
	public double getDistance() {
		System.out.printf("Hour                  Distance Traveled\n" +
				"........................................");
		while (hourCounter <= hour) {
			distance = hourCounter * mph;
			System.out.printf("\n%d                            %.0f", 
					hourCounter, distance);
					
			hourCounter++;
		}
		return distance;
	}

}
