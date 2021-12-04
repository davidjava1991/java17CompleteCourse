package com.david.class43;

public class Example2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "Jeep";
		c1.colour = "Red";
		c1.maxSpeed = 245;
		c1.price = 20000;
		c1.printCarDetails();
		Car c2 = new Car();
		c2.name = "Jeep";
		c2.colour = "Red";
		c2.maxSpeed = 245;
		c2.price = 20000;
		c2.printCarDetails();
		System.out.println("c1 equals c2 ? "+(c1==c2));
		Car c3 = c1;
		System.out.println("c1 equals c3 ? "+(c1==c3));
	}	
}
