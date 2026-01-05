package gym;

public class LoginService {

    public boolean login(String name, String password) {

        if (name == null || password == null) {
            return false;
        }

        if (name.equals("Admin") && password.equals("admin")) {
            return true;
        }

        return false;
    }
}
