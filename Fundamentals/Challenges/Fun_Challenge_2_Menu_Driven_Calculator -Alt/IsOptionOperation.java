public class IsOptionOperation {
	public static boolean optionIsOperation(String option, String operation) {
		boolean isoptiionOperation = false;
		switch (option) 
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
			case "*":
				if (option.equals("3")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break; 
			case "/":
				if (option.equals("4")) 
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break;
			case "%":
				if (option.equals("5"))
					isoptiionOperation = true;
				else isoptiionOperation = false;
			break;
			default :
				isoptiionOperation = false;
			break;
		}
		return isoptiionOperation;
	}
}