
public class QuarterlyStatisticsReport {

	private double [][] salesFigures;
	private final int ROW_SIZE = 4;
	private final int COL_SIZE = 6;
	
	public QuarterlyStatisticsReport() {
		this.salesFigures = new double[ROW_SIZE][COL_SIZE];
	}
	
	public void setSalesFigures(int row, int col, double sales) {
		this.salesFigures[row][col] = sales;
	}
	
	public double[][] getSalesFigures() {
		return salesFigures;
	}

}
