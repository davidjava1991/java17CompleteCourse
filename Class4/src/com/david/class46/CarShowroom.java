package com.david.class46;

import java.util.ArrayList;

public class CarShowroom {
	ArrayList<Car> cars;
	
	CarShowroom(ArrayList<Car> carList){
		cars = carList;
	}	
	
	public void printCarDetails() {
		for(Car c:cars) {
			System.out.println("name : "+c.name);
			System.out.println(" colour : "+c.colour);
			System.out.println("mileage : "+c.mileage);
			System.out.println("-------------");
		}
	}

}
