import javax.swing.JOptionPane; // Imports JOptionPane

public class Resturant {
/**
 * @author sethc
 * Demonstrates calculation of tax and tip for a restaurant bill and the total amount
 */
	public static void main(String[] args) {
		// Demonstrates converting the string bill gathered from user to a double for calculations
		String SPENT;
		SPENT = JOptionPane.showInputDialog("Enter the amount of your meal");
		double AMOUNT_SPENT = Double.parseDouble(SPENT);
		
		double TAX = AMOUNT_SPENT * 0.075;     // Calculates tax
		double TAX_MAIN = AMOUNT_SPENT + TAX;  // Calculates total with tax
		double TIP = TAX_MAIN * 0.18;          // Calculates tip
		double TOT_BILL = TAX_MAIN + TIP;      // Calculates total bill
		//Displays outcome to User
		System.out.printf("Your bill is $%.2f, your tax is $%.2f, your suggested tip is $%.2f" + 
		", which brings your total bill to $%.2f", AMOUNT_SPENT, TAX, TIP, TOT_BILL);             

	}

}
