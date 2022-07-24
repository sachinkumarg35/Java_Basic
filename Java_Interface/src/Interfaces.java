interface Animal {
	public void animalsound(); // interface method (does not have a body)
	public void sleep(); //interface method (does not have a body)
}
class Pig implements Animal {
	public void animalsound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("zzz");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalsound();
		myPig.sleep();

	}

}
