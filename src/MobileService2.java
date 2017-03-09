/**
 * Creates a class that takes the users inputed
 * package, and the amount of minutes they used
 * and determines their cellphone bill
 */
public class MobileService2 {

	private String pack;        //sets a private variable for their package
	private double minutes;     //sets a private variable for their minutes used
	private double totalPriceA; //sets a private variable for the total price of A
	private double totalPriceB; //sets a private variable for the total price of B
	private double totalPriceC; //sets a private variable for the total price of C
	private double remainderM;  //sets a private variable for the exceeded minutes
	private double remainderM2; //sets another private variable for the exceeded minutes
	private double savingsAB;   //sets a private variable for the savings from package A versus B
	private double savingsAC;   //sets a private variable for the savings from package A versus C
	private double savingsBC;   //sets a private variable for the savings from package B versus C
	//Default no argument constructor
	public MobileService2() {
		
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
		
		//Displays results with comparison
		if (pack.charAt(0) == 'A' || pack.charAt(0) == 'a') {
			if (minutes <= 450) {
				totalPriceA = 39.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceA);
			} else {
				remainderM2 = minutes - 900;
				totalPriceC = 69.99;
				totalPriceB = (remainderM2 * 0.40) + 59.99;
				remainderM = minutes - 450;
				totalPriceA = (remainderM * 0.45) + 39.99;
					
				if (totalPriceA < totalPriceB && totalPriceA < totalPriceC) {
						System.out.printf("Your total bill is $%,.2f", totalPriceA);
				} else if (totalPriceA > totalPriceB && !(totalPriceA > totalPriceC)) {
					savingsAB = totalPriceA - totalPriceB;
					System.out.printf("Your total bill is $%,.2f", totalPriceA);
					System.out.printf("\nYou would have saved $%,.2f by switching to package B!", savingsAB);
				} else if (totalPriceA > totalPriceC) {
					remainderM2 = minutes - 900;
					savingsAB = totalPriceA - totalPriceB;
					savingsAC = totalPriceA - totalPriceC;
					System.out.printf("Your total bill is $%,.2f", totalPriceA);
					System.out.printf("\nYou would have saved $%,.2f by switching to package B," +
					" and $%,.2f by swtiching to package C!", savingsAB, savingsAC);
				}
			}
		} else if (pack.charAt(0) == 'B' || pack.charAt(0) == 'b') {
			if (minutes <= 900) {
				totalPriceB = 59.99;
				System.out.printf("Your total bill is $%,.2f", totalPriceB);
			} else {
				remainderM = minutes - 900;
				totalPriceB = (remainderM * 0.40) + 59.99;
				totalPriceC = 69.99;
				savingsBC = totalPriceB - totalPriceC;
				if (totalPriceB > totalPriceC) {
					System.out.printf("Your total bill is $%,.2f", totalPriceB);
					System.out.printf("\nYou would have saved $%,.2f by switching to package C!", savingsBC);
				} else {
				System.out.printf("Your total bill is $%,.2f", totalPriceB);
				}
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
