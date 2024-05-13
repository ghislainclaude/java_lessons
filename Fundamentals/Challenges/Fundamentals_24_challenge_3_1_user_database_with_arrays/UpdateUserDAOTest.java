import org.junit.*;
import static org.junit.Assert.*;


public class UpdateUserDAOTest {

	@Test 
	public void TestUpdateUserData() {
		UserDAO.create("Claude", "Ilunga", "ghislainclauden@gmail.com", "01/04/2000", "24" ,"0004016350185");
		UserDAO.create("Claude", "Ilunga", "gciilunga@gmail.com", "01/04/2000", "25" ,"0004016350185");
		UserDAO.update("Ghislain", "Ilunga", "gciilunga@gmail.com", "01/04/2000", "581");
		assertEquals("Ghislain", UserDAO.user_db[0][0]);
	}

}