public class Nested1Main {
	public static void main(String[] args) {
		Nested1 inner = new Nested1();
		Nested1.Inner nestedInner = inner.new Inner();
	}
}
