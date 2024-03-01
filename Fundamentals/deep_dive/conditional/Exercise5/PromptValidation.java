import java.util.regex.*;

public class PromptValidation{
	public static boolean validate(String input) {
		boolean isPresent = true;
		String regexCharacters = "[^A-ZA-z0-9]";
		// Check if input string matches pattern of special characters and numbers
		Pattern patternCharacters = Pattern.compile(regexCharacters);
		//Pattern patternDigits = Pattern.compile(regexDigits);
		Matcher matcherCharactes = patternCharacters.matcher(input);
		//Matcher matcherDigits = patternDigits.matcher(input);
		// Check if the inputs string has special characters or numbers
		boolean isThereCharacters = matcherCharactes.find();
		//boolean isTHereDigits = matcherCharactes.find();
		if (!input.isBlank() && !isThereCharacters  ) {
			isPresent = true;
		}else if (input == null ) {
			isPresent = false;
		}
		else {
			isPresent = false;
		}
		return isPresent;
	}
}
