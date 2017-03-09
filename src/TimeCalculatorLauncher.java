import java.util.Scanner;
public class TimeCalculatorLauncher {

	public static void main(String[] args) {
		double seconds;
		double minutes;
		double hours;
		double days;
		double remainderH;
		double remainderM;
		double remainderS;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number of seconds");
		seconds = input.nextDouble();
		if (seconds >= 86400) {
			days = seconds / 86400;
			remainderH = seconds % 86400;
			hours = remainderH / 3600;
			remainderM = seconds % 3600;
			minutes = remainderM / 60;
			remainderS = seconds % 60;
			System.out.printf("The amount of seconds you entered equals %,.0f day(s), %,.0f hour(s)" +
			", %.0f minute(s), and %.0f second(s).", days, hours, minutes, remainderS);
		} else if (seconds >= 3600) {
			hours = seconds / 3600;
			remainderM = seconds % 3600;
			minutes = remainderM / 60;
			remainderS = seconds % 60;
			System.out.printf("The amount of seconds you entered equals %,.0f hour(s), " +
			"%.0f minute(s), and %.0f second(s).", hours, minutes, remainderS);
		} else if (seconds >= 60) {
			minutes = seconds / 60;
			remainderS = seconds % 60;
			System.out.printf("The amount of seconds you entered equals %.0f minutes(s), and " +
			"%.0f second(s).", minutes, remainderS);
		} else {
			System.out.println("You entered " + seconds + " seconds.");
		}
		

	}

}
