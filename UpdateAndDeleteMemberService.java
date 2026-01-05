package gym;

public class UpdateAndDeleteMemberService {

    // Simulated search by Member ID
    public String[] searchMember(String memberId) {
        return new String[]{
            "M001",                 // Member ID
            "Ahmed Khan",           // Name
            "03001234567",          // Mobile Number
            "ahmed@gmail.com",      // Email
            "Male",                 // Gender
            "1998-05-12",           // Date of Birth
            "Lahore",               // Address
            "2025-01-01",           // Start Day
            "Yoga",                 // Extra Package
            "5000",                 // Payment
            "Healthy",              // Medical Comments
            "Friend"                // How you know us
        };
    }

    // Update member record
    public boolean updateMember(String[] updatedData) {
        return true;
    }

    // Delete member record
    public boolean deleteMember(String memberId) {
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
