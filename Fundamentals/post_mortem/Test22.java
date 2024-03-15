public class Test22{
	public  static strictfp main (String... args) {
		float x = 10;
		double y = x++ * x;
		int z = ++y + x;
		System.out.println(x + " "+  y+ " "z);
	}
}