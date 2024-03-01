public class BlockPlacement {
	public static boolean placement(String grade) {
		boolean isHighshool = false;
		if (Integer.parseInt(grade) > 7 && Integer.parseInt(grade)< 12 ) {
			isHighshool = true;
		}
		return isHighshool;
	}
}