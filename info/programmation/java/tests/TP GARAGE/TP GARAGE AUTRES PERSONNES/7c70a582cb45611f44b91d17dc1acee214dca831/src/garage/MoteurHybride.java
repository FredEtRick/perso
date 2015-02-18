package garage;

public class MoteurHybride extends Moteur{

public MoteurHybride(Double prix, String cylindre) {
super(prix, cylindre);
type = TypeMoteur.HYBRIDE;
}


}

