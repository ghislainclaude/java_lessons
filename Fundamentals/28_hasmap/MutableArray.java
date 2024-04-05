import java.util.*;

public class MutableArray {
	public static void main(String... args) {
		// A mutable object can be changed after it's created
		int[] array = new int[7];
		// Since I am able to change the values inside the array after it has been create 
		array.add(9);
		array.add(0);
		System.out.println(Arrays.toString(array));
	}
}
