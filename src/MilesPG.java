import javax.swing.JOptionPane; // Imports JOptionPane
/**
 * 
 * @author sethc
 *  Program calculates the the Users MPG
 */
public class MilesPG {
// Program starts here
	public static void main(String[] args) {
		String MILES_DRIVEN; 
		MILES_DRIVEN = JOptionPane.showInputDialog("How many miles did you drive?");   // Gets miles driven
		double MILES = Double.parseDouble(MILES_DRIVEN);
		String GALLONS_USED; 
		GALLONS_USED = JOptionPane.showInputDialog("How many gallons did you use?");   // Gets gallons used
		double GALLONS = Double.parseDouble(GALLONS_USED);
		double YOUR_MPG = MILES / GALLONS;                                             //Performs calculations
		
		//Displays result
		JOptionPane.showMessageDialog(null, "Your MPG is " + YOUR_MPG);
		System.exit(0);

	}

}
