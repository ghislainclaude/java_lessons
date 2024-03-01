import java.util.*;

public class Exercise5Main{
	public static void main(String[] args) {
		boolean isNameValid = false, isSurnameValid = false, isGradeValid = false;
		String name = null, surname = null, grade = null;
		String block = null;
		// Prompt the user with a question and captures the user input
		while (!isNameValid) {
			name = Prompter.prompt("Please enter name: ");
			if (PromptValidation.validate(name)) {
				isNameValid = true;
			}else {
				System.out.println("Error! Please enter valid name");
			}
		}

		while (!isSurnameValid) {
			surname = Prompter.prompt("Please enter surname: ");
			if (PromptValidation.validate(surname)) {
				isSurnameValid = true;
			}else {
				System.out.println("Error! Please enter valid surname");
			}
		}

		while (!isGradeValid) {
			grade = Prompter.prompt("Please enter your grade: ");
			if (GradeValidation.validation(grade)) {
				if (BlockPlacement.placement(grade)) {
					block = "High school Block A";
				}else {
					block = "Primary school block B";
				}
				Printer.print(name, surname, grade, block ,
					RandomTeacherAssignment.teacherAssignement(grade), PhysicalEducationTearcher.teacherAssignement(grade));
				isGradeValid = true;
			}else {
				System.out.println("Error! The grade is out of range!");
			}
		}
	
	}
}