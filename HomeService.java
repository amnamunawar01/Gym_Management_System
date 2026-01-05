/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

public class HomeService {

    public String openNewMember() {
        return "NEW_MEMBER_PAGE";
    }

    public String openUpdateDeleteMember() {
        return "UPDATE_DELETE_MEMBER_PAGE";
    }

    public String openListOfMember() {
        return "LIST_OF_MEMBER_PAGE";
    }

    public String openPayment() {
        return "PAYMENT_PAGE";
    }

    public boolean logout() {
        return true;
    }

    public boolean exitApplication() {
        return true;
    }
}
