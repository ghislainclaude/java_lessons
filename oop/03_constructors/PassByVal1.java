public class PassByVal1 {// clas declaration with a public access modifier 
	public static void main(String[] args) {/*main method declaration, static method  JVM basically calls PassByVal1.main() to get the program started */
		int value = 0;// initialize local variable inside the main method
		
		System.out.println("Value = "+value);
		
		PassByVal2 passByVal2 = new PassByVal2();// Initialization/Instantiation of an object of the class PassByVal2 
		
		passByVal2.changeValue(value);// Call an no static class moethod changeValue() from class PassByVal2
		
		System.out.println("Value = "+value);
	}
}
