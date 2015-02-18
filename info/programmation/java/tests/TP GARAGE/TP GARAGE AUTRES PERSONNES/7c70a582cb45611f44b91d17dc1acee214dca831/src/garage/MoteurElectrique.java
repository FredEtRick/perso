package garage;

public class MoteurElectrique extends Moteur{
	private TypeMoteur ELECTRIQUE;
	public MoteurElectrique(Double prix, String cylindre) {
	super(prix, cylindre);
	type = TypeMoteur.ELECTRIQUE;
	}


	}
