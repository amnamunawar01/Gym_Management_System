package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class UpdateAndDeleteEmpServiceTest {

    @Test
    public void testSearchEmployeeNotNull() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        String[] emp = service.searchEmployee("E001");

        assertNotNull(emp);
    }

    @Test
    public void testEmployeeDataStructure() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        String[] emp = service.searchEmployee("E001");

        // Employee should have 11 fields
        assertEquals(11, emp.length);
    }

    @Test
    public void testEmployeeName() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        String[] emp = service.searchEmployee("E001");

        assertEquals("Ahmed Khan", emp[1]);
    }

    @Test
    public void testUpdateEmployee() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();

        String[] updatedData = {
            "E001", "Ahmed Khan", "03001234567", "ahmed@gmail.com",
            "Male", "26", "Lahore", "2025-01-01",
            "Trainer", "55000", "Fit"
        };

        assertTrue(service.updateEmployee(updatedData));
    }

    @Test
    public void testDeleteEmployee() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        assertTrue(service.deleteEmployee("E001"));
    }

    @Test
    public void testResetForm() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        UpdateAndDeleteEmpService service = new UpdateAndDeleteEmpService();
        assertTrue(service.closePage());
    }
}
