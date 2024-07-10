package package1;
/**Declare a class**/
public class Parent {
	/**declare a protected static method that does not return anything**/
	protected static void family(){
		System.out.println("I am a parent.");
	}
	/**declare another static void method that does not return anything**/
	public static void myMethod1() {
		System.out.println("I belong here.");
	}

	public Parent(String name, String surname) throws NumberFormatException {
		System.out.println("I am a Parent constructor");
	}

}