/**
 * 
 * @author sethc
 * This program demonstrates calculations with doubles and printf functionality
 */
public class CH12HandsOn {
// The program starts here
	public static void main(String[] args) {
		final int NUM_BARS = 567;                               // stores number of gold bars
		final double PURCHASE_PRICE = 11562;                    // stores the purchase price of the bars
		final double SELLING_PRICE = 13243;                     // stores the selling price of the bars
		final double COMM_RATE = 0.03;                          // stores the commission rate of the bars
		double goldPurchase = NUM_BARS * PURCHASE_PRICE;        // calculates the purchase total of bars
		double purchaseComm = COMM_RATE * goldPurchase;         // calculates the amount of purchase commission
		double amountPaid = goldPurchase + purchaseComm;        // calculates the total amount paid
		double stockSale = NUM_BARS * SELLING_PRICE;            // calculates to sale price of the bars
		double sellingComm = COMM_RATE * stockSale;             // calculates the price of sale commission
		double amountRecieved = stockSale - sellingComm;        // calculates the total amount received
		double profitOrLoss = amountRecieved - amountPaid;      // calculates the total profit or loss
		
		//Displays the results
		System.out.printf("Jack paid $%,.2f for the gold\n" +
		"Jack paid his broker a commission of  $%,.2f on the purchase\n" +
		"Jack paid a total of $%,.2f\n\n" + 
		"Jack sold the gold for $%,.2f\n" +
		"Jack paid his broker a commission of $%,.2f\n" +
		"So, Jack recieved a total of $%,.2f\n\n" +
		"Jack's profit or loss: $%,.2f", goldPurchase, purchaseComm, amountPaid, stockSale, sellingComm, amountRecieved, profitOrLoss);

	}

}
