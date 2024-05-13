import java.util.regex.*;//


public class emaiValidator {
	/****/
	public static boolean validate(String input) {
		// build a regex patter to check if the number is a digit 
		String regex = "^(.+)@(.+)$";
		// Check if the pattern and the input string matches 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		// return a boolean if the is a digit 
		return matcher.find();
	}
}