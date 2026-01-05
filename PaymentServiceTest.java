package gym;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentServiceTest {

    @Test
    public void testSearchMemberNotNull() {
        PaymentService service = new PaymentService();
        String[] data = service.searchMember("M001");

        assertNotNull(data);
    }

    @Test
    public void testPaymentDataStructure() {
        PaymentService service = new PaymentService();
        String[] data = service.searchMember("M001");

        // ID, Date, Name, Mobile, Email, Payment
        assertEquals(6, data.length);
    }

    @Test
    public void testMemberName() {
        PaymentService service = new PaymentService();
        String[] data = service.searchMember("M001");

        assertEquals("Ahmed Khan", data[2]);
    }

    @Test
    public void testPaymentTable() {
        PaymentService service = new PaymentService();
        List<String[]> table = service.getPaymentTable();

        assertNotNull(table);
        assertTrue(table.size() > 0);
        assertEquals(2, table.get(0).length); // Month, Amount
    }

    @Test
    public void testSavePayment() {
        PaymentService service = new PaymentService();

        String[] paymentData = {
            "M001", "2025-12-21", "Ahmed Khan",
            "03001234567", "ahmed@gmail.com", "5000"
        };

        assertTrue(service.savePayment(paymentData));
    }

    @Test
    public void testResetForm() {
        PaymentService service = new PaymentService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        PaymentService service = new PaymentService();
        assertTrue(service.closePage());
    }
}
