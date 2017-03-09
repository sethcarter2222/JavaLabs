import javax.swing.JOptionPane; //Imports JOptionPane
/**
 * 
 * @author sethc
 * This program calculates test average
 */
public class TestAverage {
// Program starts here
	public static void main(String[] args) {
		String TEST_ONE; 
		TEST_ONE = JOptionPane.showInputDialog("What is your first test score?");     // Gets the first test score
		double ONE = Double.parseDouble(TEST_ONE);
		String TEST_TWO; 
		TEST_TWO = JOptionPane.showInputDialog("What is your second test score?");    // Gets the second test score
		double TWO = Double.parseDouble(TEST_TWO);
		String TEST_THREE; 
		TEST_THREE = JOptionPane.showInputDialog("What is your third test score?");   // Gets the third variable
		double THREE = Double.parseDouble(TEST_THREE);
		double AVERAGE = (ONE + TWO + THREE) / 3;                                     //Performs the calculations
		
		//Displays the result for the User
		JOptionPane.showMessageDialog(null, "Your test scores are: " + ONE + ", " + TWO + ", and " + THREE +
				". Your average test score is: " + AVERAGE);
		System.exit(0);

	}

}
