package com.david.class62;

public class Car extends Vehicle {
	String colour;
	public Car(){
		super();
	}
	void printCarDetails() {
		//System.out.println("name "+super.name;); cannot access
		System.out.println(" max speed : "+super.maxSpeed);
		System.out.println(" colour : "+this.colour);
	}
}
