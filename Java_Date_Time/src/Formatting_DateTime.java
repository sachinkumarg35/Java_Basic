import java.time.LocalDateTime; //Import the LocalDateTime Class
import java.time.format.DateTimeFormatter; //Import the DateTime Formatter Class

public class Formatting_DateTime {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String FormattedDate = myDateObj.format(myFormatObj);
		System.out.println("After Formatting: " + FormattedDate);

	}

}
