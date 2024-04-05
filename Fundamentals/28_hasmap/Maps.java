import java.util.*;

public class Maps {
	public static void main(String[] agrs) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, "Gojo Satoru");
		//System.out.println(map);
		System.out.println(map.constainsKey(null));
	}
}