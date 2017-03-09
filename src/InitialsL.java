
public class InitialsL {

	public static void main(String[] args) {
		String firstName = "Seth ";
		String lastName = "Carter";
		String middleName = "Timothy ";
		char firstInitial = firstName.charAt(0);
		char lastInitial = lastName.charAt(0);
		char middleInitial = middleName.charAt(0);
		System.out.println("My name is " + firstName + middleName + lastName +
				" and my initals are " + firstInitial + middleInitial + lastInitial);

	}

}
