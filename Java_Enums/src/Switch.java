enum Step {
	LOW,
	MEDIUM,
	HIGH
}
public class Switch {

	public static void main(String[] args) {
		Step myVar = Step.MEDIUM;
		
		switch(myVar) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}

	}

}
