package garage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
	Garage garage = new Garage();
	ObjectInputStream ois;
    ObjectOutputStream oos;
    	 
  	 Vehicule lag1 = new Lagouna();
  	 lag1.setMoteur(new MoteurEssence(10256d, "150 Chevaux"));
  	 lag1.addOption(new GPS());
  	 lag1.addOption(new SiegeChauffant());
  	 lag1.addOption(new VitreElectrique());
  	 garage.addVoiture(lag1);
  	 
  		 
  	 Vehicule A300B_2 = new A300B();
  	 A300B_2.setMoteur(new MoteurElectrique(1234d, "1500 W"));
  	 A300B_2.addOption(new Climatisation());
  	 A300B_2.addOption(new BarreDeToit());
  	 A300B_2.addOption(new SiegeChauffant());
  	 garage.addVoiture(A300B_2);
  	 
  	 Vehicule d4_1 = new D4();
  	 d4_1.setMoteur(new MoteurDiesel(25684.80d, "200 Hdi" ));
  	 d4_1.addOption(new BarreDeToit());
  	 d4_1.addOption(new Climatisation());
  	 d4_1.addOption(new GPS());
  	 garage.addVoiture(d4_1);   	 
  	 
  	 Vehicule lag2 = new Lagouna();
  	 lag2.setMoteur(new MoteurDiesel(4569.87d, "500 Hdi"));
  	 garage.addVoiture(lag2);
  	 
  	 Vehicule A300B_1 = new A300B();
  	 A300B_1.setMoteur(new MoteurHybride(12345.95d, "ESSENCE/Electrique"));
  	 A300B_1.addOption(new VitreElectrique());
  	 A300B_1.addOption(new BarreDeToit());
  	 garage.addVoiture(A300B_1);
  	 
  	 Vehicule d4_2 = new D4();
  	 d4_2.setMoteur(new MoteurElectrique(12345.95d, "100 KW"));
  	 d4_2.addOption(new SiegeChauffant());
  	 d4_2.addOption(new BarreDeToit());
  	 d4_2.addOption(new Climatisation());
  	 d4_2.addOption(new GPS());
  	 d4_2.addOption(new VitreElectrique());
  	 garage.addVoiture(d4_2);   
  	 
  	 System.out.println(garage);
  	 
  	try {
        oos = new ObjectOutputStream(
                new BufferedOutputStream(
                  new FileOutputStream(
                    new File("Garage.txt"))));
              
       
        oos.writeObject(garage);
        oos.close();
              
       
        ois = new ObjectInputStream(
                new BufferedInputStream(
                  new FileInputStream(
                    new File("Garage.txt"))));
              
        
      
        ois.close();
              
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
   }
	}
}
