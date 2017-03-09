/**
 * This Demo creates 4 invalid instances, each with a different
 * exception that gets thrown
 */
public class PayrollDemo {
/**
 * Main method for the program to start
 */
	public static void main(String[] args) {
		/**
		 * Try/catch statement that passes in a blank name
		 */
		try {
			Payroll payroll1 = new Payroll("", 123, 14.0, 20.0);
		}
		catch (InvalidName e) {
			System.out.println(e.getMessage());
		} catch (InvalidId e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		} catch (InvalidHours e) {
			System.out.println(e.getMessage());
		}
		/**
		 * Try/catch statement that passes in an invalid id number
		 */
		try {
			Payroll payroll2 = new Payroll("Timmy", 0, 14.0, 20.0);
		}
		catch (InvalidName e) {
			System.out.println(e.getMessage());
		} catch (InvalidId e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		} catch (InvalidHours e) {
			System.out.println(e.getMessage());
		}
		/**
		 * Try/catch statement that passes in an invalid pay rate
		 */
		try {
			Payroll payroll2 = new Payroll("Timmy",123, -9, 20.0);
		}
		catch (InvalidName e) {
			System.out.println(e.getMessage());
		} catch (InvalidId e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		} catch (InvalidHours e) {
			System.out.println(e.getMessage());
		}
		/**
		 * Try/catch statement that passes in an invalid hour amount
		 */
		try {
			Payroll payroll2 = new Payroll("Timmy", 142, 14.0, 100.0);
		}
		catch (InvalidName e) {
			System.out.println(e.getMessage());
		} catch (InvalidId e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		} catch (InvalidHours e) {
			System.out.println(e.getMessage());
		}
	}
}