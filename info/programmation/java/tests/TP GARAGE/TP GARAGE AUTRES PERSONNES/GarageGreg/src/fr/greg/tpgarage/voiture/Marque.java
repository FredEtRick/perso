package fr.greg.tpgarage.voiture;

import java.io.Serializable;

/**
 * @author Greg
 *
 */
public enum Marque implements Serializable{

	RENO ("Voiture RENO"),
	PIGEOT ("Voiture PIGEOT"),
	TROEN ("Voiture TROEN");
	
	private String nom = "";
	
	Marque(String pNom){
		this.nom = pNom;
	}
	
	public String toString(){
		return this.nom;
	}
	
}