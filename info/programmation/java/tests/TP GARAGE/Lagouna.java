import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lagouna extends Vehicule
{
	public Lagouna()
	{
		super();
		setPrix(23123);
		this.setNomMarque(Marque.RENO);
	}
	public String toString()
	{
		String s = "+ " + getNom() + " RENO : Lagouna ";
		s += getMoteur() + " (23123.0€) [";
		ListIterator li = getOptions().listIterator();
		int i = 0;
		while (li.hasNext())
		{
			if (i > 0)
				s += ", ";
			s += (Option) li.next();
			i++;
		}
		s += "] d'une valeur totale de " + getPrix() + " €\n";
		return s;
	}
	public double getPrix()
	{
		double prix = 23123.d;
		ListIterator li = getOptions().listIterator();
		while (li.hasNext())
			prix += ((Option) li.next()).getPrix();
		return prix;
	}
}