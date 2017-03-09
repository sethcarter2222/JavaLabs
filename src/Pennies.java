/**
 * Public class Pennies sets the amount of days that the
 * user has worked and displays the resulting salary if
 * they started out earning one penny a day, yet doubled
 * their salary each following day
 * @author sethc
 */
public class Pennies {

	private int pennies;             //Sets a private int variable for pennies
	private double totPennies = 1;   //Sets a private double variable for total pennies
	private int days;                //Sets a private int variable for days worked
	private double penCount;         //Sets a private double variable for a penny counter
	private int dayCount = 1;        //Sets a private int variable for a day counter
	
	/**
	 * public default no argument constructor for the Pennies class
	 */
	public Pennies() {

	}
	
	/**
	 * Public method for setting the days through user input and setting up
	 * a loop for determining a valid input
	 */
	public void setDays(int d) {
		while (d <= 0) {
		System.out.println("Please enter a number greater than zero.");
		System.exit(0);
		} 
		this.days = d;
	}
	
	/**
	 * Public method for calculating and displaying the amount of money earned
	 * through a while loop, and displays the total result
	 */
	public double getGuap() {
		while (dayCount < days) {
			totPennies = totPennies * 2;
			penCount = totPennies / 100;
			dayCount++;
		}
		System.out.printf("Your total pennies is $%,.2f", penCount);
		return totPennies;
	}

}
