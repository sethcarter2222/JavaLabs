import java.util.Scanner;   //Imports the java Scanner class
public class MobileService1Launcher {
/**
 * Program starts here
 * 
 */
	public static void main(String[] args) {
		double minutes; // Sets a double primitive variable for minutes
		String pack;    // Sets a string variable for the user package
		
		//Creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		//Creates a new instance of the MobileServices1 class
		MobileService1 bill = new MobileService1();
		
		//Ask for the user's minutes the stores it in the variable minutes
		System.out.println("Please enter the amount of minutes you used this month.");
		minutes = input.nextDouble();
		//Sends the minutes to the MobileService1 class
		bill.setMinutes(minutes);
		//fixes the next line error
		input.nextLine();
		
		//Asks for the user's package and stores it in the variable pack
		System.out.println("Do you have package A, B, or C?");
		pack = input.nextLine();
		//Sends the package to the MobileService1 class
		bill.setPackage(pack);
		//Method displays the results
		bill.getPrice();

	}

}
