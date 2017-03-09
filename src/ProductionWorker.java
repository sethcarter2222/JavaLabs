
public class ProductionWorker extends Employee {

	private int shift;
	private double hourlyPayRate;
	public ProductionWorker(double hpr) {
		this.hourlyPayRate = hpr;
	}
	
	public void setDayShift() {
		this.shift = 1;
	}
	
	public void setNightShift() {
		this.shift = 2;
	}
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	
	
	public String toString() {
		String str;
		str = "Employee Name: " + super.getName() +
				"\nEmployee Number: " + super.getEmployeeNumber() +
				"\nHire Date: " + super.getHireDate() +
				"\nShift: " + shift +
				"\nHourly Pay Rate: " + hourlyPayRate;
		return str;
	}

}
