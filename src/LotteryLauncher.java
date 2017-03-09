import java.util.Scanner;   //Imports the java Scanner class
/**
 * This class is a launcher for the Lottery class that takes
 * user input for the five lottery numbers and compares them
 * tp the five randomly generated numbers and displays
 * the amount matched
 */
public class LotteryLauncher {

	public static void main(String[] args) {
		Lottery lottery = new Lottery();    //Creates a new instance of the 
		int lottoSize = lottery.getLotto().length;  //Creates a size for the lottery array
	/**
	 * Displays a message asking the user to input lottery numbers
	 */
	System.out.println("Please enter your five desired lottery guesses");
	Scanner input = new Scanner(System.in);
	/**
	 * Creates a new array then runs a for loop that stores the user inputs
	 * for each lottery number
	 */
	int numbers[] = new int[lottoSize];
	for (int i = 0; i < numbers.length; i++) {
		System.out.println("\nNumber " + (i + 1) + ":");
		numbers[i] = input.nextInt();
	}
	/**
	 * creates a variable that stores the amount of matched numbers
	 */
	int match = lottery.checkMatch(numbers);
	/**
	 * Checks to see if the user got all of their guess correctly and 
	 * displays a congratulatory message if they did
	 */
	if (match == 5) {
		System.out.println("\nCongrats! You guessed all correctly and are the" + 
	" Grand Prize Winner!");
	} else {
		System.out.println("\nYou guessed " + match + " numbers correctly!");
	}
	}

}
