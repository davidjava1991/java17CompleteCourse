package com.david.class35;

public class Example2 {
	public static void main(String[] args) {
		String month ="FEB";
		int year = 2022;
		int ndays = switch(month) {
	    case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
	    case "APR", "JUN", "SEP", "NOV" -> 30;
	    case "FEB" -> {
	        if (year % 400 == 0) yield 29;
	        else if (year % 100 == 0) yield 28;
	        else if (year % 4 == 0) yield 29;
	        else yield 28; }
	    default -> 30;
	};
		System.out.println("number of days "+ndays);
	}
}
