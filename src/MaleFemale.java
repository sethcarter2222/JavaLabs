import javax.swing.JOptionPane;

public class MaleFemale {

	public static void main(String[] args) {
		String MALE_NUM;
		MALE_NUM = JOptionPane.showInputDialog("How many males are in your class?");
		double malesNum = Double.parseDouble(MALE_NUM);
		String FEMALE_NUM;
		FEMALE_NUM = JOptionPane.showInputDialog("How many females are in your class?");
		double femalesNum = Double.parseDouble(FEMALE_NUM);
		double studentTotal = femalesNum + malesNum;
		double FEM_PERC = (femalesNum / studentTotal) * 100;
		double MALE_PERC = (malesNum / studentTotal) * 100;
		System.out.printf("The percentage of females in the class is %.2f%%, and the male percentage is %.2f%%", FEM_PERC, MALE_PERC);
		System.exit(0);

	}

}
