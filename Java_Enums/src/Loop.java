enum  Stage {
	LOW,
	MEDIUM,
	HOGH
}
public class Loop {

	public static void main(String[] args) {
		for (Stage myVar : Stage.values()) {
			System.out.println(myVar);
		}
	}

}
