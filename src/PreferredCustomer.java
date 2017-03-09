/**
 * Creates a PreferredCustomer class that extends the
 * Customer, that sets their lifetime purchases and 
 * overall discount, and contains a toString method
 */
public class PreferredCustomer extends Customer {

	private double purchases;  //Sets a variable for lifetime purchases
	private double discount;   //Sets a variable for customer discount
	/**
	 * A default no argument constructor for the 
	 * PreferredCustomer class
	 */
	public PreferredCustomer() {
		
	}
	/**
	 * Accepts a double current purchase and adds
	 * it to their lifetime purchases
	 */
	public void setPurchase(double p) {
		this.purchases += p;
	}
	/**
	 * Method determines the Customer's discount
	 * by checking their lifetime purchases
	 */
	public void setDiscount() {
		if (this.purchases >= 2000) {
			this.discount = 0.1;
		} else if (this.purchases >= 1500) {
			this.discount = 0.07;
		} else if (this.purchases >= 1000) {
			this.discount = 0.06;
		} else if (this.purchases >= 500) {
			this.discount = 0.05;
		} else {
			this.discount = 0;
		}
	}
	/**
	 * toString method that prints out the customer's
	 * name, address, telephone number, their mailing
	 * list wishes, lifetime purchases and discount.
	 */
	public String toString() {
		String str;
		str = "Customer Name: " + super.getName() +
				"\nAddress: " + super.getAddress() +
				"\nTelephone Number: " + super.getTelephoneNum() +
				"\nCustomer Number: " + super.getCustomerNum() +
				"\nMailing List: " + super.getWishes() +
				"\nLifetime Purchases: " + purchases +
				"\nCustomer Discount: " + discount;
		return str;
	}
}
