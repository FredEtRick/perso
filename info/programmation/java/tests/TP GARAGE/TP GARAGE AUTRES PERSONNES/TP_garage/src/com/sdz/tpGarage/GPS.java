package com.sdz.tpGarage;
import java.io.Serializable;


public class GPS implements Option, Serializable{
	
	private Double prix = 113.5;
	
	public GPS(){};
	
	public Double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		String str = "GPS (" + this.prix + " €)";
		return str;
	}

}
