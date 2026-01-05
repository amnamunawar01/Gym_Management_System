package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService service = new LoginService();
        assertTrue(service.login("Admin", "admin"));
    }

    @Test
    public void testInvalidPassword() {
        LoginService service = new LoginService();
        assertFalse(service.login("Admin", "wrong"));
    }

    @Test
    public void testEmptyInputs() {
        LoginService service = new LoginService();
        assertFalse(service.login("", ""));
    }

    @Test
    public void testNullInputs() {
        LoginService service = new LoginService();
        assertFalse(service.login(null, null));
    }
}
