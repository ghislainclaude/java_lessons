package package2;
/**  import package1 in your class.**/
import package1.Parent;
/**Create a class Child**/
public class Child extends Parent {
	/**Declare a protected static method that do not return anything**/
	protected static void child() {
		/**it should try to access the method: myMethod1() of the Parent class.**/
		family();
	}
	/**Declare another static method that do not return anything**/
	public static void myMethod2() {
		/**try to access the method: family() of the extending class**/
		myMethod1();
	}
}