import java.util.ArrayList;
public class For_each {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.forEach( (n) -> { System.out.println(n); } );

	}

}
