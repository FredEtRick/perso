package com.sdz.garage.options;

import java.io.Serializable;

public class GPS implements Option,Serializable{

		double prix;
		
		public GPS()
		{
			prix = 200;
		}
		
		
		public double getPrix()
		{
			return prix;
		}
		public String toString(){
			return "GPS \n";
		}
		
}
