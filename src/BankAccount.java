/**
 * An abstract class that stores an account's
 * balance, number of deposits, number of withdrawals,
 * interest rate, and monthly charges
 */
public abstract class BankAccount {

	private double balance;      //Creates a variable for the balance
	private int numDeposits;     //Creates a variable for the number of deposits
	private int numWithdrawals;  //Creates a variable for the number of withdrawals
	private double interestRate; //Creates a variable for the interest rate
	private double monthlyCharge;//Creates a variable for the monthly charge
	/**
	 * Constructor accepts a double for the accounts current
	 * balance and the interest rate
	 */
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	/**
	 * Method accepts a double and adds it to the
	 * balance and increments numDeposits
	 */
	public void deposit(double b) {
		this.balance += b;
		this.numDeposits++;
	}
	/**
	 * Method accepts a double and subtracts it from
	 * the balance, and increments numWithdrawals
	 */
	public void withdraw(double b) {
		this.balance -= b;
		this.numWithdrawals++;
		
	}
	/**
	 * Method that calculates the monthly interest that the
	 * account has
	 */
	public void calcInterest() {
		double monthlyIntRate = (this.interestRate / 12);
		double monthlyInterest = (this.balance * monthlyIntRate);
		this.balance = (this.balance + monthlyInterest);
	}
	/**
	 * Creates a method for subtracting the monthly charge
	 * from the balance, and resets the number of withdrawals, 
	 * deposits and the monthly charge
	 */
	public void monthlyProcess(double mc) {
		this.monthlyCharge = mc;
		this.balance -= monthlyCharge;
		this.numWithdrawals = 0;
		this.numDeposits = 0;
		this.monthlyCharge = 0;
	}
	/**
	 * A method for returning the class's balance
	 */
	public double getBalance() {
		return this.balance;
	}
	/**
	 * A method for returning the number of withdrawals
	 * @return
	 */
	public int getNumWithdrawals() {
		return numWithdrawals;
	}
}
