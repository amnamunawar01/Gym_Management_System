package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class NewMemberServiceTest {

    @Test
    public void testSaveMemberWithValidData() {
        NewMemberService service = new NewMemberService();
        boolean result = service.saveMember("Ali", "03001234567", "ali@gmail.com");
        assertTrue(result);
    }

    @Test
    public void testSaveMemberWithEmptyName() {
        NewMemberService service = new NewMemberService();
        boolean result = service.saveMember("", "03001234567", "ali@gmail.com");
        assertFalse(result);
    }

    @Test
    public void testSaveMemberWithEmptyMobile() {
        NewMemberService service = new NewMemberService();
        boolean result = service.saveMember("Ali", "", "ali@gmail.com");
        assertFalse(result);
    }

    @Test
    public void testSaveMemberWithEmptyEmail() {
        NewMemberService service = new NewMemberService();
        boolean result = service.saveMember("Ali", "03001234567", "");
        assertFalse(result);
    }

    @Test
    public void testResetForm() {
        NewMemberService service = new NewMemberService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        NewMemberService service = new NewMemberService();
        assertTrue(service.closePage());
    }
}
