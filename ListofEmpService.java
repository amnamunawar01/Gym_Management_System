package gym;

import java.util.ArrayList;
import java.util.List;

public class ListofEmpService {

    // Simulated employee list (as if coming from DB)
    public List<String[]> getEmployeeList() {
        List<String[]> employees = new ArrayList<>();

        employees.add(new String[]{
            "1", "Ahmed", "03001234567", "ahmed@gmail.com",
            "Male", "25", "Lahore", "14-12-2025",
            "Trainer", "50000", "Fit"
        });

        employees.add(new String[]{
            "2", "Ali", "03009876543", "ali@gmail.com",
            "Male", "28", "Islamabad", "10-12-2025",
            "Manager", "60000", "None"
        });

        return employees;
    }

    // Close page
    public boolean closePage() {
        return true;
    }
}
