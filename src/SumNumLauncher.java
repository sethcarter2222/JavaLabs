import java.util.Scanner;  //Imports the Java Scanner class
public class SumNumLauncher {

	/**
	 * This program is a Launcher for the SumNum class which
	 * creates an instance of a class which gets a user inputed
	 * number and displays the result of the sum of all numbers
	 * from one to the entered number.
	 * @author Seth Carter
	 */
	public static void main(String[] args) {
		int userNum;  //Creates a variable for the user inputed number
		
		/**
		 * Creates a new instance of the Scanner class
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Asks user for a number and stores it in the UserNum variable
		 */
		System.out.println("Please enter an integer number");
		userNum = input.nextInt();
		
		/**
		 * Creates a new instance of the SumNum class
		 */
		SumNum num1 = new SumNum();
		
		/**
		 * Sets the inputed number of the userNum variable via
		 * the setInput method and prints out the results
		 */
		num1.setInput(userNum);
		System.out.printf("The sum of the numbers from 1 to %d is %d.", 
				userNum, num1.getSum());
	}

}
