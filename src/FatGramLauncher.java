import java.util.Scanner;    //Imports the Java Scanner class
public class FatGramLauncher {
/**
 * Program begins here
 */
	public static void main(String[] args) {
		double calories;  //Sets a variable for calories
		double fat;       //Sets a variable for the fate
		
		//Creates a new instance of the Scanner class
		Scanner input = new Scanner(System.in);
		//Creates a new instance of the FatGram class
		FatGram food = new FatGram();
		//Stores the user input for amount of calories
		System.out.println("Enter the amount of calories");
		calories = input.nextDouble();
		//Stores the amount of fat from user input
		System.out.println("Enter the amount of fat");
		fat = input.nextDouble();
		//Sets through methods both the fat and calories
		food.setCalories(calories);
		food.setFatGrams(fat);
		//Runs calculations for the percentage of fat
		if ((fat * 9) > calories) {
			System.out.println("The numbers you entered are invalid");
		} else if (food.getFatPercentage() < 30.0) {
			System.out.printf("The percentage of fat calories %%%.2f," +
		" it's low in fat!", food.getFatPercentage());
		} else {
			System.out.printf("The percentage of fat calories %%%.2f,",
					food.getFatPercentage());
		}

	}

}
