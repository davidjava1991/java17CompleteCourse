package com.david.class104;

public class Example4 {
	public static void main(String[] args) {
		Shape circle = new Shape() { // Anonymous inner class
			@Override
			void draw() {
				System.out.println("Circle drawn");
			}
		};
		circle.draw();
	}
}
