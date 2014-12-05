import java.io.Serializable;

public abstract class Moteur implements Serializable
{
	private TypeMoteur type;
	private String cylindre;
	private double prix;

	public Moteur (String cylindre, double prix)
	{
		this.cylindre = cylindre;
		this.prix = prix;
	}
	public String toString()
	{
		return "a modifier";
	}
	public double getPrix()
	{
		return prix;
	}
	public void setType(TypeMoteur type)
	{
		this.type = type;
	}
	public String getCylindre()
	{
		return cylindre;
	}
}