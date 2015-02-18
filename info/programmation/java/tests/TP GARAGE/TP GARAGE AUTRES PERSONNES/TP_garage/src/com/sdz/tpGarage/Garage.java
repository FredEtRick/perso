package com.sdz.tpGarage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Garage implements Serializable {
	
	/*--------------------------------ATTRIBUTS----------------------------------------------*/
	
	private List<Vehicule> voitures = new ArrayList<>();
	
	/*------------------------------CONSTRUCTEUR---------------------------------------------*/
	
	public Garage() {
		
		this.addFile();
	}

	/*------------------------------GETTERS/SETTERS------------------------------------------*/
	
	public List<Vehicule> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Vehicule> voitures) {
		this.voitures = voitures;
	}
	
	/*--------------------------------METHODS-------------------------------------------------*/
	
	public String toString(){
		
		String str = "********************************\n";
		      str += "*    Garage OpenClassrooms     *\n";
		      str += "********************************\n";
		
		for(Vehicule v : voitures)
			str += "+ " + v +"\n";
				
		return str;
		
	}
	
	public void addVoiture(Vehicule voit){
		
		voitures.add(voit);
		this.saveFile();	
		
	}
	
	private void saveFile(){
		
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File("garage.txt"))));
			
			oos.writeObject(voitures);
			oos.close();	
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addFile(){
		
		ObjectInputStream ois;
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(
							new File("garage.txt"))));
			try {	
					this.voitures = (List<Vehicule>)ois.readObject();
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			
			ois.close();
			
			} catch (FileNotFoundException e) {
				System.out.println("Aucune voiture sauvegardée !");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
