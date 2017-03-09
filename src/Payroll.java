/**
 * @author sethc
 * This program takes the hours/Id/name/and pay rate and throws custom
 * exceptions based off invalid values
 */
public class Payroll {
	private String name;   // private variable string name
	private int number;    // private variable integer number
	private double pay;    // private variable double pay
	private double hours;  // private variable double hours
	/**
	 * Constructor accepts employee name and id number as arguments, and throws the
	 * Invalid Id/Name/PayRate/Hours exceptions, if the name is blank, the id number is
	 * 0 or less, the hours are not between 0 and 84, and the pay rate is not between
	 * 0 and 25.
	 */
	public Payroll(String employeeName, int idNumber, 
			double pay, double hours) throws InvalidName, InvalidId, InvalidPayRate, InvalidHours {
		if (employeeName.trim().equals("") || employeeName == null) {
			throw new InvalidName();
		}
		if (idNumber <= 0) {
			throw new InvalidId();
		}
		if (hours < 0 || hours > 84) {
			throw new InvalidHours();
		}
		if (pay < 0 || pay > 25) {
			throw new InvalidPayRate();
		}
	}

}