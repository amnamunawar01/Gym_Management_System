package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class NewEmpServiceTest {

    @Test
    public void testSaveEmployeeWithValidData() {
        NewEmpService service = new NewEmpService();
        boolean result = service.saveEmployee(
                "Ahmed",
                "03001234567",
                "ahmed@gmail.com",
                "50000"
        );
        assertTrue(result);
    }

    @Test
    public void testSaveEmployeeWithEmptyName() {
        NewEmpService service = new NewEmpService();
        assertFalse(service.saveEmployee("", "03001234567", "ahmed@gmail.com", "50000"));
    }

    @Test
    public void testSaveEmployeeWithEmptyMobile() {
        NewEmpService service = new NewEmpService();
        assertFalse(service.saveEmployee("Ahmed", "", "ahmed@gmail.com", "50000"));
    }

    @Test
    public void testSaveEmployeeWithEmptyEmail() {
        NewEmpService service = new NewEmpService();
        assertFalse(service.saveEmployee("Ahmed", "03001234567", "", "50000"));
    }

    @Test
    public void testSaveEmployeeWithEmptySalary() {
        NewEmpService service = new NewEmpService();
        assertFalse(service.saveEmployee("Ahmed", "03001234567", "ahmed@gmail.com", ""));
    }

    @Test
    public void testResetForm() {
        NewEmpService service = new NewEmpService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        NewEmpService service = new NewEmpService();
        assertTrue(service.closePage());
    }
}
