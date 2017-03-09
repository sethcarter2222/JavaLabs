/** 
 *This program takes the sum of every number
 *From 1 to the user number entered.
 *
 */
public class SumNum {

	private int one = 1;  //Sets a private variable for the beginning of the count
	private int counter;  //Sets a private variable for a counter for the getSum
	private int userNum;  //Sets a private variable for the user inputed number
	private int totSum;   //Sets a private variable for the total sum of the numbers
	/**
	 * Default no argument constructor
	 */
	public SumNum() {
		
	}
	/**
	 * Public method for setting the user input to the 
	 * userNum variable for calculations
	 */
	public void setInput(int userInput) {
		this.userNum = userInput;
	}
	/**
	 * Creates a loop to calculate the sum of the numbers
	 * then returns the total sum
	 */
	public int getSum() {
		while (counter < userNum) {
			totSum += one++;
			counter++;
		}
		return totSum;
	}
}
