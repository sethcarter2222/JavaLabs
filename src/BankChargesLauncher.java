import java.util.Scanner;     //Imports the Java Scanner class
public class BankChargesLauncher {
/**
 * Program starts here
 */
	public static void main(String[] args) {
		double NumOfChecks;    //Sets a variable for number of checks written
		double checkCharge;    //Sets a variable for the check charge
		double startBalance;   //Sets a variable for the starting balance
		double endBalance;     //Sets a variable for the ending balance
		
		//Creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		
		//Asks for user input on the number of checks written and stores it in a variable
		System.out.println("How many checks did you write this month?");
		NumOfChecks = input.nextDouble();
		//Asks for user input on their start balance and stores it in a variable
		System.out.println("What was your balance before fees?");
		startBalance = input.nextDouble();
		
		//Creates a new instance of the BankCharges class
		BankCharges account = new BankCharges();
		//Sets the number of checks written through the setNumOfChecks() method
		account.setNumOfChecks(NumOfChecks);
		//Sets the starting balance through the setStartBalance() method
		account.setStartBalance(startBalance);
		//Displays the results for the user
		System.out.printf("Your end balance is $%.2f, after a service fee " +
				"of $%.2f.", account.getEndBalance(), account.getCheckCharge());

	}

}
