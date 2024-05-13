import java.util.*;

public class Challenge3Main {
	public static void main(String[] args) {
		for (;; ) {
			int menuOption = MenuPrinter.print();
			switch (menuOption) {
				case 1:
					Add();
				break;
				case 2:
					delete();
				break;
				case 3:
					Update();
				break; 
				case 4:
					DisplayAll();
				break;
				case 5:
					System.exit(0);
				break;
			}
		}
	}

	public static void Add() {
		for ( ; ; ) {
			System.out.println("****************************************************************************************************");
			System.out.println("						Welcome to Add a user 														");
			System.out.println("****************************************************************************************************");
			Get_and_Set model = new Get_and_Set();
			model.setName(Prompter.prompt("Enter the user's name: "));
			while (!Character.isUpperCase(model.getName().charAt(0))) 
				model.setName(Prompter.prompt("Please enter a valid user's name starting with capital letter: "));
		
			model.setSurname(Prompter.prompt("Enter the user's surname: "));
			while (!Character.isUpperCase(model.getSurname().charAt(0))) 
				model.setSurname(Prompter.prompt("PLease enter a valid user's surname starting with capital letter: "));
		
			model.setEmail(Prompter.prompt("Enter the user's email: "));
			while (!emaiValidator.validate(model.getEmail())) 
				model.setEmail(Prompter.prompt("Please Enter a valid user's email for example name@gmail.com: ")) ;
		
			model.setDoD(Prompter.prompt("Enter the user's date of birth: "));
			while (!DateValidator.isValid(model.getDoD())) 
				model.setDoD(Prompter.prompt("Please enter a valid user's date of birth for : "));
			String unique_id = UUID.randomUUID().toString();
			UserDAO.create(model.getName(), model.getSurname(), model.getEmail(), model.getDoD(), Double.toString(AgeCalculator.calculate(model.getDoD())), unique_id);
			String option =  Prompter.prompt("Enter (b) to go back to main menu or keep enting more users: ");
			if (option.equals("b")) 
				break;
		}
	}

