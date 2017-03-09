import javax.swing.JOptionPane;

public class DriverLicenseLauncher {

	public static void main(String[] args) {
			String userIn;
			String answers[] = new String[20];
			
			
				for(int k = 0; k < 20; k++) {
						userIn = JOptionPane.showInputDialog("Enter the answer for question " +
					(k + 1));
						//while (userIn != "A" && userIn != "B" && userIn != "C" && userIn != "D") {
							//JOptionPane.showMessageDialog(null, "Please enter a valid answer");
							//userIn = JOptionPane.showInputDialog("Enter the answer for question " +
							//		(k + 1)); }
						answers[k] = userIn;
		}
				DriverLicense driver = new DriverLicense(answers);
			System.out.println("Total answers correct: " + driver.totalCorrect());
				System.exit(0);
	}
}

