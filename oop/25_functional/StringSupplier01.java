import java.util.function.*;

public class StringSupplier01 {
	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> "I am Supplier";
		System.out.println(stringSupplier.get());
	}
}