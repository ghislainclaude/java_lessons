import java.util.*;

public class StringTest2{
	public static void main(String[] args) {
		// creating an object of Scanner class to use the Scanner methods 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value number");
		// Interger Conversion
		String userInput1 = scan.nextLine();
		System.out.println("Here is the number converted into a string: "+ IntergetConversion.IntergerConverter(userInput1));
		// Byte Conversion 
		System.out.println("PLease enter a number between -127 to 128");
		String userIput2 = scan.nextLine();
		System.out.println("Here is the converted string into Byte: " + ByteConversion.ByteCoverter(userIput2));
		/// Short conversion
		System.out.println("Please a enter a short numnber ");
		String userInput3 = scan.nextLine();
		System.out.println("Here is the converted string into short number: " + ShortConversion.ShortConverter(userInput3));
		// Long Coverstion
		System.out.println("Please enter a long number ");
		String userInput4 = scan.nextLine();
		System.out.println("Here is the converted string in Long number: " + LongConversion.LongerConverter(userInput4));
		// FLoat Conversion 
		System.out.println("Please enter a float number");
		String userInput5 = scan.nextLine();
		System.out.println("Here is the converted string into float" + FloatConversion.floatConverter(userInput5));
		// Double Conversion
		System.out.println("Please enter a double number");
		String userInput6 = scan.nextLine();
		System.out.println("Here is the converted Double" + DoubleConversion.DoubleConverter(userInput6));
		// Boolean Coversion 
		System.out.println("Please enter True or False to this question: Are you 6 feet tall");
		String userInput7 = scan.nextLine();
		System.out.println("Here is the string answer converted into a boolean " + BooleanConversion.BooleanConverter(userInput7));
	}
}

class IntergetConversion {
	public static int IntergerConverter(String userInput) {
		return Integer.parseInt(userInput);
	}
}

class ByteConversion {
	public static byte ByteCoverter(String userInput) {
		return Byte.parseByte(userInput);
	}
}

class ShortConversion{
	public static short ShortConverter(String userInput) {
		return Short.parseShort(userInput);
	}
}

class LongConversion {
	public static long LongerConverter(String userInput){
		return Long.parseLong(userInput);
	}
}

class FloatConversion{
	public static float floatConverter(String userInput) {
		return Float.parseFloat(userInput);
	}
}

class DoubleConversion{
	public static double DoubleConverter(String userInput) {
		return Double.parseDouble(userInput);
	}
}

class BooleanConversion {
	public static Boolean BooleanConverter(String userInput) {
		return Boolean.parseBoolean(userInput);
	}
}