import java.util.ArrayList;
import java.util.Iterator;
public class Getting_an_Iterator {

	public static void main(String[] args) {
		// Make Collection
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		
		//Get the iterator
		Iterator<String> it = Cars.iterator();
		
		//Print the first item
		System.out.println(it.next());
		

	}

}
