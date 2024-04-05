import java.util.*;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hasMap = new HashMap<>();
		hasMap.put( 2000,"CLaude Ilunga");
		hasMap.put( 2001,"Tumi Maleka");
		hasMap.put( 2002,"Krystelle Rupnarain");
		hasMap.put( 2003,"Abel Ilunga");
		System.out.println("The intial hash map: "+hasMap);
		//hasMap.clear();
		System.out.println("The following value Claude Ilunga is in hash map: " + hasMap.containsValue("CLaude Ilunga") );
	}
}