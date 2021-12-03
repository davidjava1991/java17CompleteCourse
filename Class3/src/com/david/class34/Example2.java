package com.david.class34;

public class Example2 {
	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
			if(i ==3|| i ==5) {
				continue;// using the continue
			}
			System.out.println("iteration "+ i);
		}
	}
}
