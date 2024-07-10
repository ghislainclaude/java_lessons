import java.util.*;

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
* @see NameGetter2#getName()
* @deprecated Do not use this class use {@link NameGetter2} instead
***/
@Deprecated
public class NamesMain3 {
	public static void main(String[] args) {
		String name = "";
		String surname = "";
		int age = 0;
		// instantiated object of classes 
		NameGetter2 nameGetter2 = new NameGetter2();
		SurnameGetter2 surnameGetter2 = new SurnameGetter2();
		AgeGetter2 ageGetter2 = new AgeGetter2();
		Scanner scan = new Scanner(System.in);
		// assign the value to the static instance 
		System.out.print("Please enter your name ");
		nameGetter2.setName(scan.nextLine());
		System.
		surnameGetter2.setSurname("Smith");
		ageGetter2.setAge(100);

		name = nameGetter2.getName();
		surname = surnameGetter2.getSurname();
		age = ageGetter2.getAge();

		System.out.println("Hello"+ " "+name + " " + surname );
		System.out.print("you are " + age + " year old" );


	}
}