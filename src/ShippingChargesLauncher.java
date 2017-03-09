import java.util.Scanner;
public class ShippingChargesLauncher {

	public static void main(String[] args) {
		double miles;
		double weight;
		Scanner input = new Scanner(System.in);
		System.out.println("How far away in miles is your package shipping?");
		miles = input.nextDouble();
		System.out.println("How much does your package weigh in Kg?");
		weight = input.nextDouble();
		ShippingCharges checkIt = new ShippingCharges();
		checkIt.setMiles(miles);
		checkIt.setWeight(weight);
		System.out.printf("Shipping a %.1fKg package %.1f miles, results in a " +
		"shipping charge of $%,.2f", 
				checkIt.getWeight(), checkIt.getMiles(), checkIt.getShippingRate());

	}

}
