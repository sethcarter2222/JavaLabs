import java.util.Scanner; //Imports the Java Scanner class
import java.io.*;         //Wildcard import of the java io classes
public class Distance2 {
/**
 * This class serves as a launcher for the Distance2
 * class which displays a table result of the
 * distance traveled in each hour that the user
 * has driven and inputs it to a file
 * @author Seth Carter
 */
	public static void main(String[] args) throws IOException {
		int hour;            //creates a variable for the hour
		int mph;             //creates a variable for the mph
		int hourCounter = 1; //creates a counter variable for the hours
		int distance;        //creates a variable for the distance

		/**
		 * Creates a new instance of the Distance class named disy
		 */
		Distance disy = new Distance();
		
		/**
		 * Creates a new instance of the Scanner class named input
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Asks users the amount of traveled hours and stores it in the variable hour
		 */
		System.out.println("Please enter the number of hours you traveled");
		hour = input.nextInt();
		
		/**
		 * Asks users their speed and stores it in the variable mph
		 */
		System.out.println("Please enter the speed you traveled in mph");
		mph = input.nextInt();
		
		//fixes new line error
		input.nextLine();

		/**
		 * Creates a new instance of the PrintWriter class named outputFile
		 * and creates a file named Distance2.txt
		 */
		PrintWriter outputFile = new PrintWriter("C:\\Users\\sethc\\Desktop\\Distance2.txt");
		
		/**
		 * Performs calculations and writes the resulting table to a word doc
		 */
		outputFile.println("Hour                  Distance Traveled");
			outputFile.println("........................................");
		while (hourCounter <= hour) {
			distance = hourCounter * mph;
		outputFile.println(hourCounter + "                            " + distance);
					
			hourCounter++;
		}
		outputFile.close();
		
		System.out.println("File written to System");
		
		
	}

}
