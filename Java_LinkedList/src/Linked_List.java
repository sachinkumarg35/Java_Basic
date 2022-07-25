import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> Cars = new LinkedList<String>();
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		
		Cars.addFirst("Toyota");
		Cars.addLast("Suzuki");
		Cars.removeFirst();
		Cars.removeLast();

		System.out.println(Cars.getFirst());
		System.out.println(Cars.getLast());

	}

}
