import java.lang.reflect.Array; //Imports the Java lang reflect Array class
/**
 * This class is responsible for setting up charge numbers, and setting up a 
 * selection sort and binary search to check if a user inputed number is in the
 * list
 */
public class ChargeAccount {
	//A private array of valid charge numbers
	private int[] chargeNum = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
			8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231,
			3852085, 7576651, 7881200, 4581002};
	private int userNum, result;  //private variables for the user number and result
	/**
	 * Constructor accepts a user number as an argument and runs the selection sort
	 * and binary search to check if the number is in the array
	 */
	public ChargeAccount(int userNum) {
		this.userNum = userNum;
		selectionSort(chargeNum); //runs selection sort of the charge number
			result = binarySearch(chargeNum, userNum);
			/**
			 * Binary search will return -1 if the number was not found so the 
			 * if else statement checks for the result of the binary search
			 */
			if (result == -1) {
				System.out.println(userNum + " was not found.");
			} else {
				System.out.println(userNum + " was found at element " + result);
			}
			
			

	}
	/**
	 * Boolean method for checking if a value is true
	 * @return
	 */
	public boolean checkTrue() {
		return false;
	}
	/**
	 * Method that rearranges an array in increasing value
	 */
	public static void selectionSort(int[] array) {
		int startScan, index, minIndex, minValue;
		for (startScan = 0; startScan < (array.length - 1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			for(index = startScan +1; index < array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}
	/**
	 * Method that searches the inputed value in the array and returns
	 * -1 if the item was not found
	 */
	public static int binarySearch(int[] array, int value) {
		int first, last, middle, position;
		boolean found;
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		while (!found && first <= last) {
			middle = (first + last) / 2;
			if (array[middle] == value) {
				found = true;
				position = middle;
			} else if (array[middle] > value) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}
		return position;
	}

}
