package garage;

public class Climatisation implements Option {
	
public double getPrix(){
double prix=347.30d;
return prix;}
public String toString(){
	return ("Climatisation" + "("+getPrix()+"Euros)");
}
}
