import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("w3Schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit w3Schools!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match not Found");
		}

	}

}
