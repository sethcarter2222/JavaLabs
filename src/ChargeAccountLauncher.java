import java.util.Scanner;  //Imports the Java Scanner class
public class ChargeAccountLauncher {
/**
 * Main method that asks the user for their charge number
 * and checks to see if it is valid
 */
	public static void main(String[] args) {
		int userNum;  //Creates a variable for the inputed user number
		/**
		 * Creates an instance of the Scanner class then asks and stores
		 * the user inputed integer in the userNum variable
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your desired charge number!");
		userNum = input.nextInt();
		/**
		 * Creates a new instance of the ChargeAccount class and sents
		 * the number to the ChargeAccount constructor
		 */
		ChargeAccount charge1 = new ChargeAccount(userNum);

	}

}