	public static void Update() {
		update_data : for (; ; ) {
			if (UserDAO.user_db.length > 0) {
				System.out.println("************************************************************************************************************");
				System.out.println("					Welcome to  Update a user																");
				System.out.println("************************************************************************************************************");
				Get_and_Set model = new Get_and_Set();
				model.setEmail(Prompter.prompt("Enter the user's email of the user you would to update or enter to exits update: "));
				while (!emaiValidator.validate(model.getEmail())) 
					model.setEmail(Prompter.prompt("Please Enter a valid user's email for example name@gmail.com: "));
				
				printArray("User you would like to update ", UserDAO.getUserByEmail(model.getEmail()));
				System.out.print("************************************************************************************************************\n" +
															"The update menu : \n"+
															"1. Update user's name\n"+ 
															"2. Updates user's surname\n"+
															"3. Update user's date of birth\n" +
															"4. Exit update\n"+
								"************************************************************************************************************\n"
				);

				for ( ; ; ) {
					String menu_option = Prompter.prompt("Enter the number of the option you would like to select: ");
					while ((!NumberValidator.validate(menu_option)) || Integer.parseInt(menu_option) < 1 || Integer.parseInt(menu_option) > 4) 
						menu_option = Prompter.prompt("Please Enter a valid number of one of the option you would like to select: ");
					switch (menu_option) {
						case "1":
							model.setName(Prompter.prompt("Enter the update user's name: "));
							while (!Character.isUpperCase(model.getName().charAt(0))) 
								model.setName(Prompter.prompt("Please enter a valid user's name starting with capital letter: "));
							UserDAO.update(model.getName(),  UserDAO.getUserByEmail(model.getEmail())[1],  UserDAO.getUserByEmail(model.getEmail())[2],  UserDAO.getUserByEmail(model.getEmail())[3], 
								UserDAO.getUserByEmail(model.getEmail())[4], UserDAO.getUserByEmail(model.getEmail())[5]);
						break;
						case "2":
							model.setSurname(Prompter.prompt("Enter the user's surname: "));
							while (!Character.isUpperCase(model.getSurname().charAt(0))) 
								model.setSurname(Prompter.prompt("PLease enter a valid user's surname starting with capital letter: "));
							UserDAO.update( UserDAO.getUserByEmail(model.getEmail())[0],  model.getSurname(),  UserDAO.getUserByEmail(model.getEmail())[2],  UserDAO.getUserByEmail(model.getEmail())[3], 
								UserDAO.getUserByEmail(model.getEmail())[4], UserDAO.getUserByEmail(model.getEmail())[5]);
						break;
						case "3":
							model.setDoD(Prompter.prompt("Enter the user's date of birth: "));
							while (!DateValidator.isValid(model.getDoD())) 
								model.setDoD(Prompter.prompt("Please enter a valid user's date of birth for : "));
						break;
					}

					UserDAO.update(model.getName(), model.getSurname(), UserDAO.getUserByEmail(model.getEmail())[2], model.getDoD(), UserDAO.getUserByEmail(model.getEmail())[4], UserDAO.getUserByEmail(model.getEmail())[5]);
					if (menu_option.equals("4"))
						break update_data;
				}

				//Get_and_Set model = new Get_and_Set();
				/****/
				/*if (update.equals("y")) {
					model.setName( Prompter.prompt("Enter the updated user's name: "));
					while (!Character.isUpperCase(model.getName().charAt(0))) 
						model.setName(Prompter.prompt("Please enter a valid user's name starting with capital letter: "));
				}else 
					model.setName(UserDAO.getUserByEmail(model.getEmail())[0]);
				
				update = Prompter.prompt("Enter y if want to update surname or anything else if you want surname to remain the same  the sames: ");

				if (update.equals("y")) {
					model.setSurname(Prompter.prompt("Enter the updated user's surname: "));
					while (!Character.isUpperCase(model.getSurname().charAt(0))) 
						model.setSurname(Prompter.prompt("PLease enter a valid user's surname starting with capital letter: "));
				}else 
					model.setSurname(UserDAO.getUserByEmail(model.getEmail())[1]);
				
				update = Prompter.prompt("Enter y if want to update surname or anything else if you want surname to remain the same  the sames: ");
				
				if (update.equals("y")) {
					model.setDoD(Prompter.prompt("Enter the updated user's date of birth: "));
					while (!DateValidator.isValid(model.getDoD())) 
						model.setDoD(Prompter.prompt("Please enter a valid user's date of birth for : "));
				}else 
					model.setDoD(UserDAO.getUserByEmail(model.getEmail())[3]);*/
				
				
			}	
			else {
				System.out.println("Error there is nothing in database to update and so update can not occur!!");
				break;
			}

		}
	}



	public static void delete() {
		for (; ; ) {
			if(UserDAO.user_db.length > 0 ) {
				System.out.println("************************************************************************************************************");
				System.out.println("					Welcome to  Delete a user																");
				System.out.println("************************************************************************************************************");
				Get_and_Set model = new Get_and_Set();
				model.setEmail(Prompter.prompt("Enter the user's email of the user you would to delete: "));
				while (!emaiValidator.validate(model.getEmail())) 
					model.setEmail(Prompter.prompt("Please Enter a valid user's email for example name@gmail.com: ")) ;
				printArray("User you would like to delete ", UserDAO.getUserByEmail(model.getEmail()));
				String delete = Prompter.prompt("Enter y if you are sure you want to delete this user or enter any other to go back to main menu: ");
				if (delete.equals("y")) {
					UserDAO.delete(model.getEmail());
					break;
				}
				else 
					break;
			}else {
				System.out.println("Error there is nothing in database an delete can not occur!!");
				break;
			}
			
		}
	}

	public static void DisplayAll() {
		for (; ; ) {
			if (UserDAO.user_db.length > 0) {
				System.out.println("************************************************************************************************************");
				System.out.println("					    List users																			");
				System.out.println("************************************************************************************************************");
				print2DArray("", UserDAO.findAll());
				Get_and_Set model = new Get_and_Set();
				String nextStep = Prompter.prompt("Enter y to go back to main menu or an button to exits this programme: ");
				if (nextStep.equals("y")) 
						break;
				else 
				System.exit(0);
			}else {
				System.out.println("Error there is nothing in database an delete can not occur!!");
				break;
			}
		}	
	}



	/**
	 * 
     * pretty print each element to show the default values
     * @param  string prefix, array of integers **/
    public static void printArray(String prefix, String[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    /**
	 * 
     * pretty print each element to show the default values
     * @param  string prefix, array of integers **/
    public static void print2DArray(String prefix, String[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            System.out.print(". ");
            System.out.println(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}