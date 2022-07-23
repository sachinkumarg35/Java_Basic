//file name: Main.Java
public class many_parameters {
	int modelYear;
	String modelName;
	
public many_parameters(int year, String name) {
	modelYear = year;
	modelName = name;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		many_parameters myCar = new many_parameters(1947, "Freedom of India");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
