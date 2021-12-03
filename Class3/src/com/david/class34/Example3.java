package com.david.class34;

public class Example3 {
	public static void main(String[] args) {
		a_label:
		for(int i=1;i<11;i++) {
			for(int j = 1; j< 11;j++) {
				if(i %2 ==0) {
					continue a_label;
				}
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
	}
}
