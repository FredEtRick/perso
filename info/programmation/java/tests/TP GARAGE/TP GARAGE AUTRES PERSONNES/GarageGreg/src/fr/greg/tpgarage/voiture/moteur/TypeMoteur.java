package fr.greg.tpgarage.voiture.moteur;

import java.io.Serializable;

/**
 * @author Greg
 *
 */
public enum TypeMoteur implements Serializable {

	DIESEL ("Moteur DIESEL"),
	ESSENCE ("Moteur ESSENCE"),
	HYBRIDE ("Moteur HYBRIDE"),
	ELECTRIQUE ("Moteur ELECTRIQUE");
	
	private String nom = "";
	
	TypeMoteur(String pNom){
		this.nom = pNom;
	}
	
	public String toString(){
		return this.nom;
	}
	
}

