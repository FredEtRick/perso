package com.sdz.tpGarage;
import java.io.Serializable;


public class VitreElectrique implements Option, Serializable {
	
	private Double prix = 212.35;
	
	public VitreElectrique(Double prix) {
		this.prix = prix;
	}

	public VitreElectrique(){};
	
	public Double getPrix(){
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String toString(){
		String str = "Vitre electrique (" + this.prix + " €)";
		return str;
	}
	
}
