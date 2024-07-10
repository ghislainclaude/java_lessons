import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class LambdaSortMain {
   public static void main(String[] args) {
       List<Person> person =new ArrayList<Person>();
       person.add(new Person(new Date(2000, 4, 1), "Claue", "Ilunga"));
       person.add(new Person(new Date(2002, 10, 14), "Krystelle", "Rupnarain"));
       person.add(new Person(new Date(2002, 11, 11), "Sammatha", "Figueiredo"));
       person.add(new Person(new Date(1998, 12, 22), "Aaron", "Padirachi"));
       person.add(new Person(new Date(2002, 5,  14), "Tumi", "Maleka"));

       //person.sort((a, b) -> a.hashCode()-b.hashCode());
       Collections.sort(person, (a, b) -> {
            return a.getAge()- b.getAge();
       });
       for (Person p : person)
        System.out.println("Date of Birth: "+p.getDateOfBirth() + ", Age: " + 
            p.getAge() + ", Name: " + p.getName() + ", Surname: " + p.getSurname());
   }
}
