package fr.greg.tpgarage.voiture.moteur;

/**
 * @author Greg
 *
 */
public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String pCylindre, Double pPrix) {
		
		super(pCylindre,pPrix);
		super.type = TypeMoteur.ELECTRIQUE;
		
	}

}
