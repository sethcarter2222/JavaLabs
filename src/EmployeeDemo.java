/**
 * This program creates different instances of the Employee
 * class and it's subclass and stores their information and displays
 * the results
 */
public class EmployeeDemo {

	public static void main(String[] args) {
	/*	System.out.println("***********Employee 1************");
		ProductionWorker employee1 = new ProductionWorker(34.32);
		employee1.setNightShift();
		employee1.setEmployeeName("Brandon Meyers");
		employee1.setEmployeeNumber("8675309");
		employee1.setHireDate("11/4/07");
		System.out.println(employee1);
		System.out.println("\n***********Employee 2************");
		ShiftSupervisor employee2 = new ShiftSupervisor(650000, 45000);
		employee2.setEmployeeName("Philis Niandel");
		employee2.setEmployeeNumber("3266373");
		employee2.setHireDate("24/7/01");
		System.out.println("\n" + employee2); */
		
		/**
		 * Creates and Team Leader instance and uses Team Leader
		 * methods to set Employee Name, Employee Number, and
		 * their hire date
		 */
		System.out.println("\n***********Employee 3************");
		TeamLeader employee3 = new TeamLeader(42, 25, 61);
		employee3.setEmployeeName("Jyan Harveela");
		employee3.setEmployeeNumber("9007142");
		employee3.setHireDate("3/12/14");
		/**
		 * Prints out results through toString method
		 */
		System.out.println("\n" + employee3);
	}

}
