import java.util.Scanner;


public class Input_types {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name, age, and salary");
		
		//String input
		String name = myObj.nextLine();
		
		//Numerical input
		int age = myObj.nextInt();
		double Salary = myObj.nextDouble();
		
		
		//Output Input by User
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + Salary);

	}

}
