import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.sdz.garage.vehicule.Vehicule;

public class Garage {
	List<Vehicule> voiture;
	ObjectInputStream ois;
	ObjectOutputStream oos;

	public Garage()
	{
		voiture = new ArrayList<Vehicule>();//Instanciation de la liste de voiture

		//Flux d'entree
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("garage.txt"))));


			try{
				while(true)
					voiture.add((Vehicule)ois.readObject()); //Lecture du fichier
			}
			catch(EOFException e)
			{
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} finally
			{
				if(ois != null) ois.close();
			}

		}
		catch(EOFException e)
		{
			System.out.println("Aucune voiture sauvegardée!");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

		//Flux de sortie
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("garage.txt"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Vehicule voit:voiture)
		{
			try {
				oos.writeObject(voit);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public String toString()
	{
		String description="";
		if(voiture.isEmpty())
		{
			description = "Le garage ne contient pas de voitures \n";
		}
		else
		{
			description="Le garage contient les véhicules suivants : \n";
			for(Vehicule voit:voiture)
			{
				description+=voit.toString();
			}

		}
		return description;
	}

	public void addVoiture(Vehicule voit)
	{
		voiture.add(voit);

		try {
			oos.writeObject(voit);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void fermerFlux()
	{
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
