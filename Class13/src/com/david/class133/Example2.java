package com.david.class133;

import java.util.List;

public class Example2 {
	
	public static void displayList(List<?> list) {  
		for(Object o:list) {
		  System.out.println(o);  
	  }     
	} 
	  
	public static void main(String[] args) {
		List<String> l1 = List.of("Rice","Wheat","Barley");
		System.out.println("String list : ");
		displayList(l1);
		List<Double> l2 = List.of(1.22,23.33,5.66,7.856);
		System.out.println("Double list : ");
		displayList(l2);
	}
}
