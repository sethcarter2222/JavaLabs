import java.util.Scanner;  // imports class Scanner
public class PayrollLauncher {
	static String employeeName;  // Sets variable for employee name
	static int idNumber;         // Sets variable for employee id number
	static double pay;           // Sets variable for employee pay
	static double hours;         // Sets variable for employee nahours
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 //Stores input for employee name
		System.out.println("What is the employee's name?");
		employeeName = input.nextLine();   
		 //Stores input for employee id number
		System.out.println("What is the employee's ID number?");
		idNumber = input.nextInt();
		//Creates new employee instance
		Payroll employee1 = new Payroll(employeeName, idNumber);
		// creates employee's hourly pay
		System.out.println("What is the employee's hourly pay?");
		pay = input.nextDouble();
		// stores amount of hours worked
		System.out.println("How many hours did the employee work?");
		hours = input.nextDouble();
		//Enters to variable amounts to equation
		employee1.setHours(hours);
		employee1.setPay(pay);
		//Displays result
		System.out.printf("%s's (#%d) gross pay is $%.2f", employeeName, idNumber, employee1.getGrossPay());
	}

}
