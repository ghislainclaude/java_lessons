public class NumberValidator{
	public static boolean isVaild(String strNum) {
		try {
			//parse input string to double for distance
			double distance = Double.parseDouble(strNum);
			// Return true if distance is positive
			return  distance > 0.0;
		}catch (NumberFormatException e) {
			return false;
		}
	}
}