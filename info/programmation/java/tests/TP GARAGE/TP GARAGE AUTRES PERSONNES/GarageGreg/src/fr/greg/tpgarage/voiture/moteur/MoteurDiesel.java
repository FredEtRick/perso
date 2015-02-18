package fr.greg.tpgarage.voiture.moteur;

/**
 * @author Greg
 *
 */
public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel(String pCylindre, Double pPrix) {
		
		super(pCylindre, pPrix);
		super.type = TypeMoteur.DIESEL;
		
	}	
	
}
