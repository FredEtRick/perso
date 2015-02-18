package com.sdz.tpGarage;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, Double prix) {
		
		super(cylindre, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}
	
	

}
