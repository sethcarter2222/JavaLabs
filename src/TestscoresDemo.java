/**
 * This class tests the TestScores and TestScores2 classes
 * by passing in invalid test scores to throw up custom
 * exceptions
 */
public class TestscoresDemo {

	public static void main(String[] args) {
		//Creates an array for the testScores
		double[] testScores = {23.0, 45.0, 85.0, 90.0, 102};
		/**
		 * Creates a new instance of the TestScores class
		 * and sends in the testScores array
		 */
		TestScores scores = new TestScores(testScores);
		
		/*try {
			TestScores2 scores2 = new TestScores2(testScores);
		} catch(InvalidTestScores e) {
			System.out.println(e.getMessage());
		}*/
	}

}
