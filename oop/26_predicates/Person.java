public class Person {
	private String name;
	private String surname;
	private int age;
	private Gender gender;
	private City city;

	public Person(String name, String surname, int age, Gender gender, City city) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.city = city;
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

 	public void setAge(int age) {
 		this.age = age;
 	}

 	public int getAge() {
 		return age;
 	}

 	public void setGender(Gender gender) {
 		this.gender = gender;
 	} 

 	public Gender getGender() {
 		return gender;
 	}

 	public void setCity(City City) {
 		this.gender = gender;
 	}

 	public City getCity() {
 		return  city;
 	}

 	public String toString() { 
    return "Name : " + getName() + ", Surname :" + getSurname() + ", Age: " + getAge() +
     ", Gender: " + getGender() + ", City: " + getCity() + "\n"; 
    } 

}
