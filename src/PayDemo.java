
public class PayDemo {

	public static void main(String[] args) {
		double[] wages = { 17.25, 40.75, 15.0, 12.0, 20.65, 25.50, 13.5 };
		String[] names = {"Joe","Jill","Jack","Jessica","James", "Jenn", "Jim"};
		double[][] sales = {{153354.00, 453213.80, 743234.75, 475985.12},
				{546124.23, 521124.33, 854154.23, 546124.22},
				{537124.23, 224527.13, 200253.64, 765200.52}};
		String[] companyNames = {"Company A", "Company B", "Compant C"};
		
		for (String val : names) {
			System.out.print(val + "\t");
		}
		
		System.out.println("\n");
		for (double val : wages) {
			System.out.printf("$%.2f\t", val);
		}
		
		Pay pay1 = new Pay();
		pay1.displayHighLow(wages, names);
		System.out.println("\n");
		
		for (int row = 0; row < sales.length; row++) {
			System.out.print(companyNames[row] + " ");
			for (int col = 0; col < sales[row].length; col++) {
				System.out.print(sales[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
