import java.util.Random;


public class PhysicalEducationTearcher {
	// HashMap<String, Integer> gradeMap = new HashMap<String, Integer>();
	public static String teacherAssignement(String grade) {
		String teacher = "";
		//final int conGrade = Integer.parseInt(grade);
		String[] HighseniorPhysicalEducationTearcher = new String[]{"Mr Gyomie", "Mr Uzui"};
		String[] HighjuniorPhysicalEducationTearcher = new String[]{"Mr Rengoku", "Mr Giyu"};

		String[] PrimaryseniorPhysicalEducationTearcher = new String[]{"Mr Kanroji", "Mr Tokito"};
		String[] PrimaryjuniorPhysicalEducationTearcher = new String[]{"Mrs Shinobu", "Mitsuri"};

		if (Integer.parseInt(grade) > 0 && Integer.parseInt(grade) <= 3) {
			int random = new Random().nextInt(PrimaryjuniorPhysicalEducationTearcher.length);
			teacher = PrimaryjuniorPhysicalEducationTearcher[random];
		}else if (Integer.parseInt(grade) >= 4 && Integer.parseInt(grade) <= 7) {
			int random = new Random().nextInt(PrimaryseniorPhysicalEducationTearcher.length);
			teacher = PrimaryseniorPhysicalEducationTearcher[random];
		}else if (Integer.parseInt(grade) > 7 && Integer.parseInt(grade) < 10) {
			int random = new Random().nextInt(HighjuniorPhysicalEducationTearcher.length);
			teacher = HighjuniorPhysicalEducationTearcher[random];
		}else if (Integer.parseInt(grade) >= 10 && Integer.parseInt(grade) <= 20) {
			int random = new Random().nextInt(HighseniorPhysicalEducationTearcher.length);
			teacher = HighseniorPhysicalEducationTearcher[random];
		}
		return teacher;
	}
}