import java.util.Scanner;   //imports java class scanner
public class CircleLauncher {
/**
 * Program starts here
 * @param args
 */
	public static void main(String[] args) {
		double radius;         // sets a double for radius
		// creates an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// gets an amount for radius
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		//creates a new instance of the Circle class
		Circle circle = new Circle(radius);
		circle.setRadius(radius);
		//Displays the results
		System.out.printf("The circle's area is %.2f, it's diameter is %.2f, and it's circumference is %.2f.", 
				circle.getArea(), circle.getDiameter(), circle.getCircumference());

	}

}
