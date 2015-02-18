package fr.greg.tpgarage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.greg.tpgarage.voiture.Vehicule;


/**
 * @author Greg
 *
 */
public class Garage implements Serializable{

	private List<Vehicule> listeVoitures = new ArrayList<>();
	private String fichier = "garageGreg.txt";
	
	public Garage(){
		lectureFichier();		
	}
	
	/**
	 * @param pVehicule
	 */
	public void ajoutVehicule(Vehicule pVehicule){
		listeVoitures.add(pVehicule);
		ecritureFichier();
	}
	
	private void lectureFichier(){
		
		try ( FileInputStream fis = new FileInputStream(fichier); 
				BufferedInputStream bis = new BufferedInputStream(fis);
					ObjectInputStream ois = new ObjectInputStream(bis) ) {
			
				    	listeVoitures = (List<Vehicule>)ois.readObject();
				    	ois.close();
				    
		}	catch (FileNotFoundException e) {
		      System.err.println("Fichier inexistant --> Aucune voiture");
	    } catch (IOException e) {
	    	System.err.println("Erreur de lecture du fichier");
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	private void ecritureFichier(){
		
		try ( FileOutputStream fis = new FileOutputStream(fichier); 
				BufferedOutputStream bis = new BufferedOutputStream(fis);
					ObjectOutputStream ois = new ObjectOutputStream(bis) ) {
			
				   		ois.writeObject(listeVoitures);
				   		ois.close();
				   
		}	catch (FileNotFoundException e) {
		      System.err.println("Fichier inexistant");
	    } catch (IOException e) {
	    	System.err.println("Erreur d'écriture dans le fichier");
	    }
		
	}
	
	
	public String toString(){
		String str = "TP garage Greg\n\n";
		
		for (Vehicule v : listeVoitures)
			str +=  v + "\n";
		
		return str;
	}
	
}

