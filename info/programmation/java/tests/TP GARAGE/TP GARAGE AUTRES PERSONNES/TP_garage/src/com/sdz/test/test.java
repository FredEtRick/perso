package com.sdz.test;
import com.sdz.tpGarage.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		lag1.addOption(new GPS());
		System.out.println(lag1);
	}

}

