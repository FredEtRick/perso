package com.sdz.garage.component;

import java.io.Serializable;

import com.sdz.garage.util.TypeMoteur;

public abstract class Moteur implements Serializable
{
	private TypeMoteur mType;
	private String mCylindre;
	private Double mPrix;

	protected Moteur(String cylindre, Double prix)
	{
		mCylindre = cylindre;
		mPrix = prix;
	}

	public Double getPrix()
	{
		return mPrix;
	}

	protected void setType(TypeMoteur type)
	{
		mType = type;
	}

	@Override
	public String toString()
	{
		return mType + " " + mCylindre + " (" + mPrix + ")";
	}
}
