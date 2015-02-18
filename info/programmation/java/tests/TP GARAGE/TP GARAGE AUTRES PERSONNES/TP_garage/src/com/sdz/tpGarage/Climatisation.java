package com.sdz.tpGarage;
import java.io.Serializable;


public class Climatisation implements Option, Serializable{
	
	private Double prix = 347.3;
	
	public Climatisation(){};
	
	public Double getPrix(){
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String toString(){
		String str = "Climatisation (" + this.prix + " €)";
		return str;
	}

}
