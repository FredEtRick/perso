package com.sdz.garage.options;

import java.io.Serializable;

public class Climatisation implements Option,Serializable{
	double prix;
	
	public Climatisation()
	{
		prix = 500;
	}
	public double getPrix()
	{
		return prix;
	}
	public String toString(){
		return "Climatisation\n";
	}
}
