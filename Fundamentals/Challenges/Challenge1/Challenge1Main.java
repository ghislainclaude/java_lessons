public class Challenge1Main{
	/**
     * Main method for Challenge One by Ghislain-Claude Ilunga.
     * This challenge prompts the user for personal information, validates it,
     * then prints a summary including the user's age and the distance to their favourite store in miles.
     */
	public static void main(String[] args) {
		// Prompt for user's name and print it
		String name = Prompter.prompt("What is your name: ");
		// Prompt for user's surname and print it
		String surname = Prompter.prompt("What is your surname: ");
		// Prompt for user's date of birth, validate,
		String date_of_birth =  date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");

		// Check if the entered date of birth is IF not the loop
		while (!DateValidator.isValid(date_of_birth)){
			// Prompt for user's date of birth, validate, and calculate age
			date_of_birth = Prompter.prompt("Please enter a your valid date of birth (DD/MM/YYYY): ");
		}

		// Prompt for user's date of birth, validate, and calculate a
		String distance_from_store = Prompter.prompt("How far is your favourite store from your home? ");
		while (!NumberValidator.isVaild(distance_from_store)) {
			distance_from_store = Prompter.prompt("How far is your favourite store from your home? Enter a valid distance ");
		}
		// Initialize Variables to hold age and miles
		int age, miles = 0;
		// Check if the entered date of birth is 

		if (DateValidator.isValid(date_of_birth)) {
			// Calculate age if date is valid
			age = (int)AgeCalculator.calculate(date_of_birth);
			//System.out.println("You are "+ age +" year old" );
		}else {
			age = 0;
			System.out.println("Date is not valid exiting");
		}

		// Check if the entered distance is valid
		if (NumberValidator.isVaild(distance_from_store) == true) {
			// Convert distance to miles if valid
			miles = (int)MilesCalculator.calculate(distance_from_store);
			/*System.out.println("The distance form the shop is " + miles + " miles");*/
			Printer.print(name, surname, date_of_birth, distance_from_store, age,  miles);
		}else {
			System.out.println("Date is not valid exiting");
		}
	}
}