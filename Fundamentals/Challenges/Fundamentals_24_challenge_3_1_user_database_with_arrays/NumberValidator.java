import java.util.regex.*;


public class NumberValidator {
	/**This method accepts a string and if the string is a number it will return true value boolean **/
	public static boolean validate(String option) {
		// build a regex patter to check if the number is a digit 
		String regex = "[+-]?[0-9]+";
		// Check if the pattern and the input string matches 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(option);
		// return a boolean if the is a digit 
		return matcher.find();
	}
}