import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class A300B extends Vehicule
{
	public A300B()
	{
		super();
		setPrix(28457);
		this.setNomMarque(Marque.PIGEOT);
	}
	public String toString()
	{
		String s = "+ " + getNom() + " PIGEOT : A300B Moteur ";
		s += getMoteur() + " (28457.0€) [";
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
		double prix = 28457.d;
		ListIterator li = getOptions().listIterator();
		while (li.hasNext())
			prix += ((Option) li.next()).getPrix();
		return prix;
	}
}