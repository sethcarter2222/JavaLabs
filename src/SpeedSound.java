import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SpeedSound extends JFrame{

	private JPanel choicePanel;         // To hold components
	private JPanel selectedJavaPanel;   // To hold components
	private JComboBox tresChoice;       // List of the three options
	private JLabel label;               // To display a message
	private JTextField selectedOption;  // The user selected option
	
	private String[] LandASea = { "Land", "Water", "Steel"};
	public SpeedSound() {
		//Call the JFrame constructor
		super("Land, Water or Steel?");
		
		//Specifies and action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a BorderLayout manager for the content pane
		setLayout(new BorderLayout());
		
		// Build the panels
		buildChoicePanel();
		buildSelectedJavaPanel();
		
		// Add the panels to the content pane.
		add(choicePanel, BorderLayout.CENTER);
		add(selectedJavaPanel, BorderLayout.SOUTH);
		
		// Pack and display the window
		pack();
		setVisible(true);
		}
	/**
	 * The buildChoicePanel method adds a combo box with choice of Land
	 * Air or Sea to a panel
	 */
	private void buildChoicePanel() {
		// Creates a panel to hold the choice box
		choicePanel = new JPanel();
		
		// Creates the combo box
		tresChoice = new JComboBox(LandASea);
		
		//Register an action Listener.
		tresChoice.addActionListener(new ComboBoxListener());
		
		//Add the combo box to the panel.
		choicePanel.add(tresChoice);
		
	}
	/**
	 * The buildSelectedJavaPanel method adds a read-only
	 * text field to a panel
	 */
	
	private void buildSelectedJavaPanel() {
		//Create a panel to hold the text field
		selectedJavaPanel = new JPanel();
		
		//Create the label.
		label = new JLabel("You selected:");
		
		//Create the uneditable text field
		selectedOption = new JTextField(10);
		selectedOption.setEditable(false);
		
		// Add the label and text field to the panel
		selectedJavaPanel.add(label);
		selectedJavaPanel.add(selectedOption);
	}
	/**
	 *  Private inner class that handles the event when the user selects an
	 *  item from the combo box
	 */
	private class ComboBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String selection = (String) tresChoice.getSelectedItem();
			selectedOption.setText(selection);
		}
	}
	
	/** 
	 * The main method creates an instance of the class, which
	 * causes it to display it's window
	 */
	
	public static void main(String[] args) {
		new SpeedSound();
		
	}

}
