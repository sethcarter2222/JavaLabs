
public class Larger {

	private int[] numbers;
	public Larger() {
		
	}
	public int displayHigher() {
		int highest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > highest) {
				highest = numbers[i];
			}
		}
		
		return highest;
	}
	

}
