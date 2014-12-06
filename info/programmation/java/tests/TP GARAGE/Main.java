import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
POUR TESTER LE CODE DE L'ENNONCE DU TP : lancez le programme et tappez 15.
POUR FAIRE VOS PROPRES TESTS : commencez par modifier la partie "if (choix == 15)" puis lancez le programme et tappez 15
POUR FAIRE DES TESTS EN TEMPS REEL EN LIGNE DE COMMANDE : lancez le programme et suivez le menu. 2-3 bugs et incohérence, mais ça prend beaucoup de temps pour les corriger donc tant pis.
*/

public class Main
{
	public static void main(String[] args)
	{
		// mise en place de l'évenement nécessaire au test du programme
		Garage.chargerGarages();
		Garage g = null;
		Vehicule v = null;
		Moteur m = null;
		Option o = null;
		Scanner entree = new Scanner (System.in);
		int choix = 0;
		
		// boucle globale du menu
		do
		{
			// affichage du menu
			System.out.println("\n================================================\n");
			System.out.println("Tappez...");
			System.out.println("\n1 pour créer un garage");
			System.out.println("2 pour supprimer un garage");
			System.out.println("3 pour ouvrir un garage existant");
			System.out.println("4 pour lister les garages");
			System.out.println("5 pour effacer tous les garages");
			System.out.println("6 pour créer une voiture");
			if ((g != null) && (v != null))
				System.out.println("7 pour garer la voiture courante dans le garage courant");
			if (g != null)
			{
				System.out.println("8 pour charger une voiture du garage courant");
				System.out.println("9 pour lister les voitures du garage courant");
			}
			System.out.println("10 pour créer un moteur");
			if ((m != null) && (v != null))
				System.out.println("11 pour affecter le moteur courant à la voiture courante");
			System.out.println("12 pour créer une option");
			if ((o != null) && (v != null))
				System.out.println("13 pour affecter l'option courante à la voiture courante");
			System.out.println("14 pour afficher toutes les infos sur les voitures et garages");
			System.out.println("15 pour tester le code du cours (ou un autre code si vous voulez le modifier vous même");
			
			// renseignements sur l'état de l'environnement
			System.out.print("\ngarage courant : ");
			if (g == null)
				System.out.println("aucun");
			else
				System.out.println(g.getNom());
			System.out.print("voiture courante : ");
			if (v == null)
				System.out.println("aucun");
			else
				System.out.println(v.getNom());
			System.out.print("moteur courant : ");
			if (m == null)
				System.out.println("aucun");
			else
				System.out.println(m);
			System.out.print("option courante : ");
			if (o == null)
				System.out.println("aucun");
			else
				System.out.println(o);
			
			// recceuille le choix de l'utilisateur
			System.out.println();
			choix = entree.nextInt();
			entree.nextLine();
			System.out.println();
			
			// actions à effectuer en fonction du choix
			
			if (choix == 1) // création d'un nouveau garage
				g = new Garage();
			
			else if (choix == 2) // suppression d'un garage
			{
				Garage.listerGarages();
				System.out.println("Indiquez le numéro du garage a supprimer :");
				System.out.print("garage");
				choix = entree.nextInt();
				entree.nextLine();
				String nom = "garage" + choix;
				if (nom.equals(g.getNom()))
					g = null;
				Garage.supprimerGarage(nom);
			}
			
			else if (choix == 3) // ouverture d'un garage
			{
				Garage.listerGarages();
				System.out.println("Indiquez le numéro du garage a charger :");
				System.out.print("garage");
				choix = entree.nextInt();
				entree.nextLine();
				String nom = "garage" + choix;
				if ((g != null) && (nom.equals(g.getNom())))
						System.out.println("garage déjà chargé");
				else
				{
					boolean existe = false;
					ListIterator li = Garage.getListeGarages().listIterator();
					Garage g2 = null;
					while (li.hasNext())
					{
						g2 = (Garage) li.next();
						if (g2.getNom().equals(nom))
						{
							g = g2;
							existe = true;
							System.out.println("Chargement réussi");
						}
					}
					if (! existe)
						System.out.println("garage non trouvé");
				}
			}
			
			else if (choix == 4) // lister les garages
				Garage.listerGarages();
				
			else if (choix == 5) // effacer tous les garages
			{
				Garage.viderGarages();
				g = null;
			}
			
			else if (choix == 6) // création d'une nouvelle voiture
			{
				System.out.println("Quel modèle de voiture voulez vous créer ?");
				System.out.println("1 RENO lagouna");
				System.out.println("2 PIGEOT A300B");
				System.out.println("3 TROEN D4\n");
				choix = entree.nextInt();
				entree.nextLine();
				if (choix == 1)
					v = new Lagouna();
				else if (choix == 2)
					v = new A300B();
				else if (choix == 3)
					v = new D4();
				else
					System.out.println("modèle inexistant");
			}
			
			else if ((choix == 7) && (g != null) && (v != null)) // garer la voiture dans le garage courant
			{
				ListIterator li1 = Garage.getListeGarages().listIterator(), li2 = null;
				Vehicule v2;
				Garage g2;
				while (li1.hasNext())
				{
					g2 = (Garage) li1.next();
					li2 = g2.getListeVoitures().listIterator();
					while (li2.hasNext())
					{
						v2 = (Vehicule) li2.next();
						System.out.println(g2.getNom() + " " + v2.getNom() + " " + v.getNom());
						if (v2.getNom().equals(v.getNom()))
						{
							g2.supprimerVoiture(v2);
						}
					}
				}
				g.add(v);
				System.out.print("La voiture courante a été sortie de son ancien garage ");
				System.out.println("(si elle était déjà garée), puis garée dans le garage courant.");
			}
			
			else if ((choix == 8) && (g != null)) // charger une voiture du garage courant
			{
				g.listerVoitures();
				System.out.print("Quelle voiture voulez vous charger ? (donnez son numéro)\nvoiture");
				choix = entree.nextInt();
				entree.nextLine();
				String nom = "voiture" + choix;
				Vehicule v2;
				ListIterator li = g.getListeVoitures().listIterator();
				boolean existe = false;
				while (li.hasNext())
				{
					v2 = (Vehicule) li.next();
					if (v2.getNom().equals(nom))
					{
						v = v2;
						existe = true;
						System.out.println("Voiture chargée");
					}
				}
				if (!existe)
					System.out.println("Echec dans le chargement");
			}
			
			else if ((choix == 9) && (g != null)) // lister les voitures du garage courant
			{
				ListIterator li = g.getListeVoitures().listIterator();
				System.out.println("Voitures du garage courant :");
				while (li.hasNext())
					System.out.println("- " + ((Vehicule) li.next()).getNom());
			}
			
			else if (choix == 10) // créer un moteur
			{
				System.out.println("Quel type de moteur voulez vous créer ?");
				System.out.println("1 - moteur hybride");
				System.out.println("2 - moteur electrique");
				System.out.println("3 - moteur essence");
				System.out.println("4 - moteur diesel");
				choix = entree.nextInt();
				entree.nextLine();
				int cylindre;
				double prix;
				switch (choix)
				{
					case 1 :
						System.out.println("prix de votre moteur :");
						prix = entree.nextDouble();
						entree.nextLine();
						m = new MoteurHybride("ESSENCE/Electrique", prix);
						break;
					case 2 :
						System.out.println("nombre de watt :");
						cylindre = entree.nextInt();
						entree.nextLine();
						System.out.println("prix de votre moteur :");
						prix = entree.nextDouble();
						entree.nextLine();
						m = new MoteurElectrique(cylindre + " W", prix);
						break;
					case 3 :
						System.out.println("nombre de chevaux :");
						cylindre = entree.nextInt();
						entree.nextLine();
						System.out.println("prix de votre moteur :");
						prix = entree.nextDouble();
						entree.nextLine();
						m = new MoteurEssence(cylindre + " Chevaux", prix);
						break;
					case 4 :
						System.out.println("HDI (puissance, nombre entier) :");
						cylindre = entree.nextInt();
						entree.nextLine();
						System.out.println("prix de votre moteur :");
						prix = entree.nextDouble();
						entree.nextLine();
						m = new MoteurDiesel(cylindre + " HDI", prix);
						break;
					default :
						System.out.println("Vous n'avez pas entré un nombre correct.");
				}
			}
			
			else if ((choix == 11) && (m != null) && (v != null)) // affecter moteur a voiture courante
			{
				v.setMoteur(m);
				System.out.println("moteur affecté à la voiture courante");
			}
			
			else if (choix == 12) // créer une option
			{
				System.out.println("Quel type d'option voulez vous créer ?");
				System.out.println("1 - GPS");
				System.out.println("2 - Climatisation");
				System.out.println("3 - Barre de toit");
				System.out.println("4 - Siège chauffant");
				System.out.println("5 - vitre électrique");
				choix = entree.nextInt();
				entree.nextLine();
				switch (choix)
				{
					case 1 :
						o = new GPS();
						System.out.println("GPS créé");
						break;
					case 2 :
						o = new Climatisation();
						System.out.println("Climatisation créée");
						break;
					case 3 :
						o = new BarreDeToit();
						System.out.println("barre de toit créée");
						break;
					case 4 :
						o = new SiegeChauffant();
						System.out.println("siège chauffant créé");
						break;
					case 5 :
						o = new VitreElectrique();
						System.out.println("vitre électrique créée");
						break;
					default :
						System.out.println("mauvais nombre entré");
				}
			}
			
			else if ((choix == 13) && (o != null) && (v != null)) // affecter option a voiture courante
			{
				v.addOption(o);
				System.out.println("Option ajoutée à la voiture courante");
			}
			
			else if (choix == 14) // afficher toutes les infos sur toutes les voitures de tous les garages
			{
				ListIterator li = Garage.getListeGarages().listIterator();
				System.out.println("\nINFOS DETAILLEES SUR LES GARAGES :");
				while (li.hasNext())
				{
					System.out.println(li.next());
				}
			}
			
			else if (choix == 15) // tester code du cours (de l'énnoncé)
			{ // modifiez le si vous voulez faire des tests personnalisés
				Garage.viderGarages();
			   	Garage garage = new Garage();
			   	
			   	Vehicule lag1 = new Lagouna();
			   	lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
			   	lag1.addOption(new GPS());
			   	lag1.addOption(new SiegeChauffant());
			   	lag1.addOption(new VitreElectrique());
			   	garage.add(lag1);
			   	 
			   	Vehicule A300B_2 = new A300B();
			   	A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
			   	A300B_2.addOption(new Climatisation());
			   	A300B_2.addOption(new BarreDeToit());
			   	A300B_2.addOption(new SiegeChauffant());
			   	garage.add(A300B_2);
			   	 
			   	Vehicule d4_1 = new D4();
			   	d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
			   	d4_1.addOption(new BarreDeToit());
			   	d4_1.addOption(new Climatisation());
			   	d4_1.addOption(new GPS());
			   	garage.add(d4_1);   	 
			   	
			   	Vehicule lag2 = new Lagouna();
			    lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
			   	garage.add(lag2);
			   	
			   	Vehicule A300B_1 = new A300B();
			   	A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
			   	A300B_1.addOption(new VitreElectrique());
			   	A300B_1.addOption(new BarreDeToit());
			   	garage.add(A300B_1);
			   	
			    Vehicule d4_2 = new D4();
			   	d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
			   	d4_2.addOption(new SiegeChauffant());
			   	d4_2.addOption(new BarreDeToit());
			    d4_2.addOption(new Climatisation());
			    d4_2.addOption(new GPS());
			    d4_2.addOption(new VitreElectrique());
			    garage.add(d4_2);
			    
			    System.out.println(garage);
			}
			
			else if (choix != 0) // mauvais choix entré
			{
				System.out.println("Votre entrée ne correspond a aucun choix valide en l'état des choses");
			}
			
		} while (choix != 0); // quitter
    }
}