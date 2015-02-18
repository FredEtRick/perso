package garage;
import java.io.Serializable;

public abstract class Moteur implements Serializable {
protected TypeMoteur type;
protected String cylindre;
protected Double prix;

public Moteur (Double prix, String cylindre){
this.prix=prix;
this.cylindre=cylindre;
}

public String toString(){
return ("Moteur "+type +"  "+ cylindre +" ("+prix+"Euros)");
}

protected Double getPrix() {
    return prix;
  }
}
