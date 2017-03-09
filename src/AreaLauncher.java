
public class AreaLauncher {
	
	/**
	 * This program serves as a launcher for the Area class, it shows the use of
	 * static methods to determine the areas of a circle, a rectangle and a 
	 * cylinder and displays the results to the user.
	 */
	public static void main(String[] args) {
		
		double circle;    // Sets a double variable for the circle's area
		double rectangle; // Sets a double variable for the rectangle's area
		double cylinder;  // Sets a double variable for the circle's area
		int height = 10;   // Sets a double variable for the cylinder's height
		
		/**
		 * These set up the three shape variables with their areas through the 
		 * static overloaded methods in the Area class
		 */
		circle = Area.area(2.0);	
		rectangle = Area.area(5.0, 3.0);
		cylinder = Area.area(2.0, height);
		
		/**
		 * This displays the result to the user
		 */
		System.out.printf("The area of the circle is %.2f\nThe area of the rectangle is" +
		" %.2f\nThe area of the cylinder is %.2f", circle, rectangle, cylinder);
	}

}
