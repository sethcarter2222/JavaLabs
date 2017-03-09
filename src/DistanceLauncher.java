import java.util.Scanner; //Imports the java Scanner class

public class DistanceLauncher {

	/**
	 * This program serves as a luncher for the Distance
	 * class and has the user input the amount of hours
	 * they traveled and their speed and displays a table
	 */
	public static void main(String[] args)  {
		double hour;  // Creates a variable for the hours traveled
		double mph;   // Creates a variable for the user's speed
		
		/**
		 * Creates a new instance of the Distance class
		 */
		Distance disy = new Distance();
		
		/**
		 * Creates a new instance of the Scanner class
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Asks user for their hours traveled and stores it in the hour variable
		 * Sets the hour variable through the setHour method
		 */
		System.out.println("Please enter the number of hours you traveled");
		hour = input.nextDouble();
		disy.setHour(hour);
		
		/**
		 * Asks user for their speed and stores it in the mph variable
		 * Sets the speed variable through the setSpeed method 
		 */
		System.out.println("Please enter your speed in mph");
		mph = input.nextDouble();
		disy.setSpeed(mph);
		
		/**
		 * Calls the getDistance method to calculate and display the
		 * results
		 */
		disy.getDistance();
		
	}

}
