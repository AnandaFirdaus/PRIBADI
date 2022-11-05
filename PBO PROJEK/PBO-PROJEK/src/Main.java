import java.util.Scanner; // import scanner untuk inputannya

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama, nisn, alamat, jk, ttl,  def="Masukan ";
        float ujiansd, ujiansmp;

        User user = new User("","");
        Admin admin = new Admin("","");
        Siswa student = new Siswa("","");

        int flag = 0;
        int choice;

        while(flag == 0){
            System.out.println("|=========================================|");
            System.out.println("|        Penerimaan Siswa Baru SMA        |");
            System.out.println("|=========================================|");
            System.out.println("1. Admin");
            System.out.println("2. Siswa");
            System.out.println("3. Exit");

            System.out.println("Pilih : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Admin Login\n");
                    System.out.println("Username : ");
                    String username = input.next();
                    System.out.println("Password : ");
                    String password = input.next();

                    if(admin.adminLogin(username, password) == 1){
                        System.out.println("Login Berhasil\n");
                        admin.adminView();
                    }else{
                        System.out.println("Login Gagal\n");
                    }
                    break;
                case 2:
                    System.out.println("Siswa Login\n");
                    System.out.println("Username : ");
                    String username2 = input.next();
                    System.out.println("Password : ");
                    String password2 = input.next();

                    if(student.ceksukses(username2, password2) == 1){
                        System.out.println("Login Berhasil\n");
                        student.siswaView();
                    }else{
                        System.out.println("Login Gagal\n");
                    }
                    break;
                case 3:
                    flag = 1;
                    break;
                default:
                    System.out.println("Pilihan Salah\n");
                    break;
            }
            if (flag == 1) {
                break;
            }
        }
    }
}