/**
 * 
 * @author sethc
 * This program creates a class that stores the information for three separate employees
 */
public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() {
		
	}
	// the mutator for setting each employees name
	public void setName(String n) {
		this.name = n;
	}
	// the mutator for setting each employees department
	public void setDepartment(String depart) {
		this.department = depart;
	}
	// the mutator for setting each employees Position
	public void setPosition(String posit) {
		this.position = posit;
	}
	// the mutator for setting each employees IdNumber
	public void setId(int id) {
		this.idNumber = id;
	}

	// Returns the value of the employees name
	public String getName() {
		return name;
	}
	// Returns the value of the employees IdNumber
	public int getId() {
		return idNumber;
	}
	// Returns the value of the employees Department
	public String getDepartment() {
		return department;
	}
	// Returns the value of the employees Position
	public String getPosition() {
		return position;
	}
	
}
