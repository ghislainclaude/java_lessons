/**OOP DeepDive Variables(local, instance, static, parameters)
*
* @author Ghislain-Claude Ilunga
* @version 1.0
* @since 2014-03-31
**/
/**class that implements the interface above and provide implementation for the**/
public class implements01 implements interface01 {

	/**
	 * 	declare and initialize two static variables, i and j, with values 5 and 7 respectively.
	 *	declare and initialize two instance variables, x and y, with values 6 and 8 respectively.
	 *	declare one more final static variable, var1.
	 **/
	static int i = 5;
	static int j=7;
	int x = 6;
	int y = 8;
	static final int var2 = 10;
	static final String var3 = "10";
	static final int var1 = 0;
	// Declare two more instance variables
	int var4;
	int var5;
	// Declare two more static variables
	static int var6;
	static int var7;

	//Use a static initializer
	static {
		var7 = 11;
	}
	// Use an instance initializer
	{
		var4 = 11;
		i++;
		j++;
		x++;
		y++;
		//var2++;
		//var1++;
		var4++;
		var6++;
		var5++;
		var7++;
	}
	// Define a constructor of the class
	public implements01() {
		var5 = 13;
		var6 = 3;
	}

	/**
	 * Define another constructor that takes two args, i and j respectively
	 * tore the result as a double.
	 * Print out the result.
	 * **/
	public implements01(int i, int j) {
		double result_ex = (i + j- this.var6 + 4.0)+ this.var7;
		System.out.println(result_ex);
	}

	public implements01(int a, int b, int c) {
		this(a, b);
		double result_ex = (a - b + this.var6+c)- this.var7;
		System.out.println(result_ex);
	}

	/**parsing the variable Input into an integer and storing it into an appropriate variable type.**/
	public void converter(String input) throws NumberFormatException {
		int num_input = Integer.parseInt(input);
		System.out.println("User input [" + num_input + "]");
	}

	public void doIt() {
		int a = 2;
		System.out.println(this.doIt(this.x, this.y, a));
	}

	public int doIt(int i, int j, int x) {
		int a = 4, b = 1;
		System.out.println(implements01.doIt(i, j, a, b));
		return (i + j - x) / a * var2;
	}

	public static int doIt(int i, int j, int x, int y) {
		int a = 3;
		return (i + j * x) / a * var2;
	}

	public static void main(String[] args) {
		implements01 imp = new implements01();
		imp.doIt();
		implements01 imp1 = new implements01();
		imp1.converter(var3);
		new implements01(j, var6, var7);
	}
}