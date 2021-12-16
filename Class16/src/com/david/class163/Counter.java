package com.david.class163;

public class Counter {
	synchronized void count(int n){
		for(int i =1;i<n;i++){
			System.out.println("i = "+i);
			 try {  
			      Thread.sleep(100);  
			  }catch(Exception e){
				  System.out.println(e);  
			   } 
		}
			
		
	}
}
