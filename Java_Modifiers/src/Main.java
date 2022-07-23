//abstract class
abstract class Main {
public String fname = "Sachin";
public int age = 23;
public abstract void study(); //abstract method


//Subclass (inherit from Main)
class Student extends Main {
	public int graduationyear = 2018;
	public void study() {//the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}
	

	}
