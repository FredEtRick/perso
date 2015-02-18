package com.sdz.garage.component.option;

import com.sdz.garage.component.Option;

public class SiegeChauffant implements Option
{
	@Override
	public Double getPrix()
	{
		return 1000d;
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " ("+ getPrix()+ ")";
	}
}
