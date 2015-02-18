package com.sdz.garage.options;

import java.io.Serializable;

public class SiegeChauffant implements Option,Serializable{
	
	double prix;
	public SiegeChauffant()
	{
		prix = 300;
	}
	public double getPrix()
	{
		return prix;
	}
	public String toString(){
		return "Siège chauffant \n";
	}
}
