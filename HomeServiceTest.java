/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import org.junit.Test;
import static org.junit.Assert.*;

public class HomeServiceTest {

    @Test
    public void testNewMemberButton() {
        HomeService service = new HomeService();
        assertEquals("NEW_MEMBER_PAGE", service.openNewMember());
    }

    @Test
    public void testUpdateDeleteMemberButton() {
        HomeService service = new HomeService();
        assertEquals("UPDATE_DELETE_MEMBER_PAGE", service.openUpdateDeleteMember());
    }

    @Test
    public void testListOfMemberButton() {
        HomeService service = new HomeService();
        assertEquals("LIST_OF_MEMBER_PAGE", service.openListOfMember());
    }

    @Test
    public void testPaymentButton() {
        HomeService service = new HomeService();
        assertEquals("PAYMENT_PAGE", service.openPayment());
    }

    @Test
    public void testLogoutButton() {
        HomeService service = new HomeService();
        assertTrue(service.logout());
    }

    @Test
    public void testExitButton() {
        HomeService service = new HomeService();
        assertTrue(service.exitApplication());
    }
}
