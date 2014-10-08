#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main()
{
	cout << "blabla ? Bla !" << endl; // commentaire
/* Un autre
commentaire !*/
	cout << "sous mac/linux + Qt : éléphant à élève" << endl << "sous windows et en console : elephant a eleve" << endl;
	int a(4);
	bool vf(true);
	string mot1("tiens"), espace(" "), mot2("ldzj, non ?");
	char lettre('t');
	cout << a << vf << mot1 << espace << mot2 << lettre << endl;
	int& nombre(a);
	cout << nombre << " = " << a << " ?" << endl;
	/*cin >> nombre;
	cout << a << endl;
	cin >> mot1;
	cout << mot1 << endl;
	cin.ignore();
	string phrase;	
	getline(cin, phrase);
	cout << phrase << endl;*/
	a = a;
	cout << a << endl;
	int const b(5);
	const int c(6);
	/*int d(7) const;
	const int d;
	d = 7;*/ // Impossible d'affecter après coup. Comment affecter une variable, puis interdire de changer sa valeure ?
	cout << b << " " << c << endl;
	/*b++;
	c++;
	cout << b << " " << c << endl;*/
	const int d = b + c;
	cout << (b + c) * 4 << " " << d << endl;
	int n1(0), n2(0);
	n2=n1++; // équivalent à n2 = n1; n1++;
	cout << n1 << " " << n2 << endl;
	n2=++n1; // équivalent à n1++; n2 = n1;
	cout << n1 << " " << n2 << endl;
	const int n(19);
	double racine(0);
	racine = sqrt(n);
	cout << racine << " " << sqrt(n) << endl;
	cout << sqrt(16) << " " << sin(8) << " " << cos(-44) << " " << tan(0) << " " << log(50) << " ";
	cout << log10(50) << " " << log2(50) << " " << fabs(-10) << " ";
	cout << floor(4.4) << " " << ceil(9.0001) << endl;
	
	return 0;
}