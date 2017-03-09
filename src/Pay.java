
public class Pay {
	
	public Pay() {
		// TODO Auto-generated constructor stub
	}
	
	public double[] employeeRaise(double[] w) {
		for (int i = 0; i <= w.length; i++) {
			w[i] += 2.00;
		}
		return w;
	}
	
	public void displayHighLow(double[] w, String[] n) {

		double highest = w[0];
		for (int i = 1; i < w.length; i++) {
			if (w[i] > highest) {
				highest = w[i];
			}
		}

		System.out.printf("\n%s makes the most money at $%.2f per hour.\n",n[1], highest);
		double lowest = w[0];
		for (int i = 1; i < w.length; i++) {
			if (w[i] < lowest) {
				lowest = w[i];
			}
		}
		System.out.printf("\n%s makes the least money at $%.2f per hour.\n", n[3], lowest);
	}
	

}
