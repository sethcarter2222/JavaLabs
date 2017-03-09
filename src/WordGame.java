import javax.swing.JOptionPane; //Imports JOptionPane
/**
 * 
 * @author sethc
 * This program takes inputs from the user, and uses them in a "story" format.
 */
public class WordGame {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");                         //User enters name
		String age = JOptionPane.showInputDialog("Please enter your age");                           //User enters age
		String city = JOptionPane.showInputDialog("Please enter the name of a city");                //User enters city
		String college = JOptionPane.showInputDialog("Please enter the name of a college");          //User enters college
		String profession = JOptionPane.showInputDialog("Please enter the name of a profession");    //User enters profession
		String animal = JOptionPane.showInputDialog("Please enter the name of an animal");           //User enters animal
		String namePet = JOptionPane.showInputDialog("Please enter the name of a pet");              //User enters pet name
		
		// Thus a arguably beautiful tale unfolds and is displayed to the user
		System.out.println("There once was a person named " + name +" who lived in " + city +
				".\nAt the age of " + age + ", " + name + " went to college at " + college +
				".\n" + name + " graduated and went to work as a(n)" + profession + ".\nThen, " +
				name + " adopted a(n) " + animal + " named " + namePet + ".\nThey both lived " +
				"happily ever after!");
		

	}

}
