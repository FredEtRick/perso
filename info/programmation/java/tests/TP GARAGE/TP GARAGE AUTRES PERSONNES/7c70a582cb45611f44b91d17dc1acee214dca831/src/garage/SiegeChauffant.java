package garage;

public class SiegeChauffant implements Option {
	
public double getPrix(){
double prix= 562.90d;
return prix;}

public String toString(){
	return ("Si�ge Chauffant" + "("+getPrix()+"Euros)");
}
}