import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.*;

public class Person {
	private Date dateOfBirth;
	private String name;
	private String surname;
	private int age;

	public Person(Date dateOfBirth, String name, String surname) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.surname = surname;
		// Get the todays date 
		LocalDate date_of_birth = LocalDate.of(dateOfBirth);
		LocalDate currentDate = LocalDate.now();
		// get the difference in time between the two dates
		Period period = Period.between(date_of_birth, currentDate);
		// age should be computed in the constructor from date of birth
		age = (int)(period.getYears());
	}

	/*@Override
	public int hashCode() {
		return (int) age.hashCode();
	}
*/
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}
}