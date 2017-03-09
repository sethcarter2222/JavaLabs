/**
 * This class extends the BankAccount class
 * that uses methods to withdraw, and deposit
 * money from the account and sets up a monthly process
 * of service charges.
 */
public class SavingsAccount extends BankAccount {

	private boolean status; //A variable for the status of the account
	/**
	 * Constructor accepts a balance and interest rate, and
	 * sends them to the Bank Account constructor
	 */
	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}
	/**
	 * Method withdraws the given amount if the account has the 
	 * correct amount of funds
	 */
	public void withdraw(double amount) {
		if (this.status == false) {
			System.out.println("Please deposit more money, before trying " +
		"to withdraw.");
		} else {
			super.withdraw(amount);
		}
	}
	/**
	 * Method deposits the given amount and sets the account
	 * to active if the account has enough funds
	 */
	public void deposit(double amount) {
		super.deposit(amount);
		if (status == false) {
			if (super.getBalance() >= 25) {
				status = true;
			} else if (super.getBalance() < 25) {
				status = false;
			}
		}
	}
	/**
	 * Method runs the monthly process on the Savings account
	 * and sets the account to inactive if the amount falls below
	 * 25 dollars
	 */
	public void monthlyProcess() {
		if (super.getNumWithdrawals() > 4) {
			int monthlyCharges;
			monthlyCharges = (super.getNumWithdrawals() - 4);
			super.monthlyProcess(monthlyCharges);
			if (super.getBalance() < 25) {
				status = false;
			}
		}
	}

}
