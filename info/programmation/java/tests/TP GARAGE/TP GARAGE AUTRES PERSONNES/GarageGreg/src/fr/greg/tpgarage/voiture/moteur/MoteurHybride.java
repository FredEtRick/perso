package fr.greg.tpgarage.voiture.moteur;

/**
 * @author Greg
 *
 */
public class MoteurHybride extends Moteur {

	public MoteurHybride(String pCylindre, Double pPrix) {
		
		super(pCylindre, pPrix);
		super.type = TypeMoteur.HYBRIDE;
		
	}

}
