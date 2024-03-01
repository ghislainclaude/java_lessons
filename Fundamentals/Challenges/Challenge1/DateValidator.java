import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.time.*;
/**
 * Class for validating date formats and checking if a date is before the current date.
 * @author Claude
 */
public class DateValidator {
	/**
     * Checks if a given date string matches the dd/mm/yyyy format.
     *
     * @param dateOfBirth The date string to validate.
     * @return true if the date string matches the dd/mm/yyyy format, false otherwise.
     */
	public static boolean isValid(String date_of_birth) {
		// Define the regex for matching dates in dd/mm/yyyy format
		String regex = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/([0-9]{4})$";
		// Compile the regex into a Pattern
		Pattern pattern = Pattern.compile(regex);
		// Match the given dateOfBirth against the pattern
		Matcher matcher = pattern.matcher((CharSequence)date_of_birth);
		// Return true if the dateOfBirth matches the pattern, false otherwise
		return matcher.matches();
	}
	 /**
     * Alternative method to validate a date string in dd-MM-yyyy format and check if it is before the current date.
     *
     * @param dateOfBirth The date string to validate.
     * @return true if the date string is in valid dd-MM-yyyy format and before the current date, false otherwise.
     */
	/*public static boolean isValid(String date_of_birth) {
	 	try 
	 	{
	 		// Define the date format for parsing
	 		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 		// Parse the dateOfBirth string to a LocalDate
	 		Local date = LocalDate.parse(date_of_birth, dateformat);
	 		// Get the current date
	 		LocalDate currentdate = LocalDate.now();
	 		// Return true if the parsed date is before the current date, false otherwise
	 		return (date.isBefore(currentdate));
	 	}catch (DateTimeParseException e) {
	 		// Return false if the dateOfBirth string cannot be parsed into a valid date
	 		return false;
	 	}
	 }*/
}