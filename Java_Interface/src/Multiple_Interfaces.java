interface FirstInterface {
	public void myMethod(); //interface method
}

interface SecondInterface {
	public void myOtherMethod(); //interface method
}

//DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Archer Arjuna ");
	}
	public void myOtherMethod() {
		System.out.println("Energetic Bheema");
	}
}
public class Multiple_Interfaces {

	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
