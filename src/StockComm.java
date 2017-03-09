
public class StockComm {
/**
 * @author sethc
 * Demonstrates the calculations of commission on stocks and total purchase
 */
	public static void main(String[] args) {
		double STOCK_AMOUNT = 1000;                        //Amount of stocks that Kathryn bought
		double STOCK_PRICE = 25.50;                        //Price of stocks
		double STOCK_SPENT = STOCK_AMOUNT * STOCK_PRICE;   //Price of the 1000 stocks
		double COMMISSION = STOCK_SPENT * 0.02;            //Commission on the stocks
		double TOTAL_SPENT = COMMISSION + STOCK_SPENT;     //Total amount spent
		// Displays everything to the User
		System.out.printf("Without commission Kathryn spent $%,.2f, her commission at 2%% was $%.2f," +
		" thus her total amount spent was $%,.2f.", STOCK_SPENT, COMMISSION, TOTAL_SPENT);

	}

}
