#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main()
{
	int choix(0);
	do
	{
		cout << "Entrez un nombre : ";
		int a(0), b(0);
		cin >> a;
		cout << endl << "Que voulez vous faire avec ce nombre ? (tappez le chiffre correspondant à votre choix)" << endl;
		cout << "1. l'incrémenter" << endl << "2. le décrémenter" << endl << "3. lui ajouter un autre nombre";
		cout << endl << "4. lui soustraire un autre nombre" << endl << "5. le multiplier par un autre nombre" << endl;
		cout << "6. le diviser par un autre nombre" << endl << "7. prendre le modulo de ce nombre avec un autre" << endl;
		cout << "8. en prendre la racine" << endl << "9. le cosinus" << endl << "10. le sinus" << endl;
		cout << "11. la tangente" << endl << "12. l'exponentielle" << endl << "13. le logarithme népérien" << endl;
		cout << "14. le logarithme décimal" << endl << "15. le logarithme binaire" << endl;
		cout << "16. la valeure absolue" << endl << "17. le tronquage" << endl << "18. la valeure supérieure" << endl
		cout << "0. quitter" << endl << endl;
		cin >> choix;
		switch (choix)
		{
			case 1 :
				cout << ++a << endl;
				break;
			case 2 :
				cout << --a << endl;
				break;
			case 3 :
				cout << "combient voulez vous ajouter à " << a << " ? ";
				cin >> b;
				cout << a << " + " << b << " = ";
				a += b;
				cout << a << endl;
				break;
			case 4 :
				cout << "combient voulez vous soustraire à " << a << " ? ";
				cin >> b;
				cout << a << " - " << b << " = ";
				a -= b;
				cout << a << endl;
				break;
			case 5 :
				cout << "par combien voulez vous multiplier " << a << " ? ";
				cin >> b;
				cout << a << " * " << b << " = ";
				a *= b;
				cout << a << endl;
				break;
			case 6 :
				cout << "par combien voulez vous diviser " << a << " ? ";
				cin >> b;
				cout << a << " / " << b << " = ";
				a /= b;
				cout << a << endl;
				break;
			case 7 :
				cout << "le modulo de combien voulez vous appliquer à " << a << " ? ";
				cin >> b;
				cout << a << " % " << b << " = ";
				a %= b;
				cout << a << endl;
				break;
			case 8 :
				cout << "la racine de " << a << " est : ";
				a = sqrt(a);
				cout << a << endl;
				break;
			
		}
	
	} while (choix != 0);
			
	return 0;
}