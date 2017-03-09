/**
 * 
 * @author sethc
 * This program takes the radius of a circle and displays
 * the diameter, area, and circumference
 */
public class Circle {
	private double radius;             //sets a var for radius
	private final double PI = 3.14159; //sets a final var for PI
	//sets a constructor with the raidus as the argument
	public Circle(double rad) {
		radius = rad;
	}
	// mutator for radius
	public void setRadius(double r) {
		this.radius = r;
	}
	// access radius
	public double getRadius() {
		return radius;
	}
	// access for area calculation
	public double getArea() {
		return (radius * radius * PI);
	}
	// acess for diameter calculation
	public double getDiameter() {
		return radius * 2.0;
	}
	// access for circumference calculation
	public double getCircumference() {
		return (radius * PI * 2.0);
	}

}
