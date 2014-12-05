

public class MoteurHybride extends Moteur
{
	public MoteurHybride (String cylindre, double prix)
	{
		super(cylindre, prix);
		this.setType (TypeMoteur.HYBRIDE);
	}
	public String toString()
	{
		return "HYBRIDE ESSENCE/ELECTRIQUE " + getCylindre();
	}
}