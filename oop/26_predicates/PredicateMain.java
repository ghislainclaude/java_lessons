import java.util.function.*;
import java.util.stream.*;
import java.util.*; 

public class PredicateMain {
	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("Ghislain-Claude", "Ilunga", 24, Gender.Male, City.Manchester));
		person.add(new Person("Krystelle", "Rupnarain", 22, Gender.Female, City.Liverpool));
		person.add(new Person("Sammatha", "Figueiredo", 21, Gender.Female, City.Manchester));
		person.add(new Person("Tumi", "Maleka", 22, Gender.Female, City.London));
		person.add(new Person("Aaron", "Padirachi", 50, Gender.Male, City.Leiceste));


		Predicate<Person> isFemale = p -> p.getGender().equals(Gender.Female);
		Predicate<Person> date = p -> p.getAge()> 21 || p.getAge() < 22;
		Predicate<Person> twodates = p -> p.getAge()> 21 || p.getAge() < 22;
		Predicate<Person> isLondon = p -> p.getCity().equals(City.London);
		// Combine the predicates using .and()
		//Predicate<Person> combinedPredicate01 = isFemale.or(twodates);
		//Predicate<Person> combinedPredicate02 = isFemale.and(twodates);

		//List females = person.stream().filter(combinedPredicate).collect(Collectors.toList()); 
		List isnotLondon = person.stream().filter(isLondon).collect(Collectors.toList());

    	System.out.println(isnotLondon); 
	}
}