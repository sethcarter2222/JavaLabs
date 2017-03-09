
public class Software {
	private double indPrice = 99.0;
	private double quantity;
	private double discount;
	private double savings;
	public Software() {
		
	}
	public void setAmount(double am) {
		quantity = am;
		if (quantity < 20) {
			discount = 0.20;
		} else if (quantity < 50) {
			discount = 0.30;
		} else if (quantity < 100) {
			discount = 0.40;
		} else {
			discount = 0.50;
		}
	}
	
	public double getTotePrice() {
		return (quantity * indPrice) - (quantity * indPrice * discount);
	}
	

}
