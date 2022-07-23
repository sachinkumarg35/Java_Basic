import java.util.*; //import the java .util package

class MyClass {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String UserName;
		
		//Enter UserName and press enter
		System.out.println("Enter UserName");
		UserName = myObj.nextLine();
		
		System.out.println("User Name is " + UserName);
	}

}
