public class Challenge2Main {
	public static void main(String[] args) {
		// Initialize variables
		String op1 = null, op2 = null;
		double stOperand = 0, ndOperand = 0;
		boolean isContinue = true;
		boolean Ops1IsValid = false;
		boolean Ops2IsValid = false;
		boolean isOptionValid = false;
		boolean isOperatorValid = false;
		boolean isOptionOperation = false;
		String operation = null;
		String operators = null; 

		// Main loop that keeps running as long as the user wants to continue
		while(isContinue) 
		{
			// Main loop that keeps running as long as the user wants to continue
			MenuPrinter.printMenu();
			//System.out.println("* Enter the Operator sign (-, +, * or extra) to peerform one on the operation above:  *");
			// Loop until a valid operator is entered by the user
			operation = Prompter.prompt("Please Enter one of the options 1 to 6  to perform one of the operation above:  ");
			isOptionValid = MenuValidator.validate(operation);
			while (!isOptionValid) {
				operation = Prompter.prompt("Error !! PLease enter one of the option sign 1 to 6 to perform one on the operation above:  ");
					isOptionValid = MenuValidator.validate(operation);
				/*if (!isOptionValid) {
				}*/
			}
			op1 = Prompter.prompt("Enter the first number: ");
			Ops1IsValid =NumberValidator.validate(op1);
			// Loop until a operand operator is entered by the user
			while(!Ops1IsValid ) {
				op1 = Prompter.prompt("Invalid operand. Please enter a valid number: ");
				Ops1IsValid =NumberValidator.validate(op1);
			}


			operators = Prompter.prompt("Please enter the sign of the option you have chosen form the menu: ");
			isOperatorValid = OperatorValidation.validate(operators);
			isOptionOperation = IsOptionOperation.optionIsOperation(operation, operators);
			while (!isOptionOperation) {
				operators = Prompter.prompt("Please enter a valid artithmetic sign of the operation option you have chosen form the menu: ");
				isOperatorValid = OperatorValidation.validate(operators);
				isOptionOperation = IsOptionOperation.optionIsOperation(operation, operators);
			}

			op2 = Prompter.prompt("Enter the second number: ");
			Ops2IsValid = NumberValidator.validate(op2);
			stOperand = Double.parseDouble(op1);
			// Loop until a valid oprand is entered by the user
			while(!Ops2IsValid ) {
				op2 = Prompter.prompt("Invalid operand. Please enter a valid number: ");
				Ops2IsValid =NumberValidator.validate(op1);
			}
			ndOperand = Double.parseDouble(op2);
			// check the option entered by user and perfrom operation
			switch (Integer.parseInt(operation) ) 
			{
					case 1:
						System.out.println("Final answer: "+Addition.add(stOperand, ndOperand));
					break;
					case 2:
						System.out.println("Final answer: "+Sutraction.subtract(stOperand, ndOperand));
					break;
					case 3:
						System.out.println("Final answer: "+Multiplication.mutiply(stOperand, ndOperand));
					break;
					case 4:
						if (ndOperand == 0) {
							System.out.println("Error !! Can't divide by zero");
						}else 
						System.out.println("Final answer: "+Division.divide(stOperand, ndOperand));
					break;
					case 5:
						if (ndOperand == 0) {
							System.out.println("Error Can't divide by zero");
						}else 
						System.out.println("Final answer: "+Modulus.modulus(stOperand, ndOperand));
					break;
					default :
						System.out.println("Unknown sign");
					break;
			}

			//System.out.println("If you wish to continue using the application the please enter y if not enter any other key");
			String runContinue = Prompter.prompt("If you wish to continue using the application the please enter y if not enter any other key: ");
			if (runContinue.equals("y")) {
				isContinue = true;
				Ops1IsValid = false;
				Ops2IsValid = false;
				isOptionValid = false;
				isOperatorValid = false;
				isOptionOperation = false;
			}else {
				System.exit(0);
			}
		}
	}
}