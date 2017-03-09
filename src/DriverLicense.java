
public class DriverLicense {

	private static String[] answers = {"B", "D", "A", "A", "C", "A", 
	                                  "B", "A", "C", "D", 
	                                  "B", "C", "D", "A", 
	                                  "D", "C", "C", "B", "D", "A"};
	private int correct;
	private int incorrect;
	private boolean[] torF;
	private String[] userArray; 

	
	public DriverLicense (String[] answers)
	{
	    torF = new boolean[answers.length];
	    userArray = new String[answers.length];
	    correct = 0;
	    incorrect = 0; 

	    for (int i = 0; i < answers.length; i++)
	    {
	        userArray[i] = answers[i]; 
	        torF[i] = userArray[i].equalsIgnoreCase(answers[i]);
	        if (!torF[i]) {
	            correct++;
	        } else {
	            incorrect++;
	        }
	    }
	}

	public boolean passed()
	{
	    return correct >= 15;
	}

	public int totalCorrect()
	{
	    return correct;
	}

	public int totalIncorrect()
	{
	    return incorrect;
	}

	public boolean[] questionsMissed()
	{
	    return torF;
	}

}
