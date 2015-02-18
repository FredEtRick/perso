package garage;

public class GPS implements Option {
	
public double getPrix(){
double prix=113.50d;
return prix;}
public String toString(){
	return ("GPS" + "("+getPrix()+"Euros)");
}
}
