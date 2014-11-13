import java.util.*;

public class Guitare extends Instruments
{
	private String option;
	private static int nombreGuitares = 0;
	public Guitare ()
	{
		super();
		option = "aucune";
		nombreGuitares++;
	}
	public Guitare (double prix, double poids, double taille, String couleur, int annee, String marque, String option)
	{
		super (prix, poids, taille, couleur, annee, marque);
		setOption();
	}
	public void jouer()
	{
		System.out.println("0-0-3-3-1-0-1-1-1");
	}
	public void accorder()
	{
		if (option.equals("accordeur"))
			System.out.println("Vous venez d'accorder votre guitare grace a votre accordeur");
		else
			System.out.println("Vous venez d'accorder votre guitare à l'oreille");
	}
	public void reparer()
	{
		System.out.prinln("T'es en découverts connard !");
	}
	public void changerCorde(char corde)
	{
		System.out.println("Corde " + corde + " changée.");
	}
	public static int getNombreGuitares()
	{
		return nombreGuitares;
	}
	public String getOption()
	{
		return option;
	}
	public void setOption(String option)
	{
		if (!(option.equals("capodastre")) && !(option.equals("pedale")) && !(option.equals("accordeur")))
			this.option = "aucune";
		else
			this.option = option;
	}
	public String toString()
	{
		if (option.equals("aucune"))
			return "Cette guitare n'a pas d'option" + super.toString();
		else
			return "Cette guitare est munie d'un(e) " + option + super.toString();
	}
}