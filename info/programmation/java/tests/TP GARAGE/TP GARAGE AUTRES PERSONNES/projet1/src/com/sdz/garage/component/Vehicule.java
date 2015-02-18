package com.sdz.garage.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.garage.util.Marque;

public abstract class Vehicule implements Serializable
{
	private Double mPrix;
	private String mNom;
	private List<Option> mOptions;
	private Marque mMarque;
	private Moteur mMoteur;

	public Vehicule(Marque marque)
	{
		mOptions = new ArrayList<Option>(4);
		mPrix = 0d;
		mNom = this.getClass().getSimpleName();
		mMarque = marque;
	}

	public void addOption(Option opt)
	{
		mOptions.add(opt);
	}

	public List<Option> getOptions()
	{
		return mOptions;
	}

	public Double getPrix()
	{
		return mPrix;
	}

	public Marque getMarque()
	{
		return mMarque;
	}

	public void setMoteur(Moteur moteur)
	{
		mMoteur = moteur;
		mPrix = moteur.getPrix();
	}

	@Override
	public String toString()
	{
		// Prix de base
		Double prixTotal = mMoteur.getPrix();

		// On ahjoute le prix de chaque option.
		for(Option option : mOptions)
		{
			prixTotal += option.getPrix();
		}

		String result = "+" + mMarque + " "+ mNom + " "+ mMoteur.toString() + mOptions + " d'une valeur totale de " + prixTotal;


		return result;
	}
}
