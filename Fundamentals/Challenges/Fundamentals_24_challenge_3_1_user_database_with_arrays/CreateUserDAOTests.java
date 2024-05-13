import org.junit.*;
import static org.junit.Assert.*;


public class CreateUserDAOTests { 
	@Test 
	public void TestSizeofArray_After_adding() {
		UserDAO user_dao = new UserDAO();
		UserDAO.create("Claude", "Ilunga", "ghislainclauden@gmail.com", "01/04/2000", "0004016350185");
		UserDAO.create("Claude", "Ilunga", "gciilunga@gmail.com", "01/04/2000", "0004016350185");
		assertEquals(2, UserDAO.user_db.length);
	}

	/*@Test 
	public void testUpdate() {
		UserDAO.update("Ghislain", "Ilunga", "ghislainclauden@gmail.com", "01/04/2000", "581");
		assertEquals("Ghislain", UserDAO.user_db[0][0]);
	}

	@Test 
	public void testDelete() {
		UserDAO.delete("ghislainclauden@gmail.com");
		assertEquals(1, UserDAO.user_db.length);
	}

	@Test
	public void testGetUserByEmail() {
		assertEquals("Claude, Ilunga, gciilunga@gmail.com, 01/04/2000, 0004016350185, " , UserDAO.getUserByEmail("gciilunga@gmail.com"));
	}*/

	
}