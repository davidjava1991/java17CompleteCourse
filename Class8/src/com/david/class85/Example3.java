package com.david.class85;

import java.text.DecimalFormat;

public class Example3 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("###,###");
		System.out.println("format 1 : "+df1.format(222135633));
		DecimalFormat df2 = new DecimalFormat("#.00");
		System.out.println("format 2 : "+df2.format(2214.236));
		
	}
}
