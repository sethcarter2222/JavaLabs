
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem() {
	}
		// the mutator for setting each item's description
		public void setDescription(String d) {
			this.description = d;
		}
		// the mutator for setting the amount of units
		public void setUnitsOnHand(int units) {
			this.unitsOnHand = units;
		}
		// the mutator for setting each employees Position
		public void setPrice(double pric) {
			this.price = pric;
		}
		// Returns the value of the item's description
		public String getDescription() {
			return description;
		}
		// Returns the value of the employees IdNumber
		public int getUnits() {
			return unitsOnHand;
		}
		// Returns the value of the item price
		public double getPrice() {
			return price;
		}
		
		

}
