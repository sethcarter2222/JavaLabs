import java.util.Scanner;
public class TemperatureLauncher {

	public static void main(String[] args) {
		double ftemp;
		Scanner input = new Scanner(System.in);
		Temperature temp = new Temperature();
		
		System.out.println("What is the temperature in Farenheit?");
		ftemp = input.nextDouble();
		temp.setFarenheit(ftemp);
		
		System.out.printf("The temperature in Farenheit is: %.2f " +
		"\nThe temperature in Celsius is: %.2f\nThe temperature in Kelvin is: %.2f", temp.getFarenheit(), temp.getCelsius(), temp.getKelvin());

	}

}
