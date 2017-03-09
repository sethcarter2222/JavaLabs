
public class ShiftSupervisor extends Employee {

	private double annualSalary;
	private double annualBonus;
	public ShiftSupervisor(double as, double ab) {
		this.annualBonus = ab;
		this.annualSalary = as;
	}
	
	public String toString() {
		String str;
		str = "Employee Name: " + super.getName() +
				"\nEmployee Number: " + super.getEmployeeNumber() +
				"\nHire Date: " + super.getHireDate();
		
		System.out.printf("\nAnnual Salary: $%,.2f", annualSalary);
		System.out.printf("\nAnnual Bouns: $%,.2f", annualBonus);
		return str;
	}

}
