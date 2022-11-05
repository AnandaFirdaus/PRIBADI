import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);

    Admin admin;
    Siswa siswa;
    private String Username;
    private String Password;
    protected String name;

    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int studentLogin(String Username, String Password); {
        if (Username.equals("siswa") && Password.equals("siswa")) {
            return 1;
        } else {
            return 0;
        }
    }
}

    public void siswaView() {

    }

    public int ceksukses(String username2, String password2) {
        return 0;
    }
}