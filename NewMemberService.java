package gym;

public class NewMemberService {

    // Validate required fields
    public boolean validateMember(String name, String mobile, String email) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (mobile == null || mobile.trim().isEmpty()) {
            return false;
        }
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    // Save member (simulation)
    public boolean saveMember(String name, String mobile, String email) {
        return validateMember(name, mobile, email);
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
