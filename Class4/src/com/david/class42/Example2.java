package com.david.class42;

public class Example2 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		b1.name = "Crow";
		b1.colour = "Black";
		b1.fly();
		b1.makeNoise();
		Bird b2 = new Bird();
		b2.name = "Eagle";
		b2.colour = "Brown";
		b2.fly();
		b2.makeNoise();
		System.out.println("static field accessed through non static reference : "+b1.numOfLegs);
	}
}
