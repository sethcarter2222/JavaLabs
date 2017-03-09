import java.util.Scanner;        //imports the java Scanner class
public class PetLauncher {
/**
 *  Program starts here
 * @param args
 */
	public static void main(String[] args) {
		String name;    //creates variable for name
		String type;    //creates variable for type
		int age;        //creates variable for age
		//sets new instance of Scanner and Pet classes
		Scanner input = new Scanner(System.in);
		Pet pet = new Pet();
		//asks for pets name
		System.out.println("What is your pet's name?");
		name = input.nextLine();
		//asks for pet type
		System.out.println("What is your pet's type?");
		type = input.nextLine();
		//asks for pet age
		System.out.println("What is your pets age?");
		age = input.nextInt();
		//sets the three variables
		pet.setAge(age);
		pet.setName(name);
		pet.setType(type);
		//displays the results
		System.out.printf("Your pet's name is %s. It is a %s, and it is %d years old!\n" +
		".... Yes, this program just returns exactly what you typed in.",
		pet.getName(), pet.getType(), pet.getAge());

	}

}
