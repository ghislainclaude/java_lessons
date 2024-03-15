import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> veglist = new ArrayList<>();
        ArrayList<String> testlist = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("pine-apple");

        addinglists: {list.addAll(veglist);}

        veglist.add("tomato");
        veglist.add("cucumber");
        veglist.add(    "potato");

        addinglists;
        
        System.out.println(list);
    }
}
