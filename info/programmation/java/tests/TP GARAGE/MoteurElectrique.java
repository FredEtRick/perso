

public class MoteurElectrique extends Moteur
{
	public MoteurElectrique (String cylindre, double prix)
	{
		super(cylindre, prix);
		this.setType (TypeMoteur.ELECTRIQUE);
	} 
	public String toString()
	{
		return "ELECTRIQUE " + getCylindre();
	}
}