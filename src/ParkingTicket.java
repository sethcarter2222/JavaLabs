import java.text.DecimalFormat;  //Imports the Java text class DecimalFormat

public class ParkingTicket {

	private PoliceOfficer policeOfficer;    //Creates a private policeOfficer object
	private ParkedCar parkedCar;            //Creates a private parkedCar object
	private ParkingMeter parkingMeter;      //Creates a private parkingMeter object
	
	/**
	 * A constructor that takes ParkedCar, ParkingMeter, and PoliceOfficer objects and sets them
	 * to the private variables
	 */
	public ParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter, PoliceOfficer policeOfficer) {
		this.policeOfficer = new PoliceOfficer(policeOfficer);
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
		System.out.println("Parking Ticket has been created");
	}

	/**
	 * Default no argument constructor to initialize
	 * fields
	 */
	public ParkingTicket() {
		
	}
	
	/**
	 * A copy constructor for the ParkingTicket class
	 * @param parkingTicket
	 */
	public ParkingTicket(ParkingTicket parkingTicket) {
		this.policeOfficer = parkingTicket.policeOfficer;
		this.parkedCar = parkingTicket.parkedCar;
		this.parkingMeter = parkingTicket.parkingMeter;
	}
	
	/**
	 * Return a ParkedCar object as a string with the
	 * Make, Model, Color, and License Number
	 */
	public String getParkedCarReport(ParkedCar parkedCar) {
		return new ParkedCar(parkedCar).toString();
	}
	
	/**
	 * Creates a fine report by accepting a ParkedCar and a ParkingMeter object, and
	 * calculates the fines by determining the time over the minutes purchased
	 */
	public String getFineReport(ParkedCar parkedCar, ParkingMeter parkingMeter) {
		//Create a Decimal Format object
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		//Creates an empty string to be returned
		String str = "";
		//Store the fine
		double fine = 0.0;
		//Add to the fine of the minutes parked are greater than what was paid
		double timeOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();
		//Calculate the fine's amount
		if(timeOver > 0) {
			//For the first hour the fine is always $10
			fine += 25.0;
			if(timeOver > 60) {
				//Add $10 for every hour or partial hour over one hour
				fine += (Math.ceil((timeOver - 60) /60) * 10);
			}
			//Adds the fine to the string
			str += "Fine: " + formatter.format(fine);
		}
		System.out.println(str);
		return str;
	}
	
	/**
	 * Returns a PoliceOfficer report with the officer's information
	 * who issued the ticket
	 * @return
	 */
	public String getOfficerReport(){
		return new PoliceOfficer(this.policeOfficer).toString();
		
	}

}
