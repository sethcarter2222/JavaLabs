/**
 * This class  creates four different objects for a 
 * variety of types of tests and sends them to the
 * CourseGrades and displays the resulting grades
 */
public class CourseGradesDemo {

	/**
	 * Main method for starting the program
	 */
	public static void main(String[] args) {
		/**
		 * Creates a new Graded Activity object and
		 * sets the score
		 */
		GradedActivity grade1 = new GradedActivity();
		grade1.setScore(92.5);
		/**
		 * Creates a new PassFailExam  object and sets the
		 * exam points
		 */
		PassFailExam grade2 = new PassFailExam(40, 5, 30);
		/**
		 * Creates an Essay object and sets the scores
		 * of the four categories
		 */
		Essay grade3 = new Essay(24, 18, 19, 23);
		grade3.getGrade();
		/**
		 * Creates a FinalExam and a CourseGrades object
		 * and sets the questions for the FinalExam
		 */
		FinalExam grade4 = new FinalExam(50, 3);
		CourseGrades grades = new CourseGrades();
		/**
		 * Sets the four previously made objects to the
		 * array in the CourseGrades class
		 */
		grades.setLab(grade1);
		grades.setPassFailExam(grade2);
		grades.setEssay(grade3);
		grades.setFinalExam(grade4);
		/**
		 * Displays the results through the toString
		 * method
		 */
		System.out.println(grades);

	}

}
