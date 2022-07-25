import java.util.HashMap;

public class Add_Items {

	public static void main(String[] args) {
		HashMap<String, String> CapitalCities = new HashMap<String, String>();
		CapitalCities.put("England", "London");
		CapitalCities.put("Germany", "Berlin");
		CapitalCities.put("Norway", "Oslo");
		CapitalCities.put("USA", "Washington DC");
		CapitalCities.remove("England");
		CapitalCities.clear();
		System.out.println(CapitalCities);
	}

}
