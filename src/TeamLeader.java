/**
 * This class extends the Production Worker class,
 * and creates a Team Leader object that adds in a
 * monthly bonus, their required annual hours and
 * their hours currently attended
 */
public class TeamLeader extends ProductionWorker {

	private double monthlyBonus;  //Sets a variable for their monthly bonus
	private double requiredHours; //Sets a variable for the required hours
	private double hoursAttended; //Sets a variable for the hours attended
	/**
	 * Constructor accepts doubles for the team leader's monthly bonus,
	 * required hours, and their hours currently attended, and sets them
	 * to the variables
	 */
	public TeamLeader(double rh, double ha, double mb) {
		super(21.42);
		this.requiredHours = rh;
		this.hoursAttended = ha;
		this.monthlyBonus = mb;
	}
	/**
	 * Public toString method that prints out the employee's name
	 * employee number, hire date, shift, hourly pay rate, monthly
	 * bonus, required hours and hours attended.
	 */
	public String toString() {
		String str;
		str = "Employee Name: " + super.getName() +
				"\nEmployee Number: " + super.getEmployeeNumber() +
				"\nHire Date: " + super.getHireDate() +
				"\nShift: " + super.getShift() +
				"\nHourly Pay Rate: " + super.getHourlyPayRate() +
				"\nRequired Annual Hours: " + requiredHours +
				"\nAnnual Attended Hours: " + hoursAttended +
				"\nMonthly Bonus: " + monthlyBonus;
		return str;
	}

}
