/**
 * This class has three static overloaded methods that determine
 * the areas of either a circle, a rectangle, or a cylinder
 */
public class Area {
	
	/**
	 * Default no argument constructor
	 */
	public Area() {
		
	}
	
	/**
	 * A public static method for determining the area of a
	 * rectangle
	 */
	public static double area(double width, double length) {
		return width * length;
	}
	
	/**
	 * A public static method for determining the area of a
	 * circle
	 */
	public static double area(double radius) {
		return (radius * radius) * 3.14159;
	}
	
	/**
	 * A public static method for determining the area of a
	 * cylinder
	 */
	public static double area(double radius, int height) {
		return (radius * radius) * 3.14159 * height;
	}
}
