import java.util.Scanner;
public class WidgetLauncher {
	
	public static void main(String[] args) {
		double widgets;
		Scanner input = new Scanner(System.in);
		System.out.println("How many widgets would you like to produce?");
		widgets = input.nextDouble();
		Widget widget1 = new Widget(widgets);
		System.out.printf("It will take %.1f days to produce the desired amount.", widget1.getDays());
	}

}
