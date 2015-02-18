package com.sdz.tpGarage;
import java.io.Serializable;


public class BarreDeToit implements Option, Serializable{
	
	private Double prix = 29.9;
	
	public BarreDeToit(){};
	
	public Double getPrix(){
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String toString(){
		String str = "Barre de toit (" + this.prix + " €)";
		return str;
	}

}
