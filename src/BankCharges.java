/**
 * This program determines the end balance of the user's
 * account based on the number of checks they wrote
 * and the charges associated with that number.
 */
public class BankCharges {

	double numOfChecks;   //private variable for number of checks
	double checkCharge;   //private variable for the check charge
	double startBalance;  //private variable for the start balance
	double endBalance;    //private variable for the ending balance
	//Default no argument constructor
	public BankCharges() {
		
	}
	//Method for setting the number of checks written in given month
	public void setNumOfChecks(double numOfChecks) {
		this.numOfChecks = numOfChecks;
	}
	//Method for getting the amount charged for writing checks
	public double getCheckCharge() {
		if (numOfChecks < 20) {
			checkCharge = numOfChecks * 0.10;
		} else if (numOfChecks < 40) {
			checkCharge = numOfChecks * 0.08;
		} else if (numOfChecks < 60) {
			checkCharge = numOfChecks * 0.06;
		} else {
			checkCharge = numOfChecks * 0.04;
		}
		return checkCharge;
	}
	//Method for getting the start Balance
	public double getStartBalance() {
		return startBalance;
	}
	//Method for setting the start balance
	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}
	//method for calculating and returning the ending balance
	public double getEndBalance() {
		if (numOfChecks < 20) {
			checkCharge = numOfChecks * 0.10;
		} else if (numOfChecks < 40) {
			checkCharge = numOfChecks * 0.08;
		} else if (numOfChecks < 60) {
			checkCharge = numOfChecks * 0.06;
		} else {
			checkCharge = numOfChecks * 0.04;
		}
		endBalance = startBalance - checkCharge;
		return endBalance;
	}

	
}
