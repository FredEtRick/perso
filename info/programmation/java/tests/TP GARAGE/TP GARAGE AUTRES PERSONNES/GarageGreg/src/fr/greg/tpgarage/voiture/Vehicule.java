package fr.greg.tpgarage.voiture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.greg.tpgarage.voiture.moteur.Moteur;
import fr.greg.tpgarage.voiture.options.Option;

/**
 * @author Greg
 *
 */
public abstract class Vehicule implements Serializable{
	
	protected Double prix;
	protected String nom;
	protected List<Option> listeOptions = new ArrayList<>();
	protected Marque marque;
	protected Moteur moteur;
	
	public Double getPrix() {
		double prixTotal = prix;
		for(Option opt : listeOptions)
			prixTotal += opt.getPrix();
		
		return prixTotal;
	}
	
	public void ajoutOption(Option opt){
		listeOptions.add(opt);
	}
	
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<Option> getListeOptions() {
		return listeOptions;
	}


	public void setListeOptions(List<Option> listeOptions) {
		this.listeOptions = listeOptions;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	
	
	public Marque getMarque(){
		return marque;
	}


	public String toString(){
		return marque + " : " + nom + " " + moteur + " au prix de " + this.prix + "€ " +  listeOptions + " d'une valeur totale de " + getPrix() + " €";
	}
}
