package gym;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListOfMembersServiceTest {

    @Test
    public void testMemberListNotEmpty() {
        ListOfMembersService service = new ListOfMembersService();
        List<String[]> members = service.getMemberList();
        assertNotNull(members);
        assertTrue(members.size() > 0);
    }

    @Test
    public void testMemberDataStructure() {
        ListOfMembersService service = new ListOfMembersService();
        List<String[]> members = service.getMemberList();

        // Each member should have 13 fields
        assertEquals(13, members.get(0).length);
    }

    @Test
    public void testMemberName() {
        ListOfMembersService service = new ListOfMembersService();
        List<String[]> members = service.getMemberList();

        assertEquals("Ahmed Khan", members.get(0)[2]);
    }

    @Test
    public void testDeleteMember() {
        ListOfMembersService service = new ListOfMembersService();
        assertTrue(service.deleteMember(0));
    }

    @Test
    public void testClosePage() {
        ListOfMembersService service = new ListOfMembersService();
        assertTrue(service.closePage());
    }
}
