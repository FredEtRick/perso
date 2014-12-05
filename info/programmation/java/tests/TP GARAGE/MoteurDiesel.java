

public class MoteurDiesel extends Moteur
{
	public MoteurDiesel (String cylindre, double prix)
	{
		super(cylindre, prix);
		this.setType (TypeMoteur.DIESEL);
	}
	public String toString()
	{
		return "DIESEL " + getCylindre();
	}
}