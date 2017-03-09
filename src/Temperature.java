
public class Temperature {
	private double ftemp;
	
	public Temperature() {
		
	}
	
	public void setFarenheit(double f) {
		this.ftemp = f;
	}
	
	
	
	public double getFarenheit() {
		return ftemp;
	}
	public double getCelsius() {
		return (5.0 / 9.0) * (ftemp - 32.0);
	}
	public double getKelvin() {
		return ((5.0/9.0) * (ftemp - 32.0)) + 273.0;
	 }
}
