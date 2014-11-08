import java.util.Scanner;

public class persoBases
{
	public static void main (String[] args)
	{
		int continuer = 1, nombre = 0, baseDepart = 10, baseArrivee = 10;
		Scanner entree = new Scanner (System.in);
		System.out.println("\nne marche qu'avec des entiers et qu'avec des bases inférieures ou égales à 10\n");
		do
		{
			System.out.println("quel nombre voulez voulez vous convertir, via quelle base et vers quelle base ?");
			nombre = entree.nextInt();
			entree.nextLine();
			baseDepart = entree.nextInt();
			entree.nextLine();
			baseArrivee = entree.nextInt();
			entree.nextLine();
			System.out.print(nombre + " en base " + baseDepart + " donne ");
			System.out.println(conversion(nombre, baseDepart, baseArrivee) + " en base " + baseArrivee + ".");
			System.out.println("0 pour quitter, un autre entier pour continuer");
			continuer = entree.nextInt();
			entree.nextLine();
		} while (continuer != 0);
	}
	public static int versDecimal(int nombre, int base)
	{
		int decimal = 0, copie = nombre, taille = 0;
		while (copie != 0)
		{
			copie /= 10;
			taille++;
		}
		for (int i = 0 ; i < taille ; i++)
		{
			decimal+=((nombre/(int)Math.pow(10, i))%10)*(int)Math.pow(base, i);
		}
		return decimal;
	}
	public static int depuisDecimal(int nombre, int baseArrivee)
	{
		int resultat = 0, cpt = 0;
		while (nombre != 0)
		{
			resultat += (nombre % baseArrivee)*Math.pow(10, cpt);
			nombre /= baseArrivee;
			cpt++;
		}
		return resultat;
	}
	public static int conversion(int nombre, int baseDepart, int baseArrivee)
	{
		return depuisDecimal(versDecimal(nombre, baseDepart), baseArrivee);
	}
}