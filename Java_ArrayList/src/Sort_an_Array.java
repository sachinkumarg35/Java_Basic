import java.util.ArrayList;
import java.util.Collections;

public class Sort_an_Array {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		
		Collections.sort(Cars);
		
		for (String i : Cars) {
			System.out.println(i);
		}
		
	}

}
