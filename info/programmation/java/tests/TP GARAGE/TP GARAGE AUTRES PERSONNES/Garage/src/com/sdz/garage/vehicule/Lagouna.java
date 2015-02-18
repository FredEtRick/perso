package com.sdz.garage.vehicule;
import java.util.List;

import com.sdz.garage.moteur.Moteur;
import com.sdz.garage.options.Option;

public class Lagouna extends Vehicule{

	//Constructeurs
	public Lagouna()
	{
		super(25000d,"Lagouna",Marque.RENO);
	}
	
	public Lagouna(Moteur moteur)
	{
		super(25000d,"Lagouna",Marque.RENO,moteur);

	}
	
	public Lagouna(Moteur moteur, List<Option> options)
	{
		super(25000d,"Lagouna",Marque.RENO,moteur,options);
	}

}
