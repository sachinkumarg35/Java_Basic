import java.util.ArrayList;
import java.util.Iterator;

public class while_loop {

	public static void main(String[] args) {
		ArrayList<String> Cars =new ArrayList<String>(); 
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		
		//Get the Iterator
		Iterator<String> it = Cars.iterator();
		
		//Loop through a collection
		while(it.hasNext())
			System.out.println(it.next());
	}

}
