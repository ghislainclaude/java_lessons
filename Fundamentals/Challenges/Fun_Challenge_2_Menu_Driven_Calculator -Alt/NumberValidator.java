import java.util.regex.*;

public class NumberValidator{
	public static boolean validate(String operands) {
		try {
			String regex = "[+-]?[0-9]+";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(operands);
			return matcher.find();
		}catch (Exception e) {
			return false;
		}
		
	}
}