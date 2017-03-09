import java.util.Scanner;   //Imports the java Scanner class
/**
 * Class that stores employee Id numbers, their hours worked
 * and pay rate, and displays their wages
 */
public class PayrollLauncher {
/**
 * Program starts here
 * @param args
 */
	public static void main(String[] args) {
		final int ARRAY_SIZE = 7;   //Sets the array size for hours and pay rate
		/**
		 * Creates three new arrays for hours, pay rate and employee Id's
		 */
		int[] hours = new int[ARRAY_SIZE];
		double[] payRate = new double[ARRAY_SIZE];
		int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		/**
		 * Runs a loop to display the employee Id's
		 */
		for (int i = 0; i < 7; i++) {
			System.out.println("Employee " + (i +1) + ": " + employeeId[i]);
		}
		getHoursValues(hours);    //Runs the get hours method
		getPayRateValues(payRate);//Runs the get pay rate method
		/**
		 * Creates a new instance of the Payroll class and sends
		 * the hours and payRate arrays as arguments
		 */
		Payroll payrolL = new Payroll(hours, payRate);
		

	}

	/**
	 * Creates a method that asks the user for the hours worked by each employee
	 * through a loop and throws an error message if the user inputs an invalid
	 * number
	 */
	private static void getHoursValues(int[] array) {
		/**
		 * Creates a new instance of the Scanner class, and displays a message
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the hours worked for each employee");
		/**
		 * For loop stores the data of each employee in an array
		 */
		for(int i = 0; i < array.length; i++) {
			System.out.print("Employee " + (i + 1) + ":");
			array[i] = input.nextInt();
			
			while(array[i] < 0) {
				System.out.println("Please enter a valid number.");
				array[i] = input.nextInt();
			}
		}
	}
	
	/**
	 * Method accepts an array as an argument and asks the user to enter the
	 * pay rate of each employee through a loop and stores it in the array
	 */
	private static void getPayRateValues(double[] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the payRate for each employee");
		/**
		 * For loop stores the pay rate of each employee and displays and error
		 * if the user inputs an invalid answer
		 */
		for(int i = 0; i < array.length; i++) {
			System.out.print("Employee " + (i + 1) + ":");
			array[i] = input.nextDouble();
			
			while(array[i] < 6.00) {
				System.out.println("Please enter a valid number.");
				array[i] = input.nextDouble();
			}
		}
	}
}
