import java.util.Scanner; // import the scanner class
public class User_Input {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String UserName;
		
		//Enter UserName and press Enter.
		System.out.println("Enter UserName");
		UserName = myObj.nextLine();
		
		System.out.println("Username is " + UserName);

	}

}
