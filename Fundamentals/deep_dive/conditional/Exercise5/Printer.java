public class Printer {
	public static void print(String name, String surname, String grade, String block ,String teacher, String physicalTeacher) {
		//Print header and personal information
		System.out.println("\n======================================================================================");
		System.out.println("Hello, " + name + " " + surname );
		System.out.println("======================================================================================");
		System.out.println("Your in " + block );
		// Print class teacher
		System.out.println("======================================================================================");
		System.out.println("Your class teacher is " + teacher );
		System.out.println("======================================================================================");
		// Print the physical education teacher
		System.out.println("======================================================================================");
		System.out.println("Your physical education teacher is " + physicalTeacher );
		System.out.println("======================================================================================");
	}
}