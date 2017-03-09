/**
 * 
 * @author sethc
 * creates a program that accepts pet info and displays it
 */
public class Pet {

	//creates private vars for name, type, and age
	private String name;
	private String type;
	private int age;
	public Pet() {
		
	}
	//sets the pet name
	public void setName(String n) {
		this.name = n;
	}
	//sets the pet type
	public void setType(String t) {
		this.type = t;
	}
	//sets the pet age
	public void setAge(int a) {
		this.age = a;
	}
	//gets the pet name
	public String getName() {
		return name;
	}
	//get the pet type
	public String getType() {
		return type;
	}
	//get the pet age
	public int getAge() {
		return age;
	}
}
