import java.util.ArrayList;
import java.util.function.Consumer;

public class cnsmr {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		Consumer<Integer> method =(n) -> { System.out.println(n); };
		numbers.forEach(method);

	}

}
