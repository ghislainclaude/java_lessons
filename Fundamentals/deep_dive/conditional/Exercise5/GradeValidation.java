public class GradeValidation {
	/**
	 * @param validation captures the string grage
	 * @return The user's input as a String.
	 * **/
	public static boolean validation(String grade) {
		boolean valid = false;
		if (Integer.parseInt(grade) > 0 && Integer.parseInt(grade) <= 12) {
			valid = true;
		}else {
			valid = false;
		}
		return valid;
	}
}