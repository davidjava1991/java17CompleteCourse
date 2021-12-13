package com.david.class133;

import java.util.List;

public class Example1 {
    private static Double sum(List<? extends Number> num) {  
        double sum=0.0;  
        for(Number n:num) {  
        	sum = sum+n.doubleValue();  
        }  
          
        return sum;  
    } 
	public static void main(String[] args) {
		List<Integer> l1 = List.of(1,5,7);
		System.out.println("int sum = "+sum(l1));
		List<Double> l2 = List.of(1.33,4.23,5.67);
		System.out.println("double sum = "+sum(l2));
	}



}
