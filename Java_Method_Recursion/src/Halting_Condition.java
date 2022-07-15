
public class Halting_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(10, 25);
		System.out.println(result);
		
	}
	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}
}
