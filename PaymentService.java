package gym;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    // Search member by ID
    public String[] searchMember(String id) {
        return new String[]{
            "M001",                 // ID
            "2025-12-21",           // Date
            "Ahmed Khan",           // Name
            "03001234567",          // Mobile Number
            "ahmed@gmail.com",      // Email
            "5000"                  // Payment
        };
    }

    // Table data: Month & Amount
    public List<String[]> getPaymentTable() {
        List<String[]> payments = new ArrayList<>();

        payments.add(new String[]{"January", "5000"});
        payments.add(new String[]{"February", "5000"});

        return payments;
    }

    // Save payment
    public boolean savePayment(String[] paymentData) {
        return true;
    }

    // Reset form
    public boolean resetForm() {
        return true;
    }

    // Close page (cross button)
    public boolean closePage() {
        return true;
    }
}
