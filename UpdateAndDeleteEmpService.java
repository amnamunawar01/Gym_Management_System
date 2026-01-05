package gym;

public class UpdateAndDeleteEmpService {

    // Simulated search by Employee ID
    public String[] searchEmployee(String empId) {
        return new String[]{
            "E001",                 // Employee ID
            "Ahmed Khan",           // Name
            "03001234567",          // Mobile Number
            "ahmed@gmail.com",      // Email
            "Male",                 // Gender
            "25",                   // Age
            "Lahore",               // Address
            "2025-01-01",           // Start Day
            "Trainer",              // Type of Work
            "50000",                // Salary
            "Fit"                   // Medical Comments
        };
    }

    // Update employee record
    public boolean updateEmployee(String[] updatedData) {
        return true;
    }

    // Delete employee record
    public boolean deleteEmployee(String empId) {
        return true;
    }

    // Reset form fields
    public boolean resetForm() {
        return true;
    }

    // Close page (cross button)
    public boolean closePage() {
        return true;
    }
}
