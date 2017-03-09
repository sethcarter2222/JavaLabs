import javax.swing.JOptionPane;

public class Cookie {

	public static void main(String[] args) {
		
		int COOKIE_BAG = 40;
		int SERVING_BAG = 10;
		int CAL_IN_SERV = 300;
		int COOKIES_PER_SERVING = COOKIE_BAG / SERVING_BAG;
		int CALORIES_PER_COOKIE = CAL_IN_SERV / COOKIES_PER_SERVING;
		String cookies; 
		cookies = JOptionPane.showInputDialog("How many cookies did you eat?");
		int COKIE = Integer.parseInt(cookies);
		int CALORIES_INTAKEN = COKIE * CALORIES_PER_COOKIE;
		JOptionPane.showMessageDialog(null, "You intook " + CALORIES_INTAKEN + " calories!");
		System.exit(0);

	}

}
