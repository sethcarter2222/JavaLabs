import java.util.Scanner;

public class LargerDemo {

	public static void main(String[] args) {
		int[] numbers = {0, 1, 23, 45, 15, 26, 77, 83, 97, 343322};
		int userNum;
		
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		userNum = input.nextInt();
		numbers[0] = userNum;
		selectionSort(numbers);

	}
	public void getHigher(int[] n, int un) {
		
	}
	
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

}
