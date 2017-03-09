/**
 * This class is used to creates instances of a ParkedCar object and
 * store it's information to be used by ParkingTicket and PoliceOfficer
 * classes
 */
public class ParkedCar {

	private String make,               //Make of the parked car
		model,                         //Model of the parked car
		color,                         //Color of the parked car
		licenseNumber;                 //License number of the parked car
	private double numMinutesParked;   //Number of minutes the car has been parked
	
	/**
	 * Default no argument constructor to
	 * initialize the fields
	 */
	public ParkedCar() {
		this.make = "";
		this.model = "";
		this.color = "";
		this.licenseNumber = "";
		this.numMinutesParked = 0;
	}
	/**
	 * A ParkedCar constructor that accepts the make, model, color, license number,
	 * and number of minutes parked sets them to the variables.
	 */
	public ParkedCar(String make, String model, String color, String licenseNumber,
			double numMinutesParked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.numMinutesParked = numMinutesParked;
		System.out.println("Parked Car has been created;");
	}
	
	/**
	 * A ParkedCar copy constructor that accepts a ParkedCar object as an
	 * argument and copies the  make, model, color, minutes parked, and 
	 * license number
	 */
	public ParkedCar(ParkedCar parkedCar) {
		this.make = parkedCar.make;
		this.color = parkedCar.color;
		this.model = parkedCar.model;
		this.licenseNumber = parkedCar.licenseNumber;
		this.numMinutesParked = parkedCar.numMinutesParked;
	}

	/**
	 * A public method that returns the make of the car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * A public method that sets the make of the car
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * A public method that returns the model of the car
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 * A public method that sets the model of the car
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * A public method that returns the color of the car
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * A public method that sets the color of the car
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * A public method that returns the license number of the car
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * A public method that sets the license number of the car
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	/**
	 * A public method that returns the number of minutes parked
	 */
	public double getNumMinutesParked() {
		return numMinutesParked;
	}

	/**
	 * A public method that sets the number of minutes parked
	 */
	public void setNumMinutesParked(double numMinutesParked) {
		this.numMinutesParked = numMinutesParked;
	}
	
	/**
	 * A toString method that displays the make, model, color and
	 * license number of the parked car
	 */
	public String toString() {
		String str;
		str = "Make: " + this.make +
				"\nModel: " + this.model +
				"\nColor: " + this.color +
				"\nLicense Number: " + this.licenseNumber;
		System.out.println(str);
		return str;
	}

}
