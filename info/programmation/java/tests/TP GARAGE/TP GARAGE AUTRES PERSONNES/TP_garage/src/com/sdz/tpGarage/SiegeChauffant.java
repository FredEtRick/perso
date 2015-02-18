package com.sdz.tpGarage;
import java.io.Serializable;


public class SiegeChauffant implements Option, Serializable{
	
	private Double prix = 562.9;
	
	public SiegeChauffant(){};
	
	public Double getPrix(){
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String toString(){
		String str = "Siege chauffant (" + this.prix + " €)";
		return str;
	}
}
