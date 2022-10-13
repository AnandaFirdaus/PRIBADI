import java.util.Scanner;

class tugas1 {
    public static void main(String args[]) {
    char[] a = {'n','a','n','d','a'}; 
    int[][] x = {{0,8}, {0,6}, {0,3}}; 

    Scanner input = new Scanner(System.in);
    System.out.print("Nilai : ");
    int n = input.nextInt();                                // Input
    System.out.println("Nilainya : " + n);                  // Output
    
    System.out.println("Array 2D");                         // Array 2D/Multidimensi
    for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
			System.out.print(x[i][j] + "\t");
		}
        System.out.println();
	}
    }

    if (n % 2 == 0) {                                       // If Percabangan
        System.out.println(" Adalah bilangan Genap");
    } else {
        System.out.println(" Adalah bilangan Ganjil");
    }

    System.out.println("Array 1D");

    for(int i=0; i<5; i++){                                 // Perulangan For + Array 1D
        System.out.println("Index " + i + " = " + a[i]);            
    }
    int f = 0;

    while (f < 5) {                                         // While
        System.out.println("Nandaaa");
        f++;
    }
    int e = 0;

    do {                                                    // Do while
        System.out.println("Gantengggg");
    e++;
    }
    while (e < 5);
}