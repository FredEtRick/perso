package com.sdz.garage.vehicule;
import java.util.List;

import com.sdz.garage.moteur.Moteur;
import com.sdz.garage.options.Option;

public class D4 extends Vehicule{

	//Constructeurs
	public D4()
	{
		super(20000d,"C4",Marque.TROEN);
	}
	
	public D4(Moteur moteur)
	{
		super(20000d,"C4",Marque.TROEN,moteur);
	}
	
	public D4(Moteur moteur, List<Option> options)
	{
		super(20000d,"C4",Marque.TROEN,moteur,options);
	}
}
