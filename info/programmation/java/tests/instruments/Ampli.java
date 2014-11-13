import java.util.*;

public class Ampli
{
	private final String marque;
	private double prix;
	private final double puissance;
	public Ampli()
	{
		marque = "Inconnue";
		prix = 0;
		puissance = 0;
	}
	public Ampli(String marque, double prix, double puissance)
	{
		this.marque = marque;
		setPrix(prix);
		if (puissance < 0)
			this.puissance = 0;
		else
			this.puissance = puissance;
	}
	public String getMarque()
	{
		return marque;
	}
	public prix getPrix()
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
	public double getPuissance()
	{
		return puissance;
	}
	public String toString()
	{
		return "Ceci est un amplificateur sonore pour guitare de marque " + marque + ", coutant " + prix + "€, et pouvant monter jusqu'à " + puissance + " watts.";
	}
}