/**
 * 
 * @author sethc
 * This program takes the hours worked and pay rate and
 * displays gross pay
 */
public class Payroll {
	private String name;   // private var string name
	private int number;    // private var int number
	private double pay;    // private var double pay
	private double hours;  // private var doulbe hours
	//Constructor accepts employee name and id number as arguments
	public Payroll(String employeeName, int idNumber) {
		name = employeeName;
		number = idNumber;
	}
	// mutator for hours
	public void setHours(double h) {
		this.hours = h;
	}
	//mutator for pay
	public void setPay(double p) {
		this.pay = p;
	}
	// accesses gross pay
	public double getGrossPay() {
		return hours * pay;
	}

}
