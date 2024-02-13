import java.util.*;

public class StringTest2{
	public static void main(String[] args) {
		// creating an object of Scanner class to use the Scanner methods 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value number");
		// Interger Conversion
		System.out.println(Integer.parseInt(scan.nextLine()));
	}
}

/*class IntergetConversion {
	public int IntergerConverter(String number) {
		return Integer.parseInt(number);
	}
}

class ByteConversion {
	public byte ByteCoverter(String number) {
		return Byte.parseByte(number);
	}
}

class ShortConversion{
	public short ShortConverter(String number) {
		return Short.parseShort(number);
	}
}

class LongConversion {
	public long LongerConverter(String numnber){
		return Long.parseLong(number);
	}
}

class FloatConversion{
	public float floatConverter(String number) {
		return Float.parseFloat(number);
	}
}

class DoubleConversion{
	public double DoubleConverter(String numnber) {
		return Double.parseDouble(number);
	}
}*/