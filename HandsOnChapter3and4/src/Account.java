import java.util.Random;
public class Account {

	private double balance;
	private int accountNumber;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private boolean preferredCustomer;
	private String accountType;
	private String accountNotes;
	
	Random randomNum = new Random();
public Account(String firstName, String lastName, String streetAddress, 
		String city, String state, int zip, String phoneNumber, 
		boolean preferredCustomer, double balance, String accountType) {
		accountNotes = "none";
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhoneNumber(phoneNumber);
		setPreferredCustomer(preferredCustomer);
		setBalance(balance);
		setAccountType(accountType);
		
		setAccountNumber(accountNumber);
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if (balance < 0) {
			negativeAccountNotes(accountNotes);
		}
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(int accountNumber) {
		accountNumber = randomNum.nextInt(899999999)+ 1000000000;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isPreferredCustomer() {
		return preferredCustomer;
	}
	public void setPreferredCustomer(boolean preferredCustomer) {
		this.preferredCustomer = preferredCustomer;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		switch (accountType) {
		case "check":
			accountType = "checking";
			break;
		case "save":
			accountType = "savings";
			break;
		case "invest":
			accountType = "investment";
		default:
			accountType = "standard";
		}
		this.accountType = accountType;
	}
	public String getAccountNotes() {
		return accountNotes;
	}
	public void setAccountNotes(String accountNotes) {
		
		this.accountNotes = accountNotes;
	}

	public void negativeAccountNotes(String accountNotes) {
		accountNotes = "Negative balance letter has been sent";
		this.accountNotes = accountNotes;
	}
}
