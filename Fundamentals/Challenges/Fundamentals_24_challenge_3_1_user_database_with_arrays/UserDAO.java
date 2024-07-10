public class UserDAO {

	public static String[][] user_db = new String[0][0]; 
	/** This method add the create 1d of the users input data to the 2d array 
	 * @param **/
	public static void create(String name, String surname, String email, String dod, String age ,String id) {
		try {
			// create a new array larger than the initial one so user can add array when the add users 
			String[][] newuser_db = new String[user_db.length +1][6];
			/*// if initial array length is greater than 0
			copy elements for one initial two array to the bigger 2d array*/
			if (user_db.length > 0)  
				for (int row=0; row< user_db.length; row++) {
					for(int col=0; col< user_db[row].length; col++) {
						newuser_db[row][col] = user_db[row][col];
					}
				}
			// Add the new user information to the data abse 
			newuser_db[newuser_db.length -1 ][0] = name;
			newuser_db[newuser_db.length -1 ][1] = surname;
			newuser_db[newuser_db.length -1 ][2] = email;
			newuser_db[newuser_db.length -1 ][3] = dod;
			newuser_db[newuser_db.length -1 ][4] = age;
			newuser_db[newuser_db.length -1 ][5] = id;
			// 
			user_db = newuser_db;
			System.out.println("Hello, " + user_db[newuser_db.length -1 ][0] + " " +user_db[newuser_db.length -1 ][1]
			 +" your details have been saved to the database");
		}catch (Exception e ) { System.out.println(e); }
	}
	/****/
	public static void update(String name, String surname, String email, String dod, String age ,String id) {
		try {
			user_db[FindRow(email)][0] =  name;
			user_db[FindRow(email)][1] =  surname;
			//getUserByEmail(email)[2] =  email;
			user_db[FindRow(email)][3] =  dod;
			/*for (int row = 0; row< user_db.length; row++) {
				for (int col=0; col< user_db[row].length; col++) {
					if (user_db[row][col].equals(getUserByEmail(email)[2]) ) {
						user_db[row] = getUserByEmail(email);
					}
				}
			}*/
		}catch (Exception e) { System.out.println(e); }
	}

	/*public static int FindRow(String email) {
		int found_row =0;
		for (int row = 0; row< user_db.length; row++) {
			for (int col=0; col< user_db[row].length; col++) {
				if (user_db[row][col].equals(email)) {
					found_row = row;
				}
			}
		}
		return found_row;
	} */

	/****/
	public static int FindRow(String email) {
		int pointer_x = -1; // pointer to point at row in the 2d array
		int pointer_y = -1; // pointer to point at the colum in the row
		Outer_loop: for (int row = 0; row< user_db.length; row++) {
			for (int col=0; col< user_db[row].length; col++) {
				// check is email is in the 2d array 
				if (email.equals(user_db[row][col])) {
					pointer_x = row; // give the position of the row where the email is found 
					pointer_y = col;
					break Outer_loop;
				}
			}
		}
		return found_row;
	} 

	/****/
	public static String[] getUserByEmail(String email) {
		String[] user_Details = new String[user_db[0].length];
		try{
			for (int row = 0; row< user_db.length; row++) {
				for (int col=0; col< user_db[row].length; col++) {
					if (email.equals(user_db[row][col])) {
						user_Details = user_db[row];
				}
			}
		}
		}catch (Exception e) { System.out.println(e); }
		finally { return user_Details;}
	}
	/****/ 
	public static void delete(String email) {
		try {
			if (FindRow(email) == -1) {
				System.out.
			}
			String[][] newuser_db = new String[user_db.length -1][user_db[0].length];
			for (int row = 0; row< user_db.length; row++) 
				for (int col=0; col< user_db[row].length; col++) 
					if (FindRow(email) != row ) 
						newuser_db[row] = user_db[row] ;
			user_db = newuser_db;
		}catch (Exception e) { System.out.println(e); }
	}
	/****/
	public static String[] findAll() {
		String[] newuser_db = new String[user_db.length];
		String[] data_fields = {"Name", "Surname", "Email", "DOD", "Age" ,"ID"};
		try {
			int value = 0;
			//newuser_db[value] = "";
			for (int row = 0; row< user_db.length; row++) {
				newuser_db[value] = "";
				for (int col=0; col< user_db[row].length; col++) {
					//newuser_db[col] = "";
					newuser_db[value] +=   data_fields[col]+ ": " + user_db[row][col] + ", ";
					if (col == user_db[row].length -1 )
						value++;
				}
			}
		}catch (Exception e) { System.out.println(e); }
		finally {
			return newuser_db;
		}
		
	}
}