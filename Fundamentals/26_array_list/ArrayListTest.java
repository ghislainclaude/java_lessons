import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> veglist = new ArrayList<>();
        ArrayList<String> testlist = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("pine-apple");

        veglist.add("tomato");
        veglist.add("cucumber");
        veglist.add( "potato");

        {list.addAll(veglist);}
        
        Iterator<String> iterator = list.iterator();
        //System.out.println(list.containsAll(veglist));
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }

        Object[] array  = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
