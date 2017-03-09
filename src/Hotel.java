
public class Hotel {

	private int floors;
	private int rooms;
	private int roomOcc;
	private int totRoom;
	private int totOcc;
	private double occPerc;
	public Hotel() {
		
	}
	public void setFloor(int floor) {
		while (floor <= 1) {
			System.out.println("Please enter a number of floors above 1.");
		}
		this.floors = floor;
	}
	public void setRoom(int room) {
		while (room < 10) {
			System.out.println("Please enter a number above 10.");
		}
		this.rooms = room;
	}
	
	public void setRoomOcc(int rc) {
		this.roomOcc = rc;
	}
	public double getPerc() {
		return occPerc;
	}

}
