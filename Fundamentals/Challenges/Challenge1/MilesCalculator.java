public class MilesCalculator {
	/**
     * Converts a distance from kilometers to miles.
     * 
     * @param input The distance in kilometers as a String.
     * @return The distance in miles as a double.
     */
	public static double calculate(String input) {
		double distance, miles, coversion;
		// Parse the input string to a double, input represents distance in kilometers.
		distance = Double.parseDouble(input);
		// Define the conversion factor from kilometers to miles.
		coversion =  1.609;
		//  Convert the distance from kilometers to miles using the conversion factor.
        // The conversion formula is: miles = kilometers / conversionFactor.
		miles = distance / coversion;
		//Return the calculated distance in miles.
		return miles;
	}
}
