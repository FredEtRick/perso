import java.util.Scanner;

public class Temperatures
{
	static void main (String[] args)
	{
		String C;
		Boolean continuer;
		Scanner entree = new Scanner (System.in);
		double celsius, fahrenheit;
		do
		{
			String choix;
			do
			{
				System.out.println("Quel type de conversion voulez vous faire ?");
				System.out.println("Tappez \"CF\" pour convertir des celsius en fahrenheit");
				System.out.println("Tappez \"FC\" pour convertir des fahrenheit en celsius");
				choix = entree.nextLine();
			} while(!(choix.equals("CF")) && !(choix.equals("FC")));
			if (choix.equals("CF"))
			{
				System.out.print("Combien de celsius ? ");
				celsius = entree.nextDouble();
				fahrenheit = 
				System.out.println(celsius + "°C = " + (((9.d/5.d) * celsius) + 32) + "°F");
			}
			else if (choix.equals("FC"))
			{
				System.out.print("Combien de fahrenheit ? ");
				fahrenheit = entree.nextDouble();
				System.out.println(fahrenheit + "°F = " + (((fahrenheit - 32) * 5.d) / 9.d) + "°C");
			}
			else
			{
				System.out.println("erreur");
			}
			do
			{
				System.out.print("\"true\" pour continuer, \"false\" pour arrêter. ");
				C = entree.nextLine();
			} while (!(continuer.equals("true")) && !(continuer.equals("false")));
			continuer = Boolean.parseBoolean(continuer);
		} while (continuer);
	}
}