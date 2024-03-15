import java.util.regex.*;

public class MenuValidator {
	public static boolean validate(String option) {
		boolean isOperator = false;
		String regex = "[+-]?[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(option);
		if (matcher.find()) {
			switch (Integer.parseInt(option)) {
				case 1:
					isOperator = true;
				break;
				case 2:
					isOperator= true;
				break;
				case 3:
					isOperator= true;
				break;
				case 4:
					isOperator= true;
				break;
				case 5:
					isOperator= true;
				break;
				case 6:
					System.exit(0);
				break;
				default:
					isOperator = false;
				break;
			}
		}else {
			isOperator = false;
		}
		
		return isOperator;
	}
}