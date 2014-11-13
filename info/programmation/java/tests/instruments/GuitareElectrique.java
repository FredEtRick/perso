import java.util.*

public class GuitareElectrique extends Guitare
{
	private Ampli bafle;
	private String volume;
	public GuitareElectrique()
	{
		super();
		bafle = new Ampli();
	}
	public GuitareElectrique(double prix, double poids, double taille, String couleur, int annee, String marque, String option, Ampli bafle, String volume)
	{
		super (prix, poids, taille, couleur, annee, marque, option);
		setBafle();
		setVolume();
	}
	public Ampli getBafle()
	{
		return bafle;
	}
	public void setBafle(Ampli bafle)
	{
		this.bafle = bafle;
	}
	public String getVolume()
	{
		return volume;
	}
	public void setVolume(String volume)
	{
		if (!(volume.equals("faible")) && !(volume.equals("moyen")) && !(volume.equals("fort")))
			this.volume = "moyen";
		else
			this.volume = volume;
	}
	public void gratter(String jeu)
	{
		if (volume.equals("faible"))
			System.out.println(jeu.toLowerCase());
		else if (volume.equals("fort"))
			System.out.println(jeu.toUpperCase());
		else
			System.out.println(jeu);
	}
	public void bourriner()
	{
		gratter("BABABABABABABABAzzziiiBOUMBOUM !!!!!!!");
	}
	public void solo()
	{
		gratter("12-11-12-16-12-11-12-16-12-11-12-19/~------17-15-11-7-3-0");
	}
	public void arpege()
	{
		gratter("ta... ti ta tou tou... ti ta tou ti ti ... zIIIIIng... TA TA TA !!!");
	}
	public void monterSon()
	{
		getBafle().
	}
	public String toString()
	{
		return "Ceci est est une guitare electrique. Elle est munie de la bafle dont la description suit :\n" + bafle.toString() + "\nLe son est réglé sur " + volume + ". " + super.toString();
	}
}