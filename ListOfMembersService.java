package gym;

import java.util.ArrayList;
import java.util.List;

public class ListOfMembersService {

    // Simulated member list (as if coming from DB)
    public List<String[]> getMemberList() {
        List<String[]> members = new ArrayList<>();

        members.add(new String[]{
            "M001", "R001", "Ahmed Khan", "03001234567", "ahmed@gmail.com",
            "Male", "1995-05-12", "Lahore", "2025-01-01",
            "Yoga, Gym", "5000", "Healthy", "Friend"
        });

        members.add(new String[]{
            "M002", "R002", "Sara Ahmed", "03101234567", "sara@gmail.com",
            "Female", "1998-08-20", "Islamabad", "2025-02-01",
            "Zumba", "4000", "Allergic", "Internet"
        });

        return members;
    }

    // Close page
    public boolean closePage() {
        return true;
    }

    // Delete member (simulate DB removal)
    public boolean deleteMember(int index) {
        // For test purposes, assume always successful
        return true;
    }
}
