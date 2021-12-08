package com.david.class85;

import java.text.NumberFormat;
import java.util.Locale;

public class Example2 {
	public static void main(String[] args) {
		Locale locale = new Locale("da","DK");
		NumberFormat curFor = NumberFormat.getCurrencyInstance(locale);
		String currency = curFor.format(10000.50);
		System.out.println("Currency formatted = "+currency);
	}
}
