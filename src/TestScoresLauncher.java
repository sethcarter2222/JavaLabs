import java.util.Scanner;   //Imports java Scanner class
public class TestScoresLauncher {
/**
 * Program begins here
 */
	public static void main(String[] args) {
		double score1;    //Sets a public variable for score one
		double score2;    //Sets a public variable for score two
		double score3;    //Sets a public variable for score three
		
		//Creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		
		//Gets the user input for the first score and stores it in a variable
		System.out.println("Enter the first of three test scores to find the average");
		score1 = input.nextDouble();
		//Gets the user input for the second score and stores it in a variable
		System.out.println("Enter the second of three test scores to find the average");
		score2 = input.nextDouble();
		//Gets the user input for the third score and stores it in a variable
		System.out.println("Enter the final test score to find the average");
		score3 = input.nextDouble();
		//Creates a new instance of the TestScores class
		TestScores average = new TestScores();
		//Sets the three user input test scores through methods
		average.setScore1(score1);
		average.setScore2(score2);
		average.setScore3(score3);
		
		//Prints out the resulting letter grade and average score
		System.out.printf("Your letter grade is %s, the average was %%%.2f.", 
				average.getLetterGrade(), average.getAvgScore());
	}

}
