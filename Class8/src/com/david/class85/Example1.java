package com.david.class85;

import java.text.NumberFormat;
import java.util.Locale;

public class Example1 {
	public static void main(String[] args) {
		Locale locale = new Locale("da", "DK");
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String number = numberFormat.format(2000.46);
		System.out.println("formatted number "+number);
		
	}
}
