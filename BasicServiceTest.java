package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicServiceTest {

    @Test
    public void testEmployeeButton() {
        BasicService service = new BasicService();
        String result = service.openEmployee();
        assertEquals("EMPLOYEE_PAGE", result);
    }

    @Test
    public void testMemberButton() {
        BasicService service = new BasicService();
        String result = service.openMember();
        assertEquals("MEMBER_PAGE", result);
    }
}
