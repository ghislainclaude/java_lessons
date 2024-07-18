/*An exception is throw n at runtime because
d in the format string is used for integer not for float*/

public class Question9 {
	public static void main(String[] args) {
		int x = 1234566789;
		int y = 987654321;
		float z= 7;
		System.out.format("-%5d", x);// this statement is fine because 
		/* %d is used for formatting integers */
		System.out.printf("-%5d", y);
		/* %d same thing here, that is used for formatting integer */
		System.out.printf("-%4.1d", z);
		/* %d is only for integers, since you are dealing with a float 
		you need to use %f*/
	}
}