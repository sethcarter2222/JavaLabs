/**
 * Creates a class that holds an array of GradedActivity objects
 * and sets their grades
 */
public class CourseGrades {

	/**
	 * Creates an array of 4 GradedActivity objects
	 */
	private int ARRAY_SIZE = 4; //Creates a variable for the array size
	GradedActivity[] grades = new GradedActivity[ARRAY_SIZE];
	/**
	 * Default no-argument constructor
	 */
	public CourseGrades() {
		
	}
	/**
	 * Accepts a GradedActivity and sets it to the
	 * first array object
	 */
	public void setLab(GradedActivity g) {
		this.grades[0] = g;
	}
	/**
	 * Accepts a PassFailExam object and sets it to
	 * the second array object
	 */
	public void setPassFailExam(PassFailExam g) {
		this.grades[1] = g;
	}
	/**
	 * Accepts an Essay object and sets it to the
	 * third array object
	 */
	public void setEssay(Essay g) {
		this.grades[2] = g;
	}
	/**
	 * Accepts a Final Exam object and sets it
	 * to the fourth array object
	 */
	public void setFinalExam(FinalExam g) {
		this.grades[3] = g;
	}
	/**
	 * A public toString that displays the grades of the lab,
	 * Pass Fail Exam, Essay, and Final Exam
	 */
	public String toString() {
		String str;
		str = "Lab Grade: " + grades[0].getGrade() +
				"\nPass Fail Exam Grade: " + grades[1].getGrade() +
				"\nEssay Grade: " + grades[2].getGrade() +
				"\nFinal Exam Grade: " + grades[3].getGrade();
		return str;
	}

}
