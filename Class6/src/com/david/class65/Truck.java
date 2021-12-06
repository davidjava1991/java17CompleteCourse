package com.david.class65;

public class Truck extends Vehicle {
	@Override
	void start() {
		System.out.println("truck started");
	}
	void unload() {
		System.out.println("unloading truck");
	}
}
