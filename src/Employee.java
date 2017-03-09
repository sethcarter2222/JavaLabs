
public class Employee {

	private String name;
	private String employeeNum;
	private String hireDate;
	public Employee() {
		
	}
	public void setEmployeeName(String n) {
		this.name = n;
	}
	
	public void setEmployeeNumber(String num) {
		this.employeeNum = num;
	}
	
	public void setHireDate (String date) {
		this.hireDate = date;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmployeeNumber() {
		return employeeNum;
	}
	
	public String getHireDate() {
		return hireDate;
	}

}
