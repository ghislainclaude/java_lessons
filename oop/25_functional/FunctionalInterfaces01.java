import java.util.function.*;

public class FunctionalInterfaces01 {
	public static void main(String[] args) {
		//Supplier<String> stringSupplier = () -> "I am Supplier";
		//Supplier<Integer> integerSupplier  = () -> 100;
		//Supplier<Integer> inPrimitiveSupplier   = () -> 47;
		/*Consumer<Integer> intPrimitiveConsumer  = new Consumer<Integer>() {
			@Override 
			public void accept(Integer t) {
				System.out.println(t);
			}
		};*/
		//System.out.println(inPrimitiveSupplier.get());
		/*intPrimitiveConsumer.accept(94);*/
		String str2 = "blue";
		Predicate<String> stringColorTester = new Predicate<String>() {
			p

			@Override
			public boolean test(String str1) {
				return  str1.equals(str2);
			}
			
		};
		//System.out.println(stringColorTester.test("brown"));
		System.out.println(stringColorTester.lengthFinderFunction("FunctionLength"));
	}
}