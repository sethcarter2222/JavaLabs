/**
 * This program has the user input the amount of calories and
 * fate in a food item, and it displays the percentage of fat calories
 */
public class FatGram {

	private double fatGrams;        //Creates a private variable for fatGrams
	private double calories;        //Creates a private variable for calories
	private double caloriesFat;     //Creates a private variable for fat calories
	private double fatPercentage;   //Creates a private variable for the percentage
	//Default no argument constructor
	public FatGram() {

	}
	//Method for setting the amount of calories
	public void setCalories(double c) {
		this.calories = c;
	}
	//Method for setting the grams of fat
	public void setFatGrams(double f) {
		this.fatGrams = f;
	}
	//Method for getting the percentage of fat
	public double getFatPercentage() {
		caloriesFat = fatGrams * 9.0;
		fatPercentage = (caloriesFat / calories) * 100.0;
		return fatPercentage;
	}

}
