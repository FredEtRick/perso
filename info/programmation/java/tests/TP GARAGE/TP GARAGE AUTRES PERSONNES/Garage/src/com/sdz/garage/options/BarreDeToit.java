package com.sdz.garage.options;

import java.io.Serializable;

public class BarreDeToit implements Option,Serializable{
	
	double prix;
	
	public BarreDeToit()
	{
		prix = 150;
	}
	public double getPrix()
	{
		return prix;
	}

	public String toString(){
		return "Barre de toit \n";
	}
}
