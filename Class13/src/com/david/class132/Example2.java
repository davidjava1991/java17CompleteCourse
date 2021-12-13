package com.david.class132;

public class Example2 {

	public static <E> void displayArray(E[] elements) {
		System.out.println("----------");
        for ( E element : elements){          
            System.out.println(element);  
         }  	
	}	
	public static void main(String[] args) {
		Byte[] byteArray = {2,4,5,7,8,9};
		Double[] doubleArray = {2.22,4.55,6.65,8.65,3.43};
		displayArray(byteArray);
		displayArray(doubleArray);
	}
	
		
}
