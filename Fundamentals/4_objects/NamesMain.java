public class NamesMain{
	public static void main(String[] args) {
		NamePrinter namePrinter = new NamePrinter();
		SurnamePrinter surnamePrinter = new SurnamePrinter();

		namePrinter.print();
		surnamePrinter.print();
	}
}

class NamePrinter{
	public void print() {
		System.out.println("My name is Ghislain-Claude");
	}
}

class SurnamePrinter{
	public void print() {
		System.out.println("My surname is Ilunga");
	}
}

<resource>
	<string 
		name="name">Claude</String>
</resource