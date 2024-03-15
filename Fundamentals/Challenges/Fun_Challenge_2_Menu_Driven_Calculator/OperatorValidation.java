public class OperatorValidation {
	public static boolean validate(String operator ) {
		boolean isoperatorValid = false;
		switch (operator) {
				case "+":
					isoperatorValid = true;
				break;
				case "-":
					isoperatorValid= true;
				break;
				case "*":
					isoperatorValid= true;
				break;
				case "/":
					isoperatorValid= true;
				break;
				case "%":
					isoperatorValid= true;
				break;
				default:
					isoperatorValid = false;
				break;
			}
		return isoperatorValid;
	}
}