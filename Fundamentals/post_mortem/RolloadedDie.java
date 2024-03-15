public class RolloadedDie{
	public static void main(String[] args) {
		double r = Math.random();

		int roll;
		if (r< 1.8/8.0) roll = 1;
		else if (r< 2.8/8.0) roll = 2;
		else if (r< 3.8/8.0) roll = 3;
		else if (r< 4.8/8.0) roll = 4;
		else if (r< 5.8/8.0) roll = 5;
		else    roll = 6;

		System.out.println(roll);
	}
}