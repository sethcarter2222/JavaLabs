/**
 * Class demonstrates the SavingsAccount class
 * by calculating interest, depositing, withdrawing and
 * doing the monthly process
 */
public class SavingsAccountDemo {
/**
 * Program starts here
 */
	public static void main(String[] args) {
		/**
		 * Creates a new Savings Account object, shows the error
		 * of withdrawing when the account is under 25 dollars,
		 * and the monthly service charge for over 4 withdrawals
		 */
		SavingsAccount account1 = new SavingsAccount(15, 24);
		account1.calcInterest();
		account1.withdraw(11);
		account1.deposit(12);
		account1.withdraw(7);
		account1.withdraw(1);
		account1.withdraw(1);
		account1.withdraw(1);
		account1.withdraw(1);
		account1.monthlyProcess();
		System.out.println(account1.getBalance());
		account1.withdraw(25);
		System.out.println(account1.getBalance());

	}

}
