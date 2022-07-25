import java.util.ArrayList;

public class for_eachloop {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		for (String i : Cars) {
			System.out.println(i);
		}

	}

}
