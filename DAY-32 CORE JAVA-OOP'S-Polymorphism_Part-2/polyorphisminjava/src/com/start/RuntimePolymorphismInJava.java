package com.start;

public class RuntimePolymorphismInJava {

	public static void main(String[] args) {
		
		Car c;  //REFERENCE
		
		BMW bmw = new BMW();
		c = bmw; //UPCASTING
		c.color();
		c.speed();
		c.mileage();
		c.engine();
		c.fuel();
		c.aiFeature();
		c.drift();
		c.brack();
		c.ac();
		c.light();
		
		Swift swift = new Swift();
		c = swift;
		c.color();
		c.speed();
		c.mileage();
		c.engine();
		c.fuel();
		c.aiFeature();
		c.drift();
		c.brack();
		c.ac();
		c.light();
		
		Alto alto = new Alto();
		c = alto;
		c.color();
		c.speed();
		c.mileage();
		c.engine();
		c.fuel();
		c.aiFeature();
		c.drift();
		c.brack();
		c.ac();
		c.light();
		
		Thar thar = new Thar();
		c = thar;
		c.color();
		c.speed();
		c.mileage();
		c.engine();
		c.fuel();
		c.aiFeature();
		c.drift();
		c.brack();
		c.ac();
		c.light();
		
		Curve curve = new Curve();
		c = curve;
		c.color();
		c.speed();
		c.mileage();
		c.engine();
		c.fuel();
		c.aiFeature();
		c.drift();
		c.brack();
		c.ac();
		c.light();

	}

}
