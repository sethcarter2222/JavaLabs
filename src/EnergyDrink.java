/**
 * @author sethc
 * This program calculates the surveyed users who consume energy drinks weekly, and those who prefer citrus
 */
public class EnergyDrink {
/**
 * Programs starting point
 */
	public static void main(String[] args) {
		double CUSTOMERS_SURVEYED = 15000.0;                   //The number of customers surveyed
		double DRINKERS_SURVEYED = CUSTOMERS_SURVEYED * 0.18;  //Calculates the number of weekly energy drink consumers of those surveyed
		double CITRUS_FAVORS = DRINKERS_SURVEYED * 0.58;       //Calculates the people who drink weekly and prefer citrus
		//Displays the outcome of calculations to the User
		System.out.printf("The average amount of customers who drank one or more energy drinks " +
		"per week is %.0f\nOf those, the amount of people who prefered citrus is %.0f", DRINKERS_SURVEYED, CITRUS_FAVORS);

	}

}
