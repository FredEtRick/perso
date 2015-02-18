package com.sdz.garage.component.option;

import com.sdz.garage.component.Option;

public class Climatisation implements Option
{
	@Override
	public Double getPrix()
	{
		return 200d;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " ("+ getPrix()+ ")";
	}
}
