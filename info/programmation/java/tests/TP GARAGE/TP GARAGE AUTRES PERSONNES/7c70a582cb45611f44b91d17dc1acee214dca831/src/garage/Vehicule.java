package garage;
import java.util.*;
import java.io.Serializable;


public class Vehicule implements Serializable  {
private Double prix;
protected String nom;
private List <Option> options = new ArrayList <Option>();
protected Marque nomMarque;
private Moteur m;

protected Marque getMarque() {
    return nomMarque;
  }

protected String getNom() {
    return nom;
  }
protected Double getPrix() {
    prix=m.getPrix();
    for(Option opt : options){
    	  prix=prix+opt.getPrix(); }
	return prix;
  }

protected List <Option> getOptions() {
    return options;
  }

protected void addOption(Option opt){
	options.add (opt);
}
public void setMoteur(Moteur m) {
    this.m=m;
}

public String toString(){
return ("+ Voiture "
+ this.getMarque() + ": " 
		+ this.getNom() + " "
+  m.toString() + " " + options.toString()+
"d'une valeur totale de  "+ getPrix() + " Euros"+"\n");

}
}
