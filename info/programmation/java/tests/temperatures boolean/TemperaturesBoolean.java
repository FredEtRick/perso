import java.util.Scanner;

public class Temperatures
{
	public static void main (String[] args)
	{
		Object continuer; // Object au cas où l'utilisateur rentre autre chose que true et false
		Scanner entree = new Scanner (System.in);
		double celsius, fahrenheit;
		do // grande boucle pour convertir et demander si on veut continuer
		{
			String choix;
			do // demande a l'utilisateur quel type de conversion il désire faire
			{
				System.out.println("Quel type de conversion voulez vous faire ?");
				System.out.println("Tappez \"CF\" pour convertir des celsius en fahrenheit");
				System.out.println("Tappez \"FC\" pour convertir des fahrenheit en celsius");
				choix = entree.nextLine();
			} while(!(choix.equals("CF")) && !(choix.equals("FC")));
			if (choix.equals("CF")) // premier cas
			{
				System.out.print("Combien de celsius ? ");
				celsius = entree.nextDouble();
				System.out.println(celsius + "°C = " + (((9.d/5.d) * celsius) + 32) + "°F");
			}
			else if (choix.equals("FC")) // second cas
			{
				System.out.print("Combien de fahrenheit ? ");
				fahrenheit = entree.nextDouble();
				System.out.println(fahrenheit + "°F = " + (((fahrenheit - 32) * 5.d) / 9.d) + "°C");
			}
			else // juste au cas où
			{
				System.out.println("erreur");
			}
			do // continuer ?
			{
				System.out.print("\"true\" pour continuer, \"false\" pour arrêter. ");
				continuer = entree.next(); // next tout court car je sais pas ce qu'il entre
			} while (!((Boolean) continuer instanceof Boolean)); // est-sensé regarder s'il a entré un boolean mais ne marche pas
// CI-DESSUS BOUCLE INFINIE !!! ne considère apparemment jamais qu'on a entré un boolean même si on rentre "true" ou "false", pas moyen de sortir de la boucle.
		} while ((Boolean) continuer);
	}
}