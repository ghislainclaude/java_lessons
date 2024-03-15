public class IsOptionOperation {
	public static boolean optionIsOperation(String option, String operation) {
		boolean isoptiionOperation = false;

		if (option.equals("1")) {
			if (operation.equals("+")) 
				isoptiionOperation = true;
			else isoptiionOperation = false;
		}else if (option.equals("2")) {
			if (operation.equals("=")) 
				isoptiionOperation = true;
			else isoptiionOperation = false;
		}else if (option.equals("3")) {
			if (operation.equals("*")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;

		}else if (option.equals("4")) {
			if (operation.equals("/")) 
				isoptiionOperation = true;
			else isoptiionOperation = false;

		}else if (option.equals("5")) {
			if (operation.equals("%")) 
				isoptiionOperation = true;
			else isoptiionOperation = false;
		} else {
			isoptiionOperation = false;
		}
		/*switch (option) 
		{
			case "1":
				if (operation.equals("+")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break;
			case "2":
				if (operation.equals("+")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break; 
			case "3":
				if (operation.equals("*")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break; 
			case "4":
				if (operation.equals("/")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break; 
			case "5":
				;isoptiionOperation = true;
				else isoptiionOperation = false
			break;if (operation.equals("%"))
					
			default :
				isoptiionOperation = false;
			break;
		}*/
		return isoptiionOperation;
	}
}