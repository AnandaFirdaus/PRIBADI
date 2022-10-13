#include <iostream>
using namespace std;

int main(){
    char a[5]={'n','a','n','d','a'};   int b;
    int x[3][2] = {{0,8}, {0,6}, {0,3}};
    
    cout << "Nilai : ";
	cin >> b;											// Input
    
    cout << "Array 1D" << endl;
    for(int i=0; i<5; i++){								// Perulangan For + array 1D
        cout << "index " << i << " = " << a[i] << endl;	// Output
    }
    
    cout << endl << endl << "Array 2D" << endl;			// Array 2D/Multidimensi
    for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
			cout << x[i][j] << "\t";
		}
		cout << endl;
	}
    
    if (b%2==0){										// For percabngan
        cout << b << "Adalah bilangan genap" << endl;
    }else{
        cout << b << "Adalah bilangan ganjil" << endl;
    }
    
    cout <<  "PERULANGAN" << endl << endl << endl;
    int f = 0;
    while (f < 4) {										//While
        cout << "Nandaaa" << endl;
        f++;
    }
    int e = 0;
    
    do {												//Do while
        cout << "Gantenggg" << endl;
    e++;
    }
    while (e < 4);

}