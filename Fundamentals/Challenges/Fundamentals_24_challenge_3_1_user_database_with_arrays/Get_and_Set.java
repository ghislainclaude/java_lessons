import java.io.*;

public class Get_and_Set {
	private String name;
	private String surname;
	private String email;
	private String dod;


	public String getName() { return name;}
	public void setName(String _name ) { this.name = _name; }


	public String getSurname() { return surname; }
	public void setSurname(String _surname ) { this.surname = _surname; }


	public String getEmail() { return email;}
	public void setEmail(String _email ) { this.email = _email; }


	/*public String getName() { return name;}
	public void setName(String _name ) { this.name = _name; }*/


	public String getDoD() { return dod; }
	public void setDoD(String _dod) { this.dod = _dod; }
}