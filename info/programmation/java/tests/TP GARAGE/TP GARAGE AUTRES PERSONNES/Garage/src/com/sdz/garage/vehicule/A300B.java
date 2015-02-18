package com.sdz.garage.vehicule;
import java.util.List;

import com.sdz.garage.moteur.Moteur;
import com.sdz.garage.options.Option;

public class A300B extends Vehicule{

	//Constructeurs
	public A300B()
	{
		super(30000d,"P508",Marque.PIGEOT);
	}
	
	public A300B(Moteur moteur)
	{
		super(30000d,"P508",Marque.PIGEOT,moteur);

	}
	
	public A300B(Moteur moteur, List<Option> options)
	{
		super(30000d,"P508",Marque.PIGEOT,moteur,options);
	}
}
