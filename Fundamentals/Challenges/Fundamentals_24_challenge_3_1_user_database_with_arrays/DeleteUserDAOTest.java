import org.junit.*;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DeleteUserDAOTest {

	@ParameterizedTest
	@CsvSource({
		"ghislainclauden@gmail.com"
	})
	public void testDelete(String email ) {
		UserDAO.delete(email);
		assertEquals(1, UserDAO.user_db.length);
	}
}