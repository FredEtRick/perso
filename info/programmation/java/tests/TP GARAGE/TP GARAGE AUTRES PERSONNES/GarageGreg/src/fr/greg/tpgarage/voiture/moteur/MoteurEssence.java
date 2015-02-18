package fr.greg.tpgarage.voiture.moteur;

/**
 * @author Greg
 *
 */
public class MoteurEssence extends Moteur {

	public MoteurEssence(String pCylindre, Double pPrix) {
		
		super(pCylindre, pPrix);
		super.type = TypeMoteur.ESSENCE;
		
	}

}
