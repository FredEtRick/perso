package fr.greg.tpgarage.voiture.options;

/**
 * @author Greg
 *
 */
public class VitreElectrique implements Option {

	public Double getPrix() {
		return 300.50d;
	}
	
	public String toString() {
		return "Vitre electrique : " + getPrix() + " €";
	}

}
