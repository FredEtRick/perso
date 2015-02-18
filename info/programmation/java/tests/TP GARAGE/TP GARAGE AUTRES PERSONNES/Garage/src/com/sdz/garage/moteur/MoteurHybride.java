package com.sdz.garage.moteur;

public class MoteurHybride extends Moteur{
	public MoteurHybride()
	{
		super();
		this.type = TypeMoteur.HYBRIDE;
	}
	public MoteurHybride(String cylindre, double prix)
	{
		super(cylindre,prix);
		this.type = TypeMoteur.HYBRIDE;
	}
}
