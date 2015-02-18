package com.sdz.tpGarage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Vehicule implements Serializable{
	
	/*--------------------------------ATTRIBUTS----------------------------------------------*/
	
	protected Double prix;
	protected String nom;
	protected List<Option> options = new ArrayList<>();
	protected Marque nomMarque;
	protected Moteur moteur;
	
	/*------------------------------CONSTRUCTEUR---------------------------------------------*/
	
	public Vehicule (){};
	
	/*------------------------------GETTERS/SETTERS------------------------------------------*/
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	public Double getPrix(){
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public List<Option> getOptions(){
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	/*--------------------------------METHODS-------------------------------------------------*/
	
	public void addOption(Option opt){
		options.add(opt);
	}	
	
	private Double calculPrix(){
		Double prixOptions = 0d;
		for(Option po : options){
			prixOptions += po.getPrix();
		}
		prix = prixOptions + moteur.getPrix();
		return prix;
	}
	
	public String toString(){
		String str = "Voiture " + this.nomMarque + " : " + this.nom + " " + this.moteur; 
			   str+= this.options + " d'une valeur totale de " + this.calculPrix() + " €";
		return str;
	}
	
	

	
}
