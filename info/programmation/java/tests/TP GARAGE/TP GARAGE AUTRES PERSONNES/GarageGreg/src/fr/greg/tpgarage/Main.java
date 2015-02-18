package fr.greg.tpgarage;

import fr.greg.tpgarage.voiture.A300B;
import fr.greg.tpgarage.voiture.D4;
import fr.greg.tpgarage.voiture.Lagouna;
import fr.greg.tpgarage.voiture.Vehicule;
import fr.greg.tpgarage.voiture.moteur.MoteurDiesel;
import fr.greg.tpgarage.voiture.moteur.MoteurElectrique;
import fr.greg.tpgarage.voiture.moteur.MoteurEssence;
import fr.greg.tpgarage.voiture.moteur.MoteurHybride;
import fr.greg.tpgarage.voiture.options.BarreDeToit;
import fr.greg.tpgarage.voiture.options.Climatisation;
import fr.greg.tpgarage.voiture.options.GPS;
import fr.greg.tpgarage.voiture.options.SiegeChauffant;
import fr.greg.tpgarage.voiture.options.VitreElectrique;


/**
 * @author Greg
 *
 */
public class Main {

	public static void main(String[] args) {
	
		Garage garage = new Garage();	
		System.out.println(garage);
		
		Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		lag1.ajoutOption(new GPS());
		lag1.ajoutOption(new SiegeChauffant());
		lag1.ajoutOption(new VitreElectrique());
		garage.ajoutVehicule(lag1);
			
		Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		A300B_2.ajoutOption(new Climatisation());
		A300B_2.ajoutOption(new BarreDeToit());
		A300B_2.ajoutOption(new SiegeChauffant());
		garage.ajoutVehicule(A300B_2);
		
		Vehicule d4_1 = new D4();
		d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		d4_1.ajoutOption(new BarreDeToit());
		d4_1.ajoutOption(new Climatisation());
		d4_1.ajoutOption(new GPS());
		garage.ajoutVehicule(d4_1);		
		
		Vehicule lag2 = new Lagouna();
		lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		garage.ajoutVehicule(lag2);
		
		Vehicule A300B_1 = new A300B();
		A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_1.ajoutOption(new VitreElectrique());
		A300B_1.ajoutOption(new BarreDeToit());
		garage.ajoutVehicule(A300B_1);
		
		Vehicule d4_2 = new D4();
		d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_2.ajoutOption(new SiegeChauffant());
		d4_2.ajoutOption(new BarreDeToit());
		d4_2.ajoutOption(new Climatisation());
		d4_2.ajoutOption(new GPS());
		d4_2.ajoutOption(new VitreElectrique());
		garage.ajoutVehicule(d4_2);		
				
	}

}
