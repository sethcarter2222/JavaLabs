
/**
 * This class is responsible for knowing the police officers name and badge number,
 * Examining a ParkedCar object, and a ParkingMeter object and determining whether the
 * time is expired, as well as issuing a ticket if it has.
 * @author sethc
 */
public class PoliceOfficer {

	private String name;                 //The officer's name
	private int badgeNum;                //The officer's badge number
	private ParkedCar parkedCar;         //An reference to a ParkedCar instance
	private ParkingMeter parkingMeter;   //An reference to a ParkingMeter instance
	private ParkingTicket parkingTicket; //An reference to a ParkingTicker instance
	
	/**'
	 * Default no argument constructor to initialize
	 * fields.
	 */
	public PoliceOfficer() {
		this.name = "";
		this.badgeNum = 0;
	}

	/**
	 * Constructor to set the fields
	 */
	public PoliceOfficer(String name, int badgeNum, ParkedCar parkedCar, 
			ParkingMeter parkingMeter) {
		this.name = name;
		this.badgeNum = badgeNum;
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
		//this.parkingTicket = new ParkingTicket(parkingTicket);
	}
	/**
	 * Constructor for creating an instance of the class that accepts
	 * a name and badge number of the officer
	 */
	public PoliceOfficer(String name, int badgeNum) {
		this.name = name;
		this.badgeNum = badgeNum;
		System.out.println("First officer has been created");
	}
	
	/**
	 * Creates a copy constructor of the PoliceOfficer class 
	 */
	public PoliceOfficer(PoliceOfficer policeOfficer) {
		this.name = policeOfficer.name;
		this.badgeNum = policeOfficer.badgeNum;
	}

	/**
	 * Constructor that accepts an officer, a parkedCar object, a parking
	 * meter object, as well as a ticket object.
	 */
	public PoliceOfficer(PoliceOfficer officer, ParkedCar parkedCar, ParkingMeter parkingMeter,
			ParkingTicket ticket) {
		this.name = officer.name;
		this.badgeNum = officer.badgeNum;
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkingTicket = new ParkingTicket(ticket);
		System.out.println("Second officer has been created");
	}

	/**
	 * A public method for returning the name of the officer
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * A public method for setting the name of the officer
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A public method for returning the badge number of the officer
	 * @return
	 */
	public int getBadgeNum() {
		return badgeNum;
	}

	/**
	 * A public method for setting the name of the officer
	 * @param name
	 */
	public void setBadgeNum(int badgeNum) {
		this.badgeNum = badgeNum;
	}

	/**
	 * A public method for returning the value of the parked
	 * car object variable
	 * @return
	 */
	public ParkedCar getParkedCar() {
		return new ParkedCar(parkedCar);
	}

	/**
	 * A public method that sets the parked car variable
	 * to the object submitted as an argument
	 * @param parkedCar
	 */
	public void setParkedCar(ParkedCar parkedCar) {
		this.parkedCar = new ParkedCar(parkedCar);
	}

	/**
	 * A return method for a parking meter instance
	 */
	public ParkingMeter getParkingMeter() {
		return new ParkingMeter(parkingMeter);
	}

	/**
	 * A public copy method of the ParkingMeter class
	 */
	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	/**
	 * A public method that determines if the car was parked longer then the amount
	 * of minutes it purchased, and issues a ticket if it is over.
	 */
	public void examineParkedCar(ParkedCar parkedCar, ParkingMeter parkingMeter, ParkingTicket parkingTicket) {
		if(parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased()) {
			System.out.println("Parking Ticket issued.");
			this.parkingTicket = new ParkingTicket(parkingTicket);
			issueParkingTicket(parkingTicket);
			
		}
	}
	/**
	 * A public method for issuing a ParkingTicket, creating
	 * an Officer's report, a Parked Car report, and a Fine 
	 * report
	 * @param parkingTicket
	 */
	public void issueParkingTicket(ParkingTicket parkingTicket) {
		ParkedCar parkedCar = new ParkedCar("BatMobile", "Fox", "Black", "B4TM4N", 185.0);
		ParkingMeter parkingMeter = new ParkingMeter(30.0);
		PoliceOfficer officer = new PoliceOfficer("Officer Gordon: ", 71662);
		ParkingTicket ticket = new ParkingTicket(parkedCar, parkingMeter, officer);
		PoliceOfficer officer1 = new PoliceOfficer(officer, parkedCar, parkingMeter, ticket);
		System.out.println("Object created.");
		ticket.getOfficerReport();
		System.out.println("Officer Report Issued issued.");
		ticket.getParkedCarReport(parkedCar);
		System.out.println("Parked Car Report issued.");
		ticket.getFineReport(parkedCar, parkingMeter);
		System.out.println("Fine report issued.");
	}
	/**
	 * A public toString method that returns the officer's
	 * name and badge number
	 */
	public String toString() {
		String str;
		str = "Officer's name: " + this.name +
				"\nBadge Number: " + this.badgeNum;
		System.out.println(str);
		return str;
	}

}
