
public class ShippingCharges {

	private double weight;
	private int miles;
	private double shippingRate;
	public ShippingCharges() {
		
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	
	public void setMiles(double m) {
		miles = (int)m;
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getMiles() {
		return miles;
	}
	
	public double getShippingRate() {
		if (weight < 2) {
			shippingRate = (miles / 500) * 1.10;
		} else if (weight < 7) {
			shippingRate = (miles / 500) * 2.20;
		} else if (weight < 11){
			shippingRate = (miles / 500) * 3.70;
		} else {
			shippingRate = (miles / 500) * 4.80;
		}
		return shippingRate;
	}

}
