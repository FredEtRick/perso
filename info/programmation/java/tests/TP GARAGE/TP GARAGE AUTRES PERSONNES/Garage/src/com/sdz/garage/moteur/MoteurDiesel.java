package com.sdz.garage.moteur;

public class MoteurDiesel extends Moteur{

	public MoteurDiesel()
	{
		super();
		this.type = TypeMoteur.DIESEL;
	}
	public MoteurDiesel(String cylindre, double prix)
	{
		super(cylindre,prix);
		this.type = TypeMoteur.DIESEL;
	}

}
