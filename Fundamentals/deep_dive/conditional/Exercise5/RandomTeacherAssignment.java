import java.util.HashMap;
import java.util.*;

public class RandomTeacherAssignment {
	// HashMap<String, Integer> gradeMap = new HashMap<String, Integer>();
	public static String teacherAssignement(String grade) {
		String teacher = "";
		final int conGrade = Integer.parseInt(grade);
		int rm = 0;
		String[] seniorHighTeacher = new String[]{"Mr Gojo", "Mr Geto", "Mr Nanami",
										"Mr Masamichi", "Mr Kusakabe", "Mrs Leiri",
										"Mr Haibara"};
		String[] juniorHighTeacher = new String[]{"Mrs Zenin", "Mr Muta", "Mrs Miwa",
										"Mr Kamo", "Mr Todo", "Mr Nishimiya"};

		String[] seniorPrimaryTeacher = new String[]{"Mr Itadori", "Mr Fushiguro", "Mrs Kugisaki",
										"Mrs Zenin", "Mr Inumaki", "Mr Panda", "Mr Okkotsu"};


		String[] juniorPrimaryTeacher = new String[]{"Mr Sukuna", "Mrs Kurusu", "Mrs Iori", "Mrs Nitta", "Mrs Mei",
										"Mrs Tsukuma", "Mrs Tengen"};

		switch (conGrade) {
			case 1: 
				rm = new Random().nextInt(juniorPrimaryTeacher.length);
				teacher = juniorPrimaryTeacher[rm];
			break;
			case 2:
				rm = new Random().nextInt(juniorPrimaryTeacher.length);
				teacher = juniorPrimaryTeacher[rm];
			break;
			case 3:
				rm = new Random().nextInt(juniorPrimaryTeacher.length);
				teacher = juniorPrimaryTeacher[rm];
			break;
			case 4:
				rm = new Random().nextInt(seniorPrimaryTeacher.length);
				teacher = seniorPrimaryTeacher[rm];
			break;
			case 5:
				rm = new Random().nextInt(seniorPrimaryTeacher.length);
				teacher = seniorPrimaryTeacher[rm];
			break;
			case 6:
				rm = new Random().nextInt(seniorPrimaryTeacher.length);
				teacher = seniorPrimaryTeacher[rm];
			break;
			case 7:
				rm = new Random().nextInt(seniorPrimaryTeacher.length);
				teacher = seniorPrimaryTeacher[rm];
			break;
			case 8:
				rm = new Random().nextInt(juniorHighTeacher.length);
				teacher = juniorHighTeacher[rm];
			break;
			case 9:
				rm = new Random().nextInt(juniorHighTeacher.length);
				teacher = juniorHighTeacher[rm];
			break;
			case 10:
				rm = new Random().nextInt(seniorHighTeacher.length);
				teacher = seniorHighTeacher[rm];
			break;
			case 11:
				rm = new Random().nextInt(seniorHighTeacher.length);
				teacher = seniorHighTeacher[rm];
			break;
			case 12:
				rm = new Random().nextInt(seniorHighTeacher.length);
				teacher = seniorHighTeacher[rm];
			break;
			default :
				teacher = "No teacher is avaiable ";
		}
		return teacher;
	}
}