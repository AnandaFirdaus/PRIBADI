#include <iostream>
using namespace std;

class pointer {
public:
  string nama[50];
  int nim[50];
  string *name = &nama[0];
  int *no = &nim[0];
  void input();
  void proses();
  void output();

private:
  int x;
};

void pointer::input() {
  cout << "|| =============================== ||" << endl;
  cout << "||            PARMATIKA            ||" << endl;
  cout << "|| =============================== ||" << endl << endl;
  cout << "Masukan jumlah data : ";
  cin >> x;

}

void pointer::proses(){
	for (int i = 0; i < x; i++) {
    cout << "---------------------------------- ||" << endl;
    cout << "Masukkan Nama : ";
    cin >> nama[i];
    cout << "Masukkan Nim  : ";
    cin >> nim[i];
    cout << "---------------------------------- ||" << endl;
  }
}

void pointer::output() {
  cout << "\n|| =============================== ||" << endl;
  cout << "||        FINALIS PARMATIKA        ||" << endl;
  cout << "|| =============================== ||" << endl << endl;
  cout << "---------------------------------- ||" << endl;
  for (int i = 0; i < x; i++) {
    cout << "Finalis " << i + 1 << endl;
    cout << "Nama: " << *(name + i) << endl;
    cout << "NIM: " << *(no + i) << endl;
    cout << "---------------------------------- ||" << endl;
  }
}

int main() {
  pointer ptr;

  ptr.input();
  ptr.output();

  return 0;
}
