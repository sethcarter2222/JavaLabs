import javax.swing.JOptionPane;

public class QuarterlyStatisticsReportLauncher {

	public static void main(String[] args) {
		final int ROW_SIZE = 4;
		final int COL_SIZE = 6;
		double salesFigure = 0;
		
		QuarterlyStatisticsReport report = new QuarterlyStatisticsReport();
		
		for (int i = 0; i < ROW_SIZE; i++) {
			for(int k = 0; k < COL_SIZE; k++) {
				do {
					salesFigure = Double.parseDouble(JOptionPane.showInputDialog("Enter a sales figure for Qtr " +
				(i + 1) + " and div " + (k + 1)));
					if (salesFigure < 0) {
						JOptionPane.showMessageDialog(null, "Please enter a positive number");
					}
				} while (salesFigure < 0);
				report.setSalesFigures(i, k, salesFigure);
			}
		}
		System.out.println("Quarter\tDiv 1\tDiv 2\tDiv 3\tDiv 4\tDiv 5\tDiv 6");
		for(int row = 0; row < ROW_SIZE; row++) {
			System.out.print("Qtr" + (row + 1) + "\t");
			for(int col = 0; col < COL_SIZE; col++) {
				System.out.print(report.getSalesFigures()[row][col] + "\t");
			}
			System.out.println();
		}
		System.exit(0);

	}

}
