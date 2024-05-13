import org.junit.*; 
import static org.junit.Assert.*;

public class GetUserByEmailDAOTest {
	
	@Test
	public void testGetUserByEmail() {
		UserDAO.create("Claude", "Ilunga", "ghislainclauden@gmail.com", "01/04/2000", "0004016350185");
		UserDAO.create("Ghislain", "Ilunga", "gciilunga@gmail.com", "01/04/2000", "0004016350185");
		assertEquals( "Tumi", UserDAO.getUserByEmail("gciilunga@gmail.com")[0]);
	}
}