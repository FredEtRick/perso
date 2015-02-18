package com.sdz.garage.moteur;

public class MoteurElectrique extends Moteur{
	
	public MoteurElectrique()
	{
		super();
		this.type = TypeMoteur.ELECTRIQUE;
	}
	public MoteurElectrique(String cylindre, double prix)
	{
		super(cylindre,prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}
}
