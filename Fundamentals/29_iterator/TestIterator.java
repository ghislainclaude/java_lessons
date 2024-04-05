import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class TestIterator {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		
		hashMap.put("France", "City");
		hashMap.put("Enggland", "London");
		hashMap.put("Belgium", "Brussels");
		hashMap.put("Congo", "Kingacasa");
		hashMap.put("Germany", "Berlin");
		hashMap.put("Japan", "Tokoyo");
		hashMap.put("Spain", "Madrid");

		Set keySet = hashMap.keySet();	
		// create an Iterator object for keys 
		Iterator itr = keySet.iterator();
		// create an Iterator object for values
		Collection values = hashMap.values();
		Iterator itrValues = values.iterator();
		while (itrValues.hasNext()) {
			System.out.println(itrValues.next() + " "+ itr.next());
		}	
	}	
}