
public class naeNae {
String name;
String gender;
int age;
boolean areYouNaeNae;
	public naeNae(String name1, String gender1, int age1, boolean nathan) {
		this.areYouNaeNae = nathan;
		this.name = name1;
		this.age = age1;
		this.gender = gender1;
		if(areYouNaeNae) {
			System.out.println("I'm sorry NaeNae, you do not have the proper capabilities to judge cinematic merit");
		} else {
			System.out.println("You are a wonderful " + age + " year old " + gender + " named " + name + " who is ready to properly discuss and disect films.");
		}
	}

}
