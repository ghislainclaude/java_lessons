import java.util.function.*;

public class Predicate01 {
	public static void main(String[] args) {
		Predicate<String> isA = new Predicate<String>(){
			@Override
			public boolean test(String t) {
				return t.contains("a");
			}
		};
		Predicate<String> checkisA = p -> p.length() > 2;
		String word = "Claude";
		boolean result = isA.or(word).test(word);
		System.out.println(result);
	}
}