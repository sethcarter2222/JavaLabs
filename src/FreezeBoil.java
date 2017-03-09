/**
 *Creates class FreezeBoil to determine
 *if water, ethyl and oxygen boil or freeze
 *at the given temperatures
 */
public class FreezeBoil {

	private double temperature; // creates a private double variable for temperature
	
	//Default no argument constructor
	public FreezeBoil() {
		
	}
	//method sets the user input as the temperature used in calculations of below methods
	public void setTemps(double et) {
		temperature = et;
	}
	// method determines if ethyl is freezing at given temperature
	public boolean isEthylFreezing() {
		if (temperature > -173) {
			return false;
		} else {
			return true;
		}
	}
	// method determines if ethyl is boiling at given temperature
	public boolean isEthylBoiling() {
		if (temperature < 172) {
			return false;
		} else {
			return true;
		}
	}
	// method determines if oxygen is freezing at given temperature
	public boolean isOxygenFreezing() {
		if (temperature > -362) {
			return false;
		} else {
			return true;
		}
	}
	// method determines if oxygen is boiling at given temperature
	public boolean isOxygenBoiling() {
		if (temperature < -306) {
			return false;
		} else {
			return true;
		}
	}
	// method determines if water is freezing at given temperature
	public boolean isWaterFreezing() {
		if (temperature > 32) {
			return false;
		} else {
			return true;
		}
	}
	// method determines if water is boiling at given temperature
	public boolean isWaterBoiling() {
		if (temperature < 212) {
			return false;
		} else {
			return true;
		}
	}

}
