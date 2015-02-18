package fr.greg.tpgarage.voiture.options;

/**
 * @author Greg
 *
 */
public class BarreDeToit implements Option {

	public Double getPrix() {
		return 30d;
	}
	
	public String toString() {
		return "Barre de toit : " + getPrix() + " €";
	}
}
