/**
 * This class gets user input for three test scores
 * and displays the average and letter grade
 */
public class TestScores {
	private double score1;    //Sets private variable for the first test score
	private double score2;    //Sets private variable for the second test score
	private double score3;    //Sets private variable for the third test score
	private double avgScore;  //Sets private variable for the average score
	private char letterGrade; //Sets a private variable for the letter grade
	public TestScores() {
		
	}

	//Method sets user input as score one
	public void setScore1(double sc1) {
		score1 = sc1;
	}
	//Method sets user input as score two
	public void setScore2(double sc2) {
		score2 = sc2;
	}
	//Method sets user input as score three and calculates the average score
	public void setScore3(double sc3) {
		score3 = sc3;
		avgScore = (score1 + score2 + score3)/ 3.0;
	}
	//Second method for getting average score
	public double getAvgScore() {
		return (score1 + score2 + score3)/ 3.0;
	}
	//method gets the letter grade based off of average score
	public char getLetterGrade() {
		if (avgScore < 60) {
			letterGrade = 'F';
			return letterGrade;
		} else if (avgScore < 70) {
			letterGrade = 'D';
			return letterGrade;
		} else if (avgScore < 80) {
			letterGrade = 'C';
			return letterGrade;
		} else if (avgScore < 90) {
			letterGrade = 'B';
			return letterGrade;
		} else {
			letterGrade = 'A';
			return letterGrade;
		}
	}
}
