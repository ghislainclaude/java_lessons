public class TestArr {
	public static void main(String[] args) {
		int x1 = -4;
		int x2 = x1-- / --x1;
		int x3 = ++x2 * x1++ * --x2;
		if (x2-- > x3++) {
			--x3;
		}else {
			x1++;
			x2--;
		}
		System.out.println(x1/x2 *x3);

	}
}