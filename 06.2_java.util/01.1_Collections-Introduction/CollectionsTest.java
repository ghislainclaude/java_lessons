import java.util.*;

public class CollectionsTest<E> implements Collection<E> {



	/*public static void main(String[] args) {

	}
*/
	public boolean add(E o){

            return false;        
        }

       public boolean addAll(Collection c){
        return false; 

        }

       public void clear() {

       }

        public boolean contains(Object o){
          return false;

        }

        public boolean containsAll(Collection o){
          return false;

        }

        public boolean equals(Object c){
          return false; 
        }

        public int hashcode(){
          return 0; 
        }

        public boolean isEmpty(){
          return false; 
        }

        public Iterator iterator(){
          return null;

        }

        public boolean remove(Object o){
          return false; 
        }

        public boolean removeAll(Collection o){
          return false; 
        }

        public boolean retainAll(Collection o){
          return false; 
        }

        public int size(){
          return 1; 
        }

         public Object[] toArray(){
           return null;

         }

         public Object[] toArray(Object[] a){
           return null; 
         }
}