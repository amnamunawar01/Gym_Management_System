package gym;

import java.util.ArrayList;
import java.util.List;

public class SalaryService {

    // Simulated salary record (as if fetched by ID/Search)
    public String[] getEmployeeSalaryDetails(String id) {
        return new String[]{
            "E001",                 // ID
            "2025-01-15",           // Date
            "Ahmed Khan",           // Name
            "ahmed@gmail.com",      // Email
            "50000"                 // Salary
        };
    }

    // Simulated monthly salary table
    public List<String[]> getMonthlySalaryData() {
        List<String[]> salaryData = new ArrayList<>();

        salaryData.add(new String[]{"January", "50000"});
        salaryData.add(new String[]{"February", "50000"});

        return salaryData;
    }

    // Save salary record
    public boolean saveSalary() {
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
