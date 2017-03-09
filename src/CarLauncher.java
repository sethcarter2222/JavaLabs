
public class CarLauncher {

	public static void main(String[] args) {
		String carmake = "Ford";
		Car car1 = new Car(2003, carmake);
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.accelerate();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.accelerate();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.accelerate();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.accelerate();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.accelerate();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.brake();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.brake();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.brake();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.brake();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");
		car1.brake();
		System.out.println("The cars speed is: " + car1.getSpeed() + " MPH");


	}

}
