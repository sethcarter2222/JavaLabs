
public class Box1Launcher {

	public static void main(String[] args) {
		Box1 box1 = new Box1();
		Box1 box2 = new Box1();
		Box1 box3 = new Box1();
		Box1 box4 = new Box1();
		Box1 box5 = new Box1();
		int length = 2;
		int width = 3;
		int num = 7;
		String color = "Gold";
		
		System.out.println("The color of box1 is " + box1.getColor());
		System.out.println("The Length of box1 is " + box1.getLength());
		
		box1.setColor("Pink");
		box2.setColor("Blue");
		box3.setColor("Red");
		box4.setColor("Orange");
		box5.setColor("Yellow");
		
		System.out.println("The color of box1 is " + box1.getColor());
		System.out.println("The color of box2 is " + box2.getColor());
		System.out.println("The color of box3 is " + box3.getColor());
		System.out.println("The color of box4 is " + box4.getColor());
		System.out.println("The color of box5 is " + box5.getColor());
		box1.setWidth(width);
		box1.setLength(length);
		box1.setArea(length * width);
		System.out.println("The area of box1 is " + box1.getArea());
		length += 3;
		box1.setLength(length);
		System.out.println("The area of box1 is " + box1.getArea());
		System.out.println("The number is " + num);
		box1.changeNum(num);
		System.out.println("The number is " + num);
		System.out.println("The color is " + box1.getColor());
		box1.changeColor("Silver");
		System.out.println("The color is " + box1.getColor());
	}

}
