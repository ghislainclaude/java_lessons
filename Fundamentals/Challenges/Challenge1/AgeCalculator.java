import java.time.LocalDate;
import java.time.Month;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar; 


public class AgeCalculator {
	/**
     * Calculates age in years using the java.time package.
     * 
     * @param date The date of birth in "DD/MM/YYYY" format.
     * @return The age in years as a double.
     */
	public static double calculate(String date) {
		// Split the input date string into day, month, and year components
		String[] arrayDate = date.split("/");
		 // Convert string components to integers and create a LocalDate for the date of birth
		LocalDate date_of_birth = LocalDate.of(Integer.parseInt(arrayDate[2]),
		Integer.parseInt(arrayDate[1]), Integer.parseInt(arrayDate[0]));
		// Get the current date
		LocalDate currentDate = LocalDate.now();
		// Calculate the period between the date of birth and the current date
		Period period = Period.between(date_of_birth, currentDate);
		// Return the number of years in the period as a double
		return (double)(period.getYears());
	}

	/**
     * Alternative Calculations age in years using the Calendar and GregorianCalendar classes.
     * 
     * @param date The date of birth in "DD/MM/YYYY" format.
     * @return The age in years as a double.
     */
	// public static double calculate(String date) {
	// 	// Split the input date string into day, month, and year components
	// 	String[] arrayDate = date.split("/");
	// 	// Create a GregorianCalendar object for the date of birth, adjusting the month value
	// 	Calendar date_of_birth = new GregorianCalendar(Integer.parseInt(arrayDate[2]),
	// 	Integer.parseInt(arrayDate[1]), Integer.parseInt(arrayDate[0]));
	// 	// Get the current date by creaing a object of calendar
	// 	Calendar currentDate = new GregorianCalendar();
	// 	// Initialize the age by subtracting the year of the date of birth from the current year
	// 	int age = currentDate.get(Calendar.YEAR) - date_of_birth.get(Calendar.YEAR);
	// 	// Check if the person has not yet had their birthday for the current year
	// 	if (date_of_birth.get(Calendar.MONTH) > currentDate.get(Calendar.MONTH) || 
	// 		date_of_birth.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH) ) {
	// 		// If the person's birthday has not occurred yet this year, the code decrements the initially calculated age by 1
	// 		age --;
	// 	}
	// 	return (double)age;
	// }
}

