
public class Launcher {

	public static void main(String[] args) {
		Account acc1 = new Account("Jack", "Reacher", "511 Somewhere Blvd", "Someplace", "AR",
				23443, "541-985-6541", true, 2343.45, "check");
		Account acc2 = new Account("Lincoln", "Rhyme", "423 Falcon Ave", "St. Louis",
				"MO", 63113, "314-256-5687", true, 7542.35, "save");
		Account acc3 = new Account("Robert", "Langdon", "512 Omen Lane", "Symbolic", "NY",
				77777, "524-653-1245", false, 23.14, "invest");
		Account acc4 = new Account("Odd", "Thomas", "3312 Bodachs Street", "Pico Mundo", "CA",
				59254, "826-33-7757", false, -123.14, "match");

		System.out.printf("***** Customer Info *****\n%s %s\n%s\n%s\n%s\n" +
		"%s\nPreferred Customer: %b", 
		acc1.getFirstName(), acc1.getLastName(), acc1.getStreetAddress(),
		acc1.getCity(), acc1.getState(), acc1.getZip(), acc1.getPhoneNumber(), acc1.isPreferredCustomer());
		System.out.printf("\nAccount Number: %d\nBalance: $%,.2f\nAccountType:" +
		" %s\nNotes: %s", acc1.getAccountNumber(), acc1.getBalance(), acc1.getAccountType(),
		acc1.getAccountNotes());
		
		System.out.printf("\n\n***** Customer Info *****\n%s %s\n%s\n%s\n%s\n" +
		"%s\nPreferred Customer: %b", 
		acc2.getFirstName(), acc2.getLastName(), acc2.getStreetAddress(),
		acc2.getCity(), acc2.getState(), acc2.getZip(), acc2.getPhoneNumber(), acc2.isPreferredCustomer());
		System.out.printf("\nAccount Number: %d\nBalance: $%,.2f\nAccountType:" +
		" %s\nNotes: %s", acc2.getAccountNumber(), acc2.getBalance(), acc2.getAccountType(),
	    acc2.getAccountNotes());
				
		System.out.printf("\n\n***** Customer Info *****\n%s %s\n%s\n%s\n%s\n" +
		"%s\nPreferred Customer: %b", 
		acc3.getFirstName(), acc3.getLastName(), acc3.getStreetAddress(),
		acc3.getCity(), acc1.getState(), acc3.getZip(), acc3.getPhoneNumber(), acc3.isPreferredCustomer());
		System.out.printf("\nAccount Number: %d\nBalance: $%,.2f\nAccountType:" +
		" %s\nNotes: %s", acc3.getAccountNumber(), acc3.getBalance(), acc3.getAccountType(),
		acc3.getAccountNotes());
						
		System.out.printf("\n\n***** Customer Info *****\n%s %s\n%s\n%s\n%s\n" +
		"%s\nPreferred Customer: %b", 
		acc4.getFirstName(), acc4.getLastName(), acc4.getStreetAddress(),
		acc4.getCity(), acc4.getState(), acc4.getZip(), acc4.getPhoneNumber(), acc4.isPreferredCustomer());
		System.out.printf("\nAccount Number: %d\nBalance: $%,.2f\nAccountType:" +
		" %s\nNotes: %s", acc4.getAccountNumber(), acc4.getBalance(), acc4.getAccountType(),
		acc4.getAccountNotes());
	}

}
