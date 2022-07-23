
public class Static_vs_NonStatic {
	//Static Method
	static void myStaticMethod() { 
		System.out.println("Staic Methods can be called without creating objects");
	}

	//Public Method
	public void myPublicMethod() {
		System.out.println("Public Methods must be called by creating objects");
	}
	
	//Main Method
	public static void main(String[] args) {
		myStaticMethod(); // call the static method
		
		Static_vs_NonStatic myObj = new Static_vs_NonStatic();//Create an object of MyClass
		myObj.myPublicMethod(); // Call the public method
		

	}

}
