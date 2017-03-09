import java.util.Random;  //imports the java Random class
/**
 * This class creates 5 random lottery numbers that are stored
 * in an array from 1-10 and has the user try to guess the 
 * numbers
 */
public class Lottery {

	private int lotto[]; //Creates a private integer lottery array
	/**
	 * A public constructor that creates a random set of lottery
	 * numbers
	 */
	public Lottery() {
		this.lotto = new int[5];
		Random numb = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]  = numb.nextInt(10);
			System.out.println(lotto[i]);
		}
	}

	/**
	 * A public method for setting a lottery array
	 */
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	/**
	 * A public method for returning the lotto array
	 */
	public int[] getLotto() {
		return lotto;
	}
	/**
	 * A public method that checks the amount of matching
	 * numbers from the inputed array and the random lottery
	 * numbers
	 */
	public int checkMatch(int[] un) {
		int match = 0;
		if (un.length == lotto.length) {
		for (int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				
			
			if (un[i] == lotto[i]) {
				match++;
				break;
				}
			}
		  }
		}
		System.out.println("The amount of matching numbers is " + match);
		return match;
	}

}
