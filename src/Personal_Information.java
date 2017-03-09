/**
 * 
 * @author sethc
 * This program gets the personal information of users and stores them
 */
public class Personal_Information {

	private String name;        // stores name
	private String address;     // stores address
	private String age;         // stores age
	private String phoneNumber; //stores phone number
	public Personal_Information() {
		
	}
	//mutator for name
	public void setName(String n) {
		this.name = n;
	}
    // mutator for address
	public void setAddress(String add) {
		this.address = add;
	}
    // mutator for age
	public void setAge(String a) {
		this.age = a;
	}
    // mutator for phone number
	public void setPhoneNumber(String phone) {
		this.phoneNumber = phone;
	}
	// accesses for name
	public String getName() {
		return name;
	}
    //accesses address
	public String getAddress() {
		return address;
	}
    // accesses age
	public String getAge() {
		return age;
	}
    // accesses phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
