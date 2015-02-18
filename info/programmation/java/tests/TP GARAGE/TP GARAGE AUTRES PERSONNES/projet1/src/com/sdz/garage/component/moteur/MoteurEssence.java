package com.sdz.garage.component.moteur;

import com.sdz.garage.component.Moteur;
import com.sdz.garage.util.TypeMoteur;

public class MoteurEssence extends Moteur
{
	public MoteurEssence(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.ESSENCE);
	}
}
