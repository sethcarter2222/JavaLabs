import java.util.Scanner;
public class SoftwareLauncher {

	public static void main(String[] args) {
		double quantity;
		Scanner input = new Scanner(System.in);
		System.out.println("How many units did you purchase?");
		quantity = input.nextDouble();
		Software puch1 = new Software();
		puch1.setAmount(quantity);
		System.out.printf("Your total purchase price is $%,.2f.", puch1.getTotePrice());
	}

}
