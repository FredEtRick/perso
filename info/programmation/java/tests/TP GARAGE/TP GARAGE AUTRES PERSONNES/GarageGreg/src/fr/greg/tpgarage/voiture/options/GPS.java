package fr.greg.tpgarage.voiture.options;

/**
 * @author Greg
 *
 */
public class GPS implements Option {

	public Double getPrix() {
		return 100d;
	}
	
	public String toString() {
		return "GPS : " + getPrix() + " €";
	}

}
