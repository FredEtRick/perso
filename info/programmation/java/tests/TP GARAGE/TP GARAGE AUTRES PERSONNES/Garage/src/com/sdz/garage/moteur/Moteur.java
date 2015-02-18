package com.sdz.garage.moteur;

import java.io.Serializable;

public class Moteur implements Serializable {
	
	//Variables moteur
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	//Constructeurs
	public Moteur()
	{
		this.cylindre = "Inconnu";
		this.prix = 0;
	}
	public Moteur(String cylindre, double prix)
	{
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	//getters and setters
	public double getPrix()
	{
		return this.prix;
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
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	//Méthodes
	public String toString()
	{
		return "Moteur de type " + type.toString() + ", de cylindre " +cylindre+ ". Prix du moteur : "+prix+" euros.";
	}
	

	
}
