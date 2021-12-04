package com.david.class45;

public class Vehicle {
	static int basePrice;
	String name;
	String colour;
	
	{ // iib1
		System.out.println("IIB1 setting name");
		name = "jeep";
	}
	
	
	static { // SIB1
		System.out.println("SIB1 to set basePrice");
		basePrice = 1000;
	}
	
	{ // iib2
		System.out.println("IIB2 setting colour ");
		colour = "Red";
	}
	
	static { // SIB2
		System.out.println("SIB2 for fun");
	}
	
	Vehicle(){
		System.out.println("constructor");
		System.out.println("color = "+colour);
		System.out.println(" name = "+name);
		System.out.println("base price = "+basePrice);
		
	}
	
	public static void main(String[] args) {
			Vehicle v1 = new Vehicle();
			System.out.println("--------------");
			Vehicle v2 = new Vehicle();
	}
}
