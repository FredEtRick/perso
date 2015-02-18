package fr.greg.tpgarage.voiture.options;

/**
 * @author Greg
 *
 */
public class SiegeChauffant implements Option {

	public Double getPrix() {
		return 300d;
	}
	
	public String toString() {
		return "Siège chauffant : " + getPrix() + " €";
	}

}
