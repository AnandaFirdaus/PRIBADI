import java.util.Scanner;

public class Siswa extends User{
    Scanner input = new Scanner(System.in);

    protected String nama, nisn, alamat, jk, ttl,  def="Masukan ";
    float ujiansd, ujiansmp;

    public Siswa(String Username, String Password){
        super(Username, Password);
    }

    public int deleteAllSiswa(){
        return 1;
    }

    public int registerSiswa(){
        System.out.println("Register Student Form\n");


        System.out.print(def + "Nama \t\t\t\t: " );
        nama = input.nextLine();
        System.out.print(def + "NISN \t\t\t\t: " );
        nisn = input.nextLine();
        System.out.print(def + "Jenis Kelamin \t\t: " );
        jk = input.nextLine();
        System.out.print(def + "Tempat/Tgl Lahir \t: " );
        ttl = input.nextLine();
        System.out.print(def + "Nilai UN SD \t\t: ");
        ujiansd = input.nextFloat();
        System.out.print(def + "Nilai UN SMP \t\t: ");
        ujiansmp = input.nextFloat();


        System.out.println("\n");

        // Tampilkan datanya
        System.out.println("+------------------------------------------+");
        System.out.println("|               Data Hasil                 |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Nama\t\t\t\t: " + nama);
        System.out.println("| NISN\t\t\t\t: " + nisn);
        System.out.println("| Jenis Kelamin \t: " + jk);
        System.out.println("| Tempat/Tgl Lahir\t: " + ttl);
        System.out.println("| Rata-rata Nilai\t: " + ((ujiansd+ujiansmp)/3)); //operasi hitung rata2
        System.out.println("+------------------------------------------+");

        return 1;
    }

    @Override
    public int ceksukses(String username2, String password2) {
        return super.ceksukses(username2, password2);
    }
}
