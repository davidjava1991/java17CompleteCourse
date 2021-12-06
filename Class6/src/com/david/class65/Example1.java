package com.david.class65;

public class Example1 {
	public static void main(String[] args) {
		Vehicle v1 = new Truck();
		v1.start();// dynamic method dispatch
		v1.applyBreak();
		//v1.unload(); not available
		if(v1 instanceof Truck) {
			Truck v2 = (Truck)v1;// casting
			v2.unload();
		}
	}
}
