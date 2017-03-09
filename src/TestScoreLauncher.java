import java.util.Scanner;           // imports java class Scanner
public class TestScoreLauncher {
/**
 * 
 * @param args
 * program starts here
 */
	
	public static void main(String[] args) {
		 double score1;   // sets the variable for score1
		 double score2;   // sets the variable for score2
		 double score3;   // sets the variable for score3
		 //Creates a new instance of Scanner
		Scanner input = new Scanner(System.in);
		//Creates a new instance of a scoresheet
		TestScore score = new TestScore();
		//gets the first test score
		System.out.println("What is the first test score?");
		score1 = input.nextDouble();
		//gets the second test score
		System.out.println("What is the second test score?");
		score2 = input.nextDouble();
		// gets the third test score
		System.out.println("What is the third test score?");
		score3 = input.nextDouble();
		//sets the three amounts
		score.setScore1(score1);
		score.setScore2(score2);
		score.setScore3(score3);
		//Displays the results
		System.out.printf("The test score average is %%%.2f", score.getScoreAvg());

	}

}
