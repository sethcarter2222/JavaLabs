/**
 * 
 * @author sethc
 * This program is for finding the average of three test scores
 */
public class TestScore {
	private double score1;   // creates private variable for score 1
	private double score2;   // creates private variable for score 2
	private double score3;   // creates private variable for score 3
	public TestScore() {
		
	}
	// sets the first score
	public void setScore1(double s1) {
		this.score1 = s1;
	}
	// sets the second score
	public void setScore2(double s2) {
		this.score2 = s2;
	}
	// sets the third score
	public void setScore3(double s3) {
		this.score3 = s3;
	}
	// returns the average
	public double getScoreAvg() {
		return (score1 + score2 + score3) / 3.0;
	}
	
}
