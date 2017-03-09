import java.util.Scanner;
public class GradeDemo {

	public static void main(String[] args) {
		double[] tests = new double[4];
		String student1;
		String student2;
		String student3;
		String student4;
		String student5;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter student 1's name");
		student1 = input.nextLine();
		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter student 1's grade for test " + (i + 1));
			tests[i] = input.nextDouble();
		}
		Grade stud1 = new Grade(student1, tests);
		System.out.println(stud1);
		System.out.println("Please enter student 2's name");
		input.nextLine();
		student2 = input.nextLine();
		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter student 2's grade for test " + (i + 1));
			tests[i] = input.nextDouble();
		}
		Grade stud2 = new Grade(student2, tests);
		System.out.println(stud2);
		System.out.println("Please enter student 3's name");
		input.nextLine();
		student3 = input.nextLine();
		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter student 3's grade for test " + (i + 1));
			tests[i] = input.nextDouble();
		}
		Grade stud3 = new Grade(student3, tests);
		System.out.println(stud3);
		System.out.println("Please enter student 4's name");
		input.nextLine();
		student4 = input.nextLine();
		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter student 4's grade for test " + (i + 1));
			tests[i] = input.nextDouble();
		}
		Grade stud4 = new Grade(student4, tests);
		System.out.println(stud4);
		System.out.println("Please enter student 5's name");
		input.nextLine();
		student5 = input.nextLine();
		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter student 5's grade for test " + (i + 1));
			tests[i] = input.nextDouble();
		}
		Grade stud5 = new Grade(student5, tests);
		System.out.println(stud5);
		
	}

}
