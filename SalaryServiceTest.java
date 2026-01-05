package gym;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class SalaryServiceTest {

    @Test
    public void testSalaryDetailsNotNull() {
        SalaryService service = new SalaryService();
        String[] data = service.getEmployeeSalaryDetails("E001");

        assertNotNull(data);
    }

    @Test
    public void testSalaryDetailsStructure() {
        SalaryService service = new SalaryService();
        String[] data = service.getEmployeeSalaryDetails("E001");

        // ID, Date, Name, Email, Salary
        assertEquals(5, data.length);
    }

    @Test
    public void testEmployeeName() {
        SalaryService service = new SalaryService();
        String[] data = service.getEmployeeSalaryDetails("E001");

        assertEquals("Ahmed Khan", data[2]);
    }

    @Test
    public void testMonthlySalaryTable() {
        SalaryService service = new SalaryService();
        List<String[]> tableData = service.getMonthlySalaryData();

        assertNotNull(tableData);
        assertTrue(tableData.size() > 0);
        assertEquals(2, tableData.get(0).length); // Month, Amount
    }

    @Test
    public void testSaveSalary() {
        SalaryService service = new SalaryService();
        assertTrue(service.saveSalary());
    }

    @Test
    public void testResetForm() {
        SalaryService service = new SalaryService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        SalaryService service = new SalaryService();
        assertTrue(service.closePage());
    }
}
