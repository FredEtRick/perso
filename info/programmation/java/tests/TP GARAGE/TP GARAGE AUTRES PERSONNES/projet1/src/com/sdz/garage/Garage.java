package com.sdz.garage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.sdz.garage.component.Vehicule;

public class Garage
{
	private List<Vehicule> mVehicule;
	ObjectOutputStream mOos;

	public Garage() throws ClassNotFoundException, IOException
	{
		mVehicule = new ArrayList<Vehicule>();

		chargementGarage();

		mOos = new ObjectOutputStream(new FileOutputStream("garage.txt"));
	}

	public void close() throws IOException
	{
		mOos.close();
	}

	private void chargementGarage() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		if (Files.exists(Paths.get("garage.txt")))
		{
			try (FileInputStream fis = new FileInputStream("garage.txt"); ObjectInputStream ois = new ObjectInputStream(fis))
			{
				boolean contientVehicule = true;

				do
				{
					try
					{
						mVehicule.add((Vehicule) ois.readObject());
					}
					catch (EOFException oef)
					{
						contientVehicule = false;
					}
				} while (contientVehicule);
			}
		}
	}

	public void addVoiture(Vehicule vehicule) throws IOException
	{
		mVehicule.add(vehicule);
		mOos.writeObject(vehicule);
	}

	@Override
	public String toString()
	{
		System.out.println("*************************");
		System.out.println("* Garage OpenClassrooms *");
		System.out.println("*************************");

		for (Vehicule vehicule : mVehicule)
		{
			System.out.println(vehicule.toString());
		}

		return "";
	}
}
