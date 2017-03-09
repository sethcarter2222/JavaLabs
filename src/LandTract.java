/**
 * This class creates two tracts of land and uses
 * the equals method to determine if the two classes are
 * equal
 */
public class LandTract {

	private double length;  //Creates a private double for the length
	private double width;   //Creates a private double for the width
	private double area;    //Creates a private double for the area
	
	/**
	 * Default no argument constructor for the LandTract class
	 */
	public LandTract() {
	}
	
	/**
	 * Constructor that accepts the length and width as
	 * variables and calculates the area.
	 */
	public LandTract(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
	}
	
	/**
	 * pulbic method that returns the area of the land
	 * @return
	 */
	public double getArea() {
		return length * width;
	}
	
	/**
	 * Public boolean method that returns either true or
	 * false based upon whether or not the two areas
	 * of the land are equal to each other
	 */
	public boolean equals(LandTract land2) {
		boolean trueFalse;
		if (this.getArea() == land2.getArea()) {
			trueFalse = true;
		} else {
			trueFalse = false;
		}
		return trueFalse;
	}

	@Override
	/**
	 * A toString method that displays the area of
	 * the specified tract of land
	 */
	public String toString() {
		String str;
		str = "Area of land: " + area;
		return str;
	}
	

}
