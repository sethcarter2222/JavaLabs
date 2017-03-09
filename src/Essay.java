
public class Essay extends GradedActivity {

	private double totalGrade;
	private double grammarScore;
	private double spellingScore;
	private double lengthScore;
	private double contentScore;
	public Essay(double g, double s, double l, double c) {
		this.contentScore = c;
		this.grammarScore = g;
		this.lengthScore = l;
		this.spellingScore = s;
	}
	
	public char getGrade() {
		totalGrade += grammarScore;
		totalGrade += spellingScore;
		totalGrade += lengthScore;
		totalGrade += contentScore;
		super.setScore(totalGrade);
		return super.getGrade();
	}

}
