public class Challenge1Main{


	public static void main(String[] args) {
		// create object of Prompter class 
		//Prompter prompter = new Prompter();
		String name = Prompter.prompt("What is your name: ");
		System.out.println("Your name is " + name);

		String surname = Prompter.prompt("What is your surname: ");
		System.out.println("Your surname is " + surname);

		String date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");
		System.out.println("Your date of birth is " + date_of_birth);

		String distance_from_store = Prompter.prompt("How far is your favourite store from your home? ");
		System.out.println("Your favourite store from your home?");

		System.out.println("Hello, " + name + " " + surname);
		DateValidator.isValid(date_of_birth);
	}
	
}