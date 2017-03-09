/**
 * This program stores three runners and their times and displays
 * their placement
 */
public class Race {

	private String runner1;     //Sets variable for first runner
	private String runner2;     //Sets variable for second runner
	private String runner3;     //Sets variable for third runner
	private String placement;
	private double time1;       //Sets variable for first runner's time
	private double time2;       //Sets variable for second runner's time
	private double time3;       //Sets variable for third runner's time
	//Default no arg constructor
	public Race() {
		
	}
	//Sets the name of the three runners
	public void setRunners(String r1, String r2, String r3) {
		this.runner1 = r1;
		this.runner2 = r2;
		this.runner3 = r3;
	}
	//Sets the three runners times
	public void setTimes(double t1, double t2, double t3) {
		this.time1 = t1;
		this.time2 = t2;
		this.time3 = t3;
	}
	//Runs the calculations for the placements of the runners and displays the results
	public String getPlacement() {
		if (time1 > time2 && time1 > time3) {
			if (time2 > time3) {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner1, runner2, runner3);
			} else {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner1, runner3, runner2);
			}
		} else if (time2 > time1 && time2 > time3) {
			if (time1 > time3) {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner2, runner1, runner3);
			} else {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner2, runner3, runner1);
			}
		} else {
			if (time1 > time2) {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner3, runner1, runner2);
			} else {
				System.out.printf("1st: %s\n2nd: %s\n3rd: %s", runner3, runner2, runner1);
			}
		}
		return placement;
	}

}
