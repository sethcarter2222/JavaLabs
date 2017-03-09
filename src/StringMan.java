import java.util.Scanner;      //Imports Scanner
/**
 * 
 * @author sethc
 * This program demonstrates the use of .length, .toUpperCase, .toLowerCase, and .charAt.
 */
public class StringMan {

	public static void main(String[] args) {
		String CITY;
		Scanner UserInput = new Scanner(System.in);
		System.out.print("Enter a city");
		CITY = UserInput.nextLine();             //Assigns variable to user input
		int CIT_LENGTH = CITY.length();          //Assigns variable to length of input
		String CIT_UPPER = CITY.toUpperCase();   //Assigns variable to Upper-case version of input
		String CIT_LOWER = CITY.toLowerCase();   //Assigns variable to Lower-case version of input
		char CIT_INITIAL = CITY.charAt(0);       //Assigns variable to the first character of input
		System.out.println("The number of characters in your city is " + CIT_LENGTH + ".");                      //Demonstrates and displays .length
		System.out.println("Your city in all uppercase characters is " + CIT_UPPER + "..... just because.");     //Demonstrates and displays .toUpperCase
		System.out.println("The city in all lowercase characters is " + CIT_LOWER + "..... don't ask me why."); //Demonstrates and displays .toLowerCase
		System.out.println("In case of extreme cognitive disorder, in which you need to know "
							+ "the first letter of what you just entered, it is: " + CIT_INITIAL + "!!!!!");      //Demonstrates and displays .charAt

	}

}
