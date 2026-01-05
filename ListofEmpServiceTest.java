package gym;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListofEmpServiceTest {

    @Test
    public void testEmployeeListNotEmpty() {
        ListofEmpService service = new ListofEmpService();
        List<String[]> employees = service.getEmployeeList();
        assertNotNull(employees);
        assertTrue(employees.size() > 0);
    }

    @Test
    public void testEmployeeDataStructure() {
        ListofEmpService service = new ListofEmpService();
        List<String[]> employees = service.getEmployeeList();

        // Each employee should have 11 fields
        assertEquals(11, employees.get(0).length);
    }

    @Test
    public void testEmployeeName() {
        ListofEmpService service = new ListofEmpService();
        List<String[]> employees = service.getEmployeeList();

        assertEquals("Ahmed", employees.get(0)[1]);
    }

    @Test
    public void testClosePage() {
        ListofEmpService service = new ListofEmpService();
        assertTrue(service.closePage());
    }
}
