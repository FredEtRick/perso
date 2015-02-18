package garage;
import java.util.*;
import java.io.Serializable;

public class Garage implements Serializable {
private List <Vehicule> voitures = new ArrayList <Vehicule> ();


public String toString(){
	if (voitures.isEmpty())
		System.out.println ("Aucune voiture sauvegardée!");
else 
	 for(Vehicule v : voitures)
	      System.out.println(v);  
	return "";
	
	 
}

public void addVoiture (Vehicule voit){
	voitures.add(voit);
}
}
