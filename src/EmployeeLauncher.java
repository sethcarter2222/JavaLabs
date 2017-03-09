/**
 * 
 * @author sethc
 * This is the launcher for the Employee class
 */
public class EmployeeLauncher {
/**
 * 
 * @param args
 *  The program starts here
 */
	public static void main(String[] args) {
		
		// creates three separate objects
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		// Sets the name for each employee
		employee1.setName("Susan Meyers");
		employee2.setName("Mark Jones");
		employee3.setName("Joy Rogers");
		
		// Sets the Id Numbers for each employee
		employee1.setId(47899);
		employee2.setId(39119);
		employee3.setId(81774);
		
		// Sets the Departments of each employee
		employee1.setDepartment("Accounting");
		employee2.setDepartment("IT");
		employee3.setDepartment("Manufacturing");
		
		// Sets the Position for each employee
		employee1.setPosition("Vice President");
		employee2.setPosition("Programmer");
		employee3.setPosition("Engineer");
		
		// Displays all the information for Employee1
		System.out.println("Employee 1's name is: " + employee1.getName() +
				"\nTheir employee number is: " + employee1.getId() +
				"\nTheir department is: " + employee1.getDepartment() +
				"\nTheir position is: " + employee1.getPosition() + "\n\n");
		
		// Displays all the information for Employee2
		System.out.println("Employee 2's name is: " + employee2.getName() +
				"\nTheir employee number is: " + employee2.getId() +
				"\nTheir department is: " + employee2.getDepartment() +
				"\nTheir position is: " + employee2.getPosition() + "\n\n");
		
		// Displays all the information for Employee3
		System.out.println("Employee 3's name is: " + employee3.getName() +
				"\nTheir employee number is: " + employee3.getId() +
				"\nTheir department is: " + employee3.getDepartment() +
				"\nTheir position is: " + employee3.getPosition() + "\n\n");


	}

}
