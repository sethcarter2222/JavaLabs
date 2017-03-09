
public class Customer extends Person {

	private boolean wishes;
	private String customerNum;
	public boolean isWishes() {
		return wishes;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public void setWishes(boolean wishes) {
		this.wishes = wishes;
	}
	public boolean getWishes() {
		return wishes;
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	
	public String toString() {
		String str;
		str = "Customer Name: " + super.getName() +
				"\nAddress: " + super.getAddress() +
				"\nTelephone Number: " + super.getTelephoneNum() +
				"\nCustomer Number: " + customerNum +
				"\nMailing List: " + wishes;
		return str;
	}

}
