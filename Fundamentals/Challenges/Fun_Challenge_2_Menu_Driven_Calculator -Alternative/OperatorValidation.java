public class OperatorValidation {
	public static boolean validate(String operator ) {
		boolean isoperatorValid = false;
		if (operator.equals("+") || operator.equals("-") || 
			operator.equals("*") || operator.equals("/") || operator.equals("%")) {
			isoperatorValid = true;
		}else 
			isoperatorValid = false;
		return isoperatorValid;
	}
}