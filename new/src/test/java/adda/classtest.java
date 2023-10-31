package adda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class classtest{
	@Test
	public void testAuthenticateWithValidCrendentials() {
		class1 app = new class1();
		assertTrue(app.authenticate("ram", "3025"));
	}
	@Test
	public void testAuthenticateWithInValidCrendentials() {
		class1 app = new class1();
		assertTrue(app.authenticate("ram", "wrong"));
	}
	@Test
	public void testAuthenticateWithNonExistUser() {
		class1 app = new class1();
		assertTrue(app.authenticate("nonexistentuser", "3014"));
	}
}