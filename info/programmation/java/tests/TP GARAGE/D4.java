import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class D4 extends Vehicule
{
	public D4()
	{
		super();
		setPrix(25147);
		this.setNomMarque(Marque.TROEN);
	}
	public String toString()
	{
		String s = "+ " + getNom() + " TROEN : D4 ";
		s += getMoteur() + " (25147.0€) [";
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
		double prix = 25147.d;
		ListIterator li = getOptions().listIterator();
		while (li.hasNext())
			prix += ((Option) li.next()).getPrix();
		return prix;
	}
}