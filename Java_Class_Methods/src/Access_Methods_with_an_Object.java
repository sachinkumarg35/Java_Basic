//Create a Main(Access_Methods_with_an_object
public class Access_Methods_with_an_Object {
	
	//Create a fullThrottle() Method
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}

	//Create a speed() Method and add a parameter
	public void speed(int maxspeed) {
		System.out.println("Max speed is: "+ maxspeed);
	}
	
	//Inside main, call the methods on the myCar object
	public static void main(String[] args) {
		Access_Methods_with_an_Object myCar = new Access_Methods_with_an_Object(); //Create a my car object 
		myCar.fullThrottle(); //Call the fullThrottle method
		myCar.speed(100); // Call the Speed Method
	}

}
