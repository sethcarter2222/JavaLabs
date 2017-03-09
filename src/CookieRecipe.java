import javax.swing.JOptionPane;  //Imports JOptionPane

public class CookieRecipe {
/**
 * @author sethc
 * Allows User to input desired amount of cookies and calculates the amount of each ingredient required
 */
	public static void main(String[] args) {
		double FLOUR_PER_COOKIE = 2.75 / 48;      //Calculates flour used per cookie
		double BUTTER_PER_COOKIE = 1.0 / 48;      //Calculates butter used per cookie
		double SUGAR_PER_COOKIE = 1.5 / 48;       //Calculates sugar used per cookie
		//Aquires user input for amount of desired cookies
		String COOKIES_DESIRED;
		COOKIES_DESIRED = JOptionPane.showInputDialog("How many cookies would you like to make?");
		double CookieDesired = Double.parseDouble(COOKIES_DESIRED);
		//assigns variables to the amounts of each ingredient used in the desired cookie amount
		double CUPS_O_FLOUR = CookieDesired * FLOUR_PER_COOKIE;
		double CUPS_O_BUTTER = CookieDesired * BUTTER_PER_COOKIE;
		double CUPS_O_SUGAR = CookieDesired * SUGAR_PER_COOKIE;
		//Displays the results to the user
		System.out.printf("You need %.2f cups of flour,\nYou need %.2f cups of butter,\nand you need %.2f cups of sugar", CUPS_O_FLOUR, CUPS_O_BUTTER, CUPS_O_SUGAR);

	}

}
