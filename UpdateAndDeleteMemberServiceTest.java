package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class UpdateAndDeleteMemberServiceTest {

    @Test
    public void testSearchMemberNotNull() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        String[] member = service.searchMember("M001");

        assertNotNull(member);
    }

    @Test
    public void testMemberDataStructure() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        String[] member = service.searchMember("M001");

        // Member should have 12 fields
        assertEquals(12, member.length);
    }

    @Test
    public void testMemberName() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        String[] member = service.searchMember("M001");

        assertEquals("Ahmed Khan", member[1]);
    }

    @Test
    public void testUpdateMember() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();

        String[] updatedData = {
            "M001", "Ahmed Khan", "03001234567", "ahmed@gmail.com",
            "Male", "1998-05-12", "Lahore", "2025-01-01",
            "Yoga", "5500", "Healthy", "Friend"
        };

        assertTrue(service.updateMember(updatedData));
    }

    @Test
    public void testDeleteMember() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        assertTrue(service.deleteMember("M001"));
    }

    @Test
    public void testResetForm() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        assertTrue(service.resetForm());
    }

    @Test
    public void testClosePage() {
        UpdateAndDeleteMemberService service = new UpdateAndDeleteMemberService();
        assertTrue(service.closePage());
    }
}
