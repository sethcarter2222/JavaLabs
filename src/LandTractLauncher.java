import java.util.Scanner;     //Imports the Java Scanner class

/**
 * This class has the user input the length and width
 * of two tracts of land, and the program creates instances
 * for both of them, calculates the area and then determines
 * whether they are equal or not
 */
public final class LandTractLauncher {

	/**
	 * The main static starting point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		double length;     //Sets a variable for length
		double width;      //Sets a variable for width
		
		/**
		 * Creates a new instance of the Scanner class, and asks the
		 * user for the first tracts length and width and stores them
		 * in the variables
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first tract of land's length");
		length = input.nextDouble();
		System.out.println("Please enter the first tract of land's width");
		width = input.nextDouble();
		
		/**
		 * Creates a new instance of the LandTract class, passing the length
		 * and width as arguments, and uses toString to display the area
		 */
		LandTract land1 = new LandTract(length, width);
		System.out.printf("%s", land1.toString());
		
		/**
		 * Asks the user for the second tract's length and width and stores them
		 * in the variables.
		 */
		System.out.println("\n\nPlease enter the second tract of land's length");
		length = input.nextDouble();
		System.out.println("Please enter the second tract of land's width");
		width = input.nextDouble();
		
		/**
		 * Creates a new instance of the LandTract class and uses toString
		 * to display the area
		 */
		LandTract land2 = new LandTract(length, width);
		System.out.printf("%s", land2.toString());
		
		/**
		 * Determines whether the areas are equal and displays the result
		 */
		if (land2.equals(land1)) {
			System.out.println("\n\nThe areas are equal");
		} else {
			System.out.println("\n\nThe areas are not equal");
		}

	}

}
