import java.util.*;

public class CharAt {
	public static void main(String[] args) {
		CharSequence charSequence = "Claude";
		char[] charArray = new char[charSequence.length()];
		for (int i=0; i<charSequence.length(); i++)
			charArray[i] = charSequence.charAt(i);
		System.out.println(Arrays.toString(charArray));
		System.out.println(charSequence.subSequence(1, 6));
		String s = charSequence.toString();
		System.out.println(s);
	}
}