/**
 * This class uses static methods to determine the areas of either
 * a circle, a triangle or a rectangle
 */
public class Geometry {

	/**
	 * Default no argument constructor
	 */
	public Geometry() {
		
	}
	
	/**
	 * Public static method that takes a rectangles length and width as
	 * arguments and returns the area of the rectangle. If invalid values are
	 * placed as arguments, the program will display an error message
	 */
	public static double getArea(double length, double width) {
		while (length <= 0 || width <= 0) {
			System.out.println("Please enter valid values.");
			System.exit(0);
		}
		return length * width;
	}
	
	/**
	 * Public static method that takes a circle's radius as an
	 * argument and returns the area of the circle. If invalid values are
	 * placed as arguments, the program will display an error message
	 */
	public static double getArea(double radius) {
		while (radius <= 0) {
			System.out.println("Please enter a valid value.");
			System.exit(0);
		}
		return Math.PI * (radius * radius);
	}
	
	/**
	 * Public static method that takes a triangles base, double, and 0.5 as
	 * arguments and returns the area of the triangle. If invalid values are
	 * placed as arguments, the program will display an error message
	 */
	public static double getArea(double base, double height, double tri) {
		while (base <= 0 || height <= 0) {
			System.out.println("Please enter valid values.");
			System.exit(0);
		}
		return base * height * tri;
	}

}
