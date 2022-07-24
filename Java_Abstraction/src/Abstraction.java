//Abstract Class
abstract class Animal {
	//Abstract Method (does not have a body)
	public abstract void animalsound();
	//Regular Method
	public void sleep() {
		System.out.println("Zzz");
	}
}
//subclass (inherit from animal)
class Pig extends Animal {
	public void animalsound() {
		//The body of animal sound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalsound();
		myPig.sleep();

	}

}
