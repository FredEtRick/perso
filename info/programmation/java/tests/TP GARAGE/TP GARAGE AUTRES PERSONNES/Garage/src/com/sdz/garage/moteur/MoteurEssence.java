package com.sdz.garage.moteur;

public class MoteurEssence extends Moteur{
	
	public MoteurEssence()
	{
		super();
		this.type = TypeMoteur.ESSENCE;
	}
	public MoteurEssence(String cylindre, double prix)
	{
		super(cylindre,prix);
		this.type = TypeMoteur.ESSENCE;
	}
}
