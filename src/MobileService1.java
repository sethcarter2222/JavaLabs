/**
 * Creates a class that takes the users inputed
 * package, and the amount of minutes they used
 * and determines their cellphone bill
 */
public class MobileService1 {

	private String pack;        //sets a private variable for their package
	private double minutes;     //sets a private variable for their minutes used
	private double totalPriceA; //sets a private variable for the total price of A
	private double totalPriceB; //sets a private variable for the total price of B
	private double totalPriceC; //sets a private variable for the total price of C
	private double remainderM;  //sets a private variable for the exceeded minutes
	
	//Default no argument constructor
	public MobileService1() {
		
	}
	//Method sets the minutes used
	public void setMinutes(double m) {
		this.minutes = m;
	}
	//Method sets the package the user has
	public void setPackage(String x) {
		this.pack = x;
	}
	//Method determines and displays the price based on the users package
	public double getPrice() {
		if (pack.charAt(0) == 'A' || pack.charAt(0) == 'a') {
			if (minutes <= 450) {
				totalPriceA = 39.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceA);
			} else {
				remainderM = minutes - 450;
				totalPriceA = (remainderM * 0.45) + 39.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceA);
			}
		} else if (pack.charAt(0) == 'B' || pack.charAt(0) == 'b') {
			if (minutes <= 900) {
				totalPriceB = 59.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceB);
			} else {
				remainderM = minutes - 900;
				totalPriceB = (remainderM * 0.40) + 59.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceB);
			}
		} else if (pack.charAt(0) == 'C' || pack.charAt(0) == 'c') {
			totalPriceC = 69.99;
			System.out.printf("Your total bill is $%,.2f", totalPriceC);
		} else {
			System.out.println("Please reenter a valid package letter.");
		}
		return totalPriceA;
	}

}
