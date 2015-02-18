package com.sdz.garage.options;

import java.io.Serializable;

public class VitreElectrique implements Option,Serializable{
	
	double prix;
	
	public VitreElectrique()
	{
		prix = 125;
	}
	
	public double getPrix()
	{
		return prix;
	}
	public String toString(){
		return "Vitre électrique \n";
	}
}
