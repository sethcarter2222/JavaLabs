
public class LandCalc {
/**
 * @author Seth Carter
 * Demonstrates the calculations of finding the amount of acres in 389,767 square feet of land
 */
	public static void main(String[] args) {
		double SQFT_IN_ACRE = 43560;                            //Assigns a variable to the amount of square feet in an acre
		double SQFT_IN_LAND = 389767;                           //Assigns a variable to the amount of square feet in the given tract of land
		double ACRE_IN_LAND = SQFT_IN_LAND / SQFT_IN_ACRE;      //Does the division to calculate the correct result
		
		System.out.printf("There are %.2f acres in the tract of land", ACRE_IN_LAND);  //Displays the answer to the calculation

	}

}
