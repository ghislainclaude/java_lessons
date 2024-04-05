import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap();
		
		hashMap.put("France", "City");
		hashMap.put("Enggland", "London");
		hashMap.put("Belgium", "Brussels");
		hashMap.put("Congo", "Kingacasa");
		hashMap.put("Germany", "Berlin");
		hashMap.put("Japan", "Tokoyo");
		hashMap.put("Spain", "Madrid");

		Set<String> keySet = hashMap.keySet();	
		// create an Iterator object for keys 
		Iterator itr = keySet.iterator();
		// create an Iterator object for values
		Collection<String> values = hashMap.values();
		Iterator itrValues = values.iterator();
		/*while (itrValues.hasNext()) {
			System.out.println(itrValues.next() + " "+ itr.next());
		}*/	

		System.out.println("\n");
		for (String city : values) {
			System.out.println(city);
		}
	}	
}
