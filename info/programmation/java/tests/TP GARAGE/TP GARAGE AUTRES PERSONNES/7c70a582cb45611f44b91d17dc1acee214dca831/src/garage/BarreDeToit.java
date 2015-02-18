package garage;

public class BarreDeToit implements Option {
	
public double getPrix(){
double prix=29.90d;
return prix;}
public String toString(){
	return ("Barre de toit" + "("+getPrix()+"Euros)");
}
}
