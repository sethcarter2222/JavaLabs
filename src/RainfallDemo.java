import java.util.Scanner;   //Imports the java Scanner class
/**
 * Creates a Launcher class for Rainfall that asks the
 * users for each month's rainfall and displays the results
 * of total rainfall, average rainfall, the month with the highest
 * rainfall and the month with the lowest
 */
public class RainfallDemo {
/**
 * Main method for beginning the program
 */
	public static void main(String[] args) {
		final int ARRAY_SIZE = 12;  //Creates the array size
		
		double[] rainfall = new double[ARRAY_SIZE]; // Creates a rainfall array
		getValues(rainfall);  //Uses the getValues methods to set the rainfall array
		
		/**
		 * Creates a new instance of the Rainfall class
		 */
		Rainfall year = new Rainfall(rainfall);
		
		/**
		 * Displays the results
		 */
		System.out.println();
		System.out.println("The total rainfall for the year was " +
				year.getTotal());
		System.out.println("The average rainfall for the year was " +
				year.getAverage());
		System.out.println("The highest rainfall for the year was " +
				year.getHighest());
		System.out.println("The lowest rainfall for the year was " +
				year.getLowest());
	
	}
		
	/**
	 * Method that gets that asks the user for the rainfall
	 * each month and stores in in an array that is used in the
	 * argument
	 */
	private static void getValues(double[] array) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the rainfall for each month");
			for(int i = 0; i < array.length; i++) {
				System.out.print("Month " + (i + 1) + ":");
				array[i] = input.nextDouble();
				
				while(array[i] < 0) {
					System.out.println("Please enter a valid number.");
					array[i] = input.nextDouble();
				}
			}
		}

	

}
