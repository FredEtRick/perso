import java.util.Scanner;

public class Ville
{
	private String nom;
	private String pays;
	private int nombreHabitants;
	private char categorie;
	public Ville()
	{
		System.out.println("Creation d'une nouvelle ville vide");
		nom = "Inconnu";
		pays = "Inconnu";
		nombreHabitants = 0;
		categorie = 'A';
	}
	public Ville(String nom, String pays, int nombreHabitants)
	{
		System.out.println("Creation d'une nouvelle ville avec paramètres");
		this.nom = nom;
		this.pays = pays;
		setNombreHabitants(nombreHabitants);
	}
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom.substring(0, 30);
	}
	public String getPays()
	{
		return pays;
	}
	public void setPays(String pays)
	{
		this.pays = pays.substring(0, 30);
	}
	public int getNombreHabitants()
	{
		return nombreHabitants;
	}
	public void setNombreHabitants(int nombreHabitants)
	{
		if (nombreHabitants < 0)
			this.nombreHabitants = 0;
		else if (nombreHabitants > 100000000)
			this.nombreHabitants = 100000000;
		else
			this.nombreHabitants = nombreHabitants;
		setCategorie();
	}
	public char getCategorie()
	{
		return categorie;
	}
	public void setCategorie()
	{
		if (nombreHabitants < 1000)
			categorie = 'A';
		else if (nombreHabitants < 10000)
			categorie = 'B';
		else if (nombreHabitants < 50000)
			categorie = 'C';
		else if (nombreHabitants < 150000)
			categorie = 'D';
		else if (nombreHabitants < 350000)
			categorie = 'E';
		else if (nombreHabitants < 1000000)
			categorie = 'F';
		else if (nombreHabitants < 3000000)
			categorie = 'G';
		else if (nombreHabitants < 10000000)
			categorie = 'H';
		else if (nombreHabitants < 20000000)
			categorie = 'I';
		else if (nombreHabitants < 40000000)
			categorie = 'J';
	}
	public void ebola()
	{
		System.out.print("Une épidémie d'ebola fait rage ! Votre ville passe de " + nombreHabitants);
		System.out.print(" (categorie " + categorie + ") à ");
		setNombreHabitants(nombreHabitants / 2);
		setCategorie();
		System.out.println(nombreHabitants + " (categorie " + categorie + ") en deux jours !");
	}
	public void migration()
	{
		System.out.print("Votre ville à la cote ! Elle passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants(nombreHabitants + 10000);
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en un mois !");
	}
	public void impopularite()
	{
		System.out.print("Votre ville est à chier ! Elle passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants((int) (nombreHabitants * 0.78));
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en un mois !");
	}
	public void desertation()
	{
		System.out.print("Votre ville fait fuire tout le monde ! Elle passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants((int) (nombreHabitants * 0.26));
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en une minute !");
	}
	public void babyBoom()
	{
		System.out.print("Vos habitants sont chauds comme des lapins ! Votre ville passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants((int) (nombreHabitants * 1.3));
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en deux ans !");
	}
	public void asteroide()
	{
		System.out.print("Asteroide dans la gueule ! Votre ville passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants(0);
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en une nanoseconde !");
	}
	public void tueur()
	{
		System.out.print("Un tueur en série fait rage ! Votre ville passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants(nombreHabitants - 100);
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en un mois !");
	}
	public void attentat()
	{
		System.out.print("Un attentat a lieu dans votre ville ! Elle passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants(nombreHabitants - 10000);
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en 30 minutes !");
	}
	public void capitale()
	{
		System.out.print("Votre ville devient capitale ! Elle passe de " + nombreHabitants + " (categorie " + categorie);
		setNombreHabitants(nombreHabitants + 300000);
		setCategorie();
		System.out.println(") à " + nombreHabitants + " habitants (categorie " + categorie + ") en un mois !");
	}
}