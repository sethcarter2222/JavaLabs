
public class TestScores2 {

	private double[] testScores;
	public TestScores2(double[] array) throws InvalidTestScores{
		this.testScores = array;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0 || array[i] > 100) {
				throw new InvalidTestScores();
			}
		}
	}
	
	/*public double getAverage() {
		double total = 0;
		for(int i = 0; i < this.testScores.length; i++) {
			if(this.testScores[i] < 0 || this.testScores[i] > 100) {
				throw new IllegalArgumentException("Error, invalid score has been given");
			} else{
				total += this.testScores[i];
			}
		}
		return total/this.testScores.length;
	}*/

}