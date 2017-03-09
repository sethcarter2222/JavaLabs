
public class Car {

	private int yearModel;
	private String make;
	private int speed;
	public Car(int modelYear, String carMake) {
		yearModel = modelYear;
		make = carMake;
		speed = 0;
	}
	
	public void accelerate() {
		speed += 5;
	}

	public void brake() {
		speed -= 5;
	}
	public String getMake() {
		return make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public int getSpeed() {
		return speed;
	}


}
