import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);

    public Admin(String Username, String Password) {
        super();
    }

    public int adminLogin(String username, String password) {
        if (Username.equals("admin") && Password.equals("admin")) {
            return 1;
        } else {
            return 0;
        }
        return 0;
    }

    public void adminView() {
    }
}