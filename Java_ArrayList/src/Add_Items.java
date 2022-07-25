import java.util.ArrayList; 
public class Add_Items {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		Cars.set(0, "Opel");
		Cars.remove(0);
		Cars.clear();
		System.out.println(Cars.size());
		
	}

}