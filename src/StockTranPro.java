
public class StockTranPro {

	public static void main(String[] args) {
	double DOUGH_SPENT_ON_STOCK = 1000.0 * 32.87;
	double COMM_ON_BGHT_STOCK = DOUGH_SPENT_ON_STOCK * 0.02;
	double STOCK_TOT_SOLD = 1000.0 * 33.92;
	double SOLD_COMISSION = STOCK_TOT_SOLD * 0.02;
	double SOLD_END = STOCK_TOT_SOLD - SOLD_COMISSION;
	double BOUGHT_END = DOUGH_SPENT_ON_STOCK + COMM_ON_BGHT_STOCK;
	double END = BOUGHT_END - SOLD_END;
	System.out.printf("The amount Joe paid for the stock was $%,.2f\nThe amount of commoission on the bought stock was $%,.2f\n" +
	"The amount Joe sold the stock for was $%,.2f\nThe amount of commission paid on the sold stock was" +
	" $%,.2f\nJoe ended up at a loss of $%,.2f", DOUGH_SPENT_ON_STOCK, COMM_ON_BGHT_STOCK, STOCK_TOT_SOLD, SOLD_COMISSION, END);

	}

}
