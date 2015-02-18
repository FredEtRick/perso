package com.sdz.garage.component.moteur;

import com.sdz.garage.component.Moteur;
import com.sdz.garage.util.TypeMoteur;

public class MoteurDiesel extends Moteur
{
	public MoteurDiesel(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.DIESEL);
	}
}
