import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Garage implements Serializable
{
	private List<Vehicule> listeVoitures = new LinkedList<Vehicule>();
	private static List<Garage> listeGarages = new LinkedList<Garage>();
	private static Integer nbGarages = new Integer(0);
	private static Integer nbVoitures = new Integer(0);
	private final String nom;
	private final String chemin;

// ======================== METHODES DE CLASSE - GESTION DES GARAGES ===============================

/* transfère les données de garages.txt (la liste des garage et leur nombre) vers le programme
(dans les variables listeGarages et nbGarages). si ce fichier n'existe pas, les variables du programme
restent inchangées et le fichier est créé.*/
	public static void chargerGarages()
	{
		File garages = new File("Garages.txt");
		if (!garages.exists())
		{
			ObjectOutputStream oos;
			try
			{
				oos = new ObjectOutputStream(
						new BufferedOutputStream(
						  new FileOutputStream(garages)));
				oos.writeObject(new Integer(0));
				oos.writeObject(listeGarages);
				oos.writeObject(new Integer(0));
				oos.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			ObjectInputStream ois;
			try
			{
				ois = new ObjectInputStream(
						new BufferedInputStream(
						  new FileInputStream(garages)));
				nbGarages = (Integer) ois.readObject();
				listeGarages = (LinkedList<Garage>) ois.readObject();
				nbVoitures = (Integer) ois.readObject();
				ois.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}

// transfère les données de listeGarage et nbGarages du programme vers le fichier garages.txt
	public static void sauverGarages()
	{
		ObjectOutputStream oos;
		try
		{
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
					  new FileOutputStream(
						new File("Garages.txt"))));
			oos.writeObject(nbGarages);
			oos.writeObject(listeGarages);
			oos.writeObject(nbVoitures);
			oos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

// affiche dans le terminal la liste des garages via la variable listeGarages
	public static void listerGarages()
	{
		chargerGarages();
		ListIterator li = listeGarages.listIterator();
		System.out.println("\nGarages :\n");
		while (li.hasNext())
			System.out.println("- " + ((Garage) li.next()).getNom());
		System.out.println();
	}

/* si le nom passé en paramètre correspond a un garage, celui ci est retiré de listeGarages et son fichier est supprimé.
Sinon, un message apparait prévenant que le garage n'a pas été trouvé.*/
	public static void supprimerGarage(String nom)
	{
		chargerGarages();
		boolean existe = false;
		ListIterator li = listeGarages.listIterator();
		while (li.hasNext())
		{
			if (((Garage) li.next()).getNom().equals(nom))
			{
				li.remove();
				existe = true;
				File garage = new File("Garages/" + nom + ".txt");
				garage.delete();
			}
		}
		if (existe)
			System.out.println(nom + " a ete effacé.");
		else
			System.out.println("échec : " + nom + " n'a pas été trouvé.");
		sauverGarages();
	}

// supprime tous les garages, ainsi que le fichier garages.txt.
	public static void viderGarages()
	{
		chargerGarages();
		ListIterator li = listeGarages.listIterator();
		while (li.hasNext())
		{
			supprimerGarage(((Garage) li.next()).getNom());
		}
		File garages = new File("garages.txt");
		garages.delete();
		listeGarages = new LinkedList<Garage>();
		nbGarages = new Integer(0);
		nbVoitures = new Integer(0);
	}

// créé un nouveau garage.
	public Garage()
	{
		chargerGarages();
		nom = "garage" + (nbGarages + 1);
		listeGarages.add(this);
		nbGarages++;
		chemin = "Garages/" + nom + ".txt";
		sauverGarages();
		ObjectOutputStream oos;
		try
		{
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
					  new FileOutputStream(
						new File(chemin))));
			oos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

// ================== METHODES D'INSTANCE DE GARAGES - GERE UN GARAGE INDIVIDUELLEMENT ===================

// accesseurs et toString

	public String getNom()
	{
		return nom;
	}

	public String getChemin()
	{
		return chemin;
	}

	public String toString()
	{
		String s = "\n***************\n*   ";
		s += nom;
		s += "   *\n***************\n";
		ListIterator li = listeVoitures.listIterator();
		while (li.hasNext())
			s += ((Vehicule) li.next()).toString();
		return s;
	}

	public static List<Garage> getListeGarages()
	{
		return listeGarages;
	}

	public List<Vehicule> getListeVoitures()
	{
		return listeVoitures;
	}
	
	public static int getNbVoitures()
	{
		return nbVoitures;
	}
	
	public static void incrementerNbVoitures()
	{
		nbVoitures++;
	}

// charge le listeVoitures du fichier du garage dans le listeVoitures du programme
	public void chargerGarage()
	{
		File garage = new File(this.chemin);
		if (garage.length() < 5)
		{
			ObjectOutputStream oos;
			try
			{
				oos = new ObjectOutputStream(
						new BufferedOutputStream(
						  new FileOutputStream(garage)));
				oos.writeObject(listeVoitures);
				oos.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			ObjectInputStream ois;
			try
			{
				ois = new ObjectInputStream(
						new BufferedInputStream(
						  new FileInputStream(garage)));
				listeVoitures = (LinkedList<Vehicule>) ois.readObject();
				ois.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}

// écrase le listeVoitures du fichier du garage avec le listeVoitures du programme
	public void sauverGarage()
	{
		ObjectOutputStream oos;
		try
		{
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
					  new FileOutputStream(
						new File(this.chemin))));
			oos.writeObject(listeVoitures);
			oos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

// ========================== METHODES D'INSTANCE RELATIVES AUX VOITURES ===============================

// ajoute la voiture voit au garage (au listeVoitures du garage) si elle n'y est pas déjà.
	public void add(Vehicule voit)
	{
		chargerGarage();
		boolean existe = false;
		ListIterator li = listeVoitures.listIterator();
		while (li.hasNext())
		{
			if (((Vehicule) li.next()).equals(voit)) // NOTE : marche pas ! m'en occuper plus tard
			{
				System.out.println("cette voiture est déjà dans ce garage");
				existe = true;
			}
		}
		if (!existe)
		{
			listeVoitures.add(voit);
		}
		sauverGarage();
	}

// liste les voitures garées dans le garage courant
	public void listerVoitures()
	{
		chargerGarage();
		ListIterator li = listeVoitures.listIterator();
		System.out.println("\nVoitures :\n");
		while (li.hasNext())
			System.out.println("- " + ((Vehicule) li.next()).getNom());
		System.out.println();
	}

// retire la voiture voit de listeVoitures si elle y est
	public void supprimerVoiture(Vehicule voit)
	{
		chargerGarage();
		boolean existe = false;
		ListIterator li = listeVoitures.listIterator();
		while (li.hasNext())
			if (((Vehicule) li.next()).equals(voit))
			{
				li.remove();
				existe = true;
			}
		if (existe)
			System.out.println(voit.getNom() + " a ete supprimée du garage.");
		else
			System.out.println(voit.getNom() + " n'a pas été trouvée dans " + this.getNom() + ".");
		sauverGarage();
	}

// vide listeVoitures
	public void viderGarage()
	{
		chargerGarage();
		ListIterator li = listeVoitures.listIterator();
		while (li.hasNext())
		{
			li.next();
			li.remove();
		}
		sauverGarage();
	}

}