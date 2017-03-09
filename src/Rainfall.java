/**
 * A class that stores an array of doubles for each
 * month's rainfall and displays the month with the
 * most rain/least rain/average and total rainfall
 * @author sethc
 */
public class Rainfall {

	
	private double[] rainfall; //Creates a private array for rainfall
	
	/**
	 * Public constructor that accepts an array as an argument
	 * and sets the rainfall amounts to the rainfall array
	 */
	public Rainfall(double[] r) {
		rainfall = new double[r.length];
		
		for (int i = 0; i < r.length; i++) {
			rainfall[i] = r[i];
		}
	}
	/**
	 * A public method for getting the total
	 * amount of rainfall
	 */
	public double getTotal() {
		double total = 0.0;
		for (double value : rainfall) {
			total += value;
		}
		return total;
	}
	/**
	 * A public method for getting the average rainfall
	 */
	public double getAverage() {
		return getTotal() / rainfall.length;
	}
	/**
	 * Public method for returning the month with the
	 * highest rainfall amount
	 */
	public double getHighest() {
		double highest = rainfall[0];
		for (int i = 1; i < rainfall.length; i++) {
			if (rainfall[i] > highest) {
				highest = rainfall[i];
			}
		}
		
		return highest;
	}
	/**
	 * Public method for returning the month
	 * with the lowest rainfall
	 */
	public double getLowest() {
		double lowest = rainfall[0];
		for (int i = 1; i < rainfall.length; i++) {
			if (rainfall[i] < lowest) {
				lowest = rainfall[i];
			}
		}
		
		return lowest;
	}

}
