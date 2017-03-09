import java.util.Scanner;
public class RomanNumLauncher {

	public static void main(String[] args) {
		int romanNum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 10");
		romanNum = input.nextInt();
		
		switch (romanNum) {
		case 1:
			System.out.println("The Roman numeral for 1 is I");
			break;
		case 2:
			System.out.println("The Roman numeral for 2 is II");
			break;
		case 3:
			System.out.println("The Roman numeral for 3 is III");
			break;
		case 4:
			System.out.println("The Roman numeral for 4 is IV");
			break;
		case 5:
			System.out.println("The Roman numeral for 5 is V");
			break;
		case 6:
			System.out.println("The Roman numeral for 6 is VI");
			break;
		case 7:
			System.out.println("The Roman numeral for 7 is VII");
			break;
		case 8:
			System.out.println("The Roman numeral for 8 is VIII");
			break;
		case 9:
			System.out.println("The Roman numeral for 9 is IX");
			break;
		case 10:
			System.out.println("The Roman numeral for 10 is X");
			break;
		default:
			System.out.println("You didn't enter a number from 1 to 10.");
		}

	}

}
