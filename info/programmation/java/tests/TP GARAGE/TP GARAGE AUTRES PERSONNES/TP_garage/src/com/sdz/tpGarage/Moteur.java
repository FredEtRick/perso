package com.sdz.tpGarage;
import java.io.Serializable;


public abstract class Moteur implements Serializable{
	
	/*--------------------------------ATTRIBUTS----------------------------------------------*/
	
	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	/*------------------------------CONSTRUCTEUR---------------------------------------------*/
	
	public Moteur(String cylindre, Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	/*------------------------------GETTERS/SETTERS------------------------------------------*/

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
	
	/*--------------------------------METHODS-------------------------------------------------*/
	
	public String toString(){
		String str = "Moteur " + this.type + " " + this.cylindre + " (" + this.prix + " €)";
		return str;
	}
	

}
