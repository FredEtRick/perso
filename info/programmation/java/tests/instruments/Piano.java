import java.util.*;

public class Piano extends Instruments
{
	private final int nombreTouches;
	private final String type;
	private static int nombrePianos = 0;
	public Piano()
	{
		super();
		nombreTouches = 88;
		type = "Inconnu"
	}
	public Piano(double prix, double poids, double taille, String couleur, int annee, String marque, int nombreTouches, String type)
	{
		super(prix, poids, taille, couleur, annee, marque);
		if (nombreTouches <= 0)
			this.nombreTouches = 1;
		else
			this.nombreTouches = nombreTouches;
		if (!(type.equals("droit")) && !(type.equals("a queue")) && !(type.equals("electrique")))
			this.type = "droit";
		else
			this.type = type;
		nombrePianos++;
	}
	public void jouer()
	{
		System.out.println("do sol fa mi mi fa do re");
	}
	public void accorder()
	{
		System.out.println("Vous venez de perdre un mois de salaire !");
	}
	public void reparer()
	{
		System.out.println("Vous venez de perdre un an de salaire !");
	}
	public static int getNombrePianos()
	{
		return nombrePianos;
	}
	public int getNombreTouches()
	{
		return nombreTouches;
	}
	public String getType()
	{
		return type;
	}
	public int getNombrePianos()
	{
		return nombrePianos;
	}
	public String toString()
	{
		return "Ce piano a " + nombreTouches + " touches, c'est un piano " + type + super.toString();
	}
}