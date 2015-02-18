package com.sdz.garage.component.option;

import com.sdz.garage.component.Option;

public class GPS implements Option
{
	@Override
	public Double getPrix()
	{
		return 450d;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " ("+ getPrix()+ ")";
	}
}
