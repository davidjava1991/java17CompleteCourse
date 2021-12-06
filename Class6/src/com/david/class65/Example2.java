package com.david.class65;

public class Example2 {
	public static void main(String[] args) {
		Vehicle v = new Truck();
		if(v instanceof Truck t) { //pattern matching
			t.start();
			t.unload();
			
		}
	}
}
