import java.util.Scanner;      //Imports the Java Scanner class

/**
 * This class calculates the area's of triangles, circles and rectangles.
 * It receives user input for their chosen shape then displays the results
 * accordingly.
 * @author sethc
 *
 */
public class GeometryDemo {

	public static void main(String[] args) {
		double length;          //Variable for the length of a shape
		double width;           //Variable for the width of a shape
		double radius;          //Variable for the radius of a shape
		double base;            //Variable for the base of a shape
		double height;          //Variable for the height of a shape
		double tri = 0.5;       //Variable for the variable used in triangle's area
		int choice;             //Variable for the user's choice

		/**
		 * Creates new instances of the Geometry and the Scanner classes
		 */
		Geometry shape1 = new Geometry();
		Scanner input = new Scanner(System.in);
		
		/**
		 * Displays the available choices to the user, and stores their input in the
		 * variable choice
		 */
		System.out.println("Geometry Calculator\n1. Calculate the Area of a Circle\n2. " +
		"Calculate the Area of a Rectangle\n3. Calculate the Area of a Triangle\n4. Quit" +
				"\n\nEnter your choice (1-4):");
		choice = input.nextInt();
		
		/**
		 * Determines whether the user inputs a valid number, then asks them the 
		 * appropriate question depending on their chosen shape, and displays the resulting
		 * area.
		 */
		while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
			System.out.println("Error! Please enter a valid number!");
			choice = input.nextInt();
		}
		if (choice == 1) {
			System.out.println("Please enter the radius of the circle.");
			radius = input.nextDouble();
			System.out.printf("The area of the circle is: %.2f.", shape1.getArea(radius));
		} else if (choice == 2) {
			System.out.println("Please enter the length of the rectangle.");
			length = input.nextDouble();
			System.out.println("Please enter the width of the rectangle.");
			width = input.nextDouble();
			System.out.printf("The area of the rectangle is: %.2f.", shape1.getArea(length, width));
			
		} else if (choice == 3) {
			System.out.println("Please enter the height of the triangle.");
			height = input.nextDouble();
			System.out.println("Please enter the base of the triangle.");
			base = input.nextDouble();
			System.out.printf("The area of the triangle is: %.2f.", shape1.getArea(height, base, tri));
		} else {
			System.exit(0);
		}
	}

}
