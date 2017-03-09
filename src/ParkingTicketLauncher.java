/**
 * This class is the launcher for the ParkingTicket class which creates instances
 * of the ParkingMeter, PoliceOfficer, ParkedCar, and Parking Ticket class, submits the
 * arguments to the overloaded constructors and displays the issued ticket.
 * @author sethc
 *
 */
public class ParkingTicketLauncher {

	public static void main(String[] args) {
		/**
		 * Creates a new instance of the ParkedCar class
		 */
		ParkedCar parkedCar = new ParkedCar("BatMobile", "Fox", "Black", "B4TM4N", 185.0);
		/**
		 * Creates a new instance of the ParkingMeter Class
		 */
		ParkingMeter parkingMeter = new ParkingMeter(30.0);
		/**
		 * Creates a new instance of the PoliceOfficer class
		 */
		PoliceOfficer officer = new PoliceOfficer("Officer Gordon: ", 71662);
		/**
		 * Creates a new instance of the ParkingTicket class
		 */
		ParkingTicket ticket = new ParkingTicket(parkedCar, parkingMeter, officer);
		/**
		 * Creates another Police Officer instance that passes through a PoliceOfficer object,
		 * a ParkedCar object, a ParkingMeter object, and a ParkingTicket object
		 */
		PoliceOfficer officer1 = new PoliceOfficer(officer, parkedCar, parkingMeter, ticket);
		/**
		 * Uses the PoliceOfficer method examineParkedCar to display the resulting ticket and fines
		 */
		officer1.examineParkedCar(parkedCar, parkingMeter, ticket);

	}

}
