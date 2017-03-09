
public class Box1 {
	private String color;
	private int length;
	private int width;
	private int area;
	public Box1() {
		System.out.println("The constructor has been called");
	}
	
	public void setColor(String col) {
		this.color = col;
	}
	
	public String getColor(){
		return color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return this.length * this.width;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void changeNum(int n) {
		n = 500;
		System.out.println("The number is now " + n);
	}
	public void changeColor(String col) { 
		this.color = col;
		System.out.println("The color is now " + this.color);
	}


}
