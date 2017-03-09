/**
 * This class demonstrates a thrown IllegalArgumentException
 * with a custom method when an incorrect value is passed
 * to the constructor via the array
 */
public class TestScores {

	private double[] testScores; //Creates a private variable for a testScores array
	/**
	 * Constructor accepts and array and tests whether all the values are valid
	 * and throws an IllegalArgumentException if there is an illegal value
	 */
	public TestScores(double[] array) {
		this.testScores = array;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0 || array[i] > 100) {
				throw new IllegalArgumentException("Error, invalid score has been given");
			}
		}
	}
}