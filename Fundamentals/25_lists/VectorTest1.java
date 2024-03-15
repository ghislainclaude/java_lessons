import java.util.ArrayList;
import java.util.*;

public class VectorTest1 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> surnameList = new ArrayList<>();
		ArrayList<String> controlName = new ArrayList<>();

		nameList .add("Krystelle");
		nameList.add ("Aaron");
		nameList.add("Claude");;;;;;;
		;

		surnameList.add("Rupnarain");
		surnameList.add("Padiachy");
		surnameList.add("Ilunga");

		//controlName.add("Command");
		//controlName.add("Quality");
		//list.clear();
		//System.out.println(list.size());
		System.out.println(controlName.contains (null));
		{nameList.addAll(surnameList);}

		//Iterator<String> newnames = nameList.iterator();

/*		while(newnames.hasNext()) {
			Object element = newnames.next();
			System.out.println(element + ", ");
		}*/
		Object[] namesArray = nameList.toArray();
		//namesArray = ;
		System.out.println(Arrays.toString(namesArray));
	}
}