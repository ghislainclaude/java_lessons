public class GradeClassification{
	public static boolean classification(String grade) {
		boolean isHighshool = false;
		if (Integer.parseInt(grade) > 7 && Integer.parseInt(grade)< 12 ) {
			isHighshool = true;
		}
		return isHighshool;
	}
}