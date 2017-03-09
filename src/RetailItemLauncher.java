
public class RetailItemLauncher {

	public static void main(String[] args) {
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();
		
		item1.setDescription("Jacket");
		item2.setDescription("Designer Jeans");
		item3.setDescription("Shirt");
		
		item1.setUnitsOnHand(12);
		item2.setUnitsOnHand(40);
		item3.setUnitsOnHand(20);
		
		item1.setPrice(59.95);
		item2.setPrice(34.95);
		item3.setPrice(24.95);
		
		System.out.printf("Item #1 is a %s, with %d units on hand, and costs $%.2f" +
				"\nItem #2 is a %s, with %d units on hand, and costs $%.2f" +
				"\nItem #3 is a %s, with %d units on hand, and costs $%.2f", 
				item1.getDescription(), item1.getUnits(), item1.getPrice(), 
				item2.getDescription(), item2.getUnits(), item2.getPrice(),
				item3.getDescription(), item3.getUnits(), item3.getPrice());

	}

}
