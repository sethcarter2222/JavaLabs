/**
 * Public class that sets the grades of students
 * on multiple tests and displays their letter grades
 */
public class Grade {

	final int ARRAY_SIZE = 4;  //Creates a final array size
	private String name;       //Creates a name variable
	private double[] scores = new double[ARRAY_SIZE]; //Creates a double array for the scores
	/**
	 * Default no argument constructor for initializing names
	 */
	public Grade() {
		this.name = "";
	}
	/**
	 * Constructor accepts a name and an array of doubles
	 * and sets the values to the private variables
	 */
	public Grade(String name, double[] scores) {
		this.name = name;
		this.scores = scores;
		
	}
	/**
	 * Public method that sets the score for each test
	 */
	public void setScore(double s, int i) {
		scores[i] = s;
	}
	/**
	 * Public method for getting the scores of a given test
	 */
	public double getScore(int i) {
		return scores[i];
	}

	/**
	 * Public method for setting the name of a student
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/**
	 * Public method for getting the average test score
	 */
	public double getAvg() {
		double tot = 0;
		double avg;
		for (int i = 0; i < scores.length; i++) {
			tot += scores[i];
		}
		avg = tot / scores.length;
		return avg;
	}
	/**
	 * Public char method that gets the letter grade of 
	 * the student based on their average test score
	 */
	public char getGrade() {
		double avg = getAvg();
		char letter;
		if (avg >= 90) {
			letter = 'A';
		} else if (avg >= 80) {
			letter = 'B';
		} else if (avg >= 70) {
			letter = 'C';
		} else if (avg >= 60) {
			letter = 'D';
		} else {
			letter = 'F';
		}
		return letter;
	}
	/**
	 * ToString method that displays the students name
	 * test score average and letter grade
	 */
	public String toString() {
		String str = "";
		str = "Name: " + this.name +
				"\nAverage score: " + getAvg() +
				"\nLetterGrade: " + getGrade();
		return str;
	}
}
