package com.sdz.garage.component.option;

import com.sdz.garage.component.Option;

public class BarreDeToit implements Option
{
	@Override
	public Double getPrix()
	{
		return 50d;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " ("+ getPrix()+ ")";
	}
}
