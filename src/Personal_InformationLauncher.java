
public class Personal_InformationLauncher {
/**
 * 
 * @param args
 * program starts here
 */
	public static void main(String[] args) {
		// creates three instances of the class
		Personal_Information person1 = new Personal_Information();
		Personal_Information person2 = new Personal_Information();
		Personal_Information person3 = new Personal_Information();
		// sets the names of the three people
		person1.setName("Seth Carter");
		person2.setName("Nicolas Winding Refn");
		person3.setName("Denis Villenueve");
		// sets the address of the three people
		person1.setAddress("1430 Heartman Rd, Shiloh, IL 62221");
		person2.setAddress("342 Jenkins Ln, San Francisco, CA 98663");
		person3.setAddress("7723 Nile Blvd, Los Angeles, CA 87266");
		// sets the age of the three people
		person1.setAge("22");
		person2.setAge("48");
		person3.setAge("36");
		// sets the phone number of each user
		person1.setPhoneNumber("619-742-3883");
		person2.setPhoneNumber("734-009-1294");
		person3.setPhoneNumber("762-833-7643");
		// displays the results
		System.out.println("Person one's name is: " + person1.getName() +
				"\nTheir address is: " + person1.getAddress() +
				"\nTheir age is: " + person1.getAge() +
				"\nTheir phone number is : " + person1.getPhoneNumber() + "\n\n");
		
		System.out.println("Person two's name is: " + person2.getName() +
				"\nTheir address is: " + person2.getAddress() +
				"\nTheir age is: " + person2.getAge() +
				"\nTheir phone number is : " + person2.getPhoneNumber() + "\n\n");

		
		System.out.println("Person three's name is: " + person3.getName() +
				"\nTheir address is: " + person3.getAddress() +
				"\nTheir age is: " + person3.getAge() +
				"\nTheir phone number is : " + person3.getPhoneNumber() + "\n\n");


	}

}
