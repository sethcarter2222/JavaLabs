import javax.swing.JOptionPane;  // Imports JOptionPane
/**
 * 
 * @author sethc
 *   Calculates state and count tax and displays totals
 */
public class SaleTax {
// Program begins here
	public static void main(String[] args) {
		String purchase; 
		purchase = JOptionPane.showInputDialog("How much was your purchase?");
		double PURCHASE = Double.parseDouble(purchase);
		double STATE_TAX = PURCHASE * 0.055;               // calculates state tax
		double COUNTY_TAX = PURCHASE * 0.02;               // calculates county tax
		double TAX_TOTAL = STATE_TAX + COUNTY_TAX;         // calculates total tax
		double PURCHASE_TOTAL = PURCHASE + TAX_TOTAL;      // calculates purchase total
		//Displays result to Users
		JOptionPane.showMessageDialog(null, "You spent $" + PURCHASE + ", there was a state tax of $" + STATE_TAX +
				" and a county tax of $" + COUNTY_TAX + ". The tax total is $" + TAX_TOTAL + " which brings the total to $" + PURCHASE_TOTAL);
		System.exit(0);

	}

}
