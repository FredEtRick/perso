#include <stdio.h>
#include <stdlib.h>

double carre(double a) // fonction calculant le carré
{
	return a*a;
}
/*fonction pas très utile
car remplaçable
par la bibliothèque math.c*/

int main (int argc, char *argv[])
{
	printf("&é'àçèàç\"é&(\n");
	printf("%f\n", carre(3.5));
	
	return 0;
}