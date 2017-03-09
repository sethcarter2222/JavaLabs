
public class RoomDimension {

	private double length;
	private double width;
	public RoomDimension(double len, double w) {
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		String str = "Area: " + length * width;
		return str;
	}

}
