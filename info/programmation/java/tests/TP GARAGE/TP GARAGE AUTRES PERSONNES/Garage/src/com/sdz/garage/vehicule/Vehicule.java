package com.sdz.garage.vehicule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.garage.moteur.Moteur;
import com.sdz.garage.options.Option;

public class Vehicule implements Serializable {

	//Attributs du véhicule
	protected double prix;
	protected String nom;
	protected Marque nomMarque;
	protected Moteur moteur;
	protected List<Option> options;


	//Constructeurs
	public Vehicule()
	{
		this.prix=0;
		this.nom = "";	
		this.moteur = new Moteur();
		this.options = new ArrayList<Option>();
	}
	public Vehicule(double prix)
	{
		this.prix=prix;
		this.nom = "";	
		this.moteur = new Moteur();
		this.options = new ArrayList<Option>();
	}
	public Vehicule(double prix, String nom)
	{
		this.prix=prix;
		this.nom = nom;	
		this.moteur = new Moteur();
		this.options = new ArrayList<Option>();
	}
	public Vehicule(double prix, String nom,Marque nomMarque)
	{
		this.prix=prix;
		this.nom = nom;	
		this.nomMarque = nomMarque;
		this.moteur = new Moteur();
		this.options = new ArrayList<Option>();
	}
	public Vehicule(double prix, String nom,Marque nomMarque, Moteur moteur)
	{
		this.prix=prix;
		this.nom = nom;	
		this.nomMarque = nomMarque;
		this.moteur = moteur;
		this.options = new ArrayList<Option>();
	}
	public Vehicule(double prix, String nom, Marque nomMarque, Moteur moteur, List<Option> options)
	{
		this.prix=prix;
		this.nom=nom;
		this.nomMarque = nomMarque;
		this.moteur = moteur;
		this.options = options;
	}
	//Getters et Setters
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
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
		this.prix = this.prix + moteur.getPrix() - this.moteur.getPrix();
		this.moteur = moteur;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}


	//Méthodes
	public String toString()
	{
		String description="";
		description+="Véhicule " + nomMarque + " " +nom +" : " + prix  +" €. "+moteur.toString();
		if(!options.isEmpty())
		{
			description+= " Options du véhicule :\n ";
			for(Option opt:options)
			{
				description+="\t"+opt.toString();
			}
		}
		description+="\n\n";
		return description;
	}

	public void addOption(Option opt)
	{
		this.options.add(opt);
		this.prix += opt.getPrix();
	}


}
