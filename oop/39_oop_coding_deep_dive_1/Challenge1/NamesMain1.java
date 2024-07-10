/**
* <h1>Hello, World!</h1>
* Make NamesMain1 call each of the getters and return the value and assign it to a variable.
* <p>
* 	Make NamesMain1
*	print a custom greeting e.g. Hello John Smith
*	Print your age e.g you are 100 years old
*
*
*
* @author Ghislain-Claude Ilunga 
* @version 11.0.16.1
* @since 2014-03-31
* @see NameGetter1#getName()
* @deprecated Do not use this class use {@link NameGetter1} instead
***/
@Deprecated
public class NamesMain1 {
	public static void main(String[] args) {
		// assign the value to the static instance 
		NameGetter1.name = "John";
		SurnameGetter1.surname = "Smith";
		AgeGetter1.age = 100;

		String name = NameGetter1.getName();
		String surname = SurnameGetter1.getSurname();
		int age = AgeGetter1.getAge();

		System.out.println("Hello"+ " "+name + " " + surname );
		System.out.print("you are " + age + " year old" );


	}
}