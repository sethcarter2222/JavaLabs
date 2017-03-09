import java.util.Scanner;   // Imports java Scanner class
public class FreezeBoilLauncher {
	
	/**
	 * 
	 * Program begins here
	 */
	public static void main(String[] args) {
		double temperature;   // Sets a double variable for the temperature
		
		//Creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		
		//Gets user input for desired temperature
		System.out.println("Please enter your desired temperature in Farenheit.");
		temperature = input.nextDouble();
		
		//Creates new instance of the FreezeBoil class
		FreezeBoil tempy = new FreezeBoil();
		
		//Sends the temperature to the FreezeBoil method setTemps
		tempy.setTemps(temperature);
		//Determines and prints if ethyl boils at inputed temperature
		if (tempy.isEthylBoiling() == true) {
			System.out.println("Ethyl boils at this temperature");
		}
		//Determines and prints if ethyl freezes at inputed temperature
		if (tempy.isEthylFreezing() == true) {
			System.out.println("Ethyl freezes at this temperature");
		}
		//Determines and prints if water boils at inputed temperature
		if (tempy.isWaterBoiling() == true) {
			System.out.println("Water boils at this temperature");
		}
		//Determines and prints if water freezes at inputed temperature
		if (tempy.isWaterFreezing() == true) {
			System.out.println("Water freezes at this temperature");
		}
		//Determines and prints if oxygen boils at inputed temperature
		if (tempy.isOxygenBoiling() == true) {
			System.out.println("Oxygen boils at this temperature");
		}
		//Determines and prints if oxygen freezes at inputed temperature
		if (tempy.isOxygenFreezing() == true) {
			System.out.println("Oxygen freezes at this temperature");
		}

	}

}
