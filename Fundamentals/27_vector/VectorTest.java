import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Vector<String> vs = new Vector<>();
        v.add("banana");
        v.add("apple");
        v.add("pine apple");
        v.add("strawberry");
        vs.add("mango");
        vs.add("watermelon");
        vs.add("figs"); 
        v.addAll(vs);
        //System.out.println("This element is form the vector below, " + v.get(3) );
        //System.out.println(v.containsAll(vs));
        /*Iterator<String> iterator = v.iterator();
        //System.out.println(list.containsAll(veglist));
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }*/

        Object[] array  = v.toArray();
        System.out.println(Arrays.toString(array));
    }
}
