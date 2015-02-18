package fr.greg.tpgarage.voiture.moteur;

import java.io.Serializable;

/**
 * @author Greg
 *
 */
public abstract class Moteur implements Serializable {

	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	public Moteur(String pCylindre, Double pPrix) {
		
		this.cylindre = pCylindre;
		this.prix = pPrix;
		
	}
	
	public TypeMoteur getType() {
		return type;
	}


	public void setType(TypeMoteur type) {
		this.type = type;
	}


	public String getCylindre() {
		return cylindre;
	}


	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public String toString(){
		return type + " - " + cylindre;
	}
}
