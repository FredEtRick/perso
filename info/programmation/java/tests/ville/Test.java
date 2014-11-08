import java.util.Scanner;

public class Test
{
	public static void main (String[] args)
	{
		int continuer = 1;
		int choix = 0;
		Scanner entree = new Scanner (System.in);
		do
		{
			System.out.println ("Donnez le nom de la ville a créer, de son pays, et son nombre d'habitants.");
			Ville perso = new Ville(entree.nextLine(), entree.nextLine(), entree.nextInt());
			entree.nextLine();
			System.out.println("Votre ville est de categorie " + perso.getCategorie());
			do
			{
				System.out.println("Que voulez vous faire ?");
				System.out.println("1 - Eradiquer votre ville avec ebola");
				System.out.println("2 - vague d'immigration vers votre ville");
				System.out.println("3 - rendre votre ville impopulaire");
				System.out.println("4 - desertation");
				System.out.println("5 - baby boom");
				System.out.println("6 - asteroide");
				System.out.println("7 - tueur en série");
				System.out.println("8 - attentat");
				System.out.println("9 - capitale");
				System.out.println("0 - Arrêter avec cette ville");
				choix = entree.nextInt();
				entree.nextLine();
				if (choix == 1)
					perso.ebola();
				else if (choix == 2)
					perso.migration();
				else if (choix == 3)
					perso.impopularite();
				else if (choix == 4)
					perso.desertation();
				else if (choix == 5)
					perso.babyBoom();
				else if (choix == 6)
					perso.asteroide();
				else if (choix == 7)
					perso.tueur();
				else if (choix == 8)
					perso.attentat();
				else if (choix == 9)
					perso.capitale();
				else if (choix != 0)
					System.out.println("Vous avez entré n'importe quoi");
			} while (choix != 0);
			System.out.println("C'est fini pour la ville " + perso.getNom() + " ! Que voulez vous faire ?");
			System.out.println("n'importe quel nombre -> créer une autre ville");
			System.out.println("0 - quitter le programme");
			continuer = entree.nextInt();
			entree.nextLine();
		} while (continuer != 0);
	}
}