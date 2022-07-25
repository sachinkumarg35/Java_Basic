import java.util.ArrayList;

public class for_Loop {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}
	}

}
