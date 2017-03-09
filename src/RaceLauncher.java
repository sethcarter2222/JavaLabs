import java.util.Scanner;       // Imports the java Scanner class
public class RaceLauncher {
/**
 * Program starts here
 * 
 */
	public static void main(String[] args) {
		String runner1;     //creates a variable for the first runner
		String runner2;     //creates a variable for the second runner
		String runner3;     //creates a variable for the third runner
		double time1;       //creates a variable for the first runner's time
		double time2;       //creates a variable for the second runner's time
		double time3;       //creates a variable for the third runner's time
		//creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);  
		//creates a new instance of the Race class
		Race race1 = new Race();
		//Stores User input for first runner's name
		System.out.println("Please enter the name of the first runner.");
		runner1 = input.nextLine();
		//Stores User input for second runner's name
		System.out.println("Please enter the name of the second runner.");
		runner2 = input.nextLine();
		//Stores User input for third runner's name
		System.out.println("Please enter the name of the third runner.");
		runner3 = input.nextLine();
		//Stores User input for first runner's time
		System.out.println("Please enter the name of the first runner's time.");
		time1 = input.nextDouble();
		//Stores User input for second runner's time
		System.out.println("Please enter the name of the second runner's time.");
		time2 = input.nextDouble();
		//Stores User input for third runner's time
		System.out.println("Please enter the name of the third runner's time.");
		time3 = input.nextDouble();
		//Method sets the three runners
		race1.setRunners(runner1, runner2, runner3);
		//Method sets the three runner's times
		race1.setTimes(time1, time2, time3);
		//Method runs the calculations and displays the results
		race1.getPlacement();

	}

}
