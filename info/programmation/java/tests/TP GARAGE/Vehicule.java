import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.Serializable;

public abstract class Vehicule implements Serializable
{
	private double prix;
	private String nom;
	private List<Option> options;
	private Marque nomMarque;
	private Moteur moteur;

	public Vehicule()
	{
		Garage.chargerGarages();
		prix = 0.d;
		Garage.incrementerNbVoitures();
		nom = "voiture" + Garage.getNbVoitures();
		options = new LinkedList<Option>();
		nomMarque = Marque.RENO;
		Garage.sauverGarages();
	}

/*	public Vehicule(double prix, String nom, List<Option> options, Marque nomMarque)
	{
		setPrix(prix);
		this.nom = nom;
		this.options = options;
		this.nomMarque = nomMarque;
	}*/

	public abstract String toString();
	
	// ajouter une option
	public void addOption(Option opt)
	{
		ListIterator li = options.listIterator();
		boolean existe = false;
		while (li.hasNext())
			if (((Option) li.next()).equals(opt))
			{
				existe = true;
				System.out.println("Cette option est déjà présente dans cette voiture");
			}
		if (!existe)
			options.add(opt);
	}
	public Marque getMarque()
	{
		return Marque.RENO;
	}
	public String getNom()
	{
		return nom;
	}
	public Moteur getMoteur()
	{
		return moteur;
	}
	public List<Option> getOptions()
	{
		return options;
	}
	public Marque getNomMarque()
	{
		return nomMarque;
	}
	public void setPrix(double prix)
	{
		if (prix < 0) // par mesure de précaution, évitons les prix négatifs
			this.prix = 0.d;
		else
			this.prix = prix;
	}

	public void setMoteur (Moteur moteur)
	{
		this.moteur = moteur;
	}
	
	public void setNom (String nom)
	{
		this.nom = nom;
	}
	
	public void setNomMarque (Marque nomMarque)
	{
		this.nomMarque = nomMarque;
	}

}