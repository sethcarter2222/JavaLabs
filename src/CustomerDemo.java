/**
 * Class for creating different versions of the Customer class,
 * storing their information and displaying the results
 */
public class CustomerDemo {

	public static void main(String[] args) {
		/*Customer customer1 = new Customer();
		customer1.setAddress("1302 Seibert Lane, Troy, IL, 45552");
		customer1.setCustomerNum("432221");
		customer1.setName("George Ali");
		customer1.setWishes(true);
		System.out.println(customer1);*/
		/**
		 * Creates a new PreferredCustomer object and sets all necessary fields,
		 * including, address, customer number, name, mailing list wishes, current
		 * purchases and discount
		 */
		PreferredCustomer customer2 = new PreferredCustomer();
		customer2.setAddress("765 Harpeniel Dr, Montegue, AL, 76601");
		customer2.setCustomerNum("34622");
		customer2.setName("Steven Schraeder");
		customer2.setWishes(false);
		customer2.setPurchase(647.00);
		customer2.setPurchase(1200);
		customer2.setDiscount();
		/**
		 * Displays the results through a toString
		 */
		System.out.println("\n" + customer2);
	}

}
