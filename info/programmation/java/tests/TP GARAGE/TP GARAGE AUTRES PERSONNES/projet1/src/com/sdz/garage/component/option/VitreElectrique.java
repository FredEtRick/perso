package com.sdz.garage.component.option;

import com.sdz.garage.component.Option;

public class VitreElectrique implements Option
{

	@Override
	public Double getPrix()
	{
		return 250d;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " ("+ getPrix()+ ")";
	}
}
