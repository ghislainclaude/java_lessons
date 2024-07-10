import java.util.function.*;

public class Predicate02 {
	public static void main(String[] args) {
		Predicate<String> lengthOf10 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 0;
			}
		};


		Predicate<String> ContainsLetterA = p -> p.contains("a");
		String word = "Hello Claude";
		boolean result = ContainsLetterA.and(lengthOf10).test(word);
		System.out.println(result);
	}
}