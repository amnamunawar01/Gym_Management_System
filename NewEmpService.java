package gym;

public class NewEmpService {

    // Validate required fields
    public boolean validateEmployee(String name, String mobile, String email, String salary) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (mobile == null || mobile.trim().isEmpty()) {
            return false;
        }
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        if (salary == null || salary.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    // Save employee (simulation)
    public boolean saveEmployee(String name, String mobile, String email, String salary) {
        return validateEmployee(name, mobile, email, salary);
    }

    // Reset form
    public boolean resetForm() {
        return true;
    }

    // Close page
    public boolean closePage() {
        return true;
    }
}
