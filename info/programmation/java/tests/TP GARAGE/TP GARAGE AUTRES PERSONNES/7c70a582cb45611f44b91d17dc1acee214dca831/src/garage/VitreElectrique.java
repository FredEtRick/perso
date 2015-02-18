package garage;

public class VitreElectrique implements Option {
	
public double getPrix(){
double prix=212.35d;
return prix;}
public String toString(){
	return ("Vitre Electrique" + "("+getPrix()+"Euros)");
}
}
