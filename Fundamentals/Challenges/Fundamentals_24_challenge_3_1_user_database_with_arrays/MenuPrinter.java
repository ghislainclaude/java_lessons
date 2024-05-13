public class MenuPrinter {
	/**@author Ghislain-Claude Ilunga
	 * @return int This number of the option of displayed in the menu  **/
	public static int print() {
		System.out.print("************************************************************************************************************\n" +
								"The main menu: \n"+
								"1. Add a user\n"+ 
								"2. Delete a user\n"+
								"3. Update a user \n"+
								"4. Displays all the users in the database\n" +
								"5. Exit\n"+
								"************************************************************************************************************\n"
		);
		String menu_option = Prompter.prompt("Enter the number of the option you would like to select: ");
		/** Check in the number being entered is a dighut and then wee**/
		while ((!NumberValidator.validate(menu_option)) || Integer.parseInt(menu_option) < 1 || Integer.parseInt(menu_option) > 5) 
			menu_option = Prompter.prompt("Please Enter a valid number of one of the option you would like to select: ");
		
		return Integer.parseInt(menu_option);
	}
}