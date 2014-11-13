import java.util.Scanner;
import java.util.Objects;

public class Instruments
{
	public static void main(String[] args)
	{
		int nP = 0, nG = 0, nGE = 0, nA = 0;
		Piano[] pianos = new Piano[100];
		Guitare[] guitares = new Guitare[50];
		GuitareElectrique[] guitaresElectriques = new GuitareElectrique[50];
		Ampli[] amplis = new Ampli[50];
		String choix = "";
		Scanner entree = new Scanner(System.in);
		do
		{
			System.out.println("Que voulez vous faire ?");
			System.out.println("1 - lister les instruments");
			System.out.println("2 - atelier (création destruction instruments)");
			System.out.println("3 - interagire avec un instrument");
		} while (continuer());
	}
	public static boolean continuer()
	{
		Scanner entree = new Scanner(System.in);
		String choix = "";
		do
		{
			System.out.println("Voulez vous continuer ? (écrivez \"oui\" ou \"non\")");
			choix = entree.nextLine();
		} while (!(choix.equals("oui")) && !(choix.equals("non")));
		if (choix.equals("oui"))
			return true;
		else
			return false;
	}
	private double prix;
	private final double poids;
	private final double taille;
	private String couleur;
	private final int annee;
	private final String marque;
	private static int nombreInstruments = 0;
	public Instrument()
	{
		prix = 0;
		poids = 0;
		taille = 0;
		couleur = "Inconnue"; 
	}
	public Instrument(double prix, double poids, double taille, String couleur, int annee, String marque)
	{
		setPrix(prix);
		if (poids < 0)
			this.poids = 0;
		else
			this.poids = poids;
		if (taille < 0)
			this.taille = 0;
		else
			this.taille = taille;
		this.couleur = couleur;
		if (annee > 2014)
			this.annee = 2014;
		else
			this.annee = annee;
		this.marque = marque;
		nombreInstruments++;
	}
	public void jouer()
	{
		
	}
	public void accorder()
	{
		
	}
	public void reparer()
	{
		
	}
	public double getPrix()
	{
		return prix;
	}
	public void setPrix(double prix)
	{
		if (prix < 0)
			this.prix = 0;
		else
			this.prix = prix;
	}
	public final double getPoids()
	{
		return poids;
	}
	public double getTaille()
	{
		return taille;
	}
	public String getCouleur()
	{
		return couleur;
	}
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
	public final int getAnnee()
	{
		return annee;
	}
	public final String getMarque()
	{
		return marque;
	}
	public static int getNombreInstruments()
	{
		return nombreInstruments;
	}
	public String toString()
	{
		return ", coute " + prix + ", pèse " + poids + ", fait " + taille + " mètres, est " + couleur + ", date de " + annee + ", et c'est un(e) " + marque + "."
	}
}